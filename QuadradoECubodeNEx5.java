import java.util.Scanner;
import java.util.Locale;

public class QuadradoECubodeNEx5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(Locale.US);
    Locale.setDefault(new Locale("en", "US"));

    int n;

    // System.out.println("Informe o valor de n: ");
    System.out.println("ENTRADA: ");
    n = sc.nextInt();

    System.out.println("SAÍDA: ");
    // System.out.println("Os valores de n, seu quadrado e seu cubo são
    // respectivmente: ");
    for (int i = 1; i <= n; i++) {
      int quad = (i * i);
      int cubo = (i * i * i);

      System.out.println(i + " " + quad + " " + cubo);
    }

  }
}
