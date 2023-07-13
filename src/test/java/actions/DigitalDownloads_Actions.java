package actions;

import org.openqa.selenium.WebDriver;

import elements.DigitalDownloads_Elements;
import steps.Common_Steps;

public class DigitalDownloads_Actions {

	WebDriver driver;
	DigitalDownloads_Elements digitalDownloads_Elements;

	public DigitalDownloads_Actions(Common_Steps common_Steps) {
		this.driver = common_Steps.getDriver();
		digitalDownloads_Elements = new DigitalDownloads_Elements(driver);

	}

	public void ClickDigitalDownloads() {
		digitalDownloads_Elements.digitalDownloadsElement.click();

	}

	public String IfYouWaitdonationText() {

		return digitalDownloads_Elements.ifYouWaidonationElsdement.getText();

	}

	public void IfYouWaitdonationClick() {

		digitalDownloads_Elements.ifYouWaidonationElsdement.click();

	}

	public void AddToCartIfYouWaitdonationClick() {

		digitalDownloads_Elements.addToCartifYouWaidonationElement.click();

	}

	public String NightVisionsText() {

		return digitalDownloads_Elements.nightVisionsElement.getText();

	}

	public void NightVisionsClick() {

		digitalDownloads_Elements.nightVisionsElement.click();

	}

	public void AddToCasrtNightVisionsClick() {

		digitalDownloads_Elements.addToCartnightVisionsElement.click();

	}

	public String ScienceAndFaithText() {

		return digitalDownloads_Elements.ScienceAndFaithElement.getText();

	}

	public void ScienceAndFaithClick() {

		digitalDownloads_Elements.ScienceAndFaithElement.click();

	}

	public void AddToCartScienceAndFaithClick() {

		digitalDownloads_Elements.AddToCartScienceAndFaithElement.click();

	}

	public String TotalAmountsOfDigitalDownloads() {

		return digitalDownloads_Elements.totalAmmountsOfDigitalDownloadsElement.getText();

	}

}
