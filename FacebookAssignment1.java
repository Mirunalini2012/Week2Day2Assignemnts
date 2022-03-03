package week2Assignments;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookAssignment1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Mirunalini");
		driver.findElement(By.name("lastname")).sendKeys("Chakravarthy");
		driver.findElement(By.name("reg_email__")).sendKeys("9123456790");
		driver.findElement(By.name("reg_passwd__")).sendKeys("9123@abcd");
	    WebElement elementDropdown = driver.findElement(By.name("birthday_day"));
		//elementDropdown.sendKeys("27");
		Select bd = new Select(elementDropdown);
		bd.selectByVisibleText("20");
		WebElement elementDropdownBm = driver.findElement(By.name("birthday_month"));
		Select bm = new Select(elementDropdownBm);
		bm.selectByIndex(5);
		WebElement elementDropdownBY = driver.findElement(By.name("birthday_year"));
		Select by = new Select(elementDropdownBY);
		by.selectByValue("1988");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		

	}

}
