package projectPackage;

//מחלקת כדורים
public class Pills extends Medicine
{
    //Attribute
    private int numOfPillsInBox;

    //Constructor
    public Pills(String medicine_name,String company_name,String company_email,double price,int quantity,int expiration_year,int numOfPillsInBox){
        super(medicine_name,company_name,company_email,price,quantity,expiration_year,Type.PILL);
        this.setNumOfPillsInBox(numOfPillsInBox);
    }

    //getter
    public int getNumOfPillsInBox() { return this.numOfPillsInBox;}

    //setter
    public void setNumOfPillsInBox(int numOfPillsInBox) {
        try {this.numOfPillsInBox = numOfPillsInBox;}
        catch (NumberFormatException e)
        {e.printStackTrace();}}

    //override of the tostring method
    @Override
    public String toString() {
        return "Pills{" +
                "numOfPillsInBox=" + this.numOfPillsInBox +
                  '}'+
                super.toString();
    }

    //override of the totalInventory method
    @Override
    public int totalInventory() {
        return this.numOfPillsInBox* this.quantity;
    }
}
