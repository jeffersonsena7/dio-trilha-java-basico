import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
  public static void main(String[] args) {
    String [] candidatos = {"Felipe", "Marcia", "Julia", "Flavia", "Jaqueline"};
    for (String candidato : candidatos) {
      entrandoEmContato(candidato);
    }
  }

  static void entrandoEmContato(String candidato) {
    int tentativasRealizadas = 1;
    boolean continuarTentando = true;
    boolean atendeu = false;

    do {
      atendeu = atender();
      continuarTentando = !atendeu;
      if(continuarTentando) {
        tentativasRealizadas++;
      } 
      else{
        System.out.println("CONTATO REALIZADO COM SUCESSO");
      }
    } while (continuarTentando && tentativasRealizadas < 3);

      if(atendeu) {
        System.out.println("CONSEGUIU CONTATO COM " + candidato + " NA " + tentativasRealizadas);
      }
      else{
        System.out.println("NÃO CONSEGUIU CONTATO COM " + candidato + "NUMERO MáXIMO DE TENTATIVA " + tentativasRealizadas + "REALIZADA");
      }
   }

  //Métod0 auxiliar 
  static boolean atender() {
    return new Random().nextInt(3) == 1;
  }
  
  
  //usando o for
  static void imprimirSelecionado(){
    String [] candidatos = {"Felipe", "Marcia", "Julia", "Flavia", "Jaqueline"};

    System.out.println("Imprima a lista de candidatos informando os indices");

    for (int indice=0; indice < candidatos.length; indice++) {
     
      System.out.println("O candidato de Nº " + (indice +1) + " é o " + candidatos[indice] );
    }

    //Usando o foreach
    System.out.println("\nForma abreviada de interação com for each");
    for (String candidato : candidatos) {
      System.out.println("O candidato é " + candidato);
    }
  }

  //criando o método
  static void selecaoCandidatos() {
    // criando um array de candidatos
    String [] candidatos = {"Felipe", "Marcia", "Julia", "Flavia", "Jaqueline", "Joseane", "Jefferson", "Danielle"};
    // criando um array de candidatos selecionados
    int candidatosSelecionados = 0;
    int candidatosAtual = 0;
    double salarioBase = 2000.0;


    while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
      //criando a variável de candidato para receber a array de candidatos, passando o candidatoAtual
      String candidato = candidatos[candidatosAtual];
      double salarioPretendido = valorPretendido();

      System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);

      if (salarioBase >= salarioPretendido) {
        System.out.println("O candidato " + candidato + " foi selecionado para a vaga ");
        //se foi selecionado acrescenta +1 no while para parar nos 5
        candidatosSelecionados++;
      }
      //se não foi selecionado, incrementa o candidatoAtual para passar para o próximo na array
      candidatosAtual++;
    }
  }

  static double valorPretendido() {
    //Lembrar de importar ThreadLocalRandom para funcionar pegar números aleatórios
    return ThreadLocalRandom.current().nextDouble(1800, 2200);
  }

  static void analisarCandidato(double salarioPretendido) {
    double salarioBase = 2000.0;

    if (salarioBase > salarioPretendido) {
      System.out.println("LIGAR PARA O CANDIDATO");
    }
    else if (salarioBase == salarioPretendido) {
      System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
    }
    else {
      System.out.println("AGUARDAR O RESULTADO DOS DEMAIS CANDIDATOS");
    }
  }
}
