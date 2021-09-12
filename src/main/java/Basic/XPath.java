package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {

	public static void main(String[] args) {
		System.out.println("Hello");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//html/body[1]/div[1]/div[1]/div[1]/div/div/div[1]/div[1]/div[1]/a")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("//html/body[1]/div[1]/div[1]/div[1]/div/div/div[1]/div[1]/div[2]/a")).click();
		
		
		
		driver.navigate().back();
		
		
		
		driver.close();

	}

}
