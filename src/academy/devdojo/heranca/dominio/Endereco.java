package academy.devdojo.heranca.dominio;

public class Endereco {
  private String rua;
  private String cep;

  public Endereco(){}

  public Endereco(String rua, String cep){
    this.cep = cep;
    this.rua = rua;
  }

  public String getRua() {
    return rua;
  }

  public void setRua(String rua) {
    this.rua = rua;
  }

  public String getCep() {
    return cep;
  }

  public void setCep(String cep) {
    this.cep = cep;
  }
}

