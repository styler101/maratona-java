package academy.devdojo.maratona.core.introducaoclasses.test;

import academy.devdojo.maratona.core.introducaoclasses.domain.Professor;
// Coesão é o próposito da nossa classe.
public class ProfessorTest1 {

  public static void main(String[] args) {
    Professor professor1 = new Professor();
    professor1.nome = "Otavio";
    professor1.idade = 39;
    professor1.sexo = 'F';

    System.out.println(professor1.nome + " " +  professor1.idade  + " "  + professor1.sexo);
  }
}
