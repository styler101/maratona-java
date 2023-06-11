package academy.devdojo.interfaces.domain;

import academy.devdojo.interfaces.domain.protocols.EmployeeRule;

public class Funcionario implements EmployeeRule {

  private String nome;
  private String funcao;
  private double salario;


  @Override
  public double calcSalary(double salary) {
    return salary * 0.5;
  }
}
