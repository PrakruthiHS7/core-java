class PostOfficeExecutor
{
	public static void main(String posto[])
	{
        PostOffice postOffice = new PostOffice();
		postOffice.setId(1);
		postOffice.setName("Main POstOffice ");
		postOffice.setLocation("Mandya");
		postOffice.setPostalCode("127856");
		postOffice.setNumberOfEmployees(50);
		
		System.out.println("Post Office ID: " +postOffice.getId());
        System.out.println("Post Office Name: " +postOffice.getName());
        System.out.println("Location Of the postOffice: " +postOffice.getLocation());
        System.out.println("Postal Code of the postOffice: " +postOffice.getPostalCode());
        System.out.println("Number of Employees in postOffice: " +postOffice.getNumberOfEmployees());
	}
}