import java.util.Scanner;
import java.util.Locale;

public class QuantIntIntervaloEx2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(Locale.US);
    Locale.setDefault(new Locale("en", "US"));

    int n;
    int valorInteiro;

    System.out.println("Informe o valor de n: ");
    n = sc.nextInt();

    int somaIn = 0;
    int somaOut = 0;
    System.out.println("ENTRADA: ");
    for (int i = 1; i <= n; i++) {
      // System.out.println("ENTRADA: ");
      // System.out.println("Informe um valor inteiro: ");
      valorInteiro = sc.nextInt();
      if (valorInteiro >= 10 && valorInteiro <= 20) {
        somaIn = somaIn + 1;
        // System.out.println("O valor inteiro (" + valorInteiro + ") informado está
        // dentro do intervalo [10, 20].");
      } else {
        somaOut = somaOut + 1;
        // System.out.println("O valor inteiro (" + valorInteiro + ") informado, não
        // está dentro do intervalo [10, 20].");
      }
    }
    System.out.println("SAÍDA: ");
    // System.out.println(" A soma de valores inteiro dentro do intervalo é: ");
    System.out.println(somaIn + " in");
    // System.out.println(" A soma de valores fora do intervalo é: ");
    System.out.println(somaOut + " out");
  }
}