package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.When;

public class CustomerService_Steps {
	
	WebDriver driver;
	Common_Steps common_Steps;
	
	public CustomerService_Steps(Common_Steps common_Steps) {
		this.driver = common_Steps.getDriver();
		

	}
	@When("I Click all CustomerService {string}")
	public void i_click_all_customer_service(String string) {
		driver.findElement(By.linkText(string)).click();
	  
	}
	
	
	

}
