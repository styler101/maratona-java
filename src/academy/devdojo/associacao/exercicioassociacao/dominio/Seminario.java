package academy.devdojo.associacao.exercicioassociacao.dominio;

public class Seminario {
  private String titulo;
  private Local local;

  private Aluno[] alunos;


  public Seminario(){
  }
  public Seminario(String titulo, Local local){
    this.titulo = titulo;
    this.local = local;
  }

  public Seminario(String titulo, Local local, Aluno[] alunos) {
    this.titulo = titulo;
    this.local = local;
    this.alunos = alunos;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public Local getLocal() {
    return local;
  }

  public void setLocal(Local local) {
    this.local = local;
  }

  public Aluno[] getAlunos() {
    return alunos;
  }

  public void setAluno(Aluno[] aluno) {
    this.alunos = aluno;
  }
}
