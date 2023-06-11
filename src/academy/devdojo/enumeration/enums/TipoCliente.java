package academy.devdojo.enumeration.enums;
// Quanto adicionamos o tipo enumerado, ele recebe um construtor isso nos permite trabalhar com um tipo de um jeito na linguagem e de outro jeito no banco de dados.
// Quantos usamos enumerados temos uma variável values essa váriavel fica responsável por armazenar todos os tipos de values que nos tempos.
public enum TipoCliente {
  PESSOA_FISICA(1, "PESSOA FISÍCA"),
  PESSOA_JURIDICA(2, "PESSOA JURÍDICA");
  private  int valor;
  private String tipoRelatorio;

  TipoCliente(int valor, String nomeTipoRelatorio){
    this.valor = valor;
    this.tipoRelatorio = nomeTipoRelatorio;
  }

  public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio){
    for(TipoCliente item: values()){
      if(item.tipoRelatorio.equalsIgnoreCase(nomeRelatorio)){
        return item;
      }
    }
    return null;
  }
  public int getValor(){
    return valor;
  }
  }
