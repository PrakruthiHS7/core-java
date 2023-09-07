class BusStandExecutor 
{
    public static void main(String bus[]) 
	{
        // Create a BusStand object without using a constructor
        BusStand busStand = new BusStand();

        // Set values for bus stand attributes
        busStand.setId(1);
        busStand.setName("Central Bus Stand");
        busStand.setLocation("Bangalore");
        busStand.setNumberOfPlatforms(10);
        busStand.setRestrooms(5);

        // Display information about the bus stand
        System.out.println("Bus Stand Information:");
        System.out.println("ID of the BusStand is : " + busStand.getId());
        System.out.println("Name of the busStand: " + busStand.getName());
        System.out.println("Location of the BusStand: " + busStand.getLocation());
        System.out.println("Number of Platforms: " +busStand.getNumberOfPlatforms());
        System.out.println("the number of Restrooms: " +busStand.getRestrooms());
		}
	}