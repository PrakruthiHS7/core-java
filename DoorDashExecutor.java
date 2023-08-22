class DoorDashExecutor
{
public static void main (String food[])
{
System.out.println("main started");
 double price = DoorDash.search("Chowmein");
 System.out.println("price of the Chowmein is " +price);
 
 double priceWithQuantity = DoorDash.search("Chowmein",3);
 System.out.println("price of the Chowmein with quantity is " +priceWithQuantity);
}
}
 