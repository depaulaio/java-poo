import java.util.Scanner;
import java.util.Locale;

public class CoordenadasEx7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(Locale.US);
    Locale.setDefault(new Locale("en", "US"));

    double x, y;

    System.out.println("Informe o valor de x: ");
    x = sc.nextDouble();
    System.out.println("Informe o valor de y: ");
    y = sc.nextDouble();

    if (x == 0 && y == 0) {
      System.out.println("Entrada: ");
      System.out.printf("%.1f \n", x, y);
      System.out.println("Saída:");
      System.out.println("Origem");
    }
    if (x > 0 && y > 0) {
      System.out.println("Entrada: ");
      System.out.printf("%.1f \n", x, y);
      System.out.println("Saída:");
      System.out.println("Q1");
    }
    if (x < 0 && y > 0) {
      System.out.println("Entrada: ");
      System.out.printf("%.1f \n", x, y);
      System.out.println("Saída:");
      System.out.println("Q2");
    }
    if (x < 0 && y < 0) {
      System.out.println("Entrada: ");
      System.out.printf("%.1f \n", x, y);
      System.out.println("Saída:");
      System.out.println("Q3");
    }
    if (x > 0 && y < 0) {
      System.out.println("Entrada: ");
      System.out.printf("%.1f \n", x, y);
      System.out.println("Saída:");
      System.out.println("Q4");
    }
  }
}