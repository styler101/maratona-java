package logicadeprogramacao.sequencial;

import java.util.Scanner;

public class Exercicio3 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    double nota1, nota2, nota3,nota4,media;
    System.out.println("Entre com a nota 1");
    nota1 = scanner.nextDouble();
    System.out.println("Entre com a nota 2");
    nota2 = scanner.nextDouble();
    System.out.println("Entre com a nota 3");
    nota3 = scanner.nextDouble();
    System.out.println("Entre com a nota 4");
    nota4 = scanner.nextDouble();

    media = (nota1 + nota2 + nota3 + nota4) / 4;
    if(media > 5){
      System.out.println("Aluno aprovado :" + media);
    }else{
      System.out.println("Aluno Reprovado: " + media);
    }

    scanner.close();
  }
}
