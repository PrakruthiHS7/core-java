//7/8/2023

class Speaker
{
     static String speakerBrandName="GOVO";
	  static boolean isConnected ;   //default boolean value "false" will print  by compiler ,boolean make it as static variable
      static int maxVolume=8;	  // maxVolume always fixed. by user
	  static int curentVolume;  //default 0 by compiler
	  static int minVolume=0; 
	  
     public static void main(String speaker[]){	  
	 System.out.println("main started");
	 System.out.println("......");
	 
	 System.out.println("speaker connection status");
	     isConnected=true;                         // make sure speakeris turn on 
	 System.out.println("is speaker connected " +isConnected);
	     isConnected=false;
	 System.out.println("is speaker connected " +isConnected);
	 
	     curentVolume=curentVolume+1;//current value change by 1(update operation) ,increase the volume up to reach maxVolume(8)
     System.out.println("current volume is "+curentVolume);
				 
	 System.out.println("main ended");
	 }
}

