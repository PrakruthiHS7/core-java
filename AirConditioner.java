class AirConditioner
{
static boolean isActivated;
static int currentTemperature;
static int minTemperature;
static int maxTemperature=50;

public static boolean on()
{
	if(isActivated==false)
	{
		isActivated=true;
		System.out.println(" airconditioner is turned on!");
	}
	return isActivated;
}
public static boolean off()
{
	if(isActivated==true)
	{
		isActivated=false;
		System.out.println("Air conditioner is turned OFF");
	}
	return isActivated;
}
public static void increaseTemperature()
{
	if(isActivated==true)
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
		System.out.println("turn on the aircnditioner!");
	}
}
public static void decreaseTemperature()
{
	if(isActivated==true)
	{
		if(currentTemperature>minTemperature)
			currentTemperature-=1;
		System.out.println("the currentTemperature is " +currentTemperature);
	}
	else
	{
		System.out.println("turn on the AC!");
	}
}
}
