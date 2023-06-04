package logicadeprogramacao.sequencial;

import java.util.Scanner;

public class ExercicioIntroducao {

    public static void main(String[]args){
      Scanner scanner = new Scanner(System.in);
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      int x =  a + b;
      if(x > 10){
        System.out.println("O valor da variável X é maior do que 10, então será atribuido mais 5 no valor: " + (x + 5));
      }else{
        System.out.println("O valor da variável x é menor do que 10, então será decrementado menos 7 no valor: " + (x - 7));
      }
      scanner.close();
    }
}
