package com.xworkz.policeapp.Officer;

import com.xworkz.policeapp.Officer.Officer.Officer;
import com.xworkz.policeapp.Officer.station.RajajiNagarPoliceStation;

import java.util.Scanner;


public class PoliceStationExecutor {
    public static void main(String[] args)
    {
        //instantiate the scanner object
        /*The Scanner is mostly used to receive user input and
         parse them into primitive data types such as int, double or default String.*/
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the officer information");
                   //reads the integer from the keyboard/user.
        int size = sc.nextInt();

        RajajiNagarPoliceStation policeStation=new RajajiNagarPoliceStation(size);

        for (int index = 0; index <size ; index++)
        {
            Officer officer = new Officer();

            //System.out.println("Enter the OfficerID");
            //officer.setOfficerId(sc.nextInt());

            System.out.println("Enter the Name of the officer");
            officer.setName(sc.next());

             System.out.println("Enter the Address of the officer");
             officer.setAddress(sc.next());

             System.out.println("Enter the PostName of the officer");
             officer.setPostName(sc.next());

             System.out.println("Enter the age of the officer");
              officer.setAge(sc.nextInt());

              System.out.println("Enter the Blood grop of the officer");
              officer.setBloodGroup(sc.next());

              System.out.println("Enter the Gender of the officer");
               officer.setGender(sc.next());

               policeStation.addOfficers(officer);
      }

        policeStation.getAllOfficer();
        String input=null;
        do {
            System.out.println("Press one to get getAllOfficer");
            System.out.println("Press two to get OfficersNameByPostName");
            System.out.println("Press three to get AdressById");
            System.out.println("Press 4 to get ");
            int option=sc.nextInt();
            switch (option){
                case 1:policeStation.getAllOfficer();
                break;
                case 2:
                    System.out.println("Enter the postName");

                    String officerName=policeStation.getOfficersNameByPostName(sc.next());
                    System.out.println(officerName);
                    break;
                case 3:
                    System.out.println("Enter the Id to get the adress");
                   String address=policeStation.getAdressById(sc.nextInt());
                    System.out.println(address);
                    break;
                case 4:
                    System.out.println("Enter Id to get the OfficerInformation");
                     String officerInfo=policeStation.getOfficerInfoById(sc.nextInt());
                    System.out.println(officerInfo);
                case 5:
                    System.out.println("enter name to get the age");
                    int age= policeStation.getOfficersAGeByName(sc.next());
                    System.out.println(age);
                default:
                    System.out.println("Please choose the correct option");
                    break;

            }
            System.out.println("you want to continue yes/no");
            input=sc.next();
        }while (input.equals("yes"));
        System.out.println(("thank you for using!...."));

    }
}
