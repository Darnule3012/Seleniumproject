package testscripts.men;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.automation.genecutilities.ReadDataFromExcel;

public class SimpleTest {
	
	
	@Test
	public void setup() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\workspace\\POM\\src\\test\\resources\\config.properties");
		Properties p = new Properties();
		p.load(fis);
		String url = p.getProperty("url");
		System.out.println(url);
		String browser = p.getProperty("browser");
		if(browser.equals("Chrome")) {
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}else if(browser.equals("firefox")) {
			WebDriver driver = new FirefoxDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}else if(browser.equals("Edge")) {
			WebDriver driver = new EdgeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}else {
			System.out.println("plese provide proper browser");
		}
	}
	
	@Test(dataProvider ="logindatafromexcel" )
	public void printdata(String username,String password) {
		System.out.println(username+" "+password);
	}
	@DataProvider(name="logindatafromexcel")
	public String [] [] readAllDataFromExcel() throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("C:\\workspace\\POM\\src\\test\\resources\\TestData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet testdatasheet = workbook.getSheet("TestData");
		int totalrow = testdatasheet.getPhysicalNumberOfRows();
		int totalcol = testdatasheet.getRow(0).getPhysicalNumberOfCells();
		String arr[][]=new String [totalrow][totalcol];
		for(int i=0;i<arr.length;i++) {
			for (int j=0;j<arr[i].length;j++) {
				arr[i][j]=testdatasheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(arr[i][j]);
				
			}
			System.out.println();
		}
		return arr;
	}
	
	@Test
	public void setup2() throws IOException {
		ReadDataFromExcel r= new ReadDataFromExcel();
		String url=r.readDatafromPropertyFile("url");
		System.out.println(url);
	}
	
	
}
