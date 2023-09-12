class Country{
	
	String states[]={"Karnataka","Mumbai","Gujarath","ThamilNadu","","Chennai","Andrapradesh"};
	public void getStates()
	{
		System.out.println("Invoked get states");
		System.out.println("The list of states are");
	  for (int index=0; index<states.length; index++)
	   {
		
		System.out.println("The available states are " +states[index]);
	  }
	System.out.println("Invoked get states");
	}
	
}