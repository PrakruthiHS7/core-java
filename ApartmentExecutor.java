class ApartmentExecutor{
	public static void main(String apart[])
	{
	//ClassName refereneceVariable=new CalssName();
	Apartment apartment = new Apartment();
	apartment.apartmentId=1;  //initialising variable name   ,dot operator help to get acess
	apartment.apartmentName="Prestige";
	apartment.location="whitefield";
	apartment.noOfFloors=35;
	apartment.noOf2Bhkflats=180;
    apartment.noOfThreeBhkFlats=90;
	
	apartment.provideAccomadation();
	System.out.println("ApartmentId is " +apartment.apartmentId);
	System.out.println("Apartment name is " +apartment.apartmentName);
	System.out.println("Apartment location is " +apartment.location);
	System.out.println("Apartment  noOffloors is " +apartment.noOfFloors);
	System.out.println("Apartment noOf2Bhkflats is " +apartment.noOf2Bhkflats);
	System.out.println("Apartment noOfThreeBhkFlats is " +apartment.noOfThreeBhkFlats);
	
	
	Apartment apartment1= new Apartment();
	apartment1.apartmentId=2;  
	apartment1.apartmentName="Prestige";
	apartment1.location="JPNagar";
	apartment1.noOfFloors=45;
	apartment1.noOf2Bhkflats=190;
    apartment1.noOfThreeBhkFlats=100;
	
	apartment1.provideAccomadation();
	 System.out.println("ApartmentId is " +apartment1.apartmentId);
	 System.out.println("Apartment name is "+apartment1.apartmentName);
	System.out.println("Apartment location is "+apartment1.location);
	System.out.println("Apartment noOffloors is "+apartment1.noOfFloors);
	System.out.println("Apartment noOf2Bhkflats is "+apartment1.noOf2Bhkflats);
	System.out.println("Apartment noOfThreeBhkFlats is "+apartment1.noOfThreeBhkFlats);
	
	
	Apartment apartment2=new Apartment();
	apartment2.apartmentId=3;  
	apartment2.apartmentName="Prestige";
	apartment2.location="KoraMangala";
	apartment2.noOfFloors=65;
	apartment2.noOf2Bhkflats=200;
    apartment2.noOfThreeBhkFlats=120;
	
	System.out.println("ApartmentId is " +apartment2.apartmentId);
	System.out.println("Apartment name is " +apartment2.apartmentName);
	System.out.println("Apartment location is " +apartment2.location);
	System.out.println("Apartment  noOffloors is " +apartment2.noOfFloors);
	System.out.println("Apartment noOf2Bhkflats is " +apartment2.noOf2Bhkflats);
	System.out.println("Apartment noOfThreeBhkFlats is " +apartment2.noOfThreeBhkFlats);
	
	
	Apartment apartment3=new Apartment();
	apartment3.apartmentId=4;
	apartment3.apartmentName="Pestige";
	apartment3.location="RajajiNagar";
	apartment3.noOfFloors=75;
	apartment3.noOfThreeBhkFlats=190;
	apartment3.noOf2Bhkflats=200;
	
	System.out.println("ApartmentId is " +apartment3.apartmentId);
	System.out.println("Apartment name is " +apartment3.apartmentName);
	System.out.println("Apartment location is " +apartment3.location);
	System.out.println("Apartment  noOffloors is " +apartment3.noOfFloors);
	System.out.println("Apartment noOf2Bhkflats is " +apartment3.noOf2Bhkflats);
	System.out.println("Apartment noOfThreeBhkFlats is " +apartment3.noOfThreeBhkFlats);
	
	
	Apartment apartment4=new Apartment();
	apartment4.apartmentId=5;
	apartment4.apartmentName="Pestige";
	apartment4.location="VijayaNagar";
	apartment4.noOfFloors=85;
	apartment4.noOfThreeBhkFlats=200;
	apartment4.noOf2Bhkflats=190;
	
	
	System.out.println("The apartment Id is "  +apartment4.apartmentId);
	System.out.println("Apartment name is " +apartment4.apartmentName);
	System.out.println("Apartment location is " +apartment4.location);
	System.out.println("Apartment  noOffloors is " +apartment4.noOfFloors);
	System.out.println("Apartment noOf2Bhkflats is " +apartment4.noOf2Bhkflats);
	System.out.println("Apartment noOfThreeBhkFlats is " +apartment4.noOfThreeBhkFlats);
	
	
	
	}

}