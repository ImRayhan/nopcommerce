package steps;

import org.testng.Assert;

import actions.Common_Actions;
import actions.FeaturedProducts_Actions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FeaturedProducts_Steps {
	Common_Actions common_Actions;
	FeaturedProducts_Actions featuredProducts_Actions;

	public FeaturedProducts_Steps(Common_Actions common_Actions, FeaturedProducts_Actions featuredProducts_Actions) {
		this.common_Actions = common_Actions;
		this.featuredProducts_Actions = featuredProducts_Actions;

	}

	@Given("I am on hompage")
	public void i_am_on_hompage() {
		common_Actions.goToUrl("https://demo.nopcommerce.com/");

	}

	@When("I click on Build your own computer")
	public void i_click_on_build_your_own_computer() {
		featuredProducts_Actions.ClickBuildYourOwnComputer();

	}

	@When("I chose Processor,ram,OS ,Software adding to the cart")
	public void i_chose_processor_ram_os_software_adding_to_the_cart() {
		featuredProducts_Actions.SelectProcessor("2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]");
		featuredProducts_Actions.SelectRam("8GB [+$60.00]");
		featuredProducts_Actions.HddChoice();
		featuredProducts_Actions.OsChoice();
		featuredProducts_Actions.SoftwareSelect();
		featuredProducts_Actions.ClickAddCartbuildyourowncomputer();

	}

	@Then("I checkout as guest fulfilled my adress shipping details")
	public void i_checkout_as_guest_fulfilled_my_adress_shipping_details(DataTable dataTable)
			throws InterruptedException {

		featuredProducts_Actions.ClickCross();
		featuredProducts_Actions.ShoppingCartHoverAndGotoCartClick();
		featuredProducts_Actions.clickTearmsConditions();
		featuredProducts_Actions.clickCheckOutShoppingCart();
		featuredProducts_Actions.ClickCheckOutAsGuest();
		if (featuredProducts_Actions.shiptotheSameddressCheck().isDisplayed()) {
			featuredProducts_Actions.shiptotheSameddressCheckforIf();
		}
		// featuredProducts_Actions.shiptotheSameddressCheck();
		featuredProducts_Actions.FirstNameShipingAdreesForm(dataTable.cell(1, 0));
		featuredProducts_Actions.LastNameShipingAdreesForm(dataTable.cell(1, 1));
		featuredProducts_Actions.EmailShipingAdreesForm(dataTable.cell(1, 2));
		featuredProducts_Actions.CompanyShipingAdreesForm(dataTable.cell(1, 3));
		featuredProducts_Actions.CountryShipingAdreesForm(dataTable.cell(1, 4));
		featuredProducts_Actions.StateShipingAdreesForm(dataTable.cell(1, 5));
		featuredProducts_Actions.CityShipingAdreesForm(dataTable.cell(1, 6));
		featuredProducts_Actions.AdressShipingAdreesForm(dataTable.cell(1, 7));
		featuredProducts_Actions.ZipCodeShipingAdreesForm(dataTable.cell(1, 8));
		featuredProducts_Actions.PhoneNumShipingAdreesForm(dataTable.cell(1, 9));
		featuredProducts_Actions.FaxNumShipingAdreesForm(dataTable.cell(1, 10));
		featuredProducts_Actions.ContinueShipingAdreesForm();
		if (featuredProducts_Actions.GroundhipingAdreesMethod().isDisplayed()) {
			featuredProducts_Actions.GroundhipingAdreesMethod().isSelected();
			featuredProducts_Actions.GroundhipingAdreesMethod().click();
			featuredProducts_Actions.ContinueShipingMethodClick();
		}
		// featuredProducts_Actions.GroundhipingAdreesMethod();
		// featuredProducts_Actions.ContinueShipingMethodClick();
		featuredProducts_Actions.CheckMoneyOrder();
		featuredProducts_Actions.ContinuePaymentMethod();
		featuredProducts_Actions.ContinuePaymentInformation();
		featuredProducts_Actions.ConfirmOrder();

	}

	@Then("i verify thta order has been placed")
	public void i_verify_thta_order_has_been_placed() {
		String expectedMassage = featuredProducts_Actions.VerifyThankYouMassage();
		String actualMassage = "Thank you";
		String expectedConfirmOrderMassage = featuredProducts_Actions.VerifyYourorderhasbeensuccessfullyprocessed();
		String actualConfirmOrderMassage = featuredProducts_Actions.VerifyYourorderhasbeensuccessfullyprocessed();
		String expectedUrl = common_Actions.getCurrentPageUrl();
		String actualUrl = "https://demo.nopcommerce.com/checkout/completed";
		String expectedTitle = common_Actions.getCurrentPageTitle();
		String actualTitle = "nopCommerce demo store. Checkout";
		Assert.assertEquals(expectedMassage, actualMassage);
		Assert.assertEquals(actualConfirmOrderMassage, expectedConfirmOrderMassage);
		Assert.assertEquals(expectedUrl, actualUrl);
		Assert.assertEquals(expectedTitle, actualTitle);

	}

	@When("I click on Apple MacBook Pro")
	public void i_click_on_apple_mac_book_pro() {
		featuredProducts_Actions.ClickAppleMacBookPro();

	}

	@When("I add to cart a item")
	public void i_add_to_cart_a_item() {
		featuredProducts_Actions.AddToCartClickAppleMacBookPro();

	}

	@When("I click on HTC One M8 android L Lollipop")
	public void i_click_on_htc_one_m8_android_l_lollipop() {
		featuredProducts_Actions.ClickHtcOneM8AndroidL5Lolipop();

	}

	@When("I adding to cart a item")
	public void i_adding_to_cart_a_item() {
		featuredProducts_Actions.AddToCartClickHtcOneM8AndroidL5Lolipop();
	}

	@When("I click on Virtual Gift Card")
	public void i_click_on_virtual_gift_card() {
		featuredProducts_Actions.ClickAppleMacBookPro();
		featuredProducts_Actions.AddToCartClickAppleMacBookPro();
		common_Actions.navigateBack();
		featuredProducts_Actions.Click$25VirtualGiftCard();

	}

	@When("I enter Recipients name {string} email {string} & my name {string} email {string} massage {string}")
	public void i_enter_recipients_name_email_my_name_email_massage(String string, String string2, String string3,
			String string4, String string5) {
		featuredProducts_Actions.RecipientsName$25VirtualGiftCard(string);
		featuredProducts_Actions.RecipientsEmail$25VirtualGiftCard(string2);
		featuredProducts_Actions.YourName$25VirtualGiftCard(string3);
		featuredProducts_Actions.YourEmail$25VirtualGiftCard(string4);
		featuredProducts_Actions.Massage$25VirtualGiftCard(string5);

	}

	@When("I adding to the cart")
	public void i_adding_to_the_cart() {
		featuredProducts_Actions.AddToCart$25VirtualGiftCard();

	}

}
