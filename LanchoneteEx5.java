import java.util.Scanner;
import java.util.Locale;

public class LanchoneteEx5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(Locale.US);
    Locale.setDefault(new Locale("en", "US"));

    int cod, quant;
    double preco;

    System.out.println("Código 1: Cachorro Quente");
    System.out.println("Código 2: X-Salada");
    System.out.println("Código 3: X-Bacon");
    System.out.println("Código 4: Torrada Simples");
    System.out.println("Código 5: Refrigerante");
    System.out.println("Informe o codigo do item: ");
    cod = sc.nextInt();
    System.out.println("Informe a quantidade do produto: ");
    quant = sc.nextInt();

    if (cod == 1) {
      preco = (4.00 * quant);
      System.out.println("Entrada: ");
      System.out.println(cod + " " + quant);
      System.out.println("Saída: ");
      System.out.printf("Total: R$ %.2f", preco, " \n");
    }
    if (cod == 2) {
      preco = (4.50 * quant);
      System.out.println("Entrada: ");
      System.out.println(cod + " " + quant);
      System.out.println("Saída: ");
      System.out.printf("Total: R$ %.2f", preco, " \n");
    }
    if (cod == 3) {
      preco = (5.00 * quant);
      System.out.println("Entrada: ");
      System.out.println(cod + " " + quant);
      System.out.println("Saída ");
      System.out.printf("Total: R$ %.2f", preco, "\n");
    }
    if (cod == 4) {
      preco = (2.00 * quant);
      System.out.println("Entrada: ");
      System.out.println(cod + " " + quant);
      System.out.println("Saída: ");
      System.out.printf("Total: R$ %.2f", preco, " \n");
    }
    if (cod == 5) {
      preco = (1.50 * quant);
      System.out.println("Entrada: ");
      System.out.println(cod + " " + quant);
      System.out.println("Saída ");
      System.out.printf("Total: R$ %.2f", preco, " \n");
    }
  }
}
