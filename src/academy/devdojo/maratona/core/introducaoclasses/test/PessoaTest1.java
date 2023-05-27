package academy.devdojo.maratona.core.introducaoclasses.test;


import academy.devdojo.maratona.core.introducaoclasses.domain.Estudante;
// Coesão proposito da classe;

public class PessoaTest1 {
  public static void main(String[]args){
    Estudante estudante = new Estudante();
    System.out.println(estudante.nome);
    System.out.println(estudante.idade);
    System.out.println(estudante.sexo);
  }



}

