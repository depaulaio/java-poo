import java.util.Scanner;
import java.util.Locale;

public class TestesMediaEx3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(Locale.US);
    Locale.setDefault(new Locale("en", "US"));

    int numCasosTeste;
    System.out.println("ENTRADA (Nº DE CASOS DE TESTES): ");
    numCasosTeste = sc.nextInt();

    double valor1, valor2, valor3;

    for (int i = 1; i <= numCasosTeste; i++) {
      System.out.println("ENTRADA (VALORES): ");
      valor1 = sc.nextDouble();
      System.out.println("ENTRADA (VALORES): ");
      valor2 = sc.nextDouble();
      System.out.println("ENTRADA (VALORES): ");
      valor3 = sc.nextDouble();

      double mediaPonderada = (valor1 * 2 + valor2 * 3 + valor3 * 5) / 10;

      System.out.printf("SAÍDA: %.1f%n", mediaPonderada);
      // System.out.printf("A média pondera dos valores de entrada é: %.1f%n",
      // mediaPonderada);
    }
  }
}