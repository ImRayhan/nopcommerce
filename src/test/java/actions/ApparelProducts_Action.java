package actions;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import elements.ApparelProducts_Elements;
import steps.Common_Steps;

public class ApparelProducts_Action {

	WebDriver driver;
	ApparelProducts_Elements apparelProducts_Elements;

	public ApparelProducts_Action(Common_Steps common_Steps) {
		this.driver = common_Steps.getDriver();
		apparelProducts_Elements = new ApparelProducts_Elements(driver);

	}

	public void ClickApparel() {
		apparelProducts_Elements.apparElement.click();

	}

	public String ShoesApparelText() {
		return apparelProducts_Elements.shoesApparelElement.getText();

	}

	public String ClothingApparelText() {
		return apparelProducts_Elements.ClothingApparelElement.getText();

	}

	public String AcccessoriesApparelText() {
		return apparelProducts_Elements.accessoriesgApparelElement.getText();

	}

	public void ShoesClick() {
		apparelProducts_Elements.shoesApparelElement.click();

	}

	public String AdidasConsortiumCampus80sRunningShoesText() {
		return apparelProducts_Elements.adidasConsortiumCampus80sRunningShoesApparellElement.getText();
	}

	public String NikeFloralRosheCustomizedRunningShoesText() {
		return apparelProducts_Elements.nikeFloralRosheCustomizedRunningShoesApparelElement.getText();
	}

	public String NikeSBZoomStefanjanoskiMediumMintText() {
		return apparelProducts_Elements.nikeSBZoomStefanJanoskiMediumMintApparellElement.getText();
	}

	public void AdidasConsortiumCampus80sRunningShoesClick() {
		apparelProducts_Elements.adidasConsortiumCampus80sRunningShoesApparellElement.click();
	}

	public void SizeSelectAdidasConsortiumCampus80sRunningShoes(String size) {
		Select sel = new Select(apparelProducts_Elements.sizeAdidasConsortiumCampus80sRunningShoesApparellElement);
		sel.selectByVisibleText(size);
	}

	public void ColorsAdidasConsortiumCampus80sRunningShoes() {
		apparelProducts_Elements.colorAdidasConsortiumCampus80sRunningShoesApparellElement.click();

	}

	public void AddTocartAdidasConsortiumCampus80sRunningShoes() {
		apparelProducts_Elements.addToCartcolorAdidasConsortiumCampus80sRunningShoesApparellElement.click();

	}

	public void NikeFloralRosheCustomizedRunningShoesClick() {
		apparelProducts_Elements.nikeFloralRosheCustomizedRunningShoesApparelElement.click();
	}

	public void SizeSelectNikeFloralRosheCustomizedRunningShoes(String size) {
		Select sel = new Select(apparelProducts_Elements.sizeNikeFloralRosheCustomizedRunningShoesApparelElement);
		sel.selectByVisibleText(size);

	}

	public void ColorsSelectNikeFloralRosheCustomizedRunningShoes(String colors) {
		Select sel = new Select(apparelProducts_Elements.colorNikeFloralRosheCustomizedRunningShoesApparelElement);
		sel.selectByVisibleText(colors);

	}

	public void PrintNikeFloralRosheCustomizedRunningShoes() {
		apparelProducts_Elements.printColorNikeFloralRosheCustomizedRunningShoesApparelElement.click();

	}

	public void AddToCartNikeFloralRosheCustomizedRunningShoes() {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.elementToBeClickable(
//				apparelProducts_Elements.addToCartPrintColorNikeFloralRosheCustomizedRunningShoesApparelElement))
//				.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 1000);");

		apparelProducts_Elements.addToCartPrintColorNikeFloralRosheCustomizedRunningShoesApparelElement.click();

	}

	public void NikeSBZoomStefanjanoskiMediumMintClick() {
		apparelProducts_Elements.nikeSBZoomStefanJanoskiMediumMintApparellElement.click();
	}

	public void AddToCartNikeSBZoomStefanjanoskiMediumMintClick() {
		apparelProducts_Elements.addToCartnikeSBZoomStefanJanoskiMediumMintApparellElement.click();

	}

	public String TotalAmmountOfShoesText() {
		return apparelProducts_Elements.totalAmmountsOfShoeslElement.getText();

	}

	public void ClickClothing() {
		apparelProducts_Elements.ClothingApparelElement.click();

	}

	public String CustomTShirtText() {
		return apparelProducts_Elements.CustomTShirtCLOTHINGElement.getText();

	}

	public void CustomTShirtClick() {
		apparelProducts_Elements.CustomTShirtCLOTHINGElement.click();

	}

	public void EnterYourTextCustomTShirt(String text) {
		apparelProducts_Elements.enteryourtextCustomTShirtCLOTHINGElement.sendKeys(text);

	}

	public void AddToCartCustomTShirt() {
		apparelProducts_Elements.addToCardustomTShirtCLOTHINGElement.click();

	}

	public String Levi511JeansTEXT() {
		return apparelProducts_Elements.levis511JeansCLOTHINGElement.getText();

	}

	public void Levi511JeansClick() {
		apparelProducts_Elements.levis511JeansCLOTHINGElement.click();

	}

	public void webTablePriceLevi511Jeans() {
		int row = apparelProducts_Elements.webTableTRlevis511JeansCLOTHINGElement.size();
		int colm = apparelProducts_Elements.webTableTDlevis511JeansCLOTHINGElement.size();

		for (int i = 0; i <= row; i++) {
			for (int j = 0; j <= colm; j++) {

				System.out
						.print(apparelProducts_Elements.webTableTDlevis511JeansCLOTHINGElement.get(j).getText() + " | ");

			}
			System.out.println();

		}

	}

	public void AddToCartLevi511JeansClick() {
		apparelProducts_Elements.aaddToCartlevis511JeansCLOTHINGElement.click();

	}

	public String NikeTailwindLooseShortSleeveRunningShirtTEXT() {
		return apparelProducts_Elements.nikeTailwindLooseShortSleeveRunningShirtCLOTHINGElement.getText();

	}

	public void NikeTailwindLooseShortSleeveRunningShirtClick() {
		apparelProducts_Elements.nikeTailwindLooseShortSleeveRunningShirtCLOTHINGElement.click();

	}

	public void SizeNikeTailwindLooseShortSleeveRunningShirt(String size) {
		Select sel = new Select(apparelProducts_Elements.sizeNikeTailwindLooseShortSleeveRunningShirtCLOTHINGElement);
		sel.selectByVisibleText(size);

	}

	public void AddToCartSizeNikeTailwindLooseShortSleeveRunningShirt() {
		apparelProducts_Elements.addToCartNikeTailwindLooseShortSleeveRunningShirtCLOTHINGElement.click();

	}

	public String OversizedWomenTShirtTEXT() {
		return apparelProducts_Elements.oversizedWomenTShirtCLOTHINGElement.getText();

	}

	public void ClickAccessories() {
		apparelProducts_Elements.accessoriesgApparelElement.click();

	}

	public void OversizedWomenTShirtClick() {
		apparelProducts_Elements.oversizedWomenTShirtCLOTHINGElement.click();

	}

	public void webTableOverSizeWomanTshirt() {
		int row = apparelProducts_Elements.webTableTRoversizedWomenTShirtCLOTHINGElement.size();
		int colm = apparelProducts_Elements.webTableTDoversizedWomenTShirtCLOTHINGElement.size();

		for (int i = 0; i <= row; i++) {
			for (int j = 0; j <= colm; j++) {

				System.out.print(
						apparelProducts_Elements.webTableTDoversizedWomenTShirtCLOTHINGElement.get(j).getText() + " | ");

			}
			System.out.println();

		}

	}

	public void AddToCartOversizedWomenTShirt() {
		apparelProducts_Elements.addToCartoversizedWomenTShirtCLOTHINGElement.click();

	}

	public String TotalAmmountOfClothing() {
		return apparelProducts_Elements.totalAmmountsOfCLOTHINGElement.getText();

	}

	public void ClickaccessoriesgApparel() {
		apparelProducts_Elements.accessoriesgApparelElement.click();

	}

	public String ObeyPropagandaHatTEXT() {

		return apparelProducts_Elements.ObeyPropagandaHatElement.getText();

	}

	public void SizeSelectObeyPropagandaHat(String size) {
		Select sel = new Select(apparelProducts_Elements.sizeSelectObeyPropagandaHatElement);
		sel.selectByVisibleText(size);

	}

	public void ObeyPropagandaHatClick() {
		apparelProducts_Elements.ObeyPropagandaHatElement.click();

	}

	public void AddToCartObeyPropagandaHat() {
		apparelProducts_Elements.AddCartSelectObeyPropagandaHatElement.click();

	}

	public String rayBanAviatorSunglassesTEXT() {

		return apparelProducts_Elements.rayBanAviatorSunglassesElement.getText();

	}

	public void rayBanAviatorSunglassesClick() {
		apparelProducts_Elements.rayBanAviatorSunglassesElement.click();

	}

	public void AddTocartRayBanAviatorSunglassesClick() {
		apparelProducts_Elements.AddToCartRayBanAviatorSunglassesElement.click();

	}

	public String reversibleHorseferryCheckBeltTEXT() {

		return apparelProducts_Elements.reversibleHorseferryCheckBeltElement.getText();

	}

	public void reversibleHorseferryCheckBeltClick() {
		apparelProducts_Elements.reversibleHorseferryCheckBeltElement.click();

	}

	public void AddToCartReversibleHorseferryCheckBeltClick() {
		apparelProducts_Elements.AddTocartReversibleHorseferryCheckBeltElement.click();

	}

	public String TotalaMMOUNToFaccessories() {
		return apparelProducts_Elements.totalAmmountsOfAccessoriesElement.getText();

	}

}
