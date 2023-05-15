package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
  public static void main(String[] args) {
    // Tipos primitivos
    // int, double, float, char, byte, short, long, boolean
    double salario = 2000;
    float salarioFloat = 2508.50f;
    byte idadeByte = 10; // -128 a 127
    short idadeShort = 10;
    boolean result = true;
    long valorEmMilhoes = 123012401242L;
    char caractere = 'L';
    String value = String.valueOf(salario);
    String nome = "Goku";
    System.out.println("Oi meu nome é " + nome);
    String nome2 = "Vegeta";
    System.out.println("Meu nome é " + nome2 + "e eu sou o princípe do saiyajins");
  }
}
