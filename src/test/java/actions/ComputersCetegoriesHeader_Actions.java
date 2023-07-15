package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import elements.ComputerCetegoriesHeader_Elements;
import elements.FeaturedProducts_Elements;
import steps.Common_Steps;

public class ComputersCetegoriesHeader_Actions {

	WebDriver driver;
	ComputerCetegoriesHeader_Elements computerCetegoriesHeader_Elements;

	public ComputersCetegoriesHeader_Actions(Common_Steps common_Steps) {
		this.driver = common_Steps.getDriver();

		computerCetegoriesHeader_Elements = new ComputerCetegoriesHeader_Elements(driver);

	}

	public void ComputersHover() {

		Actions act = new Actions(driver);
		act.moveToElement(computerCetegoriesHeader_Elements.computerElement).perform();

	}

	public void ClickDesktops() {
//		Actions act = new Actions(driver);
//		act.moveToElement(computerCetegoriesHeader_Elements.deskTopsElement);
//
//		act.click().perform();
		computerCetegoriesHeader_Elements.deskTopsElement.click();

	}

	public void ClickNotes() {

		computerCetegoriesHeader_Elements.notebOOKSElement.click();

	}

	public String appleMacbookPro13incText() {

		return computerCetegoriesHeader_Elements.appleMacbookPro13incElement.getText();

	}

	public void appleMacbookPro13incClick() {

		computerCetegoriesHeader_Elements.appleMacbookPro13incElement.click();

	}

	public void AddToCartappleMacbookPro13inc() {

		computerCetegoriesHeader_Elements.AddToCartappleMacbookPro13incElement.click();

	}

	public String asusN551JKXO076HLaptopText() {

		return computerCetegoriesHeader_Elements.asusN551JKXO076HLaptopElement.getText();

	}

	public void AsusN551JKXO076HLaptopClick() {

		computerCetegoriesHeader_Elements.asusN551JKXO076HLaptopElement.click();

	}

	public void AddToCartasusN551JKXO076HLaptop() {

		computerCetegoriesHeader_Elements.addToasusN551JKXO076HLaptopElement.click();

	}

	public void AddToCartaddToCarthPEnvy61180ca156InchSleekbook() {

		computerCetegoriesHeader_Elements.addToCarthPEnvy61180ca156InchSleekbookElement.click();

	}

	public String HPEnvy61180ca156InchSleekbookText() {

		return computerCetegoriesHeader_Elements.hPEnvy61180ca156InchSleekbookElement.getText();

	}

	public void HPEnvy61180ca156InchSleekbookClick() {

		computerCetegoriesHeader_Elements.hPEnvy61180ca156InchSleekbookElement.click();

	}

	public void hPSpectreXProultraBookClick() {

		computerCetegoriesHeader_Elements.hPSpectreXProultraBookElement.click();

	}

	public String hPSpectreXProultraBookText() {

		return computerCetegoriesHeader_Elements.hPSpectreXProultraBookElement.getText();

	}

	public void AddToCarthPSpectreXProultraBook() {

		computerCetegoriesHeader_Elements.hPSpectreXProultraBookElement.click();

	}

	public void lenovoThinkpadX1CarbonLaptopClick() {

		computerCetegoriesHeader_Elements.lenovoThinkpadX1CarbonLaptopElement.click();

	}

	public String AddToCartlenovoThinkpadX1CarbonLaptoptext() {

	return	computerCetegoriesHeader_Elements.lenovoThinkpadX1CarbonLaptopElement.getText();

	}

	public String lenovoThinkpadX1CarbonLaptopText() {

		return computerCetegoriesHeader_Elements.lenovoThinkpadX1CarbonLaptopElement.getText();

	}

	public void samsungSeries9NP900X4CPremiumUltrabookClick() {

		computerCetegoriesHeader_Elements.samsungSeries9NP900X4CPremiumUltrabookElement.click();

	}

	public void AddToCartsamsungSeries9NP900X4CPremiumUltrabookClick() {

		computerCetegoriesHeader_Elements.addToCartsamsungSeries9NP900X4CPremiumUltrabookElement.click();

	}

	public String AddToCartsamsungSeries9NP900X4CPremiumUltrabookText() {

		return computerCetegoriesHeader_Elements.addToCartsamsungSeries9NP900X4CPremiumUltrabookElement.getText();

	}

	public void ClickSoftware() {

		computerCetegoriesHeader_Elements.softWareElement.click();

	}

	public String adovePhotoshopcs4softWareText() {

		return computerCetegoriesHeader_Elements.adovePhotoshopcs4softWareElement.getText();

	}

	public void SoundForgePro11recurringClick() {

		computerCetegoriesHeader_Elements.SoundForgePro11recurringsoftWareElement.click();

	}

	public void AddToCartSoundForgePro11recurringClick() {

		computerCetegoriesHeader_Elements.addToCartSoundForgePro11recurringsoftWareElement.click();

	}

	public String SoundForgePro11recurringText() {

		return computerCetegoriesHeader_Elements.SoundForgePro11recurringsoftWareElement.getText();

	}

	public void Windows8ProClick() {

		computerCetegoriesHeader_Elements.Windows8ProsoftWareElement.click();

	}
	public String Windows8ProText() {
		
	return	computerCetegoriesHeader_Elements.Windows8ProsoftWareElement.getText();
		
	}

	public void addToCartWindows8Pro() {

		computerCetegoriesHeader_Elements.addToCartWindows8ProsoftWareElement.click();

	}

	public String digitalStormVANQUISH3CustomPerformancePCelText() {
		return computerCetegoriesHeader_Elements.digitalStormVANQUISH3CustomPerformancePCelElement.getText();

	}

	public void digitalStormVANQUISH3CustomPerformancePCelClick() {
		computerCetegoriesHeader_Elements.digitalStormVANQUISH3CustomPerformancePCelElement.click();

	}

	public void AddtOCartdigitalStormVANQUISH3CustomPerformancePCelClick() {
		computerCetegoriesHeader_Elements.addToCartdigitalStormVANQUISH3CustomPerformancePCelElement.click();

	}

	public String lnovoIdeaCentre600AllinOnePCText() {
		return computerCetegoriesHeader_Elements.lnovoIdeaCentre600AllinOnePCElement.getText();

	}

	public void lnovoIdeaCentre600AllinOnePCClick() {
		computerCetegoriesHeader_Elements.lnovoIdeaCentre600AllinOnePCElement.click();

	}

	public void AddToCartlnovoIdeaCentre600AllinOnePCClick() {
		computerCetegoriesHeader_Elements.addToCartlnovoIdeaCentre600AllinOnePCElement.click();

	}

	public String buildyourowncomputerText() {
		return computerCetegoriesHeader_Elements.builYourOwnComputerElement.getText();

	}

	public String TotalAmmountsOfComputers() {
		return computerCetegoriesHeader_Elements.totalPriceOfComputersElement.getText();

	}
	
	public String TotalAmmountsOfSoftWare() {
		return computerCetegoriesHeader_Elements.totalPriceOfSoftwareElement.getText();
		
	}
	
	public String TotalAmmountsOfNotebooks() {
		return computerCetegoriesHeader_Elements.totalPriceOfNotebooksElement.getText();
		
	}
	
	

}
