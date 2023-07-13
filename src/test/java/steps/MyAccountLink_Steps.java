package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.When;

public class MyAccountLink_Steps {

	WebDriver driver;
	Common_Steps common_Steps;

	public MyAccountLink_Steps(Common_Steps common_Steps) {
		this.driver = common_Steps.getDriver();

	}

	@When("I Click all My Account {string}")
	public void i_click_all_my_account(String string) {
		driver.findElement(By.linkText(string)).click();

	}

}
