package steps;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Common_Steps {
	WebDriver driver;

	@Before(order = 0)
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@After(order = 1)
	public void tearDown(Scenario scenario) throws Exception {
//		if (scenario.isFailed()) {
//
//			final byte[] shot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//			scenario.attach(shot, "image/png", scenario.getName());
//		}
		// driver.quit();
		Thread.sleep(1000);
	}

	public WebDriver getDriver() {
		return driver;
	}

}
