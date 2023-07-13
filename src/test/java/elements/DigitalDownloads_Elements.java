package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DigitalDownloads_Elements {

	WebDriver driver;

	public DigitalDownloads_Elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//img[@title='Show products in category Digital downloads']")
	public WebElement digitalDownloadsElement;

	@FindBy(xpath = "//h2[@class='product-title']//a[normalize-space()='If You Wait (donation)']")
	public WebElement ifYouWaidonationElsdement;

	@FindBy(id  = "add-to-cart-button-35")
	public WebElement addToCartifYouWaidonationElement;

	@FindBy(xpath = "//h2[@class='product-title']//a[normalize-space()='Night Visions']")
	public WebElement nightVisionsElement;

	@FindBy(id  = "add-to-cart-button-34")
	public WebElement addToCartnightVisionsElement;

	@FindBy(xpath = "//h2[@class='product-title']//a[normalize-space()='Science & Faith']")
	public WebElement ScienceAndFaithElement;

	@FindBy(id = "add-to-cart-button-36")
	public WebElement AddToCartScienceAndFaithElement;

	@FindBy(xpath = "//span[@class='value-summary']//strong[contains(text(),'$4.80')]")
	public WebElement totalAmmountsOfDigitalDownloadsElement;

}
