package actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import elements.CommunityPoll_Elements;
import steps.Common_Steps;

public class CommunityPoll_Actions {
	WebDriver driver;

	CommunityPoll_Elements communityPoll_Elements;

	public CommunityPoll_Actions(Common_Steps common_Steps) {

		this.driver = common_Steps.getDriver();
		communityPoll_Elements = new CommunityPoll_Elements(driver);
	}

	public void ExcellentGoodPoorVerybadClick() {

		boolean checked;
		List<WebElement> all = communityPoll_Elements.ExcellentGoodPoorVerybadElements;
		int size = all.size();

		for (int i = 0; i < size; i++) {
			checked = all.get(i).isSelected();
			if (!checked) {
				all.get(i).click();

			}

		}

	}

	public void VoteClick() {
		communityPoll_Elements.voteElements.click();

	}

	public String OnlyregistereduserscanvoteText() {
		return communityPoll_Elements.OnlyregistereduserscanvoteElements.getText();

	}

}
