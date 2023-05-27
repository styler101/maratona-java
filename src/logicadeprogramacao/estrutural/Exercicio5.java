package logicadeprogramacao.estrutural;

import java.util.Scanner;

public class Exercicio5 {
    //  Precisamos calcular o valor de uma prestação em atraso.
    // valor da prestação
    // valor do juros.
    // pergar o valor do tempo em dias
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Informe o valor da prestação");
       double valueToPay = scanner.nextDouble();
       System.out.println("Informe o valor do impost");
       double tax = scanner.nextDouble();
       System.out.println("Informe a quantos dias se passaram após o vencimento dos mesmo?");
       int days = scanner.nextInt();
       double result = valueToPay + (valueToPay * (tax /100)) * days;
       System.out.println("O valor com os ajustes a seram pagos é : " + result);
       scanner.close();
    }

}
