import java.util.Locale;
import java.util.Scanner;

public class AreaCirculoEx2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(Locale.US);
    Locale.setDefault(new Locale("en", "US"));

    double pi = 3.14159;
    double r;
    double a;

    System.out.println("Informe o raio: ");
    r = sc.nextDouble();

    a = pi * (r * r);

    System.out.println("Entrada: ");
    System.out.println(r);

    System.out.println("Saída: ");
    System.out.printf("A = %.4f", a);
  }

}
