class Chat{
    String  chatNames[] = new String[10]; 
    int index; 
	
    // Method to add a chat name
    public boolean addChatName(String chatName)
	{
        
        boolean isAdded = false; // Local variable, initialized to false by default

        if (chatName != null ) 
		{
            
            chatNames[index] = chatName;
            index++;
            isAdded = true;
        }

        return isAdded;
    }

    // Method to retrieve and print chatNames
    public void getChatNames() 
	{
        System.out.println("The list of Chat Names:");
        for (int index = 0; index <chatNames.length; index++) 
		{
            System.out.println(chatNames[index] + " is added successfully");
        }
    }
}
