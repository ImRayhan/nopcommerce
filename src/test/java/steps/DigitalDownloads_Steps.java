package steps;

import static org.testng.Assert.fail;

import actions.Common_Actions;
import actions.DigitalDownloads_Actions;
import actions.FeaturedProducts_Actions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DigitalDownloads_Steps {
	Common_Actions common_Actions;
	DigitalDownloads_Actions digitalDownloads_Actions;
	FeaturedProducts_Actions commonly_Actions;

	public DigitalDownloads_Steps(Common_Actions common_Actions, DigitalDownloads_Actions digitalDownloads_Actions,
			FeaturedProducts_Actions commonly_Actions) {

		this.common_Actions = common_Actions;
		this.digitalDownloads_Actions = digitalDownloads_Actions;
		this.commonly_Actions = commonly_Actions;

	}

	@When("I click on Digital downloads")
	public void i_click_on_digital_downloads() {
		digitalDownloads_Actions.ClickDigitalDownloads();

	}

	@When("I verify that digital download have all the products its expected")
	public void i_verify_that_digital_download_have_all_the_products_its_expected() {
		if (!digitalDownloads_Actions.IfYouWaitdonationText().equalsIgnoreCase("If You Wait (donation)")) {
			fail("fail in If You Wait (donation)");

		} else if (!digitalDownloads_Actions.NightVisionsText().equalsIgnoreCase("Night Visions")) {
			fail("fail in Night Visions");

		} else if (!digitalDownloads_Actions.ScienceAndFaithText().equalsIgnoreCase("Science & Faith")) {
			fail("fail in Science & Faith");

		}
	}

	@Then("I add all the product on the cart")
	public void i_add_all_the_product_on_the_cart() {
		digitalDownloads_Actions.IfYouWaitdonationClick();
		digitalDownloads_Actions.AddToCartIfYouWaitdonationClick();
		common_Actions.navigateBack();
		digitalDownloads_Actions.NightVisionsClick();
		digitalDownloads_Actions.AddToCasrtNightVisionsClick();
		common_Actions.navigateBack();
		digitalDownloads_Actions.ScienceAndFaithClick();
		digitalDownloads_Actions.AddToCartScienceAndFaithClick();
		commonly_Actions.ClickCross();
		commonly_Actions.ShoppingCartHoverAndGotoCartClick();

	}

	@Then("I checked the item prices is coorect")
	public void i_checked_the_item_prices_is_coorect() {
		if (digitalDownloads_Actions.TotalAmountsOfDigitalDownloads().equalsIgnoreCase("$4.80")) {
			commonly_Actions.clickTearmsConditions();
			commonly_Actions.clickCheckOutShoppingCart();

		}
	}

	@Then("I placing order")
	public void i_placing_order(DataTable dataTable) {
		commonly_Actions.ClickCheckOutAsGuest();
		if (commonly_Actions.shiptotheSameddressCheck().isDisplayed()) {
			commonly_Actions.shiptotheSameddressCheckforIf();
		}
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
//		if (commonly_Actions.GroundhipingAdreesMethod().isDisplayed()) {
//			commonly_Actions.GroundhipingAdreesMethod().isSelected();
//			commonly_Actions.GroundhipingAdreesMethod().click();
//			commonly_Actions.ContinueShipingMethodClick();
//		}
//		 commonly_Actions.GroundhipingAdreesMethod();
//		 commonly_Actions.ContinueShipingMethodClick();
		 
		commonly_Actions.CheckMoneyOrder();
		commonly_Actions.ContinuePaymentMethod();
		commonly_Actions.ContinuePaymentInformation();
		commonly_Actions.ConfirmOrder();

	}

}
