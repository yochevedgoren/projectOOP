package projectPackage;

import java.util.List;
import java.util.Scanner;

public class mainScanner {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ScannerHelper sh=new ScannerHelper();
        Medicine m=null;
        int num, constantMin=0,constantMax=50;
        String type;

        //enter aa number to input medicines
        //There is a maximum and minimum limit


        num= sh.inputInt("number of medicines to be created");
        while ((num<constantMin)||(num>constantMax))
        {
            if(num<constantMin)
                System.out.println("a number smaller than minimum");
            if(num>constantMax)
                System.out.println("a number bigger than maximum");

            num= sh.inputInt("number of medicines to be created");
        }

        Inventory inventoryArr = new Inventory();

        //enetr a valid details of the medicines
         for (int i=0;i< num; i++)
         {
             m=sh.ScannerMedicine();
             inventoryArr.addMedicine(m);
         }


        System.out.println("***************** searchMedicineByName ************************");
        String name;
        System.out.println("enter a name");
        name= sc.nextLine();
        //name=sh.inputstring("name to search");

        Medicine m1= inventoryArr.searchMedicineByName(name);
        if(m1!= null)
            System.out.println( m1.toString()) ;


        System.out.println("***************** searchMedicineByType ************************");

        String typeSearch=sh.inputType("type of medicines: PILL,SYRUP,INHALER to Search");
        List<Medicine> marr1=inventoryArr.searchMedicineByType(typeSearch.toUpperCase());
    if(marr1.size()!=0)
        { for(int i=0;i<marr1.size();i++) {
        if (marr1.get(i)!= null)
            System.out.println(marr1.get(i).toString());

        }}
    else
        System.out.println( "The Type Does Not Exist") ;


        System.out.println("***************** getMedicinesInStock ************************");
        List<Medicine> marr=inventoryArr.getMedicinesInStock();

        for(int i=0;i<marr.size();i++) {
            if (marr.get(i)!= null)
                System.out.println(marr.get(i).toString());
        }
        sc.close();
        }
    }

