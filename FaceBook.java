package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("krishna");
		driver.findElement(By.name("lastname")).sendKeys("veni");
		driver.findElement(By.name("reg_email__")).sendKeys("9685741230");
		driver.findElement(By.id("password_step_input")).sendKeys("qazwsx@123");
		WebElement element = driver.findElement(By.xpath("//select[@id='day']"));
		WebElement element2 = driver.findElement(By.xpath("//select[@id='month']"));
		WebElement element3 = driver.findElement(By.xpath("//select[@id='year']"));
		Select selectMonth = new Select(element);
		selectMonth.selectByValue("11");
		Select selectDate=new Select(element2);
		selectDate.selectByIndex(3);
		Select selectYear = new Select(element3);
		selectYear.selectByVisibleText("2000");
		driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
