package actions;

import java.util.Set;

import org.openqa.selenium.WebDriver;

import elements.SocialMediaFallowsLink_Elements;
import steps.Common_Steps;

public class SocialMediaFallowsLink_Actions {

	WebDriver driver;
	SocialMediaFallowsLink_Elements socialMediaFallowsLink_Elements;
	Common_Steps common_Steps;
	Common_Actions common_Actions;

	public SocialMediaFallowsLink_Actions(Common_Steps common_Steps, Common_Actions common_Actions) {
		this.driver = common_Steps.getDriver();
		this.common_Actions = common_Actions;
		socialMediaFallowsLink_Elements = new SocialMediaFallowsLink_Elements(driver);

	}

	public void ClickFacebook() {
		String parentWindow = driver.getWindowHandle();
		socialMediaFallowsLink_Elements.facebookElement.click();
		Set<String> ChildWindow = driver.getWindowHandles();

		for (String string : ChildWindow) {
			if (!string.equals(parentWindow)) {
				driver.switchTo().window(string);

			}

		}

	}
		
	public void ClickTwiter() {
		String parentWindow = driver.getWindowHandle();
		socialMediaFallowsLink_Elements.twiterElement.click();
		Set<String> ChildWindow = driver.getWindowHandles();

		for (String string : ChildWindow) {
			if (!string.equals(parentWindow)) {
				driver.switchTo().window(string);

			}

		}
		
	}
	public void ClickYoutube() {
		String parentWindow = driver.getWindowHandle();
		socialMediaFallowsLink_Elements.youtubeElement.click();
		Set<String> ChildWindow = driver.getWindowHandles();
		
		for (String string : ChildWindow) {
			if (!string.equals(parentWindow)) {
				driver.switchTo().window(string);
				
			}
			
		}
		
	}

}
