import java.util.Scanner;
import java.util.Locale;

public class DivisaoDeParesEx4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(Locale.US);
    Locale.setDefault(new Locale("en", "US"));

    int n;

    // System.out.println("Informe o valor de N: ");
    System.out.println("ENTRADA: ");
    n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      double n1, n2;
      System.out.println("ENTRADA: ");
      // System.out.println("Informe o 1º valor de um par de números: ");
      n1 = sc.nextInt();
      // System.out.println("Informe o 2º valor de um par de números: ");
      n2 = sc.nextInt();
      double div = (n1 / n2);
      System.out.println("SAÍDA: ");
      if (n2 == 0) {
        System.out.println("Divisão Impossível");
      } else {
        // System.out.println("O valor da divisão é: " + div);
        System.out.println(div);
      }
    }
  }
}
