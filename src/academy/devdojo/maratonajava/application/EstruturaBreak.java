package academy.devdojo.maratonajava.application;

import java.util.Scanner;

public class EstruturaBreak {

  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      for(int i = 0; i < 50; i++){
        if(i > 24) break;
        System.out.println(i);
      }
      scanner.close();
  }

}
