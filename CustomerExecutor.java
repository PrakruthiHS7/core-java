class CustomerExecutor
{
 public static void main(String customerex[])
 {
 Customer customer=new Customer();
 customer.setCustomerId(1);
 System.out.println("the Id of the customer is " +customer.getCustomerId());
 
 customer.setCustomerName("Prakruthi");
 System.out.println("the Name of the customer is " +customer.getCustomerName());
 
 customer.setAddress("Mandya");
 System.out.println("the adress of the customer is " +customer.getAddress());
 
 customer.setContactNo(743247759);
 System.out.println("The contact number of the customer is  "  +customer.getContactNo());
 
 customer.setEmail("praku@gmail.com");
 System.out.println("the Email Id  of the customer is " +customer.getEmail());
 
 
 customer.setDob("07-03-2002");
 System.out.println("Date of birth of the cuatomer is " + customer.getDob());
 
 customer.setGender("Female");
 System.out.println("Gender of the  sutomer is " +customer.getGender());
 
 
 }
 
 
}
/*patient*/
//encapsulation can be achieved by keyword called private 

