package org.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static String value;
	public static WebDriver driver;
	public static Actions a;
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}
	
	public static void urlLaunch(String url) {
		driver.get(url);

	}
	
	public static void btnClick(WebElement ele) {
		ele.click();

	}
	
	public static void fillText(String text, WebElement ele) {
		ele.sendKeys(text);

	}
	
	public static String readExcel(String sheetName, int rowNo, int cellNo) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\Task\\ExcelData\\excel kathir.xlsx");
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		int cellType = cell.getCellType();
		if (cellType == 1) {
			value = cell.getStringCellValue();
		}else if (DateUtil.isCellDateFormatted(cell)) {
			Date d = cell.getDateCellValue();
			SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
			value = s.format(d);
		}else {
			double d = cell.getNumericCellValue();
			long l = (long) d;
			value = String.valueOf(l);
		}
		
return value;
	}
	
	
	public static void waitImpli(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);

	}
	
	public static void actionsClick(WebElement ele) {
		a = new Actions(driver);
		a.click(ele).perform();
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
