import java.util.Scanner;

public class DiferencaInteirosEx3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a, b, c, d, difProd;

    System.out.print("Informe o valor de a: ");
    a = sc.nextInt();
    System.out.print("Informe o valor de b: ");
    b = sc.nextInt();
    System.out.print("Informe o valor de c: ");
    c = sc.nextInt();
    System.out.print("Informe o valor de d: ");
    d = sc.nextInt();

    difProd = (a * b - c * d);

    System.out.println("Entrada: ");
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);

    System.out.println("Saída: ");
    System.out.print("DIFERENÇA = " + difProd);

  }
}