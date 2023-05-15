package academy.devdojo.maratonajava.introducao;
import java.util.Locale;

public class EstruturasCondicionais {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
      double salario = 6000;
      String resultado = salario > 5000 ? "Eu vou doar 500 pro DevDojo" : "Ainda não tenho condições, mas vou ter!";
      boolean possoComprarUmPS5 = salario > 6000 ? true : false;
      System.out.println(resultado);
      System.out.println(possoComprarUmPS5);
  }
}
