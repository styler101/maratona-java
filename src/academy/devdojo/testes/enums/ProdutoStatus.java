package academy.devdojo.testes.enums;

public enum ProdutoStatus {
  ACTIVE(1),
  INACTIVE(2);

  private int currentStatus;

  ProdutoStatus(int currentStatus){
    this.currentStatus = currentStatus;
  }

  public int getCurrentStatus(){
    return currentStatus;
  }


}
