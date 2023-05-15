package academy.devdojo.maratonajava.introducao;

import java.util.Locale;
import java.util.Scanner;

public class Aula03Exercicio {

  public static void main(String[] args){
    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter with your name: ");
    String userName = scanner.nextLine();
    System.out.println("Enter with the address: ");
    String userAddress = scanner.nextLine();
    System.out.println("Enter with your salary");
    double userSalary = scanner.nextDouble();
    scanner.nextLine();
    System.out.println("Enter with the current date dd/mm/yyyy");
    String userPaymentDate = scanner.nextLine();
    System.out.printf("Eu %s , morando no endereço %s, confirmo que recebi o salário de %.2f , na data %s", userName, userAddress, userSalary, userPaymentDate);
    scanner.close();
  }

}
