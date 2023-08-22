class Snacks
{
static String snacks[]={"Potato Chips","Popcorn.","Cheese Crackers","Cookies","Oreos. ","Pop-Tarts.","Cheese Crackers.","Tortilla Chips","Mixed Fruit.","Pretzels","Fruit Snacks","Granola Bars","Nachos","Gummy Bears","Hot Dogs"};
public static void main(String snacks[])
{
	getSnacks();
	getReverseSnacks();
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
}
	
	