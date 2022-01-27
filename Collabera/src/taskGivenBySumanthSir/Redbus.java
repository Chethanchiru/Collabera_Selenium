package taskGivenBySumanthSir;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		LocalDateTime ldt = LocalDateTime.now().plusMonths(4);
		String month = ldt.getMonth().name();
		month=month.substring(0, 1).toUpperCase()+month.substring(1, 3).toLowerCase();
		int date = ldt.getDayOfMonth();
		int year = ldt.getYear();

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.redbus.in/");

		driver.findElement(By.id("onward_cal")).click();

		for(;;) {
			try {
				driver.findElement(By.xpath("//td[text()='"+month+" "+year+"']/../..//td[text()='"+date+"']")).click();
				break;
			}catch(NoSuchElementException e) {
				driver.findElement(By.xpath("//button[text()='>']")).click();// always make sure that while writing xpath u should select unqiue or u will be not able to click.
			}
		}
	}
}