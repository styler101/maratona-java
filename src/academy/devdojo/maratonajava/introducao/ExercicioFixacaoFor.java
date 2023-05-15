package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class ExercicioFixacaoFor {
  public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Esse programa imprime todos os numeros de pares de 0 até 10000000");
     System.out.println("Informe o número");
     int number = scanner.nextInt();
     if(number > 10000000) {
       System.out.println("O número para não pode ser maior que 10000000");
     }
     int[] vect = new int[number];
     for(int i = 0; i < number; i++){
       if(i % 2 == 0) {
          System.out.println(i);
       }
    }
     scanner.close();

  }
}
