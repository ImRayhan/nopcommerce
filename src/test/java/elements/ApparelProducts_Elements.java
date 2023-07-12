package elements;

import java.util.List;

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

	@FindBy(xpath = "//a[@title='Show products in category Accessories'][normalize-space()='Accessories']")
	public WebElement accessoriesgApparelElement;

	@FindBy(css = "body > div:nth-child(7) > div:nth-child(3) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > h2:nth-child(1) > a:nth-child(1)")
	public WebElement adidasConsortiumCampus80sRunningShoesApparellElement;

	@FindBy(xpath = "//a[normalize-space()='Nike Floral Roshe Customized Running Shoes']")
	public WebElement nikeFloralRosheCustomizedRunningShoesApparelElement;

	@FindBy(css = "body > div:nth-child(7) > div:nth-child(3) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > h2:nth-child(1) > a:nth-child(1)")
	public WebElement nikeSBZoomStefanJanoskiMediumMintApparellElement;

	@FindBy(xpath = "//*[@id=\"product_attribute_9\"]")
	public WebElement sizeAdidasConsortiumCampus80sRunningShoesApparellElement;

	@FindBy(xpath = "//span[@title='Silver']//span[@class='attribute-square']")
	public WebElement colorAdidasConsortiumCampus80sRunningShoesApparellElement;

	@FindBy(id = "add-to-cart-button-25")
	public WebElement addToCartcolorAdidasConsortiumCampus80sRunningShoesApparellElement;

	@FindBy(xpath = "//*[@id=\"product_attribute_6\"]")
	public WebElement sizeNikeFloralRosheCustomizedRunningShoesApparelElement;

	@FindBy(xpath = "//*[@id=\"product_attribute_7\"]")
	public WebElement colorNikeFloralRosheCustomizedRunningShoesApparelElement;

	@FindBy(xpath = "//label[@for='product_attribute_8_20']//span[@class='attribute-square']")
	public WebElement printColorNikeFloralRosheCustomizedRunningShoesApparelElement;

	@FindBy(xpath = "(//button[normalize-space()='Add to cart'])[1]")
	public WebElement addToCartPrintColorNikeFloralRosheCustomizedRunningShoesApparelElement;

	@FindBy(xpath = "//*[@id=\"add-to-cart-button-26\"]")
	public WebElement addToCartnikeSBZoomStefanJanoskiMediumMintApparellElement;

	@FindBy(xpath = "//span[@class='value-summary']//strong[contains(text(),'$97.56')]")
	public WebElement totalAmmountsOfShoeslElement;

	@FindBy(xpath = "//h2[@class='product-title']//a[normalize-space()='Custom T-Shirt']")
	public WebElement CustomTShirtCLOTHINGElement;

	@FindBy(id = "product_attribute_12")
	public WebElement enteryourtextCustomTShirtCLOTHINGElement;

	@FindBy(id = "add-to-cart-button-29")
	public WebElement addToCardustomTShirtCLOTHINGElement;

	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/h2/a")
	public WebElement levis511JeansCLOTHINGElement;

	@FindBy(xpath = "//tbody/tr")
	public List<WebElement> webTableTRlevis511JeansCLOTHINGElement;

	@FindBy(xpath = "//tbody/tr[\" + i + \"]/td[\" + j + \"]")
	public List<WebElement> webTableTDlevis511JeansCLOTHINGElement;

	@FindBy(id = "add-to-cart-button-30")
	public WebElement aaddToCartlevis511JeansCLOTHINGElement;

	@FindBy(xpath = "//h2[@class='product-title']//a[normalize-space()='Nike Tailwind Loose Short-Sleeve Running Shirt']")
	public WebElement nikeTailwindLooseShortSleeveRunningShirtCLOTHINGElement;

	@FindBy(id = "product_attribute_11")
	public WebElement sizeNikeTailwindLooseShortSleeveRunningShirtCLOTHINGElement;

	@FindBy(id = "add-to-cart-button-27")
	public WebElement addToCartNikeTailwindLooseShortSleeveRunningShirtCLOTHINGElement;

	@FindBy(xpath = "//a[normalize-space()='Oversized Women T-Shirt']")
	public WebElement oversizedWomenTShirtCLOTHINGElement;

	@FindBy(xpath = "//tbody/tr")
	public WebElement webTableTRoversizedWomenTShirtCLOTHINGElement;

	@FindBy(xpath = "//tbody/tr/td")
	public WebElement webTableTDoversizedWomenTShirtCLOTHINGElement;

	@FindBy(id = "add-to-cart-button-28")
	public WebElement addToCartoversizedWomenTShirtCLOTHINGElement;

	@FindBy(xpath = "//span[@class='value-summary']//strong[contains(text(),'$97.50')]")
	public WebElement totalAmmountsOfCLOTHINGElement;

	@FindBy(xpath = "//h2[@class='product-title']//a[normalize-space()='Obey Propaganda Hat']")
	public WebElement ObeyPropagandaHatElement;

	@FindBy(id = "product_attribute_13")
	public WebElement sizeSelectObeyPropagandaHatElement;

	@FindBy(id = "add-to-cart-button-31")
	public WebElement AddCartSelectObeyPropagandaHatElement;

	@FindBy(xpath = "//a[normalize-space()='Ray Ban Aviator Sunglasses']")
	public WebElement rayBanAviatorSunglassesElement;

	@FindBy(id = "add-to-cart-button-33")
	public WebElement AddToCartRayBanAviatorSunglassesElement;

	@FindBy(xpath = "//a[normalize-space()='Reversible Horseferry Check Belt']")
	public WebElement reversibleHorseferryCheckBeltElement;

	@FindBy(id = "add-to-cart-button-32")
	public WebElement AddTocartReversibleHorseferryCheckBeltElement;

	@FindBy(xpath = "//span[@class='value-summary']//strong[contains(text(),'$100.00')]")
	public WebElement totalAmmountsOfAccessoriesElement;

}
