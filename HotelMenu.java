class HotelMenu {

    String menuItems[] = new String[10];
    int index;

    // Method to add a menu item and its price to the arrays
    public boolean addMenuItem(String menuItem) {
        boolean isAdded = false;
		if(index<menuItems.length){
        if (menuItem != null) {
			boolean exists = checkIfMenuItemExists(menuItem);
		      if(exists == false)
			  {
            menuItems[index] = menuItem;
            index++;
            isAdded = true;
              }
		else {
			 System.out.println(menuItem + " is already exist");
		    }
		   
		   }
		}
		else{
			System.out.println("items are filled you cannot proceed to add");;
		}
        return isAdded;
    }

   //read
    public void displayMenu() {
        System.out.println("Hotel Menu:");
        for (int index = 0; index < menuItems.length; index++) {
            System.out.println(menuItems[index]);
        }
    }
	
	public boolean checkIfMenuItemExists(String menuItem)
		{
			boolean exists=false;
	      for(int index=0;index<menuItems.length;index++)
	       {
		  
			   if (menuItems[index]==menuItem)
			   {
			    exists=true;
			   }
		   
	       }
		     return exists;
        }
		
		
		
		// Search for a MenuItem
	public String searchByMenuItem( String menuItem)
		{      
			for(int i=0;i<menuItems.length;i++)
			{
				if(menuItems[i]==menuItem)
					  return menuItem;
			}
			 return null;
		}


}