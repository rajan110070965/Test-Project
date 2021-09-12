package Basic;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/sql/sql_select.asp");
		// store whole table in table variable
		
	WebElement table=	driver.findElement(By.xpath("//table[@class='ws-table-all notranslate']"));
	System.out.println("Hello");
	
	System.out.println("Hello");
	
		
		
		
		
		
		driver.close();

	}

}
