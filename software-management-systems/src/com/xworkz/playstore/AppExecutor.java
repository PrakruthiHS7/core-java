package com.xworkz.playstore;

import com.xworkz.playstore.application.Application;
        import com.xworkz.playstore.playstore.Playstore;
        import com.xworkz.playstore.playstore.SoftwareHub;

        import java.util.Scanner;

public class AppExecutor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of Application to be added");
        int size = scanner.nextInt();
        SoftwareHub softwareHub = new Playstore(size);
        for (int index = 0; index < size; index++) {
            Application application = new Application();
            System.out.println("Enter the Application Name ");
            application.setAppName(scanner.next());

            System.out.println("Enter the Application type ");
            application.setAppType(scanner.next());

            System.out.println("Enter the Campony Name of the Application ");
            application.setCompanyName(scanner.next());

            System.out.println("Enter the Application Version ");
            application.setVersion(scanner.next());

            System.out.println("Enter the Application Release Date ");
            application.setReleaseDate(scanner.next());

            System.out.println("Enter the Application Size In Mb ");
            application.setSizeInMb(scanner.nextInt());

            softwareHub.addApplications(application);
        }
        softwareHub.getAllApplication();
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


            int options = scanner.nextInt();
            switch (options){
                case 1 :   softwareHub.getAllApplication();
                    break;
                case 2:  System.out.println("Enter the Application Name ");
                    Application application2 = softwareHub.getApplicatonByName(scanner.next());
                    System.out.println(application2.getAppName()+" "+application2.getAppId()+ " " + application2.getAppName()+ " " + application2.getCompanyName()+ " " + application2.getVersion()+ " " + application2.getReleaseDate()+ " " + application2.getSizeInMb());

                    break;

                case 3: System.out.println("Enter the Application Id ");
                    Application app2 = softwareHub.getApplicatonById(scanner.nextInt());
                    System.out.println(app2.getAppId()+" "+app2.getCompanyName()+" "+app2.getSizeInMb()+" "+app2.getAppType()+" "+app2.getAppName()+" "+app2.getReleaseDate()+" "+app2.getVersion());
                    break;

                case 4:
                    System.out.println("Enter the Application Type ");
                    Application app3 = softwareHub.getApplicationByType(scanner.next());
                    System.out.println(app3.getAppId()+" "+app3.getCompanyName()+" "+app3.getSizeInMb()+" "+app3.getAppType()+" "+app3.getAppName()+" "+app3.getReleaseDate()+" "+app3.getVersion());
                    break;

                case 5:
                    System.out.println("Enter the Application Type ");
                    String appName = softwareHub.getApplicationNameByType(scanner.next());
                    System.out.println(appName);
                    break;

                case 6:
                    System.out.println("Enter the Application Name ");
                    String appType1 = softwareHub.getApplicationTypeByName(scanner.next());
                    System.out.println(appType1);
                    break;

                case 7:
                    System.out.println("Enter the Application Name ");
                    double appSize = softwareHub.getApplicationSizeByName(scanner.next());
                    System.out.println(appSize);
                    break;

                case 8:
                    System.out.println("Enter the Application Name ");
                    String companyName = softwareHub.getApplicationComapanyNameByName(scanner.next());
                    System.out.println(companyName);
                    break;

                case 9:
                    System.out.println("Enter the Application Name ");
                    int appId = softwareHub.getApplicationIdByName(scanner.next());
                    System.out.println(appId);
                    break;

                default:
                    System.out.println("Please Check the above cases");
            }
            System.out.println("Do you Want to continue : y/n");
            input = scanner.next();
        }while(input.equals("y"));
        System.out.println("Thank you For using our application!!!");
    }
}