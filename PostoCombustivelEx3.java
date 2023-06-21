import java.util.Scanner;
import java.util.Locale;

public class PostoCombustivelEx3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(Locale.US);
    Locale.setDefault(new Locale("en", "US"));

    int codCombustivel;
    // int quant1 = 0;
    // int quant2 = 0;
    // int quant3 = 0;
    int quant1 = 0;
    int quant2 = 0;
    int quant3 = 0;
    codCombustivel = 0;
    while (codCombustivel != 4) {
      System.out.println("Informe o combustível abastecido: ");
      codCombustivel = sc.nextInt();
      if (codCombustivel == 1) {
        quant1 += 1;
        System.out.println("Álcool");
      }
      if (codCombustivel == 2) {
        quant2 += 1;
        System.out.println("Gasolina");
      }
      if (codCombustivel == 3) {
        quant3 += 1;
        System.out.println("Diesel");
      }
    }
    if (codCombustivel == 4) {
      System.out.println("Fim");
      System.out.println("Saída: ");
      System.out.println("MUITO OBRIGADO");
      System.out.println("Alcool: " + quant1);
      System.out.println("Gasolina: " + quant2);
      System.out.println("Diesel: " + quant3);
    } else {
      System.out.println("Código Inválido");
    }
  }
}
