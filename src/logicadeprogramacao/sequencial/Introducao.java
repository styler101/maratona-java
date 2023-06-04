package logicadeprogramacao.sequencial;

import java.util.Scanner;

// Ler 2 dois números inteiros
// Somar os mesmos atribuindo eles na variável X
// Verificar se a soma dos 2 é maior do que 10
public class Introducao {
     public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Informe o número da variável A");
       int a = scanner.nextInt();
       System.out.println("Informe o número da variável B");
       int b = scanner.nextInt();
       int x = a + b;
       if(x > 10){
         System.out.println("A soma das variáveis é : " + x);
       }
       scanner.close();
     }
}
