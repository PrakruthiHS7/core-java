package com.xworkz.policeapp.Officer;
import com.xworkz.policeapp.Officer.Officer.Officer;
import com.xworkz.policeapp.Officer.station.RajajiNagarPoliceStation;
import java.util.Scanner;

public class PoliceStationExecutor {
    public static void main(String[] args)
    {
        /*The Scanner is mostly used to receive user input and
         parse them into primitive data types such as int, double or default String.*/
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number of officer ");
                   //reads the integer from the keyboard/user.
        int size = sc.nextInt();

        //polimorphism
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
            System.out.println("Press 1  to get getAllOfficer");
            System.out.println("Press 2 to get OfficersNameByPostName");
            System.out.println("Press 3 to get Address ById");
            System.out.println("Press 4 to get the officerInformation");
            System.out.println("Press 5 to get the age ");
            System.out.println("Press 6 to get the postName by name ");
            System.out.println("Press 7 to get the post Name by Id");
            System.out.println("Press 8 to updatePostNameByOfficerName");
            System.out.println("Press 9 to get deletedOfficerById ");
            int option=sc.nextInt();
            switch (option){
                case 1:policeStation.getAllOfficer();
                break;
                case 2:
                    System.out.println("Enter the postName");
                    try{
                    String officerName=policeStation.getOfficersNameByPostName(sc.next());
                    System.out.println(officerName);}
                    catch (Exception e){
                        System.out.println(e);
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    System.out.println("Enter the Id to get the address");
                    try {
                        String address = policeStation.getAdressById(sc.nextInt());
                        System.out.println(address);
                    }catch (Exception e){
                        e.printStackTrace();
                        System.out.println(e);
                    }
                    break;
                case 4:
                    System.out.println("Enter Id to get the all data of Officers");
                    try {
                        String officerInfo = policeStation.getOfficerInfoById(sc.nextInt());
                        System.out.println(officerInfo);
                    }catch (Exception e){
                        System.out.println(e);
                        e.printStackTrace();
                    }
                    break;
                case 5:
                    System.out.println("enter name to get the age");
                    try{
                    int age= policeStation.getOfficersAGeByName(sc.next());
                    System.out.println(age);}
                    catch(Exception e){
                        e.printStackTrace();
                        System.out.println(e);
                    }
                  break;
                case 6 :
                    System.out.println("Enter  officer name to get the post name");
                    try{
                    String postName=policeStation.postNameByName(sc.next());
                    System.out.println(postName);}catch (Exception e){
                        e.printStackTrace();
                        System.out.println(e);
                    }
                    break;
                case 7:
                    System.out.println("Enter Id to get the postName ");
                    try {
                        String postName1 = policeStation.postNameById(sc.nextInt());
                        System.out.println(postName1);
                    }catch(Exception e){
                        e.printStackTrace();
                        System.out.println(e);
                    }
                    break;
                case 8:
                try {
                    System.out.println("Enter the updated post name: ");
                    String updatedPostName = sc.next();
                    System.out.println("Enter the existing Officer Name: ");
                    String existingOfficerName = sc.next();
                    boolean isPostNameUpdated = policeStation.updatePostNameByOfficerName(updatedPostName, existingOfficerName);

                    if (isPostNameUpdated==true) {
                        System.out.println("Post Name updated successfully");
                    } else {
                        System.out.println("Officer not found for the given name");
                    }
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                    e.printStackTrace();
                }
                break;

                case 9:
                    try {
                        System.out.println("enter the Id to delete");
                        System.out.println(policeStation.deletedOfficerById(sc.nextInt()));

                    }catch (Exception e){
                        System.out.println(e);
                        e.printStackTrace();
                    }
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
