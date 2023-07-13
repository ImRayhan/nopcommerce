package steps;

import org.testng.Assert;

import actions.Common_Actions;
import actions.SocialMediaFallowsLink_Actions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SocailMediaFallowsLink_Steps {
	SocialMediaFallowsLink_Actions socialMediaFallowsLink_Actions;
	Common_Actions common_Actions;

	public SocailMediaFallowsLink_Steps(SocialMediaFallowsLink_Actions socialMediaFallowsLink_Actions,
			Common_Actions common_Actions) {
		this.common_Actions = common_Actions;
		this.socialMediaFallowsLink_Actions = socialMediaFallowsLink_Actions;

	}

	@When("I click on facebook social media link")
	public void i_click_on_facebook_social_media_link() {
		socialMediaFallowsLink_Actions.ClickFacebook();

	}

	@Then("I verify the faebook page accociate to it")
	public void i_verify_the_faebook_page_accociate_to_it() {
		String expectedUrl = common_Actions.getCurrentPageUrl();
		String actualURL = "https://web.facebook.com/nopCommerce?_rdc=1&_rdr";

		Assert.assertEquals(expectedUrl, actualURL);

	}

	@When("I click on twitter social media link")
	public void i_click_on_twitter_social_media_link() {
		socialMediaFallowsLink_Actions.ClickTwiter();

	}

	@Then("I verify the twitter page accociate to it")
	public void i_verify_the_twitter_page_accociate_to_it() {
		String expectedUrl = common_Actions.getCurrentPageUrl();
		String actualURL = "https://twitter.com/i/flow/login?redirect_after_login=%2FnopCommerce";

		Assert.assertEquals(expectedUrl, actualURL);
	}

	@When("I click on Youtube social media link")
	public void i_click_on_youtube_social_media_link() {
		socialMediaFallowsLink_Actions.ClickYoutube();
	}

	@Then("I verify the Youtube page accociate to it")
	public void i_verify_the_youtube_page_accociate_to_it() {
		String expectedUrl = common_Actions.getCurrentPageUrl();
		String actualURL = "https://www.youtube.com/user/nopCommerce";

		Assert.assertEquals(expectedUrl, actualURL);

	}

}
