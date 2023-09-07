class BankExecutor {
    public static void main(String bankexe[])
	{
        // Create a Bank object
        Bank bank = new Bank();

        // Set bank information
		System.out.println("Bank Information:");
        bank.setId(1);
        System.out.println("ID of the Bank is : " + bank.getId());
		
        bank.setName("State Bank Of India");
		System.out.println("name  of the Bank is : " + bank.getName());
		
        bank.setIfscCode("SBI9871234");
		System.out.println("IFSC Code   of the Bank is : " + bank.getIfscCode());
		
		
		
        bank.setBankEmailID("sbibank1@gmail.com");
		System.out.println("EmailId  of the Bank is : " + bank.getBankEmailID());
		
		
        bank.setManager("John Doe");
		System.out.println("Manager name of the Bank is : " + bank.getManager());
		
        bank.setNumberOfWorkers(50);
		System.out.println("NUmber of workers in  the Bank are: " + bank.getNumberOfWorkers());
		
        bank.setBranchName("KOdiyala");
		System.out.println("Branch name  of the Bank is : " + bank.getBranchName());
		
		
		}
}