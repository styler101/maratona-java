package logicadeprogramacao.estrutural;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Exercicio5 {
    //  Precisamos calcular o valor de uma prestação em atraso.
    // valor da prestação
    // valor do juros.
    // pergar o valor do tempo em dias
    // Desafio: Receber a data de vencimento e compara com data de hoje para realizar o calcúlo.
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
      SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
       Date date = new Date();
       String currentDateFormat = sdf.format(date);
       System.out.println("Informe o valor da prestação");
       double valueToPay = scanner.nextDouble();
       System.out.println("Informe o valor do impost");
       double tax = scanner.nextDouble();
       System.out.println("Informe a data de vencimento da fatura DD/MM/YYYY");
       scanner.nextLine();
       String billExpired = scanner.nextLine();
      try {
        long diffInMileseconds = Math.abs(sdf.parse(billExpired).getTime() - sdf.parse(currentDateFormat).getTime());
        long parsedDiffToDays = TimeUnit.DAYS.convert(diffInMileseconds, TimeUnit.MILLISECONDS);
         double result = valueToPay + (valueToPay * (tax /100)) * parsedDiffToDays;
         System.out.println("O valor com os ajustes a seram pagos é : " + result);

      } catch (ParseException e) {
        throw new RuntimeException(e);
      }

       scanner.close();
    }

}
