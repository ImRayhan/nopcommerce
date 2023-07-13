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
		// Thread.sleep(5000);
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

		apparelProducts_Action.ClickClothing();

	}

	@When("I verify all cloth item is present")
	public void i_verify_all_cloth_item_is_present() {
		if (!apparelProducts_Action.CustomTShirtText().equalsIgnoreCase("Custom T-Shirt")) {
			fail("fail in Custom T-Shirt");

		} else if (!apparelProducts_Action.Levi511JeansTEXT().equalsIgnoreCase("Levi's 511 Jeans")) {
			fail("fail in Levi's 511 Jeans");

		} else if (!apparelProducts_Action.NikeTailwindLooseShortSleeveRunningShirtTEXT()
				.equalsIgnoreCase("Nike Tailwind Loose Short-Sleeve Running Shirt")) {
			fail("fail in Nike Tailwind Loose Short-Sleeve Running Shirt");

		} else if (!apparelProducts_Action.OversizedWomenTShirtTEXT().equalsIgnoreCase("Oversized Women T-Shirt")) {
			fail("fail in Oversized Women T-Shirt");

		}

	}

	@When("I adding all clothing Item to the cart")
	public void i_adding_all_clothing_item_to_the_cart() {

		apparelProducts_Action.CustomTShirtClick();
		apparelProducts_Action.EnterYourTextCustomTShirt("custom tshirt");
		apparelProducts_Action.AddToCartCustomTShirt();
		common_Actions.navigateBack();
		apparelProducts_Action.Levi511JeansClick();
		try {
			apparelProducts_Action.webTablePriceLevi511Jeans();

		} catch (Exception e) {
			System.out.println(e);

		}
		// apparelProducts_Action.webTablePriceLevi511Jeans();
		apparelProducts_Action.AddToCartLevi511JeansClick();
		common_Actions.navigateBack();
		apparelProducts_Action.NikeTailwindLooseShortSleeveRunningShirtClick();
		apparelProducts_Action.SizeNikeTailwindLooseShortSleeveRunningShirt("Small");
		apparelProducts_Action.AddToCartSizeNikeTailwindLooseShortSleeveRunningShirt();
		common_Actions.navigateBack();
		apparelProducts_Action.OversizedWomenTShirtClick();
		try {
			apparelProducts_Action.webTableOverSizeWomanTshirt();
			

		} catch (Exception e) {
			System.out.println(e);
		}
		apparelProducts_Action.AddToCartOversizedWomenTShirt();
		commonly_Actions.ClickCross();
		commonly_Actions.ShoppingCartHoverAndGotoCartClick();

	}

	@Then("I check Clothing total Ammount is matches")
	public void i_check_clothing_total_ammount_is_matches() {
		if (apparelProducts_Action.TotalAmmountOfClothing().equals("$97.50")) {
			commonly_Actions.clickTearmsConditions();
			commonly_Actions.clickCheckOutShoppingCart();

		}

	}

	@When("I Click on Accessories products")
	public void i_click_on_accessories_products() {
		apparelProducts_Action.ClickAccessories();
	}

	@When("I verify all Accessories item is shoes as expected")
	public void i_verify_all_accessories_item_is_shoes_as_expected() {
		if (!apparelProducts_Action.ObeyPropagandaHatTEXT().equalsIgnoreCase("Obey Propaganda Hat")) {
			fail("fail in Obey Propaganda Hat");

		} else if (!apparelProducts_Action.rayBanAviatorSunglassesTEXT()
				.equalsIgnoreCase("Ray Ban Aviator Sunglasses")) {
			fail("fail in Ray Ban Aviator Sunglasses");

		} else if (!apparelProducts_Action.reversibleHorseferryCheckBeltTEXT()
				.equalsIgnoreCase("Reversible Horseferry Check Belt")) {
			fail("fail in Reversible Horseferry Check Belt");

		}
	}

	@When("I adding all Accessories product to the cart")
	public void i_adding_all_accessories_product_to_the_cart() {
		apparelProducts_Action.ObeyPropagandaHatClick();
		apparelProducts_Action.SizeSelectObeyPropagandaHat("Small");
		apparelProducts_Action.AddToCartObeyPropagandaHat();
		common_Actions.navigateBack();
		apparelProducts_Action.rayBanAviatorSunglassesClick();
		apparelProducts_Action.AddTocartRayBanAviatorSunglassesClick();
		common_Actions.navigateBack();
		apparelProducts_Action.reversibleHorseferryCheckBeltClick();
		apparelProducts_Action.AddToCartReversibleHorseferryCheckBeltClick();
		commonly_Actions.ClickCross();
		commonly_Actions.ShoppingCartHoverAndGotoCartClick();

	}

	@Then("I check Accessories total Ammount is correct")
	public void i_check_accessories_total_ammount_is_correct() {

		if (apparelProducts_Action.TotalaMMOUNToFaccessories().equalsIgnoreCase("$100.00")) {
			commonly_Actions.clickTearmsConditions();
			commonly_Actions.clickCheckOutShoppingCart();

		}

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
