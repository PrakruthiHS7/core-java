class ArrayAsc
{
   static int array[]={70,20,60,10,40};
   public static void main(String args[])
   {
	   int i;
   for( i=0;i<array.length;i++)
   {
      if(array[i]>array[i+1])
	  {
		  int temp=array[i];
	   array[i]=array[i+1];
	  array[i+1]=array[i];
	  
	  }
   }
   System.out.println("The soretd array is" +array[i]);
  }
  
  
}
	  