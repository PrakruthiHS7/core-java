package com.xworkz.playstore.playstore;
import com.xworkz.playstore.application.Application;
import com.xworkz.playstore.exception.ApplicationNameNotFoundException;
import com.xworkz.playstore.exception.ApplicationNotFoundException;

public interface SoftwareHub {
    /*int dummy=10; static final dummy=10;
    public static void(){
        dummy=80; //by default final and static cannot modified
        System.out.println(dummy);
    }
     */
    public abstract boolean addApplications(Application application);
    public void getAllApplication();
    //custom checked exception
    public Application getApplicatonByName(String appName)throws ApplicationNameNotFoundException;
    public Application getApplicatonById(int appId) throws ApplicationNotFoundException;
    public Application getApplicationByType(String apptype)throws ApplicationNotFoundException;
    public String getApplicationNameByType(String appType);
    public  String getApplicationTypeByName(String appName);
    public  double getApplicationSizeByName(String appName);
    public  String getApplicationComapanyNameByName(String appName);
    public  int getApplicationIdByName(String appName);
    public boolean updateVersionByAppName(String updatedVersion, String exisistingAppName);
    public void deleteApplicationByAppName(String appName);
    public void getAllNewApplication(Application application[] );
}