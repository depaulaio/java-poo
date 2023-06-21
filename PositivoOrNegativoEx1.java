import java.util.Scanner;
import java.util.Locale;

public class PositivoOrNegativoEx1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(Locale.US);
    Locale.setDefault(new Locale("en", "US"));

    int n;

    System.out.print("Informe o valor de n: ");
    n = sc.nextInt();

    if (n > 0) {
      System.out.println("SAÍDA: ");
      System.out.println("NÃO NEGATIVO");
    } else {
      System.out.println("SAÍDA: ");
      System.out.println("NEGATIVO");
    }
  }
}