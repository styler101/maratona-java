package academy.devdojo.heranca.dominio;

public class Funcionario extends Pessoa {
  private double salario;

  @Override
  public void imprime(){
    System.out.println("Informações do Funcionário");
    super.imprime();
    System.out.println("Salário: " + salario);
  }
  public Funcionario(double salario) {
    this.salario = salario;
  }

  public Funcionario(String nome, String cpf, Endereco endereco, double salario) {
    super(nome, cpf, endereco);
    this.salario = salario;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }
}
