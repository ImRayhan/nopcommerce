package actions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import elements.ElectronicsProductsServices_Elements;
import steps.Common_Steps;

public class ElectronicsProductServices_Actions {
private	WebDriver driver;

	ElectronicsProductsServices_Elements electronicsProductsServices_Elements;

	public ElectronicsProductServices_Actions(Common_Steps common_Steps) {
		this.driver = common_Steps.getDriver();
		electronicsProductsServices_Elements = new ElectronicsProductsServices_Elements(driver);

	}

	public void CkickElectronics() {
		electronicsProductsServices_Elements.electronicsElement.click();

	}

	public String CameraAndPhotoText() {

		return electronicsProductsServices_Elements.cameraAndPhotoElement.getText();

	}

	public String CellPhonesText() {

		return electronicsProductsServices_Elements.cellPhonesElement.getText();

	}

	public String OthersText() {

		return electronicsProductsServices_Elements.othersElement.getText();

	}

	public void ClickCameraAndPhoto() {

		electronicsProductsServices_Elements.cameraAndPhotoElement.click();

	}

	public String NikonD5500DSLRText() {
		return electronicsProductsServices_Elements.nikonD5500DslrElement.getText();

	}

	public String AppleiCamText() {
		return electronicsProductsServices_Elements.appleiCamElement.getText();

	}

	public String LeicaTMirrorlessDigitalCameraText() {
		return electronicsProductsServices_Elements.leicaTMirrorlessDigitalCameraElement.getText();

	}

	public void NikonD5500DSLRClick() {
		electronicsProductsServices_Elements.nikonD5500DslrElement.click();

	}

	public void AddToCartNikonD5500DSLRBlack() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions
				.elementToBeClickable(electronicsProductsServices_Elements.addToCartNikonD5500DSLRBlackElement))
				.click();
		// electronicsProductsServices_Elements.addToCartNikonD5500DSLRBlackElement.click();

	}

	public void AddToCartNikonD5500DSLRRed() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions
				.elementToBeClickable(electronicsProductsServices_Elements.addToCartNikonD5500DSLRRedElement)).click();
		// electronicsProductsServices_Elements.addToCartNikonD5500DSLRRedElement.click();

	}

	public void LeicaTMirrorlessDigitalCameraClick() {
		electronicsProductsServices_Elements.leicaTMirrorlessDigitalCameraElement.click();

	}

	public void AddToCartLeicaTMirrorlessDigitalCamera() {
		electronicsProductsServices_Elements.addToCartleicaTMirrorlessDigitalCameraElement.click();

	}

	public String TotalAmmountCameraAndPhoto() {

		String a = electronicsProductsServices_Elements.totalAmmountcameraAndPhotoElement.getText();

		return a;

	}

	public void ClickCellPhones() {
		electronicsProductsServices_Elements.cellPhonesElement.click();

	}

	public String HTCOneM8AndroidL50LollipopText() {
		return electronicsProductsServices_Elements.hTCOneM8AndroidL50LollipopcCellPhonesElement.getText();

	}

	public String HTCOneMiniBlueText() {
		return electronicsProductsServices_Elements.hTCOneMiniCellPhonesBlueElement.getText();

	}

	public String NokiaLumia1020Text() {
		return electronicsProductsServices_Elements.nokiaLumia1020CellPhonesElement.getText();

	}

	public void AddToCartHTCOneM8AndroidL50LollipopAndHTCOneMiniBlueaNDNokiaLumia() {
		List<WebElement> size = electronicsProductsServices_Elements.addToCartAllCellPhonesAndAllOtherElement;
		int s = size.size();
		for (int i = 0; i < s; i++) {
			driver.navigate().refresh();
			size.get(i).click();

		}

	}

	public String TotalAmmountOfCellPhones() {
	
		String b = electronicsProductsServices_Elements.totalAmountsOfCellPhonesElement.getText();
		return b;

	}

	public void ClickOthers() {
		electronicsProductsServices_Elements.othersElement.click();

	}

	public String BeatsPill20WirelessSpeakerText() {

		return electronicsProductsServices_Elements.beatsPill20WirelessSpeakerothersElement.getText();

	}

	public String PortableSoundSpeakersText() {

		return electronicsProductsServices_Elements.portableSoundSpeakersElement.getText();

	}

	public String Universal8InchTabletCoverText() {

		return electronicsProductsServices_Elements.Universal78InchTabletCoverElement.getText();

	}
	


	public boolean TotalAmmountOfOthers() {
		return electronicsProductsServices_Elements.totalAmmountsOfOthersElement.isDisplayed();

	}

}
