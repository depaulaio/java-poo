import java.util.Scanner;
import java.util.Locale;

public class IntervaloEx6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(Locale.US);
    Locale.setDefault(new Locale("en", "US"));

    double valor;

    System.out.println("Informe o valor: ");
    valor = sc.nextDouble();

    if (valor >= 0 && valor <= 25) {
      System.out.println("Entrada: ");
      System.out.printf("%.2f \n", valor);
      System.out.println("Saída: ");
      System.out.println("Intervalo (0, 25)");
    }

    if (valor > 25 && valor <= 50) {
      System.out.println("Entrada: ");
      System.out.printf("%.2f \n", valor);
      System.out.println("Saída: ");
      System.out.println("Intervalo (25, 50]");
    }

    if (valor > 50 && valor <= 75) {
      System.out.println("Entrada: ");
      System.out.printf("%.2f \n", valor);
      System.out.println("Saída: ");
      System.out.println("Intervalo (50, 75]");
    }

    if (valor > 75 && valor <= 100) {
      System.out.println("Entrada: ");
      System.out.printf("%.2f \n", valor);
      System.out.println("Saída: ");
      System.out.println("Intervalo (75, 100]");
    }

    if ((valor < 0) || (valor > 100)) {
      System.out.println("Entrada: ");
      System.out.printf("%.2f \n", valor);
      System.out.println("Fora de intervalo.");
    }

  }
}