class CricketPlatformExecutor 
{
    public static void main(String cricket[]) 
	{
        CricketPlatform cricketPlatform = new CricketPlatform();

        // Adding cricket player names
        cricketPlatform.addPlayerNames("Virak Kohli");
        cricketPlatform.addPlayerNames("Hardik. Pandya");
        cricketPlatform.addPlayerNames("MS Dhoni");
		cricketPlatform.addPlayerNames("RohitSharma");
		cricketPlatform.addPlayerNames("Rishabh");
		cricketPlatform.addPlayerNames("Ravichandran");
		cricketPlatform.addPlayerNames("Ashwin");
		cricketPlatform.addPlayerNames("Sourav Ganguly");
		cricketPlatform.addPlayerNames("Rahul Dravid");
		cricketPlatform.addPlayerNames("KL Rahul");

        // Getting and printing cricket player names
        cricketPlatform.getPlayerNames();
    }
}
