package testcacases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase001 {
	
	
	
	public void book() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.booking.com/");
		https://www.booking.com/?aid=355028&auth_success=1&account_created=1
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[contains(text(),'Sign in or register')]")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("tanuja.sanikoppa@gmail.com");
		driver.findElement(By.xpath("//span[contains(text(), 'Continue with email')]")).click();
		driver.findElement(By.xpath("//input[@id='new_password']")).sendKeys("Uttu123@*#");
		driver.findElement(By.xpath("//input[@id='confirmed_password']")).sendKeys("Uttu123@*#");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		//WebElement errormessage=driver.findElement(By.xpath("//div[@role='alert']"));
		//Assert.assertTrue(errormessage.isDisplayed());
		
	}
	
	
	@Test
	public void book1() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.booking.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[@aria-label='Dismiss sign-in info.']")).click();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Where are you going?']")).sendKeys("Goa");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@role='group']/li[2]")).click();
		Thread.sleep(2000);
		WebElement checkin=driver.findElement(By.xpath("//button[@data-testid='date-display-field-start']"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td/span[@aria-label='25 November 2023']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td/span[@aria-label='30 November 2023']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		List<WebElement> hotels=driver.findElements(By.xpath("//div[@class='a4b53081e1']//div//div[2]//a"));
		System.out.println(hotels.size());
		for(int i=0; i<hotels.size(); i++)
		{
			System.out.println(hotels.get(i).getText());
			
			
		}
		hotels.get(4).click();
		
		/*while(true)
		{
		String atualmonthyear=driver.findElement(By.xpath("//div[@class='d358556c65']//h3[@aria-live='polite']")).getText();
		System.out.println( atualmonthyear);
		String expectedmonth="Decemeber 2023";
		if(atualmonthyear.equals(expectedmonth))
		{    String expectedday="25";
			List<WebElement> days=driver.findElements(By.xpath("//tbody/tr[4]/td[7]/span"));
			for(WebElement day:days)
			{
				if(days.equals(expectedday))
					day.click();
			}
			
			
		}
		else
		{
		driver.findElement(By.xpath("//span[@class='eedba9e88a']")).click();
		}
		}
	
	*/
	}
}
