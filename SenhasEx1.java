import java.util.Scanner;
import java.util.Locale;

public class SenhasEx1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(Locale.US);
    Locale.setDefault(new Locale("en", "US"));

    int senha = 0;
    while (senha != 2002) {
      System.out.println("Informe a senha: ");
      senha = sc.nextInt();
      if (senha != 2002) {
        System.out.println("Senha Inválida!");
      }
    }
    if (senha == 2002) {
      System.out.println("Acesso Permitido!");
      // senha++;
    }
  }
}
