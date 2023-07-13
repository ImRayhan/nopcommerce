package steps;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import actions.NewsArchive_Actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewsArchive_Steps {
	NewsArchive_Actions newsArchive_Actions;

	public NewsArchive_Steps(NewsArchive_Actions newsArchive_Actions) {
		this.newsArchive_Actions = newsArchive_Actions;

	}

	@Given("I click on View News Archive")
	public void i_click_on_view_news_archive() {
		newsArchive_Actions.ClickViewNewsArchive();

	}

	@When("I Verify all the news header are prasent")
	public void i_verify_all_the_news_header_are_prasent() {
		Assert.assertEquals(newsArchive_Actions.newonlinestoreisopenText(), "New online store is open!");

		Assert.assertEquals(newsArchive_Actions.nopCommercenewreleaseText(), "nopCommerce new release!");

		Assert.assertEquals(newsArchive_Actions.aboutnopCommerceText(), "About nopCommerce");

	}

	@When("I click New online store is open!")
	public void i_click_new_online_store_is_open() {
		newsArchive_Actions.newonlinestoreisopenClick();
	}

	@When("I leave comment {string} and {string}")
	public void i_leave_comment_and(String string, String string2) {
		newsArchive_Actions.titleLeaveYourComment(string);
		newsArchive_Actions.commentLeaveYourComment(string2);
		newsArchive_Actions.newCommentClick();

	}

	@Then("I validate {string}")
	public void i_validate(String verifyMassage) {
	//	System.out.println(newsArchive_Actions.Newscommentissuccessfullyadded());

		Assert.assertEquals(newsArchive_Actions.Newscommentissuccessfullyadded(), verifyMassage);
		

	}

	@When("I click nopCommerce new release")
	public void i_click_nop_commerce_new_release() {
		newsArchive_Actions.nopCommercenewreleaseClick();
	}

	@When("I click About nopCommerce")
	public void i_click_about_nop_commerce() {
		newsArchive_Actions.aboutnopCommerceClick();
	}

}
