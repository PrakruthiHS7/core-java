class PostOffice 
{
    private int id;
    private String name;
    private String location;
    private String postalCode;
    private int numberOfEmployees;
	
	 public void setId(int id) {
        this.id = id;
    }
	public int getId() {
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
	
	
	 public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    } 
	public String getPostalCode() {
        return postalCode;
    }
     
	
	
	public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
	public int getNumberOfEmployees()
	{
        return numberOfEmployees;
    }
	

}