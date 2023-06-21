import java.util.Locale;
import java.util.Scanner;

public class TresValoresEx6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(Locale.US);
    Locale.setDefault(new Locale("en", "US"));

    double a, b, c, areaTRiangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo, pi = 3.14159;

    System.out.println("Informe o valor de A: ");
    a = sc.nextDouble();
    System.out.println("Informe o valor de B: ");
    b = sc.nextDouble();
    System.out.println("Informe o valor de C: ");
    c = sc.nextDouble();

    areaTRiangulo = ((a * c) / 2);
    areaCirculo = (pi * (c * c));
    areaTrapezio = ((a + b) / 2 * c);
    areaQuadrado = (b * b);
    areaRetangulo = (a * b);

    System.out.println("Entrada: ");
    System.out.println(a + " " + b + " " + c);
    System.out.printf("TRIANGULO: %.3f \n", areaTRiangulo);
    System.out.printf("CIRCULO: %.3f \n", areaCirculo);
    System.out.printf("TRAPEZIO: %.3f \n", areaTrapezio);
    System.out.printf("QUADRADO: %.3f \n", areaQuadrado);
    System.out.printf("RETANGULO: %.3f \n", areaRetangulo);
  }

}