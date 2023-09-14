class CricketPlatform
{
    String playerNames[]= new String[10]; // Array to store player names
    int index; // Instance variable 

    // Method to add a cricket player name
    public boolean addPlayerNames(String playerName) 
	{
        
        boolean isAdded = false; // Local variable

        if (playerName != null ) {
            
            playerNames[index] = playerName;
            index++;
            isAdded = true;
        }

        return isAdded;
    }

    // Method to retrieve and print cricket player names
    public void getPlayerNames() {
        System.out.println("Cricket Player Names:");
        for (int index=0; index < playerNames.length; index++) {
            System.out.println(playerNames[index] + " is added successfully");
        }
    }
}
