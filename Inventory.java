package projectPackage;

import com.sun.source.tree.WhileLoopTree;

import javax.sql.rowset.serial.SerialStruct;
import java.util.*;
import java.util.List;

public class Inventory {

    //Attribute
    private List<Medicine> arrOfMedicie ;


    //Constructor
    public Inventory()
    {
        this.arrOfMedicie=new ArrayList<Medicine>();

    }

    //function to add medicine to array
    public void addMedicine(Medicine m)  {

        try{

            boolean degel = false;
            for(int i=0;i<this.arrOfMedicie.size();i++) {
                if (this.arrOfMedicie.get(i).medicine_name.equals(m.medicine_name) )
                {
                    degel = true;
                    break;
                }


            }
            if (degel == true)
                throw new MedicineAlreadyExistException();
            else
                this.arrOfMedicie.add(m);


        }
        catch(MedicineAlreadyExistException e)
        {
            //print the message from the exception class
            e.printStackTrace();
        }

    }

    //function to search medicine by name
    public Medicine searchMedicineByName(String name) {
        try{

            Medicine m=null;

            for(int i=0;i<this.arrOfMedicie.size();i++)  {
                if (this.arrOfMedicie.get(i).medicine_name.equalsIgnoreCase(name)) {
                    m = this.arrOfMedicie.get(i);
                    break;
                }


            }
            if (m == null)
                throw new MedicineDoesNotExistException();
            else {

                System.out.println("The totalInventory is:"+ m.totalInventory());
                return m;
            }

        }
        catch(MedicineDoesNotExistException e)
        {
            //print the message from the exception class
            e.printStackTrace();
        }
        return null;
        }

    //function to search medicine by type
       public List<Medicine> searchMedicineByType(String type)
        {
            List<Medicine> arrm= new ArrayList<Medicine>() ;
            for(int i=0;i<this.arrOfMedicie.size();i++) {
                if (this.arrOfMedicie.get(i).type.toString().equals(type)) {
                    arrm.add(this.arrOfMedicie.get(i));
                }
            }
            if(arrm!= null)
            return arrm;
            return null;
        }

    //function -return medicine in stock
    public List<Medicine> getMedicinesInStock() {
       List<Medicine> arrm= new ArrayList<Medicine>() ;
        for(int i=0;i<this.arrOfMedicie.size();i++) {
            if (this.arrOfMedicie.get(i).inStock()) {
                arrm.add(this.arrOfMedicie.get(i));
            }
        }
        return arrm;
    }
    }







