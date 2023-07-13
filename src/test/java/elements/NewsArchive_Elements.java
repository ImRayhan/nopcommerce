package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewsArchive_Elements {

	WebDriver driver;

	public NewsArchive_Elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[normalize-space()='View News Archive']")
	public WebElement viewNewsArchiveElement;

	@FindBy(xpath = "//a[normalize-space()='New online store is open!']")
	public WebElement newonlinestoreisopenElement;

	@FindBy(xpath = "//a[normalize-space()='nopCommerce new release!']")
	public WebElement nopCommercenewreleaseElement;

	@FindBy(xpath = "//a[normalize-space()='About nopCommerce']")
	public WebElement aboutnopCommerceElement;

	@FindBy(xpath = "//input[@id='AddNewComment_CommentTitle']")
	public WebElement titleLeaveYourCommentElement;

	@FindBy(xpath = "//textarea[@id='AddNewComment_CommentText']")
	public WebElement CommentLeaveYourCommentElement;

	@FindBy(xpath = "//button[normalize-space()='New comment']")
	public WebElement newCommentElement;

	@FindBy(xpath = "//div[@class='result']")
	public WebElement newscommentssuccessfullyaddedElement;

}
