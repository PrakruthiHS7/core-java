class Chat{
    String  chatNames[] = new String[10]; 
    int index; 
	
    // Method to add a chat name
    public boolean addChatName(String chatName)
	{
        boolean isAdded = false; 
        if(index < chatNames.length)
		{
          if (chatName != null ) 
		   {
             boolean exists=checkIfNameExists(chatName);
			   if(exists==false)
			   {
                chatNames[index] = chatName;
                index++;
                isAdded =true;
			    
			   }
			   else
			  {
				  System.out.println( chatName +" is aleady added");
			  }		
          }
		}
		else{
		   System.out.println("chatname size is full..cannot procees to add the data");
		   }
        return isAdded;
    }

    
      public boolean checkIfNameExists(String chatName)
		{
			boolean exists=false;
	      for(int index=0;index<chatNames.length;index++)
	       {
		  
			   if (chatNames[index]==chatName)
			   {
			    exists=true;
			   }	   
	       }  
		  return exists;
		}
		
		// Search for a chatName
		public String searchBychatName(String chatName)
		{      
			for(int i=0;i<chatNames.length;i++)
			{
				if(chatNames[i]==chatName)
					  return chatName;
			}
			 return null;
		}
		
    // Method to retrieve/read and print chatNames
    public void getChatNames() 
	{
        System.out.println("The list of Chat Names:");
        for (int index = 0; index <chatNames.length; index++) 
		{
            System.out.println(chatNames[index] );
        }
    }
	
	public boolean deletedByChat(String chat)
	{
		boolean isDeleted=false;
		String chatNamesAfterDelete[]=new String [chatNames.length-1];
		int ind=0;
		for(int index=0;index<chatNames.length;index++)
		{
			if(chatNames[index]!=chat)
			{
				chatNames[ind++]=chatNames[index];
			     isDeleted=true;
			}
		}
		
	
	return isDeleted;
	}
}
