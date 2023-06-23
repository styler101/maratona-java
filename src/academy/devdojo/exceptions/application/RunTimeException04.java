package academy.devdojo.exceptions.application;
// Podemos ser utilizar vários catchs os o tipo mais genérico precisa estar sempre no final das classes.
public class RunTimeException04 {
    public static void main(String[]args){
      try{
        int[] values = new int[0];
        values[0] = 1 / 0;
        System.out.println(values[1]);
      }catch(ArrayIndexOutOfBoundsException | ArithmeticException  e){
        System.out.println("Não é possível acessar a posição do array");
      }catch (RuntimeException e){
       e.printStackTrace();
      }
    }


}
