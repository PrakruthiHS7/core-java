class FishExecutor{
	
	public static void main(String fishes[])
	{
		Fish fish=new Fish(); //object of child class
		fish.setFishId(492);
		fish.setFishName("Elvis");
		fish.setPrice(6813.0);
		fish.setWeight(4.4);
		fish.setColor("light silver");
		
		Water water=new Water(); //object of super class
		
		//has-a relationship
		water.fish=fish;
		water.waterType="brackish water";
		
		System.out.println("Water Type : "+water.waterType);
		System.out.println("Fish Id : "+water.fish.getFishId());
		System.out.println("Fish Name : "+water.fish.getFishName());
		System.out.println("Fish Price : "+water.fish.getPrice());
		System.out.println("Fish color : "+water.fish.getColor());
		System.out.println("Fish Weigth : "+water.fish.getWeight());
		
	}
	
}