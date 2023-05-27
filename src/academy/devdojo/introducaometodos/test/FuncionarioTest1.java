package academy.devdojo.introducaometodos.test;

import academy.devdojo.introducaometodos.dominio.Funcionario;

import javax.swing.*;

public class FuncionarioTest1 {
  public static void main(String[] args) {
    Funcionario funcionario = new Funcionario();
    funcionario.setNome("Lucas");
    funcionario.setIdade(29);
    int salaryQuant= Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos salários você deseja cadastrar"));
    double[] salarys = new double[salaryQuant];
    for(int i = 0; i < salarys.length; i++){
      double salary = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o salário do funciónario"));
      salarys[i] = salary;
    }
    funcionario.setSalarios(salarys);

    funcionario.imprimirDados();
    double salaryAverage = funcionario.salaryAverage();
    System.out.println("Média do Salário : " + salaryAverage);
  }
}
