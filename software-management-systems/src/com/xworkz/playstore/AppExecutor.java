package com.xworkz.playstore;
import com.xworkz.playstore.application.Application;
import com.xworkz.playstore.exception.ApplicationNotFoundException;
import com.xworkz.playstore.playstore.Playstore;
import com.xworkz.playstore.playstore.SoftwareHub;
import java.util.Scanner;

public class AppExecutor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of Application to be added");
        int size = scanner.nextInt();
        // Creating a SoftwareHub reference variable and assigning a Playstore object to it-polimorphism
        SoftwareHub softwareHub = new Playstore(size);

        for (int i = 0; i < size; i++)
        {
            Application application = new Application();
            System.out.println("Enter the Application Name ");
            application.setAppName(scanner.next());

            System.out.println("Enter the Application type ");
            application.setAppType(scanner.next());

            System.out.println("Enter the Company Name ");
            application.setCompanyName(scanner.next());

            System.out.println("Enter the Application Version ");
            application.setVersion(scanner.next());

            System.out.println("Enter the Application Release Date ");
            application.setReleaseDate(scanner.next());

            System.out.println("Enter the Application Size In Mb ");
            application.setSizeInMb(scanner.nextInt());

            softwareHub.addApplications(application);
        }

        String input = null;
        do{
            System.out.println("Press 1: To get All the Applications");
            System.out.println("Press 2: To get Application By Name");
            System.out.println("Press 3: To get Application By Id");
            System.out.println("Press 4: To get Application By Type");
            System.out.println("Press 5: To get Application Name By Type");
            System.out.println("Press 6: To get Application Type By Name");
            System.out.println("Press 7: To get Application Size By Name");
            System.out.println("Press 8: To get Application CompanyName By Name");
            System.out.println("Press 9: To get Application Id By Name");
            System.out.println("press 10:To deleteApplicationByAppName");
            System.out.println("Press 11: To updateVersionByAppName");

            int options = scanner.nextInt();
            switch (options){
                case 1 :   softwareHub.getAllApplication();
                    break;
                case 2:  System.out.println("Enter the Application Name ");
                try {
                    Application application2 = softwareHub.getApplicatonByName(scanner.next());
                    System.out.println(application2);
                }catch (Exception e){
                    System.out.println(e);
                    e.printStackTrace();
                }
                break;
                case 3: System.out.println("Enter the Application Id ");
                try {
                    Application app2 = softwareHub.getApplicatonById(scanner.nextInt());
                    System.out.println(app2);
                }catch (Exception e){
                    System.out.println(e);
                    e.printStackTrace();
                }
                    break;
                case 4:
                    System.out.println("Enter the Application Type ");
                    try {
                       Application app3 = softwareHub.getApplicationByType(scanner.next());
                        System.out.println(app3);
                    }catch (Exception e){
                        e.printStackTrace();
                        System.out.println(e);
                    }
                    break;
                case 5:
                    System.out.println("Enter the Application Type ");
                    try{
                       String appName = softwareHub.getApplicationNameByType(scanner.next());
                       System.out.println(appName);}
                    catch(Exception e){
                        System.out.println(e);
                        e.printStackTrace();
                    }
                    break;
                case 6:
                    System.out.println("Enter the Application Name ");
                    try {
                    String appType1 = softwareHub.getApplicationTypeByName(scanner.next());
                    System.out.println(appType1);}
                    catch (Exception e){
                        e.printStackTrace();
                        System.out.println(e);
                    }
                    break;
                case 7:
                    System.out.println("Enter the Application Name ");
                    try {
                        double appSize = softwareHub.getApplicationSizeByName(scanner.next());
                        System.out.println(appSize);
                    }catch (Exception e){
                        System.out.println(e);
                        e.printStackTrace();
                    }
                    break;
                case 8:
                    System.out.println("Enter the Application Name ");
                    try{
                    String companyName = softwareHub.getApplicationComapanyNameByName(scanner.next());
                    System.out.println(companyName);
                    }
                    catch (Exception e){
                        e.printStackTrace();
                        System.out.println(e);
                    }
                    break;
                case 9:
                    System.out.println("Enter the Application Name ");
                    try{
                    int appId = softwareHub.getApplicationIdByName(scanner.next());
                    System.out.println(appId);
                    }catch (Exception e){
                        e.printStackTrace();
                        System.out.println(e);
                    }
                    break;
                case 10:
                    System.out.println("Enter the Application Name to delete ");
                    try {
                        String appNameToDelete = scanner.next();
                        softwareHub.deleteApplicationByAppName(appNameToDelete);
                        System.out.println("Application deleted successfully");
                    } catch (ApplicationNotFoundException e) {
                        System.out.println("Error: " + e.getMessage());
                        e.printStackTrace();
                    }
                    break;
                case 11:
                    try {
                        System.out.println("Enter the updated version: ");
                        String updatedVersion = scanner.next();
                        System.out.println("Enter the existing Application Name: ");
                        String existingAppName = scanner.next();
                        boolean isVersionUpdated = softwareHub.updateVersionByAppName(updatedVersion, existingAppName);
                        if (isVersionUpdated) {
                            System.out.println("Version updated successfully");
                        } else {
                            System.out.println("Application not found for the given name");
                        }
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                        e.printStackTrace();
                    }
                    break;

                default:
                    System.out.println("Please Check the above cases");
            }System.out.println("Do you Want to continue : y/n");
            input = scanner.next();
        }while(input.equals("y"));
        System.out.println("Thank you For using our application!!!");
    }
}