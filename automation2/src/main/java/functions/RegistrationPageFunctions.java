package functions;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;

import enums.Hobby;
import pages.RegistrationPage;
import utils.Customer;

public class RegistrationPageFunctions {

	public static void populatePassword(WebDriver driver, Customer customer)
	{
		driver.findElement(RegistrationPage.passwordInput).sendKeys(customer.password);
		driver.findElement(RegistrationPage.confirmPassword).sendKeys(customer.password);
	}

	public static void populateNames(WebDriver driver, Customer customer)
	{
		driver.findElement(RegistrationPage.firstNameInput).sendKeys(customer.firstName);
		driver.findElement(RegistrationPage.lastNameInput).sendKeys(customer.lastName);
	}

	public static void populateEmail(WebDriver driver, Customer customer) 
	{
	    driver.findElement(RegistrationPage.emailInput).sendKeys(customer.email);
	}

	public static void populateUsername(WebDriver driver, Customer customer) 
	{
		driver.findElement(RegistrationPage.usernameInput).sendKeys(customer.username);
	}
	
	public static void selectHobbyCheckbox(WebDriver driver, Customer customer) 
	{		
		List<Hobby> hobbies = Arrays.asList(customer.hobby); //convert array into list
		
		if(hobbies.contains(Hobby.DANCE)) {
			driver.findElement(RegistrationPage.hobbyDance).click();
		}
		if(hobbies.contains(Hobby.READING)) {
			driver.findElement(RegistrationPage.hobbyReading).click();
		}
		if(hobbies.contains(Hobby.CRICKET)) {
			driver.findElement(RegistrationPage.hobbyCricket).click();
		}
		
	}
	public static void selectHobbyCheckbox1(WebDriver driver, Customer customer) 
	{
		Hobby[] hobbies = customer.hobby; 
		for(Hobby hobby : hobbies) {
			switch (hobby) {
			case DANCE:
				driver.findElement(RegistrationPage.hobbyDance).click();
				break;
			case READING:
				driver.findElement(RegistrationPage.hobbyReading).click();
				break;
			case CRICKET:
				driver.findElement(RegistrationPage.hobbyCricket).click();
				break;
			default:
				System.out.println("Please check if you provided the correct name of the hobby");
			}
		}
	}
}