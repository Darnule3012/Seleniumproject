package testscripts.men;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class PrintDynamicData {
	@Test
		public void printDynamicData() {
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.iplt20.com/points-table/men/2024");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			String text = driver.findElement(By.xpath("//h2[text()=\"RCB\"]/../../..//td[contains(@class,'bt ng-binding')]")).getText();
			System.out.println(text);
		}


	@Test
	public void keyBoardEventControlButton() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		driver.findElement(By.id("email")).sendKeys("Shubham123");
		WebElement passwordtestField = driver.findElement(By.id("pass"));
		actions.keyDown(Keys.CONTROL).sendKeys("a").perform();
		actions.keyDown(Keys.CONTROL).sendKeys("c").perform();
		actions.clickAndHold(passwordtestField).perform();
		actions.keyDown(Keys.CONTROL).sendKeys("v").perform();
		
		Thread.sleep(2000);
		
		}
	}


	

