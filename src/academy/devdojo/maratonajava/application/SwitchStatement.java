package academy.devdojo.maratonajava.application;

public class SwitchStatement {

  public static void main(String[] args) {
      int dayOfWeek = 0;

      switch(dayOfWeek){
        case 0:
          System.out.println("Domingo");
          break;
         case 1:
          System.out.println("Segunda-Feira");
          break;
         case 2:
          System.out.println("Terça-Feira");
          break;
         case 3:
          System.out.println("Quarta-Feira");
          break;
         case 4:
          System.out.println("Quinta-Feira");
          break;
         case 5:
          System.out.println("Sexta-Feira");
          break;
          case 6:
          System.out.println("Sábado");
          break;
        default:
          System.out.println("Opção Invalida!");
          break;
      }
  }
}
