package testscripts.men;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TakeScreenShoot {
	@Test
	public void takeScreenshot() throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		 File screeenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(screeenshotFile, new File("DemoScreenshot.png"));
	}
}

