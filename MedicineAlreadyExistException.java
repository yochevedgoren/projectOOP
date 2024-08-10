package projectPackage;

public class MedicineAlreadyExistException extends Exception{
  public MedicineAlreadyExistException()
  {
    super("The Medicine already exists");
  }
}
