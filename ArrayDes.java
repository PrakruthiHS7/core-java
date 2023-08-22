class ArrayDes
{
   static int array[]={200,400,800,1000,500,100};
   public static void main(String args[])
   {
	    int temp=0,i,j;
	  
   for( i=0;i<array.length;i++)
   {
	  
	   
      for(j=i+1;j<array.length;j++)
	   
      if(array[i]<array[j])
	  {
		temp=array[i];
	    array[i]=array[j];
	    array[j]=temp;
	  }
   }
	  
   for(i=0;i<array.length;i++)
   {
   System.out.println( array[i]+ "");
   }
   
  }
  
   
}
	  