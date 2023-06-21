import java.util.Scanner;
import java.util.Locale;

public class LisarbEx8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(Locale.US);
    Locale.setDefault(new Locale("en", "US"));

    double renda, valorTrib, valorTrib2, valorTrib3, valorTrib4, impRenda;

    System.out.println("Informe a renda: ");
    renda = sc.nextDouble();

    if (renda >= 0.00 && renda <= 2000.00) {
      System.out.println("Entrada:");
      System.out.printf("%.2f \n", renda);
      System.out.println("Insento");
    }
    if (renda >= 2000.01 && renda <= 3000.00) {
      System.out.println("Trbutável 8% acima do valor máximo de isenção.");
      valorTrib = (renda - 2000.00);
      impRenda = (valorTrib * 0.08);
      System.out.println("Entrada:");
      System.out.printf("%.2f \n", renda);
      System.out.println("Saída:");
      System.out.printf("%.2f \n", impRenda);
    }
    if (renda >= 3000.01 && renda <= 4500.00) {
      System.out.println("Tributável 18% acima do valor máximo de isenção.");
      valorTrib = (renda - 2000.00);
      valorTrib2 = (renda - 3000.00);
      valorTrib3 = (valorTrib - valorTrib2);
      impRenda = (valorTrib2 * 0.18) + (valorTrib3 * 0.08);
      System.out.println("Entrada:");
      System.out.printf("%.2f \n", renda);
      System.out.println("Saída:");
      System.out.printf("%.2f \n", impRenda);
    }
    if (renda >= 4500.00) {
      System.out.println("Tributável 28% acima do valor máximo de isenção.");
      valorTrib3 = (renda - 4500.00);
      valorTrib2 = (renda - valorTrib3 - 3000.00);
      valorTrib = (renda - valorTrib2 - valorTrib3);
      valorTrib4 = (valorTrib - 2000.00);
      impRenda = (valorTrib3 * 0.28) + (valorTrib2 * 0.18) + (valorTrib4 * 0.08);
      System.out.println("Entrada:");
      System.out.printf("%.2f \n", renda);
      System.out.println("Saída:");
      System.out.printf("%.2f \n", impRenda);
    }
    if (renda < 0.0) {
      System.out.println("Entrada:");
      System.out.printf("%.2f \n", renda);
      System.out.println("Valor inválido!");
    }
  }
}
