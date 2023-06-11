package academy.devdojo.abstracoes.domain;

public class Gerente extends Funcionario{

  public Gerente(){
    super();
  }

  public Gerente(String nome, String funcao, double salario){
    super(nome, funcao, salario);
  }



  @Override
  public void showData() {
    System.out.println("Dados do empregado");
    System.out.println("Nome do empregado: " + this.nome);
    System.out.println("Função do empregado: " + this.funcao);
    System.out.println("Salário do empregado: " + this.salario);
  }

  @Override
  public void calculaBonus() {
    System.out.println(this.salario = salario + salario * 0.2);
  }

  @Override
  public void imprime() {

  }
}
