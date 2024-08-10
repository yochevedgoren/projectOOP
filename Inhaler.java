package projectPackage;

//מחלקת משאף
public class Inhaler extends Medicine{

    //Attribute
    private int amountOfClick;

    //Constructor
    public Inhaler(String medicine_name,String company_name,String company_email,double price,int quantity,int expiration_year,int amountOfClick){
        super( medicine_name,company_name,company_email,price,quantity,expiration_year,Type.INHALER);
        this.setAmountOfClick(amountOfClick);
    }

    //getter
    public int getAmountOfClick() {return this.amountOfClick;}

    //setter
    public void setAmountOfClick(int amountOfClick) {
        try {this.amountOfClick = amountOfClick;}
        catch (NumberFormatException e)
        {e.printStackTrace();}}

    //override of the tostring method
    @Override
    public String toString() {
        return "Syrup{" +
                "amountOfClick=" + this.amountOfClick +
                '}'+ super.toString();
    }

    //override of the totalInventory method
    @Override
    public int totalInventory() {
        return this.amountOfClick* this.quantity;
    }
}
