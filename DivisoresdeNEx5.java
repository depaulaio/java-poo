import java.util.Scanner;
import java.util.Locale;

public class DivisoresdeNEx5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(Locale.US);
    Locale.setDefault(new Locale("en", "US"));

    int n;

    // System.out.println("Informe o valor de n: ");
    System.out.println("ENTRADA: ");
    n = sc.nextInt();
    int divN;

    System.out.println("SAÍDA:");
    for (int i = n; i >= 1; i--) {
      divN = (n / i);

      if (n % i == 0) {
        // System.out.println("Os divisores de N são: " + divN);
        System.out.println(divN);
      }
    }

  }
}