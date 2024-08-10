package projectPackage;

public class MedicineDoesNotExistException extends Exception{
    public MedicineDoesNotExistException()
    {
        super("The Medicine does not exists");
    }
}
