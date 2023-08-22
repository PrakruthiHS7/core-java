//8/8/2023(for loop)
class SportsMania
{
  static String topTenCricketBatsman[]= {"kane williamson","steve smith","marnus labuschangne","travis head","joe root","babar azamusman khawaja","dayrl mitchell","dimuth karunaratne","rishab pant","Virak Kohli"};
  static String topTenCricketTeams[]= {"australia","pakistan","India","new zealand","england","south africa","bangladesh","afghanisthan","sriLanka","WestIndies"};
  static String topTenHockyTeams[]= {"Australia","Belgium","Netherlands","Germany","India","England","Argentina","Spain","New Zealand","Malaysia"};
  static String topTenTennisPlayers[]= {"Novak Djokovic","Carlos Alcaraz","Daniil Medvedv","caspur rud","jannik sinner","rafael Nadal","andry rublev","hubert"," holger rune","Alexander Zverev"};
  static String topTenCricketBowlers[]= {"Josh Hazlewookg","Mitchell Starc","Rashid Khan","Mohammad Siraj","Matt Henry","Trent Boult","Adam Zampa"," Mohammad Nabi"," Chris Woakes"," Mark Watt"};
  public static void main(String sports[])
  {
         System.out.println("main started");
		 for(int index = topTenCricketBatsman.length-1;index >=0  ; index--)
		{
		System.out.println("the topTen CricketBatsman are " +topTenCricketBatsman[index]);
		}
		for(int index = topTenCricketTeams.length-1;  index>=0;  index--)
		{
		System.out.println("the topTen CricketTeams are " +topTenCricketTeams[index]);
		}
		
		for(int index = topTenHockyTeams.length-1;  index>=0;   index--)
		{
		System.out.println("the topTen  HockyTeams are " +topTenHockyTeams[index]);
		}
		
		for(int index = topTenTennisPlayers.length-1; index>=0; index--)
		{
		System.out.println("the topTen TennisPlayers are " +topTenTennisPlayers[index]);
		}
		
		for(int index = topTenCricketBowlers.length-1; index>=0; index--)
		{
		System.out.println("the topTen CricketBowlers are " +topTenCricketBowlers[index]);
		}
		System.out.println("the mian ended");
	}
}	