package elements;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FeaturedProducts_Elements {

	WebDriver driver;

	public FeaturedProducts_Elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@title='Show details for Build your own computer']")
	public WebElement buildyourowncomputereElement;

	@FindBy(css = "#product_attribute_1")
	public WebElement processorElement;

	@FindBy(id = "product_attribute_2")
	public WebElement ramElement;
	
	@FindBy(id  = "product_attribute_3_7")
	public WebElement Hdd400GbElement;

	@FindBy(id  = "product_attribute_4_9")
	public WebElement osVistaPremiumElement;

	@FindBy(xpath = "//input[@type='checkbox']")
	public List<WebElement> softwareElement;

	@FindBy(css = "#add-to-cart-button-1")
	public WebElement addToCartbuildyourowncomputereElement;
	
	@FindBy(css  = "span[title='Close']")
	public WebElement crossShoppingCartbuildyourowncomputereElement;
	
	@FindBy(xpath  = "//button[normalize-space()='Go to cart']")
	public WebElement goToCartbuildyourowncomputereElement;

	@FindBy(xpath = "//a[normalize-space()='Apple MacBook Pro 13-inch']")
	public WebElement appleMacBookPro13inchElement;

	@FindBy(css = "#add-to-cart-button-4")
	public WebElement addToCartappleMacBookPro13inchElement;

	@FindBy(xpath = "//img[@title='Show details for HTC One M8 Android L 5.0 Lollipop']")
	public WebElement hTCOneM8AndroidL50LollipopElement;

	@FindBy(css = "#add-to-cart-button-18")
	public WebElement addToCarthTCOneM8AndroidL50LollipopElement;

	@FindBy(xpath = "//a[normalize-space()='$25 Virtual Gift Card']")
	public WebElement VirtualGiftCardElement;

	@FindBy(id = "giftcard_43_RecipientName")
	public WebElement recipientNameVirtualGiftCardElement;

	@FindBy(id = "giftcard_43_RecipientEmail")
	public WebElement recipientEmailVirtualGiftCardElement;

	@FindBy(id = "giftcard_43_SenderName")
	public WebElement yourNameVirtualGiftCardElement;

	@FindBy(id = "giftcard_43_SenderEmail")
	public WebElement yourEmailVirtualGiftCardElement;

	@FindBy(id = "giftcard_43_Message")
	public WebElement massageVirtualGiftCardElement;

	@FindBy(id = "add-to-cart-button-43")
	public WebElement addToCartVirtualGiftCardVirtualGiftCardElement;

	@FindBy(xpath = "//span[@class='cart-label']")
	public WebElement shoppingCartElement;

	@FindBy(xpath = "//input[@id='termsofservice']")
	public WebElement tearmsConditionElement;

	@FindBy(xpath = "//button[@id='checkout']")
	public WebElement checkOutShopingCartElement;

	@FindBy(xpath = "//button[normalize-space()='Checkout as Guest']")
	public WebElement checkOutAsGuestElement;

	@FindBy(xpath = "//input[@id='ShipToSameAddress']")
	public WebElement shiptothesameaddresscheckOutAsGuestElement;

	@FindBy(xpath = "//input[@id='BillingNewAddress_FirstName']")
	public WebElement firstNamecheckOutAsGuestElement;

	@FindBy(xpath = "//input[@id='BillingNewAddress_LastName']")
	public WebElement lastNamecheckOutAsGuestElement;

	@FindBy(xpath = "//input[@id='BillingNewAddress_Email']")
	public WebElement emailNamecheckOutAsGuestElement;

	@FindBy(xpath = "//input[@id='BillingNewAddress_Company']")
	public WebElement companycheckOutAsGuestElement;

	@FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
	public WebElement countryheckOutAsGuestElement;

	@FindBy(xpath = "//select[@id='BillingNewAddress_StateProvinceId']")
	public WebElement stateheckOutAsGuestElement;

	@FindBy(xpath = "//input[@id='BillingNewAddress_City']")
	public WebElement cityheckOutAsGuestElement;

	@FindBy(id = "BillingNewAddress_Address1")
	public WebElement adressheckOutAsGuestElement;

	@FindBy(xpath = "//input[@id='BillingNewAddress_ZipPostalCode']")
	public WebElement zipcodeheckOutAsGuestElement;

	@FindBy(xpath = "//input[@id='BillingNewAddress_PhoneNumber']")
	public WebElement phoneNumberheckOutAsGuestElement;

	@FindBy(xpath = "//input[@id='BillingNewAddress_FaxNumber']")
	public WebElement faxNumberheckOutAsGuestElement;

	@FindBy(xpath = "//button[@onclick='Billing.save()']")
	public WebElement continueheckOutAsGuestElement;

	@FindBy(id = "shippingoption_0")
	public WebElement GroundheckOutAsGuestElement;

	@FindBy(id = "shippingoption_2")
	public WebElement secoundndDayAirheckOutAsGuestElement;

	@FindBy(css = ".button-1.shipping-method-next-step-button")
	public WebElement continueOnShipingMethodeheckOutAsGuestElement;

	@FindBy(id = "paymentmethod_0")
	public WebElement CheckMoneyOrderheckOutAsGuestElement;

	@FindBy(id = "paymentmethod_1")
	public WebElement creditCardheckOutAsGuestElement;

	@FindBy(css = "button[class='button-1 payment-method-next-step-button']")
	public WebElement continuePaymentMethodheckOutAsGuestElement;

	@FindBy(css = ".button-1.payment-info-next-step-button")
	public WebElement continuePaymentInformationheckOutAsGuestElement;

	@FindBy(xpath = "//button[normalize-space()='Confirm']")
	public WebElement ConfirmOrderheckOutAsGuestElement;

	@FindBy(xpath = "//h1[normalize-space()='Thank you']")
	public WebElement thankYouConfirmOrderheckOutAsGuestElement;

	@FindBy(xpath = "//strong[normalize-space()='Your order has been successfully processed!']")
	public WebElement YourorderhasbeensuccessfullyprocessedConfirmOrderheckOutAsGuestElement;

}
