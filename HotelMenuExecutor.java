class HotelMenuExecutor {
    public static void main(String hotels[])
	{
       
      Hotel hotel=new Hotel();
        hotel.addMenuItem("Burger");
        hotel.addMenuItem("Pizza");
        hotel.addMenuItem("Spaghetti");
        hotel.addMenuItem("Salad");
		hotel.addMenuItem("Lasagna");
        hotel.addMenuItem("Tacos");
        hotel.addMenuItem("Chicken Parmesan");
        hotel.addMenuItem("Shrimp Scampi");
        hotel.addMenuItem("Mushroom Risotto");
		hotel.addMenuItem("Fish and Chips");
		
        hotel.getMenuItems();
    }
}