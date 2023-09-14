class CricketPlatformExecutor 
{
    public static void main(String cricket[]) 
	{
        CricketPlatform cricketPlatform = new CricketPlatform();

        // Adding cricket player names
        cricketPlatform.addPlayerNames("Virat Kohli");
        cricketPlatform.addPlayerNames("Hardik. Pandya");
        cricketPlatform.addPlayerNames("Virat Kohli");
		cricketPlatform.addPlayerNames("RohitSharma");
		cricketPlatform.addPlayerNames("Rishabh");
		cricketPlatform.addPlayerNames("Ravichandran");
		cricketPlatform.addPlayerNames("Ashwin");
		cricketPlatform.addPlayerNames("RohitSharma");
		cricketPlatform.addPlayerNames("Rahul Dravid");
		cricketPlatform.addPlayerNames("KL Rahul");

        // Getting and printing cricket player names
        cricketPlatform.getPlayerNames();
    }
}
