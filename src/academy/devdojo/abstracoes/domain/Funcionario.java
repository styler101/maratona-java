package academy.devdojo.abstracoes.domain;

public abstract class Funcionario extends Pessoa{
  protected String nome;
  protected String funcao;
  protected double salario;

  public Funcionario(){};

  public Funcionario(String nome, String funcao, double salario){
    this.nome = nome;
    this.funcao = funcao;
    this.salario = salario;
  }

  public abstract  void showData();

  public abstract void calculaBonus();


}
