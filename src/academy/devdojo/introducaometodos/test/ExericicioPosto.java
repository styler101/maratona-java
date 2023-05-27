package academy.devdojo.introducaometodos.test;

import java.util.Scanner;

public class ExericicioPosto {

    public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      int distancePorLitro = 12;
      System.out.println("Informe o tempo percorrido na viagem? ");
      int distancia = scanner.nextInt();
      System.out.println("Informe a velocidade média gasta na viagem? ");
      double averageSpeed = scanner.nextDouble();
      double distance = distancia * averageSpeed;
      double consumed = distance / distancePorLitro;
      System.out.println("VELOCIDADE MÉDIA : " + averageSpeed);
      System.out.println("Tempo Gasto: " + distancia);
      System.out.println("Distância Percorrida:"+ distance + "KM");
      System.out.println("LITROS CONSUMIDOS: " + consumed);
      scanner.close();
    }
}

