package logicadeprogramacao.estrutural;

import java.util.Scanner;

public class exercicio7 {
  // Ler quatro valores
  // realizar  o conceito de propriedade distribuitiva
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    int d = scanner.nextInt();

    int combinationSumA = (a + b) + (a + c) + (a + d);
    int combinationSumB = (b + c) + (b + d);
    int combinationSumC = (c + d);

    int combinationPlusA = (a * b) + (a * c) + (a * d);
    int combinationPlusB = (b * c) + (b * d);
    int combinationPlusC = (c * d);

    System.out.println("Combination Sum A: " + combinationSumA);
    System.out.println("Combination Sum B: " + combinationSumB);
    System.out.println("Combination Sum C: " + combinationSumC);

    System.out.println("Combination Plus A: " + combinationPlusA);
    System.out.println("Combination Plus B: " + combinationPlusB);
    System.out.println("Combination Plus C: " + combinationPlusC);



    scanner.close();
  }
}
