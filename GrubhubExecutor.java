class GrubhubExecutor
{
public static void main (String food[])
{
System.out.println("main started");
 double price = Grubhub.search("Chineesegarlic bread");
 System.out.println("price of theChineesegarlic bread  is " +price);
 
 
 double priceWithQuantity = Grubhub.search("Chineesegarlic bread",2);
 System.out.println("price of theChineesegarlic bread  with quantity is " +priceWithQuantity);
 System.out.println("main ended");
 
 }
 }