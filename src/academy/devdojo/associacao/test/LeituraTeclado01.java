package academy.devdojo.associacao.test;

import java.util.Scanner;

public class LeituraTeclado01 {
    public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      System.out.println("Linux é o melhor sistema operacional");
      char resp = scanner.nextLine().charAt(0);
      System.out.println(resp != 'S' ? "Sabe de nada inocente!" : "Certa a resposta");
      scanner.close();

    }
}
