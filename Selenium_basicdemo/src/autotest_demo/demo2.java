package autotest_demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Santosh Sharma\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		driver.manage().window().maximize();
		
		//String title = driver.getTitle();
		
		//System.out.println(title);
		
		WebElement username = driver.findElement(By.id("txtUsername"));
		
		if(username.isEnabled())
		{
			username.clear();
			username.sendKeys("Admin");
			
		}
		
		if(username.isDisplayed())
		{
			WebElement pwd = driver.findElement(By.id("txtPassword"));
			pwd.clear();
			pwd.sendKeys("admin123");
			driver.findElement(By.id("btnLogin")).click();
			Thread.sleep(3000);
			//driver.findElements(By.tagName("a"));
			List<WebElement> link = driver.findElements(By.tagName("a"));
			System.out.println(link.size());
			for(int i=0; i<link.size();i++)
			{
				System.out.println(link.get(i).getText());
				
			}
		}
		
		else
		{
			System.out.println("Error: Username is not Displaying");
		}
		
	}

}
