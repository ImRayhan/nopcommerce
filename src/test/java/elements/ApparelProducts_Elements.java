package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApparelProducts_Elements {

	WebDriver driver;

	public ApparelProducts_Elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//img[@title='Show products in category Apparel']")
	public WebElement apparElement;

	@FindBy(xpath = "//a[@title='Show products in category Shoes'][normalize-space()='Shoes']")
	public WebElement shoesApparelElement;

	@FindBy(xpath = "//a[@title='Show products in category Clothing'][normalize-space()='Clothing']")
	public WebElement ClothingApparelElement;

	@FindBy(xpath = "//a[@title='Show products in category Accessories'][normalize-space()='Accessories']]")
	public WebElement accessoriesgApparelElement;

	@FindBy(css  = "body > div:nth-child(7) > div:nth-child(3) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > h2:nth-child(1) > a:nth-child(1)")
	public WebElement adidasConsortiumCampus80sRunningShoesApparellElement;

	@FindBy(xpath = "//a[normalize-space()='Nike Floral Roshe Customized Running Shoes']")
	public WebElement nikeFloralRosheCustomizedRunningShoesApparelElement;

	@FindBy(css =  "body > div:nth-child(7) > div:nth-child(3) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > h2:nth-child(1) > a:nth-child(1)")
	public WebElement nikeSBZoomStefanJanoskiMediumMintApparellElement;

	@FindBy(xpath = "//*[@id=\"product_attribute_9\"]")
	public WebElement sizeAdidasConsortiumCampus80sRunningShoesApparellElement;

	@FindBy(xpath = "//span[@title='Silver']//span[@class='attribute-square']")
	public WebElement colorAdidasConsortiumCampus80sRunningShoesApparellElement;

	@FindBy(id  = "add-to-cart-button-25")
	public WebElement addToCartcolorAdidasConsortiumCampus80sRunningShoesApparellElement;

	@FindBy(xpath = "//*[@id=\"product_attribute_6\"]")
	public WebElement sizeNikeFloralRosheCustomizedRunningShoesApparelElement;

	@FindBy(xpath = "//*[@id=\"product_attribute_7\"]")
	public WebElement colorNikeFloralRosheCustomizedRunningShoesApparelElement;

	@FindBy(xpath = "//label[@for='product_attribute_8_20']//span[@class='attribute-square']")
	public WebElement printColorNikeFloralRosheCustomizedRunningShoesApparelElement;

	@FindBy(xpath   = "(//button[normalize-space()='Add to cart'])[1]")
	public WebElement addToCartPrintColorNikeFloralRosheCustomizedRunningShoesApparelElement;

	@FindBy(xpath = "//*[@id=\"add-to-cart-button-26\"]")
	public WebElement addToCartnikeSBZoomStefanJanoskiMediumMintApparellElement;
	
	@FindBy(xpath = "//span[@class='value-summary']//strong[contains(text(),'$97.56')]")
	public WebElement totalAmmountsOfShoeslElement;

}
