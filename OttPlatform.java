class OttPlatform
{
	// Declare and initialize the movies array
    String[] movies = {"Appu", "Power", "Rajakumara","Arasu", "Bettada Hoovu"};
	
	public void getMovies()
	{
		System.out.println("List of movies");
		for(int index=0;index<movies.length;index++)
		{
			System.out.println(movies[index]);
		}
	}
}