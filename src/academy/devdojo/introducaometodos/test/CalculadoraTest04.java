package academy.devdojo.introducaometodos.test;

import academy.devdojo.introducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {

  public static void main(String[] args) {
    Calculadora cal = new Calculadora();
    int num1 = 22;
    int num2 = 11;
    cal.alteraDoisNumeros(22, 11); // No java os parâmetros de variáveis são passados por cópia nos parâmetros.
    System.out.println("Num 1: " + num1);
    System.out.println("Num 2:" + num2);
  }
}
