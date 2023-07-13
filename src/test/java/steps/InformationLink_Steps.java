package steps;

import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import actions.Common_Actions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InformationLink_Steps {
	WebDriver driver;
	Common_Steps common_Steps;
	Common_Actions common_Actions;

	public InformationLink_Steps(Common_Steps common_Steps, Common_Actions common_Actions) {
		this.driver = common_Steps.getDriver();
		this.common_Actions = common_Actions;
	}

	@When("I Click all information {string}")
	public void i_click_all_information(String string) {
		driver.findElement(By.linkText(string)).click();

	}

	@Then("I verify the {string} and {string}")
	public void i_verify_the_and(String string, String string2) {

		String expactedUrl = common_Actions.getCurrentPageUrl();
		String expactedTitle = common_Actions.getCurrentPageUrl();

		if (!expactedUrl.equalsIgnoreCase(string)) {
			fail();

		} else if (expactedTitle.equalsIgnoreCase(string2)) {
			fail();

		}

	}
	


}
