class RailwayStation {
    private int stationId;
    private String stationName;
    private String stationCode;
    private String location;
    private int noOfPlatforms;
	
	public void setStationId(int stationId) {
        this.stationId = stationId;
    }
    public int getStationId() {
        return stationId;
    }
	
	public void setStationName(String stationName) {
        this.stationName = stationName;
    }
	public String getStationName() {
        return stationName;
    }

    
	 public void setStationCode(String stationCode) {
        this.stationCode = stationCode;
    }
      public String getStationCode() {
        return stationCode;
    }
	
	 public void setLocation(String location) {
        this.location = location;
    }
	public String getLocation() {
        return location;
    }
    
	
	
	 public void setNoOfPlatforms(int noOfPlatforms) {
        this.noOfPlatforms = noOfPlatforms;
    }
	public int getNoOfPlatforms() {
        return noOfPlatforms;
    }
	
	
	
 public void displayRailwayStationInformation()
 {
        System.out.println("Station ID : " + stationId);
        System.out.println("Station Name: " + stationName);
        System.out.println("Station Code: " + stationCode);
        System.out.println("Location of the RailwayStation : " + location);
        System.out.println("Number of Platforms: " + noOfPlatforms);
    }
}