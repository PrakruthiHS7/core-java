class Factorial
{
    //5!=5*4*3*2*1
	//0!=1
	public static void main (String factorial[])
	{
	getFact(10);
	getFact(15);
	getFact(30);
	}
	//methods syntax
    public static void getFact(int factNumber)
    { 	
	System.out.println("getFact started");
	int fact=1;
	   for(int factNum=1; factNum<=factNumber;factNum++)
	    {
	     fact=fact*factNum;
	    }
	System.out.println("the factorial of "+factNumber +  " is: "  + fact);
	System.out.println("getFact started");
    }
	
}