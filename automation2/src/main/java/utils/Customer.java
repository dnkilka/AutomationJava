package utils;

import enums.Hobby;

public class Customer {
	
	public String firstName;
	
	public String lastName;
	
	public String country;
	
	public String password = "Chicago1";
	
	public String username;
	
	public String email;
	
	public String phoneNumber;
	
	//array
	public Hobby[] hobby;
	
	//constructor
    public Customer(String country1, Hobby[] hobby1) {
    	
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
