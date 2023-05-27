package logicadeprogramacao.estrutural;

import java.util.Scanner;

public class Exercicio8 {
  // Realizar o calculo de um volume de uma caixa retangular
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Informe o valor do comprimento");
    int comprimento = scanner.nextInt();
    System.out.println("Informe o valor da largura");
    double largura = scanner.nextDouble();
    System.out.println("Informe o valor da altura");
    double altura = scanner.nextDouble();
    double volume = comprimento * largura * altura;
    System.out.println("Resultado: " + String.format("%.2f", volume).replace(",", "."));

    scanner.close();
  }

}
