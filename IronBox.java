class IronBox
{
static boolean isPowerOn;
static int currentTemperature;
static int minTemperature;
static int maxTemperature=8;

public static boolean on()
{
	if(isPowerOn==false)
	{
		isPowerOn=true;
		System.out.println(" IronBox is turned on!");
	}
	return isPowerOn;
}
public static boolean off()
{
	if(isPowerOn==true)
	{
		isPowerOn=false;
		System.out.println("IronBox is turned OFF");
	}
	return isPowerOn;
}
public static void increaseTemperature()
{
	if(isPowerOn==true)
	{
		if(currentTemperature< maxTemperature)
		{
			currentTemperature=currentTemperature+1;
			System.out.println("The currentTemperature is " +currentTemperature);
		}
		else{
			System.out.println("Maximum temperature is reached");
			
		}
	}
	else
	{
		System.out.println("turn on the power of IronBox!");
	}
}
public static void decreaseTemperature()
{
	if(isPowerOn==true)
	{
		if(currentTemperature>minTemperature)
			currentTemperature-=1;
		System.out.println("the currentTemperature is " +currentTemperature);
	}
	else
	{
		System.out.println("turn on the power of IronBox!");
	}
}
}
