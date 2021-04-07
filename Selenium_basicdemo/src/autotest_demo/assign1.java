package autotest_demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assign1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Santosh Sharma\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/");
		
		driver.manage().window().maximize();
		
		//String title = driver.getTitle();
		
		//System.out.println(title);
		
		WebElement username = driver.findElement(By.name("userName"));
		
		if(username.isEnabled())
		{
			username.clear();
			username.sendKeys("sunil");
			
		}
		
		if(username.isDisplayed())
		{
			WebElement pwd = driver.findElement(By.name("password"));
			pwd.clear();
			pwd.sendKeys("sunil");
			driver.findElement(By.name("submit")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.linkText("Flights")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@name='tripType' and @value='oneway']")).click();
			
			WebElement DD = driver.findElement(By.name("fromPort"));
			Select sel = new Select(DD);
			sel.selectByValue("London");
			List<WebElement> ddvalue = sel.getOptions();
			
			System.out.println(ddvalue.size());
			
			for(int i=0; i<ddvalue.size(); i++)
			{
				System.out.println(ddvalue.get(i).getText());
				
			}
			
			WebElement DD1 = driver.findElement(By.name("toPort"));
			Select sel1 = new Select(DD1);
			sel1.selectByValue("Paris");
			
			driver.findElement(By.name("findFlights")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//*[@href='index.php']")).click();
			Thread.sleep(3000);
			
			driver.close();
			
		}

	}

}
