package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class EstruturaBreak {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Informe o valor do veículo");
    double carValue = sc.nextDouble(); // 40.000
    char resp = 'S';
    int result;
    while(resp != 'N'){
       System.out.println("Informe o valor da parcela");
       int parcela = sc.nextInt();
       if(parcela < 1000) {
         System.out.println("Só é possível parcelar realizar parcelas para veículos com parcela acima 1.000");
         resp = 'N';
         break;
       }
       result = (int)carValue / parcela;
       System.out.printf("A condição de parcelamento do veículo  são %d parcelas de %d", result, parcela);
       break;

    }


    sc.close();
  }


}
