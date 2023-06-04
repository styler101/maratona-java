package logicadeprogramacao.sequencial;

import java.util.Scanner;

// Calcular o reajuste de um salário
// salario < 500 -> 15%
// salario > 500  || salario <= 1000 -> 10%
// salario > 1000 -> 5%
public class ExercicioIntroducao2 {
    public static void main(String[]args){
     Scanner scanner = new Scanner(System.in);
     System.out.println("Entre com o salário do funcionário");
     double salario = scanner.nextDouble();
     double salarioReajustado;
     if(salario < 500){
       salarioReajustado = salario + (salario * ((double)15 /100));
     }else if(salario <= 1000){
        salarioReajustado = salario + (salario * ((double) 10/100));
     }else{
        salarioReajustado = salario + (salario * ((double) 5/100));
     }
     System.out.println("O salário do Funcionário é: " + salario);
     System.out.println("O salário do Funcionário com o reajuste é:" + salarioReajustado);
     scanner.close();

    }
}
