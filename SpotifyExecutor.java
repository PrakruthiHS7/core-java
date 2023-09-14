 class SpotifyExecutor{
    public static void main(String spotifyplatform[])
	{
        Spotify spotify= new Spotify();

        // Adding song names
		spotify.addSongName("Heeriye");
		spotify.addSongName("Challeya");
		spotify.addSongName("Chikkini chammeli");
		spotify.addSongName("Heeriye");
		spotify.addSongName("Tu Chale");
		spotify.addSongName("Chammak Challo");
		spotify.addSongName("Naah");
        spotify.addSongName("Dilko karaya");
        spotify.addSongName("Gollimata");
        spotify.addSongName("Pinga");

        // Getting and printing song names
        spotify.getSongNames();
    }
}
