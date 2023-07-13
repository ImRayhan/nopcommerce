package elements;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommunityPoll_Elements {

	WebDriver driver;

	public CommunityPoll_Elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//input[@type='radio']")
	public List<WebElement>  ExcellentGoodPoorVerybadElements;
	
	@FindBy(id = "vote-poll-1")
	public WebElement  voteElements;
	
	
	@FindBy(id = "block-poll-vote-error-1")	
	public WebElement  OnlyregistereduserscanvoteElements;

}
