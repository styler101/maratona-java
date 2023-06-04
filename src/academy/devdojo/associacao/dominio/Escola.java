package academy.devdojo.associacao.dominio;


import academy.devdojo.associacao.dominio.implementation.EscolaImp;

public class Escola implements EscolaImp {

  private String nome;

  private Professor[] professores;

  public Escola() {
  }

  public Escola(String nome) {
    this.nome = nome;
  }

  public void imprime(){
    System.out.println("Informação da escola");
    System.out.println("Nome da escola: "+ this.getNome());
    if(this.getProfessores() != null && this.getProfessores().length > 0){
      System.out.println("Os professores da escola");
      for(Professor item: professores){
        System.out.println(item.getNome());
      }
    }else{
      System.out.println("A escola ainda não possui professores");
    }

  }


  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Professor[] getProfessores() {
    return professores;
  }

  public void setProfessores(Professor[] professores) {
    this.professores = professores;
  }
}
