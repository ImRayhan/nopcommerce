package steps;

import static org.testng.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import actions.Common_Actions;
import actions.ComputersCetegoriesHeader_Actions;
import actions.FeaturedProducts_Actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ComputerCetegoriesHeader_Steps {
	WebDriver driver;
	ComputersCetegoriesHeader_Actions computersCetegoriesHeader_Actions;
	FeaturedProducts_Actions featuredProducts_Actions;
	Common_Steps common_Steps;
	Common_Actions common_Actions;

	public ComputerCetegoriesHeader_Steps(ComputersCetegoriesHeader_Actions computersCetegoriesHeader_Actions,
			Common_Steps Common_Steps, FeaturedProducts_Actions featuredProducts_Actions, Common_Steps common_Steps,
			Common_Actions common_Actions) {

		this.computersCetegoriesHeader_Actions = computersCetegoriesHeader_Actions;
		this.featuredProducts_Actions = featuredProducts_Actions;

		this.common_Actions = common_Actions;

	}

	@Given("I hover mouse on computer")
	public void i_hover_mouse_on_computer() {

		computersCetegoriesHeader_Actions.ComputersHover();

	}

	@When("I Click desKtop cetegory")
	public void i_click_des_ktop_cetegory() {
		computersCetegoriesHeader_Actions.ClickDesktops();
	}

	@When("I verify all the desktop product are visible")
	public void i_verify_all_the_desktop_product_are_visible() {

		Assert.assertEquals(computersCetegoriesHeader_Actions.buildyourowncomputerText(), "Build your own computer");
		Assert.assertEquals(computersCetegoriesHeader_Actions.digitalStormVANQUISH3CustomPerformancePCelText(),
				"Digital Storm VANQUISH 3 Custom Performance PC");
		Assert.assertEquals(computersCetegoriesHeader_Actions.lnovoIdeaCentre600AllinOnePCText(),
				"Lenovo IdeaCentre 600 All-in-One PC");

	}

	@When("I add all the desktop product on the cart")
	public void i_add_all_the_desktop_product_on_the_cart() {
		computersCetegoriesHeader_Actions.digitalStormVANQUISH3CustomPerformancePCelClick();
		computersCetegoriesHeader_Actions.AddtOCartdigitalStormVANQUISH3CustomPerformancePCelClick();
		common_Actions.navigateBack();
		computersCetegoriesHeader_Actions.lnovoIdeaCentre600AllinOnePCClick();
		computersCetegoriesHeader_Actions.AddToCartlnovoIdeaCentre600AllinOnePCClick();
		common_Actions.navigateBack();
		featuredProducts_Actions.ClickBuildYourOwnComputer();
		featuredProducts_Actions.SelectProcessor("2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]");
		featuredProducts_Actions.SelectRam("8GB [+$60.00]");
		featuredProducts_Actions.HddChoice();
		featuredProducts_Actions.OsChoice();
		featuredProducts_Actions.SoftwareSelect();
		featuredProducts_Actions.ClickAddCartbuildyourowncomputer();
		featuredProducts_Actions.ShoppingCartHoverAndGotoCartClick();

	}

	@When("i check total price of desktop if match")
	public void i_check_total_price_of_desktop_if_match() {
		if (computersCetegoriesHeader_Actions.TotalAmmountsOfComputers().equalsIgnoreCase("$3,209.00")) {
			featuredProducts_Actions.clickTearmsConditions();
			featuredProducts_Actions.clickCheckOutShoppingCart();

		}

	}

	@When("I Click Noteooks cetegory")
	public void i_click_noteooks_cetegory() {
		computersCetegoriesHeader_Actions.ClickNotes();
	}

	@When("I verify all the Notebooks product are visible")
	public void i_verify_all_the_notebooks_product_are_visible() {
		if (!computersCetegoriesHeader_Actions.appleMacbookPro13incText()
				.equalsIgnoreCase("Apple MacBook Pro 13-inch")) {
			fail("fail in Apple MacBook Pro 13-inch");

		} else if (!computersCetegoriesHeader_Actions.asusN551JKXO076HLaptopText()
				.equalsIgnoreCase("Asus N551JK-XO076H Laptop")) {
			fail("fail in Asus N551JK-XO076H Laptop");

		} else if (!computersCetegoriesHeader_Actions.HPEnvy61180ca156InchSleekbookText()
				.equalsIgnoreCase("HP Envy 6-1180ca 15.6-Inch Sleekbook")) {
			fail("fail in HP Envy 6-1180ca 15.6-Inch Sleekbook");

		} else if (!computersCetegoriesHeader_Actions.hPSpectreXProultraBookText()
				.equalsIgnoreCase("HP Spectre XT Pro UltraBook")) {
			fail("fail in HP Spectre XT Pro UltraBook");

		} else if (!computersCetegoriesHeader_Actions.lenovoThinkpadX1CarbonLaptopText()
				.equalsIgnoreCase("Lenovo Thinkpad X1 Carbon Laptop")) {
			fail("fail in Lenovo Thinkpad X1 Carbon Laptop");

		} else if (!computersCetegoriesHeader_Actions.AddToCartsamsungSeries9NP900X4CPremiumUltrabookText()
				.equalsIgnoreCase("Samsung Series 9 NP900X4C Premium Ultrabook")) {
			fail("fail in Samsung Series 9 NP900X4C Premium Ultrabook");

		}

	}

	@When("I add all the Notebooks product on the cart")
	public void i_add_all_the_notebooks_product_on_the_cart() {
		computersCetegoriesHeader_Actions.appleMacbookPro13incClick();
		computersCetegoriesHeader_Actions.AddToCartappleMacbookPro13inc();
		common_Actions.navigateBack();
		computersCetegoriesHeader_Actions.AsusN551JKXO076HLaptopClick();
		computersCetegoriesHeader_Actions.AddToCartasusN551JKXO076HLaptop();
		common_Actions.navigateBack();
		computersCetegoriesHeader_Actions.HPEnvy61180ca156InchSleekbookClick();
		computersCetegoriesHeader_Actions.AddToCartaddToCarthPEnvy61180ca156InchSleekbook();
		common_Actions.navigateBack();
		computersCetegoriesHeader_Actions.hPSpectreXProultraBookClick();
		computersCetegoriesHeader_Actions.AddToCarthPSpectreXProultraBook();
		common_Actions.navigateBack();
		computersCetegoriesHeader_Actions.lenovoThinkpadX1CarbonLaptopClick();
		computersCetegoriesHeader_Actions.AddToCartlenovoThinkpadX1CarbonLaptoptext();
		common_Actions.navigateBack();
		computersCetegoriesHeader_Actions.samsungSeries9NP900X4CPremiumUltrabookClick();
		computersCetegoriesHeader_Actions.AddToCartsamsungSeries9NP900X4CPremiumUltrabookText();
		
	}

	@When("i check total price of notebooks if match")
	public void i_check_total_price_of_notebooks_if_match() {
		if (computersCetegoriesHeader_Actions.TotalAmmountsOfNotebooks().equalsIgnoreCase("$10,860.00")) {
			featuredProducts_Actions.clickTearmsConditions();
			featuredProducts_Actions.clickCheckOutShoppingCart();
			
			
		}
	}

	@When("I Click Software cetegory")
	public void i_click_software_cetegory() {
		computersCetegoriesHeader_Actions.ClickSoftware();
		
	}

	@When("I verify all the Software product are visible")
	public void i_verify_all_the_software_product_are_visible() {
		Assert.assertEquals(computersCetegoriesHeader_Actions.adovePhotoshopcs4softWareText(), "Adobe Photoshop CS4");
		Assert.assertEquals(computersCetegoriesHeader_Actions.SoundForgePro11recurringText(), "Sound Forge Pro 11 (recurring)");
		Assert.assertEquals(computersCetegoriesHeader_Actions.Windows8ProText(), "Windows 8 Pro");

	}

	@When("I add all the Software product on the cart")
	public void i_add_all_the_software_product_on_the_cart() {
		computersCetegoriesHeader_Actions.SoundForgePro11recurringClick();
		computersCetegoriesHeader_Actions.AddToCartSoundForgePro11recurringClick();
		common_Actions.navigateBack();
		computersCetegoriesHeader_Actions.Windows8ProClick();
		computersCetegoriesHeader_Actions.addToCartWindows8Pro();
		featuredProducts_Actions.ClickCross();
		featuredProducts_Actions.ShoppingCartHoverAndGotoCartClick();
	}

	@When("i check total price of Software if match")
	public void i_check_total_price_of_software_if_match() {
		if (computersCetegoriesHeader_Actions.TotalAmmountsOfSoftWare().equalsIgnoreCase("$119.99")) {
			featuredProducts_Actions.clickTearmsConditions();
			featuredProducts_Actions.clickCheckOutShoppingCart();
			
			
		}
	}

}
