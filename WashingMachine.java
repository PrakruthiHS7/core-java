class WashingMachine 
{
	 static boolean isPowerOn;
	 static int minSpeed;
	 static int maxSpeed=6;
	 static int currentSpeed;
	 
	 public static boolean on()
	   {
       System.out.println("inside on");	 
	
        if(isPowerOn == false) 
		{
	       isPowerOn = true ;
		    System.out.println("the washing machine is turned on");
		}
		return isPowerOn;
	   }
		
		
	public static boolean off()
    {
	  if(isPowerOn==true)
	 {
		isPowerOn=false;
		System.out.println("The washing machine is turned OFF");
	 }
	 return isPowerOn;
    }
	 
	 
    public static void increaseSpeed() 
	 {
	   System.out.println("start of increase Speed"); 
       if ( isPowerOn == true) 
		 {
           if ( currentSpeed < maxSpeed) 
		   {
             currentSpeed=currentSpeed +1;	
             System.out.println("the current Speed is "+currentSpeed); 
		    }
           else
		    {
			System.out.println("Maximum Speed is reached"); 
            }
        }
		else 
		{
		 System.out.println("first turn on the washing machine"); 
        }
        System.out.println("end of increase Speed"); 
     }	
	
       public static void decreaseSpeed()
	   {
		System.out.println("start of decrease Speed"); 
		  if ( isPowerOn == true)
			  {
                     if ( currentSpeed > minSpeed) 
					 {
                          currentSpeed=currentSpeed -1;	
                          System.out.println("the current Speed is "+currentSpeed);
				     }
                    else
					{ 
				      System.out.println("minimum Speed is reached"); 
                    }
              }
			  else
			  {
					  System.out.println("first turn on the washing machine"); 
              }
		      System.out.println("end of decrease Speed"); 
         }
}