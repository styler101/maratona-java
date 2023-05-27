package academy.devdojo.introducaometodos.dominio;
// Coasão a classe precisa conhecer apenas ela.
// Auto acoplamento ruim
// Auto coesão bom
public class Pessoa {
    private String nome;
    private int idade;

    public String getNome(){
      return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
      return idade;
    }
    public void setIdade(int idade){
      if(idade < 1){
        System.out.println("Idade invalída!");
        return;
      }
      this.idade = idade;
    }
    public void imprime(){
      System.out.println(getNome());
      System.out.println(getIdade());
    }

}
