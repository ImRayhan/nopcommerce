package steps;

import static org.testng.Assert.fail;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import actions.Common_Actions;
import actions.ElectronicsProductServices_Actions;
import actions.FeaturedProducts_Actions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ElectronicsProductServices_Steps {
	WebDriver driver;
	ElectronicsProductServices_Actions electronicsProductServices_Actions;
	Common_Actions common_Actions;
	FeaturedProducts_Actions commonly_Actions;

	public ElectronicsProductServices_Steps(ElectronicsProductServices_Actions electronicsProductServices_Actions,
			Common_Actions common_Actions, FeaturedProducts_Actions commonly_Actions) {
		this.electronicsProductServices_Actions = electronicsProductServices_Actions;
		this.common_Actions = common_Actions;
		this.commonly_Actions = commonly_Actions;

	}

	@Given("I am on homepage")
	public void i_am_on_homepage() {
		common_Actions.goToUrl("https://demo.nopcommerce.com/");
	}

	@Given("I click Electronics category")
	public void i_click_electronics_category() {
		electronicsProductServices_Actions.CkickElectronics();
	}

	@When("I see three diffrent compartment Electronics")
	public void i_see_three_diffrent_compartment_electronics() {
		if (!electronicsProductServices_Actions.CameraAndPhotoText().equalsIgnoreCase("Camera & photo")) {
			fail("not match in cameraPhoto");

		} else if (!electronicsProductServices_Actions.CellPhonesText().equalsIgnoreCase("Cell phones")) {
			fail("not match in ccellPhones");

		} else if (!electronicsProductServices_Actions.OthersText().equalsIgnoreCase("Others")) {
			fail("not match in Others");

		}

	}

	@When("I Click Camera & Photo department and checking the item is visible")
	public void i_click_camera_photo_department_and_checking_the_item_is_visible() {
		electronicsProductServices_Actions.ClickCameraAndPhoto();

		if (!electronicsProductServices_Actions.NikonD5500DSLRText().equalsIgnoreCase("Nikon D5500 DSLR")) {
			fail();

		} else if (!electronicsProductServices_Actions.AppleiCamText().equalsIgnoreCase("Apple iCam")) {
			fail();

		} else if (!electronicsProductServices_Actions.LeicaTMirrorlessDigitalCameraText()
				.equalsIgnoreCase("Leica T Mirrorless Digital Camera")) {
			fail();

		}

	}

	@When("I adding to the card")
	public void i_adding_to_the_card() throws InterruptedException {
		electronicsProductServices_Actions.NikonD5500DSLRClick();
		electronicsProductServices_Actions.AddToCartNikonD5500DSLRRed();
		common_Actions.navigateRefresh();
		electronicsProductServices_Actions.AddToCartNikonD5500DSLRBlack();
		common_Actions.navigateBack();
		electronicsProductServices_Actions.LeicaTMirrorlessDigitalCameraClick();
		electronicsProductServices_Actions.AddToCartLeicaTMirrorlessDigitalCamera();
		commonly_Actions.ClickCross();
		commonly_Actions.ShoppingCartHoverAndGotoCartClick();

	}

	@When("I Checking total ammount of Camera&Photo item")
	public void i_checking_total_ammount_of_camera_photo_item() {
		if (electronicsProductServices_Actions.TotalAmmountCameraAndPhoto().equals("$1,830.00")) {
			commonly_Actions.clickTearmsConditions();
			commonly_Actions.clickCheckOutShoppingCart();

		}
	}

	@When("I Checking the ammount of Cell Phones")
	public void i_checking_the_ammount_of_cell_phones() {
		if (electronicsProductServices_Actions.TotalAmmountOfCellPhones().equals("$694.00")) {
			commonly_Actions.clickTearmsConditions();
			commonly_Actions.clickCheckOutShoppingCart();
		} else {
			fail();
		}
	}

	@When("I Checking the ammount of Others accessory")
	public void i_checking_the_ammount_of_others_accessory() {
		if (electronicsProductServices_Actions.TotalAmmountOfOthers()) {
			commonly_Actions.clickTearmsConditions();
			commonly_Actions.clickCheckOutShoppingCart();

		}
	}

	@Then("I placing the order")
	public void i_placing_the_order(DataTable dataTable) {
		commonly_Actions.ClickCheckOutAsGuest();
		if (commonly_Actions.shiptotheSameddressCheck().isDisplayed()) {
			commonly_Actions.shiptotheSameddressCheckforIf();
		}
		// featuredProducts_Actions.shiptotheSameddressCheck();
		commonly_Actions.FirstNameShipingAdreesForm(dataTable.cell(1, 0));
		commonly_Actions.LastNameShipingAdreesForm(dataTable.cell(1, 1));
		commonly_Actions.EmailShipingAdreesForm(dataTable.cell(1, 2));
		commonly_Actions.CompanyShipingAdreesForm(dataTable.cell(1, 3));
		commonly_Actions.CountryShipingAdreesForm(dataTable.cell(1, 4));
		commonly_Actions.StateShipingAdreesForm(dataTable.cell(1, 5));
		commonly_Actions.CityShipingAdreesForm(dataTable.cell(1, 6));
		commonly_Actions.AdressShipingAdreesForm(dataTable.cell(1, 7));
		commonly_Actions.ZipCodeShipingAdreesForm(dataTable.cell(1, 8));
		commonly_Actions.PhoneNumShipingAdreesForm(dataTable.cell(1, 9));
		commonly_Actions.FaxNumShipingAdreesForm(dataTable.cell(1, 10));
		commonly_Actions.ContinueShipingAdreesForm();
		if (commonly_Actions.GroundhipingAdreesMethod().isDisplayed()) {
			commonly_Actions.GroundhipingAdreesMethod().isSelected();
			commonly_Actions.GroundhipingAdreesMethod().click();
			commonly_Actions.ContinueShipingMethodClick();
		}
		// featuredProducts_Actions.GroundhipingAdreesMethod();
		// featuredProducts_Actions.ContinueShipingMethodClick();
		commonly_Actions.CheckMoneyOrder();
		commonly_Actions.ContinuePaymentMethod();
		commonly_Actions.ContinuePaymentInformation();
		commonly_Actions.ConfirmOrder();

	}

	@Then("I validate the outcomes that order has been placed")
	public void i_validate_the_outcomes_that_order_has_been_placed() {
		String expectedMassage = commonly_Actions.VerifyThankYouMassage();
		String actualMassage = "Thank you";
		String expectedConfirmOrderMassage = commonly_Actions.VerifyYourorderhasbeensuccessfullyprocessed();
		String actualConfirmOrderMassage = commonly_Actions.VerifyYourorderhasbeensuccessfullyprocessed();
		String expectedUrl = common_Actions.getCurrentPageUrl();
		String actualUrl = "https://demo.nopcommerce.com/checkout/completed";
		String expectedTitle = common_Actions.getCurrentPageTitle();
		String actualTitle = "nopCommerce demo store. Checkout";
		Assert.assertEquals(expectedMassage, actualMassage);
		Assert.assertEquals(actualConfirmOrderMassage, expectedConfirmOrderMassage);
		Assert.assertEquals(expectedUrl, actualUrl);
		Assert.assertEquals(expectedTitle, actualTitle);
	}

	@When("I Click cellphone drpartment and have three phones & able to adding to the cart")
	public void i_click_cellphone_drpartment_and_have_three_phones_able_to_adding_to_the_cart() {
		electronicsProductServices_Actions.ClickCellPhones();
		if (!electronicsProductServices_Actions.HTCOneM8AndroidL50LollipopText()
				.equalsIgnoreCase("HTC One M8 Android L 5.0 Lollipop")) {
			fail("not match in HTC One M8 Android L 5.0 Lollipop");

		} else if (!electronicsProductServices_Actions.HTCOneMiniBlueText().equalsIgnoreCase("HTC One Mini Blue")) {
			fail("not match in HTC One Mini Blue");

		} else if (!electronicsProductServices_Actions.NokiaLumia1020Text().equalsIgnoreCase("Nokia Lumia 1020")) {
			fail("not match in Nokia Lumia 1020");

		}

		electronicsProductServices_Actions.AddToCartHTCOneM8AndroidL50LollipopAndHTCOneMiniBlueaNDNokiaLumia();
		commonly_Actions.ShoppingCartHoverAndGotoCartClick();
	}

	@When("I Click Others accessory drpartment have three items aswell & addable to the cart")
	public void i_click_others_accessory_drpartment_have_three_items_aswell_addable_to_the_cart() {
		electronicsProductServices_Actions.ClickOthers();
		if (!electronicsProductServices_Actions.BeatsPill20WirelessSpeakerText()
				.equalsIgnoreCase("Beats Pill 2.0 Wireless Speaker")) {
			fail();

		} else if (!electronicsProductServices_Actions.PortableSoundSpeakersText()
				.equalsIgnoreCase("Portable Sound Speakers")) {
			fail();

		} else if (!electronicsProductServices_Actions.Universal8InchTabletCoverText()
				.equalsIgnoreCase("Universal 7-8 Inch Tablet Cover")) {

		}

		electronicsProductServices_Actions.AddToCartHTCOneM8AndroidL50LollipopAndHTCOneMiniBlueaNDNokiaLumia();
		commonly_Actions.ShoppingCartHoverAndGotoCartClick();
	}

}
