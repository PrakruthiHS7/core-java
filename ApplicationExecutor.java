class ApplicationExecutor
{
 public static void main(String appp[])
 {
  
  Application application=new Application();
  application.setName("PhonePay");
  application.setSizeInMb(400);
  application.setVersion("v.05.02");
  application.setRatings("5star");
  application.setNoOfDownloads(500);
  application.setCompanyName("PhonePay");
  
  
  PlayStore store=new PlayStore();
  
  //has-A relationship
   store.application = application;
        store.managedBy = "Google"; 

        System.out.println("The name of the Application is " + store.application.getName());
        System.out.println("The size of the application is " + store.application.getSizeInMb() + " MB");
        System.out.println("The version of the Application is " + store.application.getVersion());
        System.out.println("The ratings of the Application is " + store.application.getRatings());
        System.out.println("The number of downloads is " + store.application.getNoOfDownloads());
        System.out.println("The company name is " + store.application.getCompanyName());

        System.out.println("The application is managed by " + store.managedBy);
    }
}