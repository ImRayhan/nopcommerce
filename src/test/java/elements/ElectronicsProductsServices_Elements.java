package elements;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsProductsServices_Elements {
	WebDriver driver;

	public ElectronicsProductsServices_Elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@title='Show products in category Electronics']")
	public WebElement electronicsElement;

	@FindBy(xpath = "//div[@class='item-box']")
	public WebElement cameraAndPhotoCellPhoneOthersThreeElement;
	
	@FindBy(xpath  = "(//a[@title='Show products in category Camera & photo'][normalize-space()='Camera & photo'])[1]")
	public WebElement cameraAndPhotoElement;

	@FindBy(xpath = "//h2[@class='product-title']//a[contains(text(),'Nikon D5500 DSLR')]")
	public WebElement nikonD5500DslrElement;

	@FindBy(id = "add-to-cart-button-14")
	public WebElement addToCartNikonD5500DSLRBlackElement;

	@FindBy(xpath  = "(//button[@id='add-to-cart-button-15'])[1]")
	public WebElement addToCartNikonD5500DSLRRedElement;

	@FindBy(xpath = "//h2[@class='product-title']//a[normalize-space()='Apple iCam']")
	public WebElement appleiCamElement;

	@FindBy(xpath = "//h2[@class='product-title']//a[normalize-space()='Leica T Mirrorless Digital Camera']")
	public WebElement leicaTMirrorlessDigitalCameraElement;
	
	@FindBy(id = "add-to-cart-button-16")
	public WebElement addToCartleicaTMirrorlessDigitalCameraElement;
	
	@FindBy(xpath = "//span[@class='value-summary']//strong[contains(text(),'$1,830.00')]")
	public WebElement totalAmmountcameraAndPhotoElement;
	
	@FindBy(xpath  = "//a[@title='Show products in category Cell phones'][normalize-space()='Cell phones']")
	public WebElement cellPhonesElement;
	
	@FindBy(xpath  = "//a[normalize-space()='HTC One M8 Android L 5.0 Lollipop']")
	public WebElement hTCOneM8AndroidL50LollipopcCellPhonesElement;
	
	@FindBy(xpath  = "//a[normalize-space()='HTC One Mini Blue']")
	public WebElement hTCOneMiniCellPhonesBlueElement;	
	
	@FindBy(xpath  = "//a[normalize-space()='Nokia Lumia 1020']")
	public WebElement nokiaLumia1020CellPhonesElement;
	
	@FindBy(xpath  = "//button[@class='button-2 product-box-add-to-cart-button']")
	public List<WebElement> addToCartAllCellPhonesAndAllOtherElement;
	
	@FindBy(xpath  = "//span[@class='value-summary']//strong[contains(text(),'$694.00')]")
	public WebElement totalAmountsOfCellPhonesElement;
	
	@FindBy(xpath  = "//a[@title='Show products in category Others'][normalize-space()='Others']")
	public WebElement othersElement;
	
	@FindBy(xpath  = "//a[normalize-space()='Beats Pill 2.0 Wireless Speaker']")
	public WebElement beatsPill20WirelessSpeakerothersElement;
	
	@FindBy(xpath  = "//h2[@class='product-title']//a[normalize-space()='Portable Sound Speakers']")
	public WebElement portableSoundSpeakersElement;
	
	@FindBy(xpath  = "//h2[@class='product-title']//a[contains(text(),'Universal 7-8 Inch Tablet Cover')]")
	public WebElement Universal78InchTabletCoverElement;
	
	@FindBy(xpath  = "//span[@class='value-summary']//strong[contains(text(),'$155.99')]")
	public WebElement totalAmmountsOfOthersElement;
	
	


}