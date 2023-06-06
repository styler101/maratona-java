package academy.devdojo.heranca.dominio;

public class Pessoa {

  protected String nome;
  protected String cpf;

  protected Endereco endereco;
  public Pessoa(){};

  public Pessoa(String nome){
    this.nome = nome;
  }
  public Pessoa(String nome, String cpf, Endereco endereco ){
    this(nome);
    this.cpf = cpf;
    this.endereco = endereco;
  }

  public void imprime(){
    System.out.println("Nome :" + this.getNome());
    System.out.println("CPF: " + this.getCpf());
    System.out.println("Endereço: " + this.getEndereco());
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public Endereco getEndereco() {
    return endereco;
  }

  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }
}
