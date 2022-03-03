package week2Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Week2Assignment4Dropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement drop1 = driver.findElement(By.id("dropdown1"));
		Select dd = new Select(drop1);
		dd.selectByIndex(2);
		WebElement drop2 = driver.findElement(By.name("dropdown2"));
		Select dd1 = new Select(drop2);
		dd1.selectByVisibleText("Selenium");
		WebElement drop3 = driver.findElement(By.id("dropdown3"));
		Select dd2 = new Select(drop3);
		dd2.selectByValue("3");
		System.out.println("The getTest -  " +driver.findElement(By.className("dropdown")).getText());
		driver.findElement(By.xpath("(//div[@class='example']//select)[5]")).sendKeys("Loadrunner");
		driver.findElement(By.xpath("(//div[@class='example']//select)[6]")).sendKeys("Selenium");
		
		
					
	
	        
	    }

	}
	
	


