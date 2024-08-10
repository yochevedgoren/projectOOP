package projectPackage;


import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerHelper {
    Scanner sc= new Scanner(System.in);
    public Medicine ScannerMedicine()
    {
        Medicine m=null;
        String medicine_name,company_name,company_email,type;
        double price;
        int quantity,expiration_year;

        System.out.println("enter a medicine_name");
        medicine_name=sc.nextLine();

        System.out.println("enter a company_name");
        company_name=sc.nextLine();

         type=inputType("type of medicines: PILL,SYRUP,INHALER");

        System.out.println("enter a price");
        price=sc.nextDouble();

        System.out.println("enter a quantity");
        quantity=sc.nextInt();

        System.out.println("enter a expiration_year");
        expiration_year=sc.nextInt();

        System.out.println("enter a company_email");
        company_email=sc.next();



        //create object of pill
        if (type.equalsIgnoreCase("PILL"))
        {
           int numOfPillsInBox;
            System.out.println("enter a numOfPillsInBox");
            numOfPillsInBox=sc.nextInt();

            m=new Pills(medicine_name,company_name,company_email,price,quantity,expiration_year,numOfPillsInBox);
        }

        //create object of syrup
        if (type.equalsIgnoreCase("SYRUP"))
        {
            int bottleContent;
            System.out.println("enter a bottleContent");
            bottleContent=sc.nextInt();

            m=new Syrup(medicine_name,company_name,company_email,price,quantity,expiration_year,bottleContent);
        }

        //create object of inhaler
        if (type.equalsIgnoreCase("INHALER"))
        {
            int amountOfClick;
            System.out.println("enter a amountOfClick");
            amountOfClick=sc.nextInt();
            m=new Inhaler(medicine_name,company_name,company_email,price,quantity,expiration_year,amountOfClick);
        }
       // if ((!type.equalsIgnoreCase("PILL"))||(!type.equalsIgnoreCase("SYRUP"))||(!type.equalsIgnoreCase("INHALER")))
            System.out.println("The type is worrng-Dont create object");

        return  m;
    }


    //A function to check that the string is number
    public boolean validateInt(String st) {
        try{
            int mis=Integer.parseInt(st);
            return true;
        }
           catch(NumberFormatException e){
            return false;
           }
   }

    //Accepting a int value is correct
    public  int inputInt(String st)
    {
        String input;
        System.out.println("enter a "+ st);
        input=sc.nextLine();
        while (!validateInt(input))
        {
            System.out.println("A non-numeric value");
            System.out.println("enter a "+st);
            input=sc.nextLine();
        }
        return Integer.parseInt(input);
    }
    public  String inputstring(String st)
    {
        String input;
        System.out.println("enter a "+ st);
        input=sc.nextLine();
        while (!ValidateString(input))
        {
            System.out.println("Null value");
            System.out.println("enter a "+st);
            input=sc.nextLine();
        }
        return input;
    }

    public boolean ValidateString(String input) {

        try {
            if (input == "")
                throw new NullPointerException();
            return true;
        } catch (NullPointerException e) {
            return false;
        }
    }
    //A function to check that the type is pill or syrup or inhaler
    public boolean validateType(String st) {
        if ((st.equalsIgnoreCase("PILL"))||(st.equalsIgnoreCase("SYRUP"))||(st.equalsIgnoreCase("INHALER")))
            return true;
        else {
            System.out.println("Entering an wrong value");
            return false;
        }

    }
    //Accepting a string value is correct
    public  String inputType(String st)
    {
        String input;
        System.out.println("enter a "+ st);
        input=sc.next();
        while (!validateType(input))
        {
            System.out.println("enter a "+st);
            input=sc.next();
        }
        return input;
    }
}
