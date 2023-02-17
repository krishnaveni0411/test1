package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TamilMatrimony {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.tamilmatrimony.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//select[@id='REGISTERED_BY']")).click();
		WebElement element = driver.findElement(By.xpath("//select[@id='RELIGION']"));
		Select selectRegisteredBy=new Select(element);
		selectRegisteredBy.selectByValue("1");
		driver.findElement(By.xpath("//input[@id='NAME']")).sendKeys("krishna");
		driver.findElement(By.xpath("//input[@id='genderfemale']")).click();
		driver.findElement(By.id("MOBILENO")).sendKeys("9685741230");
		WebElement element2 = driver.findElement(By.xpath("//select[@id='DOBDAY']"));
		Select selectdtae=new Select(element2);
		selectdtae.selectByValue("3");
		WebElement element3 = driver.findElement(By.xpath("//select[@id='DOBMONTH']"));
		Select selectmonth=new Select(element3);
		selectmonth.selectByValue("4");
		WebElement element4 = driver.findElement(By.xpath("//select[@id='DOBYEAR']"));
		Select selectyear=new Select(element4);
		selectyear.selectByVisibleText("1997");
		driver.findElement(By.xpath("//select[@id='RELIGION']")).click();
		WebElement element5 = driver.findElement(By.xpath("//select[@id='RELIGION']"));
		Select selectReligion=new Select(element5);
		selectReligion.selectByValue("1");
		driver.findElement(By.xpath("//select[@id='MOTHERTONGUE']")).click();
		WebElement element6 = driver.findElement(By.xpath("//select[@id='MOTHERTONGUE']"));
		Select selectMotherTonge=new Select(element6);
		selectMotherTonge.selectByValue("47");
		driver.findElement(By.xpath("//select[@id='COUNTRY']")).click();
		WebElement element7 = driver.findElement(By.xpath("//select[@id='COUNTRY']"));
		Select selectCountry=new Select(element7);
		selectCountry.selectByValue("98");
		driver.findElement(By.xpath("//select[@id='M_COUNTRYCODE']")).click();
		WebElement element8 = driver.findElement(By.xpath("//select[@id='RELIGION']"));
		Select selectMobleCountry=new Select(element8);
		selectMobleCountry.selectByIndex(1);
		driver.findElement(By.xpath("//input[@id='MOBILENO']")).sendKeys("9685741230");
		Thread.sleep(2000);
		driver.close();
		
	}

}
