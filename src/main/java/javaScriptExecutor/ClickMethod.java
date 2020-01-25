package javaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClickMethod 
{
	public static void main(String[] args)
	{
		String path = System.setProperty("webdriver.chrome.driver","E:\\Automation\\Selenium Driver\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		WebDriverWait wait10 = new WebDriverWait(driver, 10);
		driver.get("https://www.google.com");
		WebElement s2 = driver.findElementByXPath("//*[@id='gbw']/div/div/div[1]/div[1]/a");
		
		//Click Method
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", s2);
		//Click Method
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", s2);
		driver.quit();
	}

}
