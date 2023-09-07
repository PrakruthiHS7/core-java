class BusStand
 {
    private int id;
    private String name;
    private String location;
    private int numberOfPlatforms;
    private int restrooms;
	
	
	public void setId(int id) {
        this.id = id;
    }
	public int getId() 
	{
        return id;
    }
	
	
	public void setName(String name) {
        this.name = name;
    }
	public String getName() {
        return name;
    }
	
    public void setLocation(String location) {
        this.location = location;
    }
	public String getLocation() {
        return location;
    }
	
    public void setNumberOfPlatforms(int numberOfPlatforms)
	{
        this.numberOfPlatforms = numberOfPlatforms;
    }
	public int getNumberOfPlatforms() 
	{
        return numberOfPlatforms;
    }

    public void setRestrooms(int restrooms) 
	{
        this.restrooms = restrooms;
    }
	public int  getRestrooms() {
        return restrooms;
    }
	
}

	
	
	