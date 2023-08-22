//8/8/2023(for loop)
class Netflix
{
   static String englishMovies[] = {"The Guilty","Hidden Strike ","Paradise","Ride Along","The Out-Laws","Titanic","Accepted","The Mule","Extraction","Dunkirk","The Son ","Missing","Ted","The Mother","Chupa","Easy A","Munich", "The Edge of War","The Pez Outlaw ","Bubble","Bullet Train","Da 5 Bloods","Passing","conjuring","RRR","annabell"};
   static String kannadaMovies[] = {"U-Turn","Mundina Nildana","kanthara","Ayana","KRANTI","VEDHA","RAYMO","paramathma","galipata","VIJAYANAND ","Shivaji Surathkal","Thothapuri ","Prem Poojyam","ugram","munjane","annabond","murali meets meera","gajakesari"," power","modalasala","boss","charli","yajamana","krishnarukku","yuvarathna"};
   static String  hindiSeries[] = {"Narcos","Top Boy","Stranger Things","Sacred Games","Mirzapur and Scam 1992","The Harshad Mehta Story","delhi crime","hasmukh","Tajmahal","little things","missmatched","scoop","The Witcher","ujutsu Kaisen","Dark "};
   static  String teluguMovies[] = {"Oh! Baby","GodFather","Thimmarusu"," Shyam Singha Roy","Uppena","Oohalu Gusagusalade","Saakini Daakini","Bheeshma","Ante Sundaraniki!","Most Eligible Bachelor","Major","Eega","AWE!","Mallesham","Cinema Bandi","Ala Vaikunthapurramloo","Care of Kancharapalem","Adhugo","Manu","Spyder","Sarkar","Baahubali ","Matti Kusthi","Yevadu","Shirdi Sai"};
   static String malayalamMovies[] = {"Uyare","Irul ","jan Prakashan","Forensic","Lilli","Grandmaster","Comrade In America ","Varane Avashyamund","Swathanthryam","Nayattu ","Angamaly Diaries","Kappela ","Aalorukkam","Vikrithi","Maniyarayile Ashokan","Love","Kurup","Sudani From Nigeria ","Kilometers and Kilometers","Kuttavum Shikshayum","Thottappan","Minnal Murali ","Jana Gana Mana","Vaashi","Night Drive"};
   
      public static void main(String netflix[])
	  {
	 
	     System.out.println("main startted");
		for(int index=englishMovies.length-1; index>=0; index--)
		{
		System.out.println("the englishMovies are " +englishMovies[index]);
		}
		
		for(int index=kannadaMovies.length-1; index>=0; index--)
		{
		System.out.println("the kannadaMovies are " +kannadaMovies[index]);
		}
		
		for(int index=hindiSeries.length-1; index>=0; index--)
		{
		System.out.println("the hindiSeries  are " +hindiSeries[index]);
		}
		
		
		for(int index=teluguMovies.length-1; index>=0; index--)
		{
		System.out.println("the teluguMovies are " +teluguMovies[index]);
		}
		
		
		for(int index=malayalamMovies.length-1; index>=0; index--)
		{
		System.out.println("the malayalamMovies are " +malayalamMovies[index]);
		}
		
		System.out.println("The main ended");
	  }
}