package com.xworkz.playstore.playstore;
import com.xworkz.playstore.application.Application;

public interface SoftwareHub {
    /*int dummy=10; static final dummy=10;
    public static void(){
        dummy=80; //by default final and static cannot modified
        System.out.println(dummy);
    }
     */
    public abstract boolean addApplications(Application application);
    public void getAllApplication();
    public Application getApplicatonByName(String appName);
    public Application getApplicatonById(int appId);
    public Application getApplicationByType(String apptype);
    public String getApplicationNameByType(String appType);
    public  String getApplicationTypeByName(String appName);
    public  double getApplicationSizeByName(String appName);
    public  String getApplicationComapanyNameByName(String appName);
    public  int getApplicationIdByName(String appName);
    public boolean updateVersionByAppName(String updatedVersion, String exisistingAppName);
    public void deleteApplicationByAppName(String appName);
    public void getAllNewApplication(Application application[] );
}