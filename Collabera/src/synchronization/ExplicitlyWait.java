package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		WebDriverWait explicitWait=new WebDriverWait(driver, 10);
		explicitWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.name("username")));
		driver.findElement(By.name("username")).sendKeys("chethan");
	}

}
