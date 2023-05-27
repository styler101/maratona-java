package logicadeprogramacao.estrutural;

import java.util.Scanner;

public class Exercicio4 {
  // Objetivo efetuar o calculo da quantidade de litros de combustivel gastos em uma viagem
  // Nesse exemplo vamos utilizar um veículo que faz 12km o litro.
  // tempo gasto
  // velocidade média[]
  // distancia <- velocidade média * tempo
  // quantidades gasta distancia /12
  // Apresentar velocidade média, tempo gasto, distancia percorrida,  quantidade de litros usados.

  public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Quantas horas foram necessário para realizar a viagem?");
     int hours = scanner.nextInt();
     System.out.println("Qual foi a velocidade média da viagem");
     int velocidadeMedia = scanner.nextInt();
     int distancia = velocidadeMedia * hours;
     double quantidadeLitrosGastos = (double)distancia / 12;
     System.out.println("A velocidade média da viagem foi: " + velocidadeMedia +"Km");
     System.out.println("O tempo gasto na viagem foi: " + hours + "hrs");
     System.out.println("A distância percorrida foi: " + distancia + "Km");
     System.out.println("A quantidade de litros usados foi: " + String.format("%.2f", quantidadeLitrosGastos).replace(",", ".")+" litros");
     scanner.close();
  }

}
