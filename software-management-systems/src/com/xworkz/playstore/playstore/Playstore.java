package com.xworkz.playstore.playstore;
import com.xworkz.playstore.application.Application;
import com.xworkz.playstore.exception.*;
import java.util.Arrays;
// Class implementing the interface
public class Playstore implements SoftwareHub {
    Application[] application;
    int id=1, index;
    public Playstore(int size) {
        application = new Application[size];
    }
    public boolean addApplications(Application application) {
        System.out.println("invoke addApplications");
        boolean isAdded = false;
        try {
            if (application != null)
            {
                application.setAppId(id++);
                this.application[index++] = application;
                isAdded = true;
            }
            else {
                IllegalArgumentException  illegalArgumentException=new IllegalArgumentException("Application cannot be null");
                throw illegalArgumentException;
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: Array index out of bounds");
            // Handle the array index out of bounds exception here
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
            // Handle other exceptions if needed
        }
        return isAdded;
    }

    public void getAllApplication() {
        System.out.println("Application lists are");
        for (int index = 0; index < application.length; index++) {
            //System.out.println(application[index].getAppName()+" "+application[index].getAppId()+ " " + application[index].getAppName()+ " " + application[index].getCompanyName()+ " " + application[index].getVersion()+ " " + application[index].getReleaseDate()+ " " + application[index].getSizeInMb());
            //because of toString
            System.out.println(application[index]);
        }
    }

    public Application getApplicatonByName(String appName) throws ApplicationNameNotFoundException{
        Application application1 = null;
        try{
        for (int i = 0; i< application.length; i++) {
            if (application[i].getAppName().equals(appName)) {
                application1 = application[i];
                System.out.println("Application found.... please collect it in executor");
            }
        }
            if(application1==null){
                ApplicationNotFoundException applicationNotFoundException=new ApplicationNotFoundException("ApplicationNotFoundException");
                throw applicationNotFoundException;
            }
        }catch (ApplicationNotFoundException e)
        {
            e.printStackTrace();
        }
        return application1;
    }

    public Application getApplicatonById(int appId) throws ApplicationNotFoundException {
        Application application3 = null;
        try {
            if (appId > 0) {
                for (int appIndex = 0; appIndex < this.application.length; appIndex++) {
                    if (application[appIndex].getAppId() == appId) {
                        application3 = application[appIndex];
                        System.out.println("Application found.... please collect it in executor");
                        break;
                    }
                }

                if (application3 == null) {
                    // Print a message before throwing the exception
                    System.err.println("Error: Application not found for the given ID");
                    ApplicationNotFoundException applicationNotFoundException = new ApplicationNotFoundException("Application not found for the given ID");
                    throw applicationNotFoundException;
                }
            } else {
                InvalidIdException invalidIdException = new InvalidIdException("Invalid ID");
                throw invalidIdException;
            }
        } catch (ApplicationNotFoundException | InvalidIdException e) {
            e.printStackTrace();
        }
        return application3;
    }


    public Application getApplicationByType(String apptype)throws ApplicationNotFoundException{

        Application application2 = null;
        try{
                for (int appIndex = 0; appIndex < this.application.length; appIndex++)
                {
                    if (application[appIndex].getAppType().equals(apptype))
                    {
                        application2 = application[appIndex];
                        System.out.println("Application found.... please collect it in executor");
                    }
                }

                    if(application2==null){
                        ApplicationNotFoundException applicationNotFoundException=new ApplicationNotFoundException("ApplicationNotFoundException");
                        throw applicationNotFoundException;
                    }
                }catch (ApplicationNotFoundException e){
                    e.printStackTrace();
                }

        return  application2;
    }

    public String getApplicationNameByType(String appType) {
        String appName = null;
        try{
        for (int appIndex = 0; appIndex < this.application.length; appIndex++) {
            if (application[appIndex].getAppType().equals(appType)) {
                appName = application[appIndex].getAppName();
                System.out.println("Application name found.... please collect it in executor");
            }
        }
            if (appName == null) {
                // Throw the custom exception when the application name is not found
                ApplicationNameNotFoundException nameNotFoundException = new ApplicationNameNotFoundException("Application name not found for type " + appType);
                throw nameNotFoundException;
            }

        } catch (ApplicationNameNotFoundException e) {
            e.printStackTrace();
            // Optionally, you can return a default value or null if needed.
        }

        return appName;
    }
    public  String getApplicationTypeByName(String appName){
        String appType = null;
        try{
        for (int appIndex = 0; appIndex < this.application.length; appIndex++)
        {
            if (application[appIndex].getAppName().equals(appName) )
            {
                appType = application[appIndex].getAppType();
                System.out.println("Application type found.... please collect it in executor");
                break;

            }
        }

            if (appType==null)
            {
                AppTypeNotFoundException appTypeNotFoundException=new AppTypeNotFoundException("AppTypeNOtFound for the given name");
                throw  appTypeNotFoundException;

            }
        }catch (AppTypeNotFoundException e){
            e.printStackTrace();

        }
        return appType;
    }

    public  double getApplicationSizeByName(String appName){
        double appSize = 0.0;
        try{
        for (int appIndex = 0; appIndex < this.application.length; appIndex++) {
            if (application[appIndex].getAppName().equals(appName)){
                appSize = application[appIndex].getSizeInMb();
                System.out.println("Application type found.... please collect it in executor");

            }
        }

            if(appSize==0){
                ApplicationSizeNotFoundException applicationSizeNotFoundException=new ApplicationSizeNotFoundException("ApplicationSizeNotFoundException");
                throw applicationSizeNotFoundException;
            }
        }catch (ApplicationSizeNotFoundException e) {
            e.printStackTrace();
        }

        return appSize;
    }

    public  String getApplicationComapanyNameByName(String appName){
        String companyName = null;
        try{
        for (int appIndex = 0; appIndex < this.application.length; appIndex++) {
            if (application[appIndex].getAppName().equals(appName)){
                companyName = application[appIndex].getCompanyName();
                System.out.println("Application type found.... please collect it in executor");

            }
        }
            if(companyName==null){
                CompanyNameNotFoundException companyNameNotFoundException=new  CompanyNameNotFoundException(" CompanyNameNotFoundException");
                throw companyNameNotFoundException;
            }
        }
        catch ( CompanyNameNotFoundException e) {
            e.printStackTrace();
        }

        return companyName;
    }

    public  int getApplicationIdByName(String appName){
        int appId = 0;
        try{
        for (int appIndex = 0; appIndex < this.application.length; appIndex++) {
            if (application[appIndex].getAppName().equals(appName)){
                appId = application[appIndex].getAppId();
                System.out.println("Application type found.... please collect it in executor");

            }
        }
            if(appId==0){
                ApplicaticationIdNotFoundException applicaticationIdNotFoundException=new ApplicaticationIdNotFoundException("ApplicaticationIdNotFoundException");
                throw applicaticationIdNotFoundException;
            }
        }catch(ApplicaticationIdNotFoundException e){
            e.printStackTrace();
        }
        return appId;
    }
    public boolean updateVersionByAppName(String updatedVersion, String exisistingAppName){
        boolean isVersionUpdated = false ;
        for (int appIndex = 0; appIndex < this.application.length; appIndex++) {
            if(application[appIndex].getAppName().equals(exisistingAppName)){
                application[appIndex].setVersion(updatedVersion);
                isVersionUpdated = true;
            }
        }
        return isVersionUpdated;
    }
    public void deleteApplicationByAppName(String appName) {
        try {
            System.out.println("invoked deleteApplicationByAppName ");
            int index, newIndex;
            boolean found = false;
            for (index = 0, newIndex = 0; index < this.application.length; index++) {
                if (!application[index].getAppName().equals(appName)) {
                    application[newIndex++] = application[index];
                } else {
                    System.out.println("Given App Name is been deleted from the SoftwareHub");
                    found = true;
                }
            }

            if (!found) {
                throw new ApplicationNotFoundException("Application not found with name: " + appName);
            }

            application = Arrays.copyOf(application, newIndex);
            getAllNewApplication(application);
        } catch (ApplicationNotFoundException e) {
            // Handle the exception (print an error message, log, etc.)
            System.err.println("Error: " + e.getMessage());
        }
    }

    public void getAllNewApplication(Application[] application){
        System.out.println("Get all new application");
        for (int index = 0; index < application.length; index++) {
            System.out.println(application[index].getAppName()+" "+application[index].getAppId()+" "+application[index].getCompanyName()+" "+application[index].getAppType()+" "+application[index].getVersion()+" "+application[index].getReleaseDate()+" "+application[index].getSizeInMb());
        }
    }
}
