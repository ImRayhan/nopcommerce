package actions;

import org.openqa.selenium.WebDriver;

import elements.NewsArchive_Elements;
import steps.Common_Steps;

public class NewsArchive_Actions {
	WebDriver driver;
	Common_Actions common_Actions;
	NewsArchive_Elements newsArchive_Elements;

	public NewsArchive_Actions(Common_Steps common_Steps) {
		this.driver = common_Steps.getDriver();
		newsArchive_Elements = new NewsArchive_Elements(driver);

	}

	public void ClickViewNewsArchive() {
		newsArchive_Elements.viewNewsArchiveElement.click();

	}

	public String newonlinestoreisopenText() {
		return newsArchive_Elements.newonlinestoreisopenElement.getText();

	}

	public void newonlinestoreisopenClick() {
		newsArchive_Elements.newonlinestoreisopenElement.click();

	}

	public String nopCommercenewreleaseText() {
		return newsArchive_Elements.nopCommercenewreleaseElement.getText();

	}

	public void nopCommercenewreleaseClick() {
		newsArchive_Elements.nopCommercenewreleaseElement.click();

	}

	public String aboutnopCommerceText() {
		return newsArchive_Elements.aboutnopCommerceElement.getText();

	}

	public void aboutnopCommerceClick() {
		newsArchive_Elements.aboutnopCommerceElement.click();

	}

	public void titleLeaveYourComment(String title) {
		newsArchive_Elements.titleLeaveYourCommentElement.sendKeys(title);

	}

	public void commentLeaveYourComment(String comment) {
		newsArchive_Elements.CommentLeaveYourCommentElement.sendKeys(comment);

	}

	public void newCommentClick() {
		newsArchive_Elements.newCommentElement.click();

	}

	public String Newscommentissuccessfullyadded() {
		return newsArchive_Elements.newscommentssuccessfullyaddedElement.getText();

	}

}
