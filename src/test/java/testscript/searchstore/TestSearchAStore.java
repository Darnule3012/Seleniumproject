package testscript.searchstore;

import org.testng.annotations.Test;

import com.automation.base.BAase_Test;
import com.automation.pages.HomePage;
import com.automation.pages.FindAStorePage;

public class TestSearchAStore extends BAase_Test {
	@Test
	public void testsearchaStore() throws InterruptedException {
		HomePage homepage = new HomePage(driver);
		homepage.getSearchAStoreink().click();
		FindAStorePage fspage=new FindAStorePage(driver);
		fspage.getSearchStoreTextFeild().sendKeys("Pune");
		Thread.sleep(2000);
	}
}
