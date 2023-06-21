import java.util.Locale;
import java.util.Scanner;

public class SomaInteirosEx1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(Locale.US);
    Locale.setDefault(new Locale("en", "US"));

    int n1, n2, soma;

    System.out.print("Informe n1: ");
    n1 = sc.nextInt();
    System.out.print("Informe n2: ");
    n2 = sc.nextInt();

    soma = (n1 + n2);

    System.out.println("Entrada:");
    System.out.println(n1);
    System.out.println(n2);

    System.out.println("Saída: ");
    System.out.print("SOMA = " + soma);

  }

}