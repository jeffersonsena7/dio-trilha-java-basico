import java.util.Scanner;

public class ContaTerminal {
  public static double saldoConta = 25;

  public static void valorSolicitado() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Qual valor você deseja sacar?");
    double valorSaque = scanner.nextDouble();
    if (valorSaque <= saldoConta) {
      saldoConta -= valorSaque;
      System.out.println("Saque realizado com sucesso! \n");
      System.out.println("Seu novo saldo é: R$ " + saldoConta);
    } else {
      System.out.println("Saldo insuficiente!");
    }
  }

  public static void main(String[] args) throws Exception {

    // Criando o objeto de scanner
    Scanner scanner = new Scanner(System.in);

    System.out.println("Por favor digite o número da agência");
    Integer numeroAgencia = scanner.nextInt();

    System.out.println("Por favor digite o número da conta");
    String numeroConta = scanner.next();

    System.out.println("Por favor digite seu nome");
    String nomeCliente = scanner.next();

    // Imprimir os dados obtidos pelo usuário
    System.out
        .println("Olá " + nomeCliente + " ,obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia
            + " conta " + numeroConta + " e seu saldo " + saldoConta + " R$, já está disponível para saque");

    valorSolicitado();

  };

};
