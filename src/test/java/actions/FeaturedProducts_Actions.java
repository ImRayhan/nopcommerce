package actions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import elements.FeaturedProducts_Elements;
import steps.Common_Steps;

public class FeaturedProducts_Actions {

	WebDriver driver;
	FeaturedProducts_Elements featuredProducts_Elements;

	public FeaturedProducts_Actions(Common_Steps common_Steps) {
		this.driver = common_Steps.getDriver();
		featuredProducts_Elements = new FeaturedProducts_Elements(driver);

	}

	public void ClickBuildYourOwnComputer() {
		featuredProducts_Elements.buildyourowncomputereElement.click();

	}

	public void SelectProcessor(String processor) {
		Select sel = new Select(featuredProducts_Elements.processorElement);
		sel.selectByVisibleText(processor);

	}

	public void SelectRam(String ram) {
		Select sel = new Select(featuredProducts_Elements.ramElement);
		sel.selectByVisibleText(ram);

	}

	public void HddChoice() {
		featuredProducts_Elements.Hdd400GbElement.click();

	}

	public void OsChoice() {
		featuredProducts_Elements.osVistaPremiumElement.click();

	}

	public void SoftwareSelect() {

		for (WebElement iterable_element : featuredProducts_Elements.softwareElement) {
			iterable_element.click();

		}

	}

	public void ClickAddCartbuildyourowncomputer() {
		featuredProducts_Elements.addToCartbuildyourowncomputereElement.click();

	}

	public void ClickCross() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions
				.visibilityOf(featuredProducts_Elements.crossShoppingCartbuildyourowncomputereElement)).click();

//		if (featuredProducts_Elements.crossShoppingCartbuildyourowncomputereElement.isDisplayed()) {
//			featuredProducts_Elements.crossShoppingCartbuildyourowncomputereElement.click();
//
//		}

	}

	public void ShoppingCartHoverAndGotoCartClick() {
		Actions act = new Actions(driver);
		act.moveToElement(featuredProducts_Elements.shoppingCartElement).perform();
		featuredProducts_Elements.goToCartbuildyourowncomputereElement.click();
		// act.moveToElement(featuredProducts_Elements.goToCartbuildyourowncomputereElement).click();

	}

	public void clickTearmsConditions() {
		featuredProducts_Elements.tearmsConditionElement.click();

	}

	public void clickCheckOutShoppingCart() {
		featuredProducts_Elements.checkOutShopingCartElement.click();

	}

	public void ClickCheckOutAsGuest() {
		featuredProducts_Elements.checkOutAsGuestElement.click();

	}

	public WebElement shiptotheSameddressCheck() {
//		if (!featuredProducts_Elements.shiptothesameaddresscheckOutAsGuestElement.isSelected()) {
//			featuredProducts_Elements.shiptothesameaddresscheckOutAsGuestElement.click();
//
//		}
		return featuredProducts_Elements.shiptothesameaddresscheckOutAsGuestElement;

	}

	public void shiptotheSameddressCheckforIf() {
		if (!featuredProducts_Elements.shiptothesameaddresscheckOutAsGuestElement.isSelected()) {
			featuredProducts_Elements.shiptothesameaddresscheckOutAsGuestElement.click();

		}

	}

	public void FirstNameShipingAdreesForm(String firstNmae) {

		featuredProducts_Elements.firstNamecheckOutAsGuestElement.sendKeys(firstNmae);

	}

	public void LastNameShipingAdreesForm(String lasttNmae) {

		featuredProducts_Elements.lastNamecheckOutAsGuestElement.sendKeys(lasttNmae);

	}

	public void EmailShipingAdreesForm(String email) {

		featuredProducts_Elements.emailNamecheckOutAsGuestElement.sendKeys(email);

	}

	public void CompanyShipingAdreesForm(String company) {

		featuredProducts_Elements.companycheckOutAsGuestElement.sendKeys(company);

	}

	public void CountryShipingAdreesForm(String country) {
		Select sel = new Select(featuredProducts_Elements.countryheckOutAsGuestElement);
		sel.selectByVisibleText(country);

	}

	public void StateShipingAdreesForm(String state) {

		Select sel = new Select(featuredProducts_Elements.stateheckOutAsGuestElement);
		sel.selectByVisibleText(state);

	}

	public void CityShipingAdreesForm(String city) {

		featuredProducts_Elements.cityheckOutAsGuestElement.sendKeys(city);

	}

	public void AdressShipingAdreesForm(String adress) {

		featuredProducts_Elements.adressheckOutAsGuestElement.sendKeys(adress);

	}

	public void ZipCodeShipingAdreesForm(String zipCode) {

		featuredProducts_Elements.zipcodeheckOutAsGuestElement.sendKeys(zipCode);

	}

	public void PhoneNumShipingAdreesForm(String phoneNum) {

		featuredProducts_Elements.phoneNumberheckOutAsGuestElement.sendKeys(phoneNum);

	}

	public void FaxNumShipingAdreesForm(String faxNum) {

		featuredProducts_Elements.faxNumberheckOutAsGuestElement.sendKeys(faxNum);

	}

	public void ContinueShipingAdreesForm() {

		featuredProducts_Elements.continueheckOutAsGuestElement.click();

	}

	public WebElement GroundhipingAdreesMethod() {
//		if (!featuredProducts_Elements.GroundheckOutAsGuestElement.isSelected()) {
//			featuredProducts_Elements.GroundheckOutAsGuestElement.click();
//
//		}
		return featuredProducts_Elements.GroundheckOutAsGuestElement;

	}

	public void ContinueShipingMethodClick() {
		featuredProducts_Elements.continueOnShipingMethodeheckOutAsGuestElement.click();

	}

	public void CheckMoneyOrder() {
		if (!featuredProducts_Elements.CheckMoneyOrderheckOutAsGuestElement.isSelected()) {
			featuredProducts_Elements.CheckMoneyOrderheckOutAsGuestElement.click();

		}

	}

	public void ContinuePaymentMethod() {
		featuredProducts_Elements.continuePaymentMethodheckOutAsGuestElement.click();

	}

	public void ContinuePaymentInformation() {
		featuredProducts_Elements.continuePaymentInformationheckOutAsGuestElement.click();

	}

	public void ConfirmOrder() {
		featuredProducts_Elements.ConfirmOrderheckOutAsGuestElement.click();

	}

	public String VerifyThankYouMassage() {
		return featuredProducts_Elements.thankYouConfirmOrderheckOutAsGuestElement.getText();

	}

	public String VerifyYourorderhasbeensuccessfullyprocessed() {
		return featuredProducts_Elements.YourorderhasbeensuccessfullyprocessedConfirmOrderheckOutAsGuestElement
				.getText();

	}

	public void ClickAppleMacBookPro() {
		featuredProducts_Elements.appleMacBookPro13inchElement.click();

	}

	public void AddToCartClickAppleMacBookPro() {
		featuredProducts_Elements.addToCartappleMacBookPro13inchElement.click();

	}

	public void ClickHtcOneM8AndroidL5Lolipop() {
		featuredProducts_Elements.hTCOneM8AndroidL50LollipopElement.click();

	}

	public void AddToCartClickHtcOneM8AndroidL5Lolipop() {
		featuredProducts_Elements.addToCarthTCOneM8AndroidL50LollipopElement.click();

	}

	public void Click$25VirtualGiftCard() {
		featuredProducts_Elements.VirtualGiftCardElement.click();

	}

	public void RecipientsName$25VirtualGiftCard(String RecipientsName) {
		featuredProducts_Elements.recipientNameVirtualGiftCardElement.sendKeys(RecipientsName);

	}

	public void RecipientsEmail$25VirtualGiftCard(String RecipientsEmail) {
		featuredProducts_Elements.recipientEmailVirtualGiftCardElement.sendKeys(RecipientsEmail);

	}

	public void YourName$25VirtualGiftCard(String yourName) {
		featuredProducts_Elements.yourNameVirtualGiftCardElement.sendKeys(yourName);

	}

	public void YourEmail$25VirtualGiftCard(String yourEmail) {
		featuredProducts_Elements.yourEmailVirtualGiftCardElement.sendKeys(yourEmail);

	}

	public void Massage$25VirtualGiftCard(String massage) {
		featuredProducts_Elements.massageVirtualGiftCardElement.sendKeys(massage);

	}

	public void AddToCart$25VirtualGiftCard() {
		featuredProducts_Elements.addToCartVirtualGiftCardVirtualGiftCardElement.click();

	}

}
