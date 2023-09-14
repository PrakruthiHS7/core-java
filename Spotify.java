class Spotify
{
    String[] songNames = new String[10]; // Array to store song names 
    int index; // Instance variable 

    // Method to add a song name
    public boolean addSongName(String songName) {
        
        boolean isAdded = false; // Local variable, initialized to false by default

        if (songName != null) {
            
            songNames[index] = songName;
            index++;
            isAdded = true;
        }

        return isAdded;
    }

    // Method to retrieve and print song names
    public void getSongNames() 
	{
		System.out.println("The list of Songs are:");
        
        for (int index= 0; index < songNames.length; index++) {
            System.out.println(songNames[index] + " is added successfully");
        }
    }
}
