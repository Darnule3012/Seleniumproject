package TestFinal1;
import org.testng.annotations.Test;
import com.automation.base.FinalTest;
import com.automation.pages.HomePageFinal;



public class BackPackAddToCart extends FinalTest {
@Test
	public void BagPackAddToCart() {
		HomePageFinal HPF = new HomePageFinal(driver);
		HPF.clickBagPackAddToCart();
		
	}

}

