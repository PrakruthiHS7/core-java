class SpeakerVolume                                          //clas contain only logic	
{
      //static variable                                                   												 
     static boolean isConnected; 
     static  int  maxVolume=5;
     static int  minVolume;
     static int  currentVolume;
	 
	 public static boolean on()
	 {
	 System.out.println("Inside Off");
	 if(isConnected==false)            //false==false
	 {
	 isConnected=true;	 //true
	 System.out.println("The Speakeris turned on");
	 }
	 return isConnected;
	 }
	 
	 public static boolean off()
	 {
	 System.out.println("Inside On");
	 if(isConnected==true)            //false==false
	 {
	  isConnected=false;	 //true
	 System.out.println("The Speakeris turned off");
	 }
	 return isConnected;
	 }
	
	  public static void increaseVolume()
	 {
	 System.out.println("Start of increaseVolume");
	 if(isConnected==true)
	 {
	    if(currentVolume<maxVolume)
		{
	      currentVolume=currentVolume + 1;
	      System.out.println("The currentVolume is " +currentVolume);
	    }
	    else
		{   
	    System.out.println("Max Volume is reached");
	    }
	 }
	 else
	 {
	 System.out.println("turn on the Speaker");
	 }
	 }
	  
	 public static void decreaseVolume()
	 {
	 System.out.println("Start of decreaseVolume");
	 if(isConnected==true)
	 {
	    if(currentVolume>minVolume)
		{
	      currentVolume = currentVolume - 1;
	      System.out.println("The currentVolume is " +currentVolume);
	    }
	    else
		{   
	    System.out.println("Min Volume is reached");
	    }
	 }
	 else
	 {
	 System.out.println("turn on the Speaker");
	 }
	 }
	 
	 
}