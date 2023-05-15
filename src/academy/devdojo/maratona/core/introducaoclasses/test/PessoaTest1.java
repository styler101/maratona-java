package academy.devdojo.maratona.core.introducaoclasses.test;


import academy.devdojo.maratona.core.introducaoclasses.domain.Estudante;


public class PessoaTest1 {
  public static void main(String[]args){
    Estudante estudante = makeSut();
    System.out.println(estudante.nome);
    System.out.println(estudante.idade);
    System.out.println(estudante.sexo);
  }


  private static Estudante makeSut(){
     Estudante estudante = new Estudante();
     estudante.nome = "any_name";
     estudante.idade = 29;
     estudante.sexo = 'C';
     return estudante;
  }
}

