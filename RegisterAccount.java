package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterAccount {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://uibank.uipath.com/register-account");
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("krishna");
		driver.findElement(By.xpath("//select[@id='title']")).click();
		WebElement element = driver.findElement(By.xpath("//select[@id='title']"));
		Select selectTitle=new Select(element);
		selectTitle.selectByValue("ms");
		driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys("k");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("veni");
		driver.findElement(By.xpath("//select[@id='sex']")).click();
		WebElement element2 = driver.findElement(By.xpath("//select[@id='sex']"));
		Select selectGender=new Select(element2);
		selectGender.selectByValue("female");
		driver.findElement(By.xpath("//select[@id='employmentStatus']")).click();
		WebElement element3 = driver.findElement(By.xpath("//select[@id='employmentStatus']"));
		Select selectEmploymentStatus=new Select(element3);
		selectEmploymentStatus.selectByVisibleText("Full-time");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("krish");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("krisdhdfk@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("qazwsx@123");
		Thread.sleep(2000);
		driver.close();
	}
}
