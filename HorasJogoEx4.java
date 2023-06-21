import java.util.Scanner;
import java.util.Locale;

public class HorasJogoEx4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(Locale.US);
    Locale.setDefault(new Locale("en", "US"));

    int a, b, c, d;

    System.out.println("Informe a hora de início: ");
    a = sc.nextInt();
    System.out.println("Informa a hora final: ");
    b = sc.nextInt();

    if (a == b) {
      System.out.println("O JOGO DUROU 24 HORA(S)");
    }
    if (a < b) {
      c = (b - a);
      System.out.println("O JOGO DUROU " + c + " HORA(S)");
    }
    if (a > b) {
      d = 24 - (a - b);
      System.out.println("O JOGO DUROU " + d + " HORAS(S)");
    }
  }
}
