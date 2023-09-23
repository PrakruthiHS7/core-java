class StateExecutor
{
	public static void main(String states[])
	{
		State state=new State();
		
		state.setStateId(2);
		state.setStateName("Karnataka");
		state.setNoOfDistricts(31);
		state.setCapital("Bengaluru");
		state.setPopulation(61095297);
		state.setLangauge("Kannada");
		
		Country country=new Country();
		country.state=state;
		
		country.countryName="India";
		
		
		System.out.println("Country name is  : "+country.countryName);
		System.out.println("State Id : "+country.state.getStateId());
		System.out.println("State Name : "+country.state.getStateName());
		System.out.println("No of Districts in the State : "+country.state.getNoOfDistricts());
		System.out.println("Capital name : "+country.state.getCapital());
		System.out.println("population:"+country.state.getPopulation());
		System.out.println("Language:"+country.state.getLanguage());
		
	}
}
