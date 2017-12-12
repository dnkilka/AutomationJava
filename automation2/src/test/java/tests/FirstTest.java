package tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import functions.RegistrationPageFunctions;
import pages.RegistrationPage;
import utils.Customer;
import utils.ValueGenerator;

public class FirstTest {
	@Test
	public void test1(){
		
		System.setProperty("webdriver.chrome.driver", "/Users/lyubovhrynenko/Documents/automationWorkspace3/automation2/src/test/java/resources/chromedriver");
		
		//String phone = ValueGenerator.getRandomPhoneNumber();
		//String phone2 = ValueGenerator.getUniquePhoneNumber("2123");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demoqa.com/registration/");
		
		//String[] hobbies = {"dance","reading","cricket"};
		String[] hobbies = {"dance","cricket"};
		String country = "Ukraine";
		Customer customer = new Customer (country, hobbies);
		
		//String fullName = customer.fullName(); method returns value, not void
		
        RegistrationPageFunctions.populateNames(driver, customer);

		RegistrationPageFunctions.selectHobbyCheckbox1(driver, customer);
		driver.findElement(RegistrationPage.phoneNumberInput).sendKeys(customer.phoneNumber);
		
		RegistrationPageFunctions.populateUsername(driver, customer);
		RegistrationPageFunctions.populateEmail(driver, customer);
		RegistrationPageFunctions.populatePassword(driver, customer);
		
		//Click on "Submit"
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
		//Select country
		Select select = new Select(driver.findElement(RegistrationPage.countryDropdown));
		select.selectByVisibleText("Ukraine");
				
		//Verify required fields 
		//String enteredName = driver.findElement(RegistrationPage.firstNameInput).getAttribute("value");
		//assertEquals(customer.firstName, enteredName);
		
		assertEquals(customer.firstName, driver.findElement(RegistrationPage.firstNameInput).getAttribute("value"));
		assertEquals(customer.lastName, driver.findElement(RegistrationPage.lastNameInput).getAttribute("value"));
		assertEquals(customer.country, new Select(driver.findElement(RegistrationPage.countryDropdown)).getFirstSelectedOption().getText());
		assertEquals("true", driver.findElement(By.xpath("//input[@value='dance']")).getAttribute("checked"));
		
		//Verify text
		assertEquals("Registration", driver.findElement(By.className("entry-title")).getText());
		
		//Verify success message
		assertEquals("Thank you for your registration", driver.findElement(By.className("piereg_message")).getText());
		
		driver.quit();
	}
	
}
