package academy.devdojo.introducaometodos.test;

import academy.devdojo.introducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
  public static void main(String[] args) {
    Calculadora calculadora = new Calculadora();
    calculadora.sumArray(makeSut());
    calculadora.somaVarArgs(1,2,3,4,5);
  }


  private static int[] makeSut(){
    return new int[]{1,2,3,6};
  }

}

