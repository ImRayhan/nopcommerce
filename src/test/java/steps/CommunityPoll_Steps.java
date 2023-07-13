package steps;

import static org.testng.Assert.fail;

import actions.CommunityPoll_Actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CommunityPoll_Steps {
	CommunityPoll_Actions communityPoll_Actions;

	public CommunityPoll_Steps(CommunityPoll_Actions communityPoll_Actions) {
		this.communityPoll_Actions = communityPoll_Actions;
	}

	@Given("I iterate all four buttons")
	public void i_iterate_all_four_buttons() {
		communityPoll_Actions.ExcellentGoodPoorVerybadClick();

	}

	@When("I Click vote")
	public void i_click_vote() {
		communityPoll_Actions.VoteClick();
	}

	@When("I verify the outcome")
	public void i_verify_the_outcome() {
		if (communityPoll_Actions.OnlyregistereduserscanvoteText()
				.equalsIgnoreCase("Only registered users can vote.")) {
			fail();

		}
	}

}
