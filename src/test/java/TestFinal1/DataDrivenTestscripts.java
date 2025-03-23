package TestFinal1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DataDrivenTestscripts {
	/*@Test (enabled= false)
	
	public void readDataFromExcelFile() throws EncryptedDocumentException, IOException { 
	FileInputStream fis = new FileInputStream("C:\\Users\\Shubham\\OneDrive\\Desktop\\SourceData.xlsx");
	Workbook workbook = WorkbookFactory.create(fis);
	Sheet  sourcedatasheet = workbook.getSheet("SourceData");
	Cell secondcellfirstrow=sourcedatasheet.getRow(1).getCell(1);
	System.out.println(secondcellfirstrow.getStringCellValue());
	
	}*/
	

@Test(dataProvider="logindata")
	public void login(String username,String password) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		
	}
	
	
	
	@Test
	public  void logindata() throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("\\C:\\Users\\Shubham\\OneDrive\\Desktop\\testcase.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet  testdatasheet = workbook.getSheet("testcase");
		int totalrow = testdatasheet.getPhysicalNumberOfRows() ;
		System.out.println( totalrow);
		
		int totalcol = testdatasheet.getRow(0).getPhysicalNumberOfCells()  ;
		System.out.println(totalcol);
		/*String [][] arr = new String [totalrow][totalcol];
		for(int i=0;i<arr.length;i++) {
			Row row = sourcedatasheet.getRow(i);
			for(int j=0;j<arr.length;j++) {
				Cell cell = row.getCell(j);
				arr[i][j] = cell.getStringCellValue();
				
			}
		}
			
			System.out.println(arr);
			
			
			for (int i=0;i<arr.length;i++) {
				for(int j=0;j<arr.length;j++) {
					System.out.print(arr[i][j]+" ");
					
				}
				System.out.println();
			}*/
			
				//return null;	
		
		
	}
	
	
}
