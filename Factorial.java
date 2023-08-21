class Factorial
{
    //5!=5*4*3*2*1
	//0!=1
	public static void main (String factorial[])
	{
	int factNumber=5;
	int fact=1;
	for(int factNum=1;factNum<=factNumber;factNum++)
	{
	fact=fact*factNum;
	}
	System.out.println("the factorial of "+factNumber + " is " +fact);
    }
}