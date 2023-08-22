class SuperMarket
{
   static String chocolates[]={"Cadbury Dairy Milk","Kit Kat","Munch","Fruit Nut","Snickers","Fuse","Milky Bar","5 Star","Dark Chocolate","Fabelle","MilkyWay","Twix","Coffee byte","Mars","Hershey's Milk Chocolate"};
   static String biscuits[]={"Parle-G","Marie Gold","Britannia Bourbon","Monaco","Dark Fantasy","Britannia NutriChoice","Oreo","Jeera butter cookies","Hobnubs","Butter Biscuit","Good Day","50-50","Hide and seek","Milk Bikis","Cream biscuit"};
   static String soaps[]={"Lux","Dove","Lifebuoy","Pers","Santoor","Cinthol","Hamam"," Chandrika","Mysore Sandle","Raktha Chandana","Dettol","Softsens","Psorolin","mamaearth","Orange Carrot Soap"};
   static String vegetables[]={"Beans","Carrot","Radish","Potatos","Tomato","Onion","cabbage","pumpkin","cucumber","Beetroot","Spinach","Pvoid eas","Okra","brinjal","Okra"};static String snacks[]={"Potato Chips","Popcorn.","Cheese Crackers","Cookies","Oreos. ","Pop-Tarts.","Cheese Crackers.","Tortilla Chips","Mixed Fruit.","Pretzels","Fruit Snacks","Granola Bars","Nachos","Gummy Bears","Hot Dogs"};
   static String fruits[]={"Mango","Pomogranate","Banana","Kiwi","Apple","Gava","Orange","Grapes","Pine apple","peaches","Plums","Pears","Watermelons","Papaya","Chikoo"};
   static String gloceries[]={"Toor dal","Round urad dal ","Yellow moong dal","Chana dal","Split urad dal","Rajma, peas","Fried gram dal","Horsegram","Bread","Rice Floor","Ragi Flour","Rava","Idli Rava","REd chilli","cooking Oil","Noodles"};
   static String coldDrinks[]={"Coca Cola.","Pepsi","Sprite","Mirinda","Maaza","Fruty","Raspberry Fizz","Peach Iced Tea. ","Cold-Brew Iced Tea","Strawberry Thyme Lemonade","Kombucha-Pomegranate Tonic","Coke","Mountain Dew.","Diet Pepsi.","Dr Pepper.","orange soda"};
   static String perfume[]={"Sauvage by Dior.","Baccarat Rouge","Floral Daze.","Enchanted.","Shalimar by Guerlain.","Aventus by Creed.","Envy","Cobra","Ocaen","Fog","Born Rich","Morning Breeze.","Orchid Essence.","Floral Daze.","Moist Perfum"};
   static String iceCream[]={"Butter pecan","Kulfi","Snow Cream","Mango IceCream","FriedIce","VanillaIce Cream","Gelat","Soft serve","Chocolate ice cream","Granita","Mint chocolate","Pea nut Icecream","Caramel IceCram","Butterscotch","Cookies and Cream"};
   public static void main(String biscuit[])
   {  
      getChocolate();
	  getReverseChocolate();
	  getBiscuit();
	  getReverseBiscuit();
	  getSoap();
	  getReverseSoap();
	  getSnacks();
	  getReverseSnacks();
	  getVegtables();
      getReversevegetables();
	  getfruits();
      getReversefruits();
	  getGloceries();
	  getReverseGloceries();
	  getColdDrink();
	  getReverseColdDrink();
	  getPerfume();
	  getReversePerfume();
	  getIceCream();
	  getReverseIceCream();

	  
	 
   }
    public static void getChocolate()
   {
	 System.out.println("The list of available biscuits are: ");
     for(int index=0;index<chocolates.length;index++){
	 System.out.println( chocolates[index] );
	 }
   }
   public static void getReverseChocolate()
   { 
     System.out.println("The list  available biscuits in  reverse order: ");
     for(int index=chocolates.length-1;index>=0;index--)
	 {
	 System.out.println( chocolates[index] );
	 }
   }
   
   public static void getBiscuit()
   {
	 System.out.println("The list of available biscuits are ");
     for(int index=0;index<biscuits.length;index++){
	 System.out.println(  biscuits[index] );
	 }
   }
   public static void getReverseBiscuit()
   { 
     System.out.println("The list  available biscuits in  reverse order ");
     for(int index=biscuits.length-1;index>=0;index--)
	 {
	 System.out.println(  biscuits[index] );
	 }
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
  
  
  public static void getSnacks()
{
	System.out.println("The list of available snacks are:");
	for(int num=0; num < snacks.length; num++)
	{
		System.out.println(snacks[num]);
	}
}
public static void getReverseSnacks()
{
	System.out.println("The list snacks in Reverse order:");
	for(int num=snacks.length-1;num>=0;num--)
	{
		System.out.println(snacks[num]);
	}
}


 public static void getVegtables()
 {
 System.out.println("The list of Vegetables are:");
 for(int num=0;num<vegetables.length;num++)
 {
 System.out.println(vegetables[num]);
 }
 }
 public static void getReversevegetables()
 {
 System.out.println("The list of vegetables in reverse order:");
 for(int num=vegetables.length-1;num>=0;num--)
{
 System.out.println(vegetables[num]);
 }
 }
 
 public static void getfruits()
 {
 System.out.println("The list of Vegetables are:");
 for(int num=0;num<fruits.length;num++)
 {
 System.out.println(fruits[num]);
 }
 }
 public static void getReversefruits()
 {
 System.out.println("The list of vegetables in reverse order:");
 for(int num=fruits.length-1;num>=0;num--)
{
 System.out.println(fruits[num]);
 }
 }
 
 
  public static void getGloceries()
   {
	 System.out.println("The list of available Gloceries are: ");
     for(int index=0;index<gloceries.length;index++){
	 System.out.println(  gloceries[index] );
	 }
   }
   public static void getReverseGloceries()
   { 
     System.out.println("The list  available gloceries  in  reverse order: ");
     for(int index=gloceries.length-1;index>=0;index--)
	 {
	 System.out.println( gloceries[index] );
	 }
   }
   
   
   
   
   public static void getColdDrink()
   {
	 System.out.println("The list of available coldDrinks : ");
     for(int index=0;index<coldDrinks.length;index++){
	 System.out.println(  coldDrinks[index] );
	 }
   }
   public static void getReverseColdDrink()
   { 
     System.out.println("The list  available coldDrinks in  reverse order: ");
     for(int index=coldDrinks.length-1;index>=0;index--)
	 {
	 System.out.println(  coldDrinks[index] );
	 }
   }
   
   
   
   public static void getPerfume()
   {
	 System.out.println("The list of available perfumes are: ");
     for(int index=0;index<perfume.length;index++){
	 System.out.println(  perfume[index] );
	 }
   }
   public static void getReversePerfume()
   { 
     System.out.println("The list  available perfumes in  reverse order: ");
     for(int index=perfume.length-1;index>=0;index--)
	 {
	 System.out.println(  perfume[index] );
	 }
   }
  
   
   
   public static void getIceCream()
   {
	 System.out.println("The list of available IceCram : ");
     for(int index=0;index<iceCream.length;index++){
	 System.out.println( iceCream[index] );
	 }
   }
   public static void getReverseIceCream()
   { 
     System.out.println("The list  available IceCram in  reverse order: ");
     for(int index=iceCream.length-1;index>=0;index--)
	 {
	 System.out.println( iceCream[index] );
	 }
   }
 
   
}
