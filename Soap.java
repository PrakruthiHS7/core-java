class Soap
{
  static String soaps[]={"Lux","Dove","Lifebuoy","Pers","Santoor","Cinthol","Hamam"};
  public static void main(String soap[])
  {
    getSoap();
	getReverseSoap();
	}
  public static void getSoap()
  {
   
  System.out.println("The list of Available soaps are:");
  for(int num=0;num<soaps.length;num++)
  {
  System.out.println(soaps[num]);
  }
  }
  public static void getReverseSoap()
  {
  System.out.println("The list of soap in reverse order:");
  for(int num=soaps.length-1;num>=0;num--)
  {
  System.out.println(soaps[num]);
  }
  }
}