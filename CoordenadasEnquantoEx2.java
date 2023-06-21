import java.util.Scanner;
import java.util.Locale;

public class CoordenadasEnquantoEx2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(Locale.US);
    Locale.setDefault(new Locale("en", "US"));

    int x = 1;
    int y = 1;
    while ((x != 0) && (y != 0)) {
      System.out.println("Informe o valor de x: ");
      x = sc.nextInt();
      ;
      System.out.println("Informe o valor de y: ");
      y = sc.nextInt();
      if ((x > 0) && (y > 0)) {
        System.out.println("Entrada: ");
        System.out.println(x + " " + y);
        System.out.println("QD1");
      }
      if ((x < 0) && (y > 0)) {
        System.out.println("Entrada: ");
        System.out.println(x + " " + y);
        System.out.println("QD2");
      }
      if ((x < 0) && (y < 0)) {
        System.out.println("Entrada: ");
        System.out.println(x + " " + y);
        System.out.println("QD3");
      }
      if ((x > 0) && (y < 0)) {
        System.out.println("Entrada: ");
        System.out.println(x + " " + y);
        System.out.println("QD4");
      }
    }
    if ((x == 0) || (y == 0)) {
      sc.close();
    }
  }
}
