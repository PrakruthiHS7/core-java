class Ottplatform1
{
	//instance variableclass OttPlatForm {
	String movieNames[]=new String[7];
	int index;//instance variable
	
	//create/add/save operation
	
	public boolean addMoviesName(String movieName)
	{
		
		boolean isAdded=false;//local variable it shoul be initialize at the time of declarartion
		
		
		if(index < movieNames.length)
		{  
	   
		   if(movieName != null)
		   {
			   boolean exists=checkIfNameExists(movieName);
			   if(exists==false)
			   {
			
			movieNames[index++]=movieName;
			isAdded=true;
			
			   }
              else
			  {
				  System.out.println( movieName +" is aleady added");
			  }				  
		   }
		   else{
			   
		   }
		}
		else{
		   System.out.println("movieName size is full..cannot procees to add the data");
		   }
	
		
		return isAdded;
	}
		
		public boolean checkIfNameExists(String movieName)
		{
			boolean exists=false;
	      for(int index=0;index<movieNames.length;index++)
	       {
		  
			   if (movieNames[index]==movieName)
			   {
			   System.out.println("movieName aleady exist");
			   exists=true;
			   }
		   
	       }
		  
		  return exists;
		}
	
	//read
	public void getMoviesName()
	{
		System.out.println("The list of MOvie names are :");
		for(int index=0; index<movieNames.length;index++)
		{
			System.out.println(movieNames[index]);
			
		}
		
	}
	
}
 