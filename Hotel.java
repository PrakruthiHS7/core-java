class Hotel 
{
     String menuItems[] = new String[10];
     int index;

    public boolean addMenuItem(String itemName) {
        
        boolean isAdded = false;
        if(itemName != null ) 
		{
            
            menuItems[index] =itemName;
            index++;
            isAdded = true;
        }
        return isAdded;
    }

    public void getMenuItems() {
        System.out.println("The list of menu items are:");
        for (int index = 0; index <menuItems.length; index++) {
            System.out.println(menuItems[index] + " is added succesfully ");
        }
    }
}


