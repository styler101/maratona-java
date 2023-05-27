package academy.devdojo.introducaometodos.dominio;

public class Calculadora {

  public int somar(int number1, int number2){
    return number1 + number2;
  }

  public void subtrair(){
    System.out.println(21 - 10);
  }

  public double dividirDoisNumeros(double num1, double num2){
      if(num2 != 0){
        return num1 / num2;
      }
      return 0;
  }

  public void alteraDoisNumeros(int num1 , int num2){
    num1 = 99;
    num2 = 33;
    System.out.println("Dentro do altera Dois Numeros");
    System.out.println("Num 1" + num1);
    System.out.println("Num2" + num2);
  }

  public void sumArray(int[] values){
    int aux = 0;
    for(int value:values){
      aux+=value;
    }
    System.out.println(aux);
  }

  public  void somaVarArgs(double test, int... numeros){
    int aux = 0;
    for(int value:numeros){
      aux+=value;
    }
    System.out.println(aux);

  }

}
