package logicadeprogramacao.sequencial;
import java.util.Scanner;

public class Exercicio4 {

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    double nota1, nota2, nota3, nota4,media;
    System.out.println("Entre com o nome do aluno");
    String nome = scanner.nextLine();
    System.out.println("Entre com o valor da nota 1 ");
    nota1 = scanner.nextDouble();
    System.out.println("Entre com o valor da nota 2");
    nota2 = scanner.nextDouble();
    System.out.println("Entre com o valor da nota 3");
    nota3 = scanner.nextDouble();
    System.out.println("Entre com o valor da nota 4");
    nota4 = scanner.nextDouble();
    media = (nota1 + nota2 + nota3 + nota4) /4;
    if(media >=7){
      System.out.println("O Aluno: "+ nome );
      System.out.println("Aluno Aprovado: " + media);
      return;
    }
    System.out.println("Entre com  o valor do exame final");
    double exameFinal = scanner.nextDouble();
    double resultado = (exameFinal + media) /2;

    if(resultado >= 5){
      System.out.println("O Aluno :"+ nome + " está aprovado");
      System.out.println("Resultado da média Final: " + String.format("%.2f", resultado));
    }else{
      System.out.println("O Aluno: " + nome + " está reprovado");
      System.out.println("Resultado da média Final: " + String.format("%.2f", resultado));
    }
    scanner.close();
  }
}
