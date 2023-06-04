package logicadeprogramacao.estrutural;

import java.util.Scanner;

// Exercicio reajuste de salário
public class Exercicio16 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Informe o valor do salário");
    double salario = scanner.nextDouble();
    System.out.println("Informe o percentual de reajuste (Exemplo: 5%)");
    double reajuste = (scanner.nextDouble() /100);
    double salarioReajustado = salario + (salario * reajuste);
    System.out.println("Salário Reajustado: R%$" + salarioReajustado);
  }
}
