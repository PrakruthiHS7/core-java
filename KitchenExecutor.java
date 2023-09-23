class KitchenExecutor{

	public static void main(String kitchens[]){
		
		Kitchen kitchen=new Kitchen();  //creating object using new keyword
		
		kitchen.setColor("Green");
		kitchen.setGraniteType("polished");
		kitchen.setHasOven(true);
		kitchen.setSize(200);
		
		
		
		Hotel hotel=new Hotel();  
		
		hotel.hotelName="Food court";
		hotel.owner="Ramanand";
		
		hotel.kitchen=kitchen;   //Has-A relationship
		
		
		System.out.println("Hotel name: " + hotel.hotelName);
		System.out.println("Hotel managed by: " + hotel.owner);
        System.out.println("Kitchen colour: " + hotel.kitchen.getColor());
        System.out.println("Type of granite in kitchen area: " + hotel.kitchen.getGraniteType());
        System.out.println("Has Oven: " + hotel.kitchen.getHasOven()); 
        System.out.println("Kitchen size: " + hotel.kitchen.getSize() + " sqft");
   
		
		
		
		
	}
}