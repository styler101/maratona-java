package academy.devdojo.enumeration.enums;
// Podemos adicionar método dentro do nosso tipo enumerado.
// Sempre que precisamos efetuar algum tipo de calculo do base em um tipo devemos usar um classe abstrata como padrão.
// Essa classe abstrata não terá corpo com isso podemos apenas implementar as mesmas.
public enum TipoPagamento {
  CREDITO{
    @Override
    public double calcularDesconto(double valor) {
      return valor * 0.05;
    }
  },
  DEBITO{
    @Override
    public double calcularDesconto(double valor) {
      return valor * 0.1;
    }
  };

  public abstract double calcularDesconto(double valor);


}
