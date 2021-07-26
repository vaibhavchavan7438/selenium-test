package code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\data\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://freecrm.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[text()='Log In']")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("mswinterfell7@gmail.com");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Jui12345");
	driver.findElement(By.xpath("//div[text()='Login']")).click();
	
	
	
}
}
