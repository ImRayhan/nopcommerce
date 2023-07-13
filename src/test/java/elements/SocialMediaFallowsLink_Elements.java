package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SocialMediaFallowsLink_Elements {
	WebDriver driver;

	public SocialMediaFallowsLink_Elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//a[normalize-space()='Facebook']")
	public WebElement facebookElement;
	
	@FindBy(xpath = "//a[normalize-space()='Twitter']")
	public WebElement twiterElement;
	
	@FindBy(xpath = "//a[normalize-space()='YouTube']")
	public WebElement youtubeElement;
	

}
