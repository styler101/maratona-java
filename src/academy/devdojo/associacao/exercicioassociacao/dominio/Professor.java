package academy.devdojo.associacao.exercicioassociacao.dominio;

public class Professor {
  private String nome;

  private String especialidade;

  private Seminario[] semarios;

  public Professor(){}

  public void informacoesDoSeminario(){
    System.out.println("Professor: " + this.getNome());
    System.out.println("Especialidade: " + this.getEspecialidade());
    if(this.semarios == null) return;
    System.out.println("## Seminarios Cadastrados ##");
    for(Seminario seminario: semarios){
      System.out.println("Titulo: "+ seminario.getTitulo());
      System.out.println("Local: "+   seminario.getLocal() == null ? "Local ainda não definido" : seminario.getLocal().getEndereco());
      for(Aluno aluno: seminario.getAlunos()){
        System.out.println(aluno.getNome());
      }
    }
  }

  public Professor(String nome, String especialidade){
    this.nome = nome;
    this.especialidade = especialidade;
  }

  public Professor(String nome, String especialidade, Seminario[] semarios) {
    this.nome = nome;
    this.especialidade = especialidade;
    this.semarios = semarios;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEspecialidade() {
    return especialidade;
  }

  public void setEspecialidade(String especialidade) {
    this.especialidade = especialidade;
  }

  public Seminario[] getSemarios() {
    return semarios;
  }

  public void setSemarios(Seminario[] semarios) {
    this.semarios = semarios;
  }
}
