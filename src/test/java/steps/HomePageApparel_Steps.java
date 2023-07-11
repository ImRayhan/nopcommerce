package steps;

import static org.testng.Assert.fail;

import org.testng.Assert;

import actions.ApparelProducts_Action;
import actions.Common_Actions;
import actions.FeaturedProducts_Actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageApparel_Steps {
	Common_Actions common_Actions;
	ApparelProducts_Action apparelProducts_Action;
	FeaturedProducts_Actions commonly_Actions;

	public HomePageApparel_Steps(Common_Actions common_Actions, ApparelProducts_Action apparelProducts_Action,
			FeaturedProducts_Actions commonly_Actions) {
		this.common_Actions = common_Actions;
		this.apparelProducts_Action = apparelProducts_Action;
		this.commonly_Actions = commonly_Actions;

	}

	@Given("I am on Homepage")
	public void i_am_on_homepage() {
		common_Actions.goToUrl("https://demo.nopcommerce.com/");

	}

	@Given("I click on Apparel")
	public void i_click_on_apparel() {
		apparelProducts_Action.ClickApparel();

	}

	@When("I Click shoes products")
	public void i_click_shoes_products() {
		apparelProducts_Action.ShoesClick();

	}

	@When("I verify all shoe item is visible")
	public void i_verify_all_shoe_item_is_visible() {
		if (!apparelProducts_Action.AdidasConsortiumCampus80sRunningShoesText()
				.equalsIgnoreCase("adidas Consortium Campus 80s Running Shoes")) {
			fail("fail in adidas Consortium Campus 80s Running Shoes");

		}
		if (!apparelProducts_Action.NikeFloralRosheCustomizedRunningShoesText()
				.equalsIgnoreCase("Nike Floral Roshe Customized Running Shoes")) {
			fail("fail in Nike Floral Roshe Customized Running Shoes");

		}
		if (!apparelProducts_Action.NikeSBZoomStefanjanoskiMediumMintText()
				.equalsIgnoreCase("Nike SB Zoom Stefan Janoski \"Medium Mint\"")) {
			fail("fail in Nike SB Zoom Stefan Janoski \"Medium Mint\"");

		}

	}
	@When("I adding all the Item to the cart")
	public void i_adding_all_the_item_to_the_cart() throws InterruptedException {
		apparelProducts_Action.AdidasConsortiumCampus80sRunningShoesClick();
		apparelProducts_Action.SizeSelectAdidasConsortiumCampus80sRunningShoes("8");
		apparelProducts_Action.ColorsAdidasConsortiumCampus80sRunningShoes();
		apparelProducts_Action.AddTocartAdidasConsortiumCampus80sRunningShoes();
		common_Actions.navigateBack();
		apparelProducts_Action.NikeFloralRosheCustomizedRunningShoesClick();
		apparelProducts_Action.SizeSelectNikeFloralRosheCustomizedRunningShoes("8");
		apparelProducts_Action.ColorsSelectNikeFloralRosheCustomizedRunningShoes("White/Black");
		apparelProducts_Action.PrintNikeFloralRosheCustomizedRunningShoes();
	  //  Thread.sleep(5000);	
		apparelProducts_Action.AddToCartNikeFloralRosheCustomizedRunningShoes();
		common_Actions.navigateBack();
		apparelProducts_Action.NikeSBZoomStefanjanoskiMediumMintClick();
		apparelProducts_Action.AddToCartNikeSBZoomStefanjanoskiMediumMintClick();
		commonly_Actions.ClickCross();
		commonly_Actions.ShoppingCartHoverAndGotoCartClick();
	
		if (apparelProducts_Action.TotalAmmountOfShoesText().equals("$97.56")) {
			commonly_Actions.clickTearmsConditions();
			commonly_Actions.clickCheckOutShoppingCart();
			
			
		}

	}

	@When("I Click on clothing products")
	public void i_click_on_clothing_products() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("I verify all cloth item is present")
	public void i_verify_all_cloth_item_is_present() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("I adding all clothing Item to the cart")
	public void i_adding_all_clothing_item_to_the_cart() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("I Click on Accessories products")
	public void i_click_on_accessories_products() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("I verify all Accessories item is shoes as expected")
	public void i_verify_all_accessories_item_is_shoes_as_expected() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("I adding all Accessories product to the cart")
	public void i_adding_all_accessories_product_to_the_cart() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("I check the order has been complete")
	public void i_check_the_order_has_been_complete() {
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

}
