package utils;

public class Customer {
	public String firstName;
	public String lastName;
	public String country;
	public String password;
	public String username;
	public String email;
	public String phoneNumber;
	
	//array
	public String[] hobby;
	
	//constructor
    public Customer(String country1, String[] hobby1) {
    	
    	      System.out.println("creating new customer");
        	  firstName = ValueGenerator.getRandomName(7);
    	      lastName = ValueGenerator.getRandomName(7);
    	      password = ValueGenerator.getRandomName(8);
    	      username = ValueGenerator.getRandomName(8);
    	      email = ValueGenerator.getRandomEmail("@gmail.com");
    	      phoneNumber = ValueGenerator.getRandomPhoneNumber();
          hobby = hobby1;
    	      country = country1;
    	
    }
    public String fullName() {
    	  return firstName + " " + lastName;
    	 }
}
