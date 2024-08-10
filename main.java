package projectPackage;

import java.util.List;

public class main {
  public static void main(String args[])
  {
      Inventory inventoryA=new Inventory();

      //Create the Medicines
      Pills p1=new Pills("jj","asd","asd@gmail.com",20,0,2026,30);
      Pills p2=new Pills("DexcamolPills","rty","rty@gmail.com",25,0,2027,35);
      Pills p3=new Pills("AntibutecaPills","uio","uio@gmail.com",20,0,2029,25);

      Syrup s1=new Syrup("AcamolSyrup","asd","asd@gmail.com",15,0,2030,50);
      Syrup s2=new Syrup("DexcamolSyrup","rty","rty@gmail.com",22,0,2025,60);
      Syrup s3=new Syrup("AntibutecaSyrup","uio","uio@gmail.com",35,0,2029,80);

      Inhaler i1=new Inhaler("AcamolInhaler","asd","asd@gmail.com",40,0,2025,100);
      Inhaler i2=new Inhaler("DexcamolInhaler","rty","rty@gmail.com",50,0,2030,150);
      Inhaler i3=new Inhaler("AntibutecaInhaler","asd","asd@gmail.com",55,2,2029,160);

      //Enter the Medicines to array of all the medicines
      inventoryA.addMedicine(p1);
      inventoryA.addMedicine(p2);
      inventoryA.addMedicine(p3);

      inventoryA.addMedicine(s1);
      inventoryA.addMedicine(s2);
      inventoryA.addMedicine(s3);

      inventoryA.addMedicine(i1);
      inventoryA.addMedicine(i2);
      inventoryA.addMedicine(i3);


      System.out.println("***************** searchMedicineByName ************************");
      Medicine m= inventoryA.searchMedicineByName("AntibutecaSyrup");
      if(m!= null)
          System.out.println( m.toString()) ;
      else
          System.out.println( "The Medicine Does Not Exist") ;

      System.out.println("***************** searchMedicineByType ************************");
      List<Medicine> marr1=inventoryA.searchMedicineByType("PILL");
    if(marr1.size()!=0)
    {
      for(int i=0;i<marr1.size();i++) {
          if (marr1.get(i) != null)
              System.out.println(marr1.get(i).toString());
      }
      }
      else
          System.out.println( "The Medicine Does Not Exist") ;

      System.out.println("***************** getMedicinesInStock ************************");
      List<Medicine> marr=inventoryA.getMedicinesInStock();

      for(int i=0;i<marr.size();i++) {
          if (marr.get(i)!= null)
              System.out.println(marr.get(i).toString());

      }



      //System.out.println("***************** TryToAddExistingMedicine ************************");
      //Inhaler i4=new Inhaler("AntibutecaInhaler","asd","asd@gmail.com",55,2,2029,160);
      //inventoryA.addMedicine(i4);

      //  System.out.println("***************** SearchForNonExistingMedicine ************************");
      //Medicine nonm= inventoryA.searchMedicineByName("Antibutecayy");
      //if(nonm!= null)
      //System.out.println( nonm.toString()) ;

     // System.out.println("***************** TryToCreateMedicineWithErrorCompanyEmail ************************");
      //Pills p4=new Pills("AcamolPills","asd","asd@gmailcom@",20,0,2026,30);

  }
}
