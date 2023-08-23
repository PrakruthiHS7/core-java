class Mixer
{
static boolean isPowerOn;
static int currentSpeed;
static int minspeed;
static int maxSpeed=5;

public static boolean turnOn()
{
	if(isPowerOn==false)
	{
		isPowerOn=true;
		System.out.println(" Mixer is turned on!");
	}
	return isPowerOn;
}
public static boolean turnOff()
{
	if(isPowerOn==true)
	{
		isPowerOn=false;
		System.out.println("Mixer is turned OFF");
	}
	return isPowerOn;
}
public static void increaseSpeed()
{
	if(isPowerOn==true)
	{
		if(currentSpeed< maxSpeed)
		{
			currentSpeed=currentSpeed+1;
			System.out.println("The currentSpeed is " +currentSpeed);
		}
		else{
			System.out.println("Maximum Speed is reached");
			
		}
	}
	else
	{
		System.out.println("switch on !");
	}
}
public static void decreaseSpeed()
{
	if(isPowerOn==true)
	{
		if(currentSpeed>minspeed)
			currentSpeed-=1;
		System.out.println("the currentSpeed is " +currentSpeed);
	}
	else
	{
		System.out.println("turn on the Mixer!");
	}
}
}
