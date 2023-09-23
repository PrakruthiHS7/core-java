class State
{
	
	private int  stateId;
	private String stateName;
	private int noOfDistricts;
	private String capital;
	private long population;
    private String language;
	
	public State(){
		
	}
	public void setStateId(int stateId){
		this.stateId=stateId;
	}
	public void setStateName(String stateName){
		this.stateName=stateName;
	}
	public void setNoOfDistricts(int noOfDistricts){
		this.noOfDistricts=noOfDistricts;
	}
	public void setCapital(String capital){
		this.capital=capital;
	}
	public int getStateId(){
		return stateId;
	}
	public String getStateName(){
		return stateName;
	}
	public int getNoOfDistricts(){
		return noOfDistricts;
	}
	public String getCapital(){
		return capital;
	}
	public void setPopulation(long population)
	{
		this .population=population;
	}
	public long getPopulation()
	{
		return population;
	}
	public void setLangauge(String language)
	{
		this.language=language;
	}
	public String getLanguage()
	{
		return language;
	}
	
	
}