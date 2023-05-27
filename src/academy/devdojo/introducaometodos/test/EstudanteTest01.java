package academy.devdojo.introducaometodos.test;

import academy.devdojo.introducaometodos.dominio.Estudante;

public class EstudanteTest01 {
  public static void main(String[] args) {
     Estudante estudante1 = new Estudante();
     Estudante estudante2 = new Estudante();

     estudante1.nome = "Lucas";
     estudante1.idade = 29;
     estudante1.sexo = 'M';

     estudante2.nome = "Fernanda";
     estudante2.idade = 29;
     estudante2.sexo = 'F';
  }

}
