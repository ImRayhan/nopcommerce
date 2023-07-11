package actions;

import java.time.Duration;

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

}
