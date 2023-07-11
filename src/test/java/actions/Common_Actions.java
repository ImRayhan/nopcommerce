package actions;

import org.openqa.selenium.WebDriver;

import steps.Common_Steps;

public class Common_Actions {
private	WebDriver driver;
	Common_Steps common_Steps;

	public Common_Actions(Common_Steps common_Steps) {
		this.driver = common_Steps.getDriver();

	}

	public void goToUrl(String url) {
		driver.get(url);
	}

	public String getCurrentPageUrl() {
		return driver.getCurrentUrl();
	}

	public String getCurrentPageTitle() {
		return driver.getTitle();
	}

	public void navigateBack() {
		driver.navigate().back();
	}

	public void navigateForword() {
		driver.navigate().forward();
	}
	public void navigateRefresh() {
		driver.navigate().refresh();
	}

}
