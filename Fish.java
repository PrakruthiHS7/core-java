class Fish{
    //private member variable
	private int fishId;
	private String fishName;
	private String color;
	private double price;
	private double weight;	
	
	//default constructor
	public Fish()
	{
		
	}
	
	//settter and getter methods
	public void setFishId(int fishId){
		this.fishId=fishId;
	}
	public void setFishName(String fishName){
		this.fishName=fishName;
	}
	
	// Setter and getter methods for color
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
	public void setPrice(double price){
		this.price=price;
	}
	public void setWeight(double weight){
		this.weight=weight;
	}
	
	public int getFishId(){
		return fishId;
	}
	public String getFishName(){
		return fishName;
	}
	public double getPrice(){
		return price;
	}
	public double getWeight(){
		return weight;
	}
}