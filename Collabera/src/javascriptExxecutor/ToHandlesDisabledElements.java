package javascriptExxecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandlesDisabledElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		/*driver.get("https://demoapp.skillrary.com/");
		
		WebElement disabledTextField = driver.findElement(By.xpath("//input[@disabled]"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='It is receving';", disabledTextField);*/
		
		driver.get("https://www.oracle.com/java/technologies/downloads/");
		
		driver.findElement(By.linkText("jdk-8u311-linux-x64.tar.gz")).click();
		
		WebElement disabledButton = driver.findElement(By.linkText("Download jdk-8u311-linux-x64.tar.gz"));
				//driver.findElement(By.xpath("(//div[@class='obttns'])[10]"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", disabledButton);
		
	}

}
