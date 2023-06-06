package academy.devdojo.heranca.dominio;

// Atributos protected vão dar acesso a qualquer subclasse da super classe no mesmo pacote.
public class Funcionario extends Pessoa {
  private double salario;

  @Override
  public void imprime(){
    System.out.println("Informações do Funcionário");
    super.imprime();
    System.out.println("Salário: " + salario);
  }

  public Funcionario(){
    super();
  }


  public void relatorioPagamento(){
    System.out.println("Eu: " + this.nome + ", recebi o salário de " + this.salario);
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
