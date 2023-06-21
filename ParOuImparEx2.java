import java.util.Scanner;
import java.util.Locale;

public class ParOuImparEx2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(Locale.US);
    Locale.setDefault(new Locale("en", "US"));

    int n;

    System.out.println("Entrada: ");
    n = sc.nextInt();

    if (n % 2 == 0) {
      System.out.println("Saída: ");
      System.out.println("PAR");
    } else {
      System.out.println("Saída: ");
      System.out.println("ÍMPAR");
    }
  }
}
