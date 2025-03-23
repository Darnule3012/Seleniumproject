package testscripts.men;

import org.testng.annotations.Test;

import com.automation.base.BAase_Test;
import com.automation.pages.HomePage;

public class MenTest extends BAase_Test {
	@Test
	public void clickOnMenLink() {
		HomePage homepage = new HomePage(driver);
		homepage.getMenlink().click();
	}
}
