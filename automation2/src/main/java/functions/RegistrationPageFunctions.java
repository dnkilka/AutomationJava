package functions;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;

import pages.RegistrationPage;
import utils.Customer;

public class RegistrationPageFunctions {

	public static void populatePassword(WebDriver driver, Customer customer){
		driver.findElement(RegistrationPage.passwordInput).sendKeys(customer.password);
		driver.findElement(RegistrationPage.confirmPassword).sendKeys(customer.password);
	}

	public static void populateNames(WebDriver driver, Customer customer){
	driver.findElement(RegistrationPage.firstNameInput).sendKeys(customer.firstName);
	driver.findElement(RegistrationPage.lastNameInput).sendKeys(customer.lastName);
	    }

	public static void populateEmail(WebDriver driver, Customer customer) {
	    driver.findElement(RegistrationPage.emailInput).sendKeys(customer.email);
	}

	public static void populateUsername(WebDriver driver, Customer customer) {
		driver.findElement(RegistrationPage.usernameInput).sendKeys(customer.username);
	}
	
	public static void selectHobbyCheckbox(WebDriver driver, Customer customer) {
		String[] hobbies = customer.hobby; 
		List<String> hobbiesList = Arrays.asList(hobbies); //convert array into list
		
		if(hobbiesList.contains("dance")) {
			driver.findElement(RegistrationPage.hobbyDance).click();
		}
		if(hobbiesList.contains("reading")) {
			driver.findElement(RegistrationPage.hobbyReading).click();
		}
		if(hobbiesList.contains("cricket")) {
			driver.findElement(RegistrationPage.hobbyCricket).click();
		}
		
	}
	public static void selectHobbyCheckbox1(WebDriver driver, Customer customer) {
		String[] hobbies = customer.hobby; 
		for(String hobby : hobbies) {
			switch (hobby) {
			case "dance":
				driver.findElement(RegistrationPage.hobbyDance).click();
				break;
			case "reading":
				driver.findElement(RegistrationPage.hobbyReading).click();
				break;
			case "cricket":
				driver.findElement(RegistrationPage.hobbyCricket).click();
				break;
			default:
				System.out.println("Please check if you provided the correct name of the hobby");
			}
		}
	}
}