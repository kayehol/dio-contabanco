import java.util.Locale;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ContaTerminal {
  public static void main(String[] args) {
    try {
      Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

      System.out.println("Digite o número da conta:");
      int numero = scanner.nextInt();

      System.out.println("Digite o número da agência:");
      String agencia = scanner.next();

      scanner.nextLine();

      System.out.println("Digite o nome do cliente:");
      String nomeCliente  = scanner.nextLine();

      System.out.println("Digite o saldo:");
      double saldo = scanner.nextDouble();

      scanner.close();

      System.out.println("Olá " + nomeCliente 
      + ", obrigado por criar uma conta em nosso banco, "
      + "sua agência é " + agencia
      + ", conta " + numero
      + " e seu saldo " + saldo
      + " já está disponivel para saque.");
    } catch (InputMismatchException err) {
      err.printStackTrace();
    }
  }
}
