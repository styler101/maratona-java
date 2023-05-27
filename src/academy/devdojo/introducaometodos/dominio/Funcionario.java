package academy.devdojo.introducaometodos.dominio;

public class Funcionario {

    private String nome;
    private int idade;
    private double[] salarios;

    public String getNome() {
      return nome;
    }

    public void setNome(String nome) {
      this.nome = nome;
    }

    public int getIdade() {
      return idade;
    }

    public void setIdade(int idade) {
      this.idade = idade;
    }

    public double[] getSalarios() {
      return salarios;
    }

    public void setSalarios(double[] salarios) {
      this.salarios = salarios;
    }

      public void imprimirDados(){
        int aux= 0;
        System.out.println("Nome do funcionário" + this.nome);
        System.out.println("Idade do funcionário" + this.idade);
        System.out.println("Salários do funcionário");
        for(double salario:salarios){
          ++aux;
          System.out.printf("Salário %d %.2f %n" , aux, salario);
        }
      }

      public double salaryAverage(){
        double sum = 0;
        for(double salario:salarios){
          sum+= salario;
        }
        return  sum / salarios.length;
      }


}
