package projectPackage;

import java.util.Date;

 enum Type {
    PILL,SYRUP,INHALER;
}

//מחלקת תרופה
public abstract class Medicine {

     //Attribute
    protected String medicine_name;
    protected String company_name;
    protected String company_email;
    protected double price;
    protected int quantity; //מספר קופסאות
    protected int expiration_year; //שנת תפוגה
    protected Type type; // סוג התרופה - משנה Enum

    //Constructor
    public Medicine(String medicine_name,String company_name,String company_email,double price,int quantity,int expiration_year,Type type)
    {
        this.setMedicine_name(medicine_name.toUpperCase());
        this.setCompany_name(company_name);
        this.setPrice(price);
        this.setQuantity(quantity);
        this.setExpiration_year(expiration_year);
        this.setType(type);
        this.setCompany_email(company_email);
    }


    //getters
    public String getMedicine_name() { return this.medicine_name;}
    public String getCompany_name() { return this.company_name; }
    public String getCompany_email() { return this.company_email;}
    public double getPrice() {return this.price; }
    public int getQuantity() {return this.quantity;}
    public int getExpiration_year() {return this.expiration_year;}
    public Type getType() { return this.type; }

    //setters
    public void setMedicine_name(String medicine_name) {
         try {
            if(medicine_name!="")
                this.medicine_name = medicine_name;
            else
                throw new NullPointerException();
        }
        catch (NullPointerException e)
        {e.printStackTrace();}
    }
    public void setCompany_name(String company_name) {
        try {
            if(company_name!="")
              this.company_name = company_name;
            else
                throw new NullPointerException();
        }
        catch (NullPointerException e)
        {e.printStackTrace();}}

    public void setCompany_email(String company_email) {

        try {
            boolean emailcontainchar, valueinlast, degel = false;
            char valueinfirst;
            int indexS, indexDot;
            emailcontainchar = company_email.contains("@");
            valueinfirst = company_email.charAt(0);
            valueinlast = company_email.endsWith("@");
            indexS = company_email.indexOf('@');
            indexDot = company_email.indexOf(".", indexS);
            if (emailcontainchar == false) {
                System.out.println("Error:@ is missing in the email field:" + " " + company_email);
                degel = true;
            }
            if (valueinfirst == '@') {
                System.out.println("Error:The @ character appears at the beginning of the email field:" + " " + company_email);
                degel = true;
            }
            if (valueinlast == true) {
                System.out.println("Error:The @ character appears at the end of the email field:" + " " + company_email);
                degel = true;
            }
            if (indexDot == -1) {
                System.out.println("Error: There is no dot after the @ character in the email field:" + " " + company_email);
                degel = true;
            }

            if (degel == false)
                this.company_email = company_email;
            else
                throw new InvalidEmailAdrdressException();
        }
        catch (InvalidEmailAdrdressException e)
        {
            e.printStackTrace();
        }
    }


    public void setPrice(double price) {
        try {
                this.price = price;
            }
        catch (Exception e)
        {e.printStackTrace();}}



    public void setQuantity(int quantity) {
        try {this.quantity = quantity;}
        catch (Exception e)
        {e.printStackTrace();}}


    public void setExpiration_year(int expiration_year) {
        try {this.expiration_year = expiration_year;}
        catch (Exception e)
        {e.printStackTrace();}
    }
    public void setType(Type type) {
        try {
         if((type.toString()=="")||(type.toString()== null))
             throw new NullPointerException();
         if ( ((type.toString().equalsIgnoreCase("PILL"))||(type.toString().equalsIgnoreCase("SYRUP"))||(type.toString().equalsIgnoreCase("INHALER"))))
                this.type = type;
         else
             throw new WorngTypeException();
        }
        catch (NullPointerException e)
        {e.printStackTrace();}
        catch (WorngTypeException e)
        {e.printStackTrace();}
    }

    //toString
    @Override
    public String toString() {
        return "Medicine{" +
                "medicine_name='" + medicine_name + '\'' +
                ", company_name='" + company_name + '\'' +
                ", company_email='" + company_email + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", expiration_year=" + expiration_year +
                ", type=" + type +
                '}';
    }
    // abstract method to calculate total Inventory for each medicine type
    public abstract int totalInventory();

    // method that return true if the quantity greater than zero
    public  boolean inStock()
    {
        if (this.quantity>0)
            return true;
        return false;
    }
}
