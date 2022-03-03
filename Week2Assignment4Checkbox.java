package week2Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Week2Assignment4Checkbox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//div[@class='example']//input")).click();
		driver.findElement(By.xpath("(//div[@class='example']//input)[4]")).click();
		driver.findElement(By.xpath("(//div[@class='example']//input)[5]")).click();
		System.out.println("It is selected : "+driver.findElement(By.xpath("(//div[@class='example']//input)[6]")).isSelected());
		Boolean text1=driver.findElement(By.xpath("(//div[@class='example']//input)[7]")).isSelected();
		System.out.println("First Checkbox - "+text1);
		Boolean text2=driver.findElement(By.xpath("(//div[@class='example']//input)[8]")).isSelected();
		System.out.println("Second Cehckbox - " +text2);
		if(text2.booleanValue())
		{
			driver.findElement(By.xpath("(//div[@class='example']//input)[8]")).click();
			
		}
		
		driver.findElement(By.xpath("(//div[@class='example']//input)[9]")).click();
		driver.findElement(By.xpath("(//div[@class='example']//input)[10]")).click();
		driver.findElement(By.xpath("(//div[@class='example']//input)[11]")).click();
		driver.findElement(By.xpath("(//div[@class='example']//input)[12]")).click();
		driver.findElement(By.xpath("(//div[@class='example']//input)[13]")).click();
		
		
		//for(int i=9;i<=13;i++)
		//{
		//	driver.findElement(By.xpath("(//div[@class='example']//input)[i]")).click();
		//}
		
	}

}
