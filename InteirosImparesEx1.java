import java.util.Scanner;
import java.util.Locale;

public class InteirosImparesEx1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(Locale.US);
    Locale.setDefault(new Locale("en", "US"));

    int x;

    // System.out.println("Informe o valor de x: ");
    System.out.println("ENTRADA: ");
    x = sc.nextInt();

    if (x >= 1 && x <= 1000) {
      // System.out.println("Os números ímpares entre 1 e " + x + " são: ");
      System.out.println("SAÍDA: ");
      for (int i = 1; i <= x; i++) {
        if (i % 2 != 0) {
          System.out.println(i);
        }
      }
    }
  }
}