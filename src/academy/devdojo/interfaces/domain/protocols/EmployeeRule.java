package academy.devdojo.interfaces.domain.protocols;

public interface EmployeeRule {
  public double calcSalary(double salary);
  // Interfaces com métodos default podem ser atribuidas implmentações sem o overwrite
  public default void checkValues(){
    System.out.println("Implementando os valores na interface ");
  }
}
