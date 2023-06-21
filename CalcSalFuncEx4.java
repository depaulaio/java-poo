import java.util.Locale;
import java.util.Scanner;

public class CalcSalFuncEx4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(Locale.US);
    Locale.setDefault(new Locale("en", "US"));

    double funcN, horasTrab;
    double valorPorHr, salario;

    System.out.println("Informe o número do funcionário: ");
    funcN = sc.nextInt();
    System.out.println("Informe o número de horas trabalhadas pelo funcionário: ");
    horasTrab = sc.nextInt();
    System.out.println("Informe o valor por hora: ");
    valorPorHr = sc.nextDouble();

    salario = (horasTrab * valorPorHr);

    System.out.println("NUMBER = " + funcN);
    System.out.printf("SALARY = U$ %.2f", salario);
  }
}