package pages;

import org.openqa.selenium.By;

//object repository/object map (object locators)
public class RegistrationPage {
      public static final By firstNameInput = By.name("first_name");
      public static final By lastNameInput = By.name("last_name");
      public static final By emailInput = By.name("e_mail");
      public static final By phoneNumberInput = By.name("phone_9");
      public static final By usernameInput = By.name("username");
    	  public static final By passwordInput =  By.name("password");
    	  public static final By confirmPassword = By.id("confirm_password_password_2");
    	  public static final By countryDropdown = By.name("dropdown_7");
    	  public static final By hobbyDance = By.xpath("//input[@value='dance']");
    	  public static final By hobbyReading = By.xpath("//input[@value='reading']");
    	  public static final By hobbyCricket = By.xpath("//input[@value='cricket ']");
}
