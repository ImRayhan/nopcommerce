package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerCetegoriesHeader_Elements {

	WebDriver driver;

	public ComputerCetegoriesHeader_Elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
	public WebElement computerElement;

	@FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Desktops']")
	public WebElement deskTopsElement;

	@FindBy(xpath = "//a[normalize-space()='Digital Storm VANQUISH 3 Custom Performance PC']")
	public WebElement digitalStormVANQUISH3CustomPerformancePCelElement;

	@FindBy(xpath = "//a[normalize-space()='Lenovo IdeaCentre 600 All-in-One PC']")
	public WebElement lnovoIdeaCentre600AllinOnePCElement;

	@FindBy(id = "add-to-cart-button-2")
	public WebElement addToCartdigitalStormVANQUISH3CustomPerformancePCelElement;

	@FindBy(id = "add-to-cart-button-3")
	public WebElement addToCartlnovoIdeaCentre600AllinOnePCElement;

	@FindBy(xpath = "//span[@class='value-summary']//strong[contains(text(),'$3,209.00')]")
	public WebElement totalPriceOfComputersElement;

	@FindBy(xpath = "//h2[@class='product-title']//a[normalize-space()='Build your own computer']")
	public WebElement builYourOwnComputerElement;

	@FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Notebooks']")
	public WebElement notebOOKSElement;

	@FindBy(xpath = "//h2[@class='product-title']//a[contains(text(),'Apple MacBook Pro 13-inch')]")
	public WebElement appleMacbookPro13incElement;

	@FindBy(id = "add-to-cart-button-4")
	public WebElement AddToCartappleMacbookPro13incElement;

	@FindBy(xpath = "//h2[@class='product-title']//a[contains(text(),'Asus N551JK-XO076H Laptop')]")
	public WebElement asusN551JKXO076HLaptopElement;

	@FindBy(id = "add-to-cart-button-5")
	public WebElement addToasusN551JKXO076HLaptopElement;

	@FindBy(xpath = "//h2[@class='product-title']//a[contains(text(),'HP Envy 6-1180ca 15.6-Inch Sleekbook')]")
	public WebElement hPEnvy61180ca156InchSleekbookElement;

	@FindBy(id = "add-to-cart-button-8")
	public WebElement addToCarthPEnvy61180ca156InchSleekbookElement;

	@FindBy(xpath = "//h2[@class='product-title']//a[normalize-space()='HP Spectre XT Pro UltraBook']")
	public WebElement hPSpectreXProultraBookElement;

	@FindBy(id = "add-to-cart-button-7")
	public WebElement addToCarthPSpectreXProultraBookElement;

	@FindBy(xpath = "//h2[@class='product-title']//a[contains(text(),'Lenovo Thinkpad X1 Carbon Laptop')]")
	public WebElement lenovoThinkpadX1CarbonLaptopElement;

	@FindBy(id = "add-to-cart-button-9")
	public WebElement addToCartlenovoThinkpadX1CarbonLaptopElement;

	@FindBy(xpath = "//h2[@class='product-title']//a[contains(text(),'Samsung Series 9 NP900X4C Premium Ultrabook')]")
	public WebElement samsungSeries9NP900X4CPremiumUltrabookElement;

	@FindBy(id = "add-to-cart-button-6")
	public WebElement addToCartsamsungSeries9NP900X4CPremiumUltrabookElement;

	@FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Software']")
	public WebElement softWareElement;

	@FindBy(xpath = "//h2[@class='product-title']//a[contains(text(),'Adobe Photoshop CS4')]")
	public WebElement adovePhotoshopcs4softWareElement;

	@FindBy(xpath = "//a[normalize-space()='Sound Forge Pro 11 (recurring)']")
	public WebElement SoundForgePro11recurringsoftWareElement;

	@FindBy(id = "add-to-cart-button-12")
	public WebElement addToCartSoundForgePro11recurringsoftWareElement;

	@FindBy(xpath = "//a[normalize-space()='Windows 8 Pro']")
	public WebElement Windows8ProsoftWareElement;

	@FindBy(id = "add-to-cart-button-11")
	public WebElement addToCartWindows8ProsoftWareElement;
	
	@FindBy(xpath = "//span[@class='value-summary']//strong[contains(text(),'$119.99')]")
	public WebElement totalPriceOfSoftwareElement;
	
	@FindBy(xpath  = "//span[@class='value-summary']//strong[contains(text(),'$10,860.00')]")
	public WebElement totalPriceOfNotebooksElement;

}
