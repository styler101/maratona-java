package academy.devdojo.maratonajava.application;

import java.util.Scanner;

public class ExercicioFixacaoEstruturaCondicional {

  public static void main(String[] args) {
      // Saber qual valor do salário do funcionário
      // 0 á 34,712 = 9.70%
      // 34.713  a 68.507 = 37.35%
      // 68.508 = 49.50%
      Scanner scanner = new Scanner(System.in);
      System.out.println("Please enter with your salary");
      double salary = scanner.nextDouble();
      double result;
      double impost;

      if( salary <= 34.712){
          impost = 9.70 / 100;
         impost =salary *impost;
          System.out.println(salary);
      }else if( salary >= 34.713 && salary <= 68.507 ){
        impost = 37.35 / 100;
        impost =salary *impost;
        System.out.println(impost);
      }else{
        impost = 49.50 / 100;
        impost = salary * impost;
        System.out.println(impost);
      }


      scanner.close();
  }
}
