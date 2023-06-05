package logicadeprogramacao.sequencial;

import java.util.Scanner;

// Ler dois números apresentar o resultado da diferença do maior valor pelo menor valor.
public class Exercicio1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter with number A");
    int a = scanner.nextInt();
    System.out.println("Enter with number B");
    int b = scanner.nextInt();
    int diff;
    if(a > b){
      diff = a - b;
      System.out.println("A diferença do maior valor A para B é :" + diff);
    }else{
      diff = b - a;
      System.out.println("A difenrença do maior valor B para A é :" + diff);
    }
    scanner.close();
  }
}
