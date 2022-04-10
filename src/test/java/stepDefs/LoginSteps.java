package stepDefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	 WebDriver driver =BaseClass.driver;

@Given("I have opened the application in browser")
public void i_have_opened_the_application_in_browser() {
	driver.get("https://www.simplilearn.com/");
	
   
}

@When("I click on the Login link")
public void i_click_on_the_login_link() {
	WebElement LoginLink =driver.findElement(By.linkText("Log in"));
	LoginLink.click();
  
}
@When("I enter the username")
public void i_enter_the_username() {
    // Write code here that turns the phrase above into concrete actions
	
	WebElement UserName = driver.findElement(By.name("user_login"));
	UserName.sendKeys("xyz@abc.com");
   
}

@When("I enter the password")
public void i_enter_the_password() {
    // Write code here that turns the phrase above into concrete actions
	
	WebElement Password = driver.findElement(By.id("password"));
	Password.sendKeys("Abc@12345");
   
}

@When("I click on the login Button")
public void i_click_on_the_login_button() {
    // Write code here that turns the phrase above into concrete actions
	WebElement LoginBtn = driver.findElement(By.name("btn_login"));
	LoginBtn.click();
	
	
}

@Then("I should be Landed on the home page")
public void i_should_be_landed_on_the_home_page() {
    // Write code here that turns the phrase above into concrete actions
	
	System.out.println("inside homepage");
   
}

@When("I enter the username {string}")
public void i_enter_the_username(String UserName1) {
    // Write code here that turns the phrase above into concrete actions
	
	WebElement UserName = driver.findElement(By.name("user_login"));
	UserName.sendKeys(UserName1);
    
}

@When("I enter the password {string}")
public void i_enter_the_password(String Passwordval) {
    // Write code here that turns the phrase above into concrete actions
	
	WebElement Password = driver.findElement(By.id("password"));
	
	Password.sendKeys(Passwordval);
  
}
@Then("I should get error message as  {string}")
public void i_should_get_error_message_as(String ExpMsg) {
    // Write code here that turns the phrase above into concrete actions
	
    WebElement ErrorMsg = driver.findElement(By.id("msg_box")); 
    String ActualMsg = ErrorMsg.getText();
    
    Assert.assertEquals(ExpMsg, ActualMsg);
    
}
	
  
}



