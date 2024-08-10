package projectPackage;

//מחלקת סירופ
public class Syrup extends Medicine{

    //Attribute
    private int bottleContent;

    //Constructor
    public Syrup(String medicine_name,String company_name,String company_email,double price,int quantity,int expiration_year,int bottleContent){
        super(medicine_name,company_name,company_email,price,quantity,expiration_year,Type.SYRUP);
        this.setBottleContent(bottleContent);
    }

    //getter
    public int getBottleContent() {return this.bottleContent;}

    //setter
    public void setBottleContent(int bottleContent) {
        try {this.bottleContent = bottleContent;}
        catch (NumberFormatException e)
        {e.printStackTrace();}}

    //override of the tostring method
    @Override
    public String toString() {
        return "Syrup{" +
                "bottleContent=" + this.bottleContent +
                '}'+ super.toString();
    }

    //override of the totalInventory method
    @Override
    public int totalInventory() {
        return this.bottleContent* this.quantity;
    }
}
