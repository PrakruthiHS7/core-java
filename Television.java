class Television
{
    static boolean isConnected;
	static int maximumVolume=10;
	static int minimumVolume;
	static int currentVolume;
   public static boolean on()
   {
		 if(isConnected==false)
		   {
			   isConnected=true;
			   System.out.println("Telivision is turned on!");
		   }
		   return isConnected;
   }
   public static boolean off()
   {
	   if(isConnected==true)
	   {
		   isConnected=false;
		   System.out.println("Telision is turned Off!");
	   }
	   return isConnected;
   }
   public static void increaseVolume()
   {
	   if(isConnected==true)
	   {
		   if(currentVolume<maximumVolume)
		   {  
	         currentVolume+=1;
			 System.out.println("The currentVolume volume is " +currentVolume);
		   }
		   else
			   System.out.println("Maximum volume is reached");
		   
	   }
	   else
	   {
		   System.out.println("turn on the Speaker");
	   }
   }
   public static void decreaseVolume()
   {
	   if(isConnected==true)
	   {
		   if(currentVolume>minimumVolume)
		   {
			   currentVolume-=1;
			   System.out.println("The currentVolume is " +currentVolume);
		   }
		   else{
			   System.out.println("Minimum volume is reached");
		   }
	   }
	   else
	   {
		   System.out.println("Turn on the Speaker");
	   }
   }
}
	   