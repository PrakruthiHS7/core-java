class PassengersExecutor {
    public static void main(String pass[]) {

        // Create a passenger object
        Passengers passengers= new Passengers();

        // Set passenger attributes using setter methods
        passengers.setPassengerId(123456);
        passengers.setPassengerName("prakruthi");
        passengers.setDestination("hyderabad");
        passengers.setTicketPrice(900.0);
        passengers.setDepartureTime("09:00 AM");
        passengers.setArrivalTime("9:00 PM");

        Train train = new Train();
        // Has-a relationship
        train.passengers = passengers;

        train.trainName = "Indian Express";
		
        System.out.println("The train name is " +train.trainName);
		System.out.println("Passenger name: " + train.passengers.getPassengerName());
        System.out.println("Passenger ID: " + train.passengers.getPassengerId());
        System.out.println("Destination: " + train.passengers.getDestination());
        System.out.println("Ticket Price: $" + train.passengers.getTicketPrice());
        System.out.println("Departure Time: " + train.passengers.getDepartureTime());
        System.out.println("Arrival Time: " + train.passengers.getArrivalTime());
    }
}
