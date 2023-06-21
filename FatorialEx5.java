import java.util.Scanner;
import java.util.Locale;

public class FatorialEx5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(Locale.US);
    Locale.setDefault(new Locale("en", "US"));

    int n;

    // System.out.println("Informe o valor de n: ");
    System.out.println("ENTRADA: ");
    n = sc.nextInt();

    int fatN = 1;

    for (int i = 1; i <= n; i++) {
      fatN = fatN * i;
    }
    // System.out.println("O fatorial de " + n + " é: " + fatN);
    System.out.println("SAÍDA: \n" + fatN);
  }
}