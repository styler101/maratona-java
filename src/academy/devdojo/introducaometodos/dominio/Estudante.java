package academy.devdojo.introducaometodos.dominio;

public class Estudante {

    public String nome;
    public int idade;
    public char sexo;

    public void imprimeDados(){
      System.out.println(this.nome);
      System.out.println(this.idade);
      System.out.println(this.sexo);
    }

}
