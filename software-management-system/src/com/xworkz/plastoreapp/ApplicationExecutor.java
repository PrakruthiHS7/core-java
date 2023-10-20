package com.xworkz.plastoreapp;

import com.xworkz.plastoreapp.application.Application;
import com.xworkz.plastoreapp.hub.SoftwareHub;

import java.util.Scanner;
import java.lang.String;


public class ApplicationExecutor {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of Applications");
        int size=scanner.nextInt();

        SoftwareHub softwareHub= new SoftwareHub(size);

        for (int index = 0; index <size ; index++) {
            Application application=new Application();

            System.out.println("Enter the Application ID");
            application.setAppId(scanner.nextInt());

            System.out.println("Enter the Applicaton name");
            application.setAppName(scanner.next());

            System.out.println("Enter the company name");
            application.setCompanyName(scanner.next());

            System.out.println("Enter the size of the App");
            application.setSizeInMb(scanner.nextInt());

            System.out.println("Enter the App type");
            application.setAppType(scanner.next());

            System.out.println("Enter the Released date of the app");
            application.setReleasedDate(scanner.next());

            System.out.println("Enter the Version of the app");
            application.setVersion(scanner.nextDouble());

            softwareHub.addApplications(application);
        }

        softwareHub.getAllApplication();

      /*
        Application appByName= softwareHub.getApplicationByName("Snapchat");
        System.out.println(appByName.getAppId()+" "+appByName.getAppName()+" "+appByName.getCompanyName()+" "+appByName.getVersion()+" "+appByName.getSizeInMb()+" "+appByName.getReleasedDate());

        Application appByType=softwareHub.getApplicationByType("financial app");

        System.out.println("Application information based on type  "+appByType.getAppType());
        System.out.println(appByType.getAppId()+" "+appByType.getCompanyName()+ " "+ appByType.getCompanyName()+ " "+appByType.getVersion()+" "+appByType.getSizeInMb()+" "+ appByType.getReleasedDate());

        Application appById=softwareHub.getApplicationById(2);
        System.out.println("Application information based on  Id"+appById.getAppId());
        System.out.println(appById.getAppId()+ " " +appById.getAppName()+" "+appById.getSizeInMb()+ " "+appById.getVersion()+" "+appById.getCompanyName()+" "+appById.getReleasedDate());


        String appName=softwareHub.getApplicationNameByType("financial app");
        System.out.println("App Name is fetched by the type : "+ appName);

        int sizeinMb=softwareHub.getapplicationSizeByName("Snapchat");
        System.out.println("Application size in MB is fetched by the application name : " +sizeinMb);

        String appTypeByName=softwareHub.getApplicationTypeByName("WhatsApp");
        System.out.println("Application type  fetched by the application Name(WhatssApp) is : "+appTypeByName);
       */
    }
}
