class HotelMenuExecutor{
  
     public static void main(String hotelmenu[]) {
        // Create an instance of Hotel
        HotelMenu hotelMenu = new HotelMenu();
        hotelMenu.addMenuItem("masaldose");
        hotelMenu.addMenuItem("paroota");
        hotelMenu.addMenuItem("egg rice");
        hotelMenu.addMenuItem("chicken biriyani");
        hotelMenu.addMenuItem("chilly chicken");
        hotelMenu.addMenuItem("egg rice");
        hotelMenu.addMenuItem("egg biriyani");
		hotelMenu.addMenuItem("chilly chicken");
        hotelMenu.addMenuItem("fish kabab");
        hotelMenu.addMenuItem("chicken lollypop");

        // Display the menu
        hotelMenu.displayMenu();
    }
}