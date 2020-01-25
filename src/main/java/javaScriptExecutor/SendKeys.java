package javaScriptExecutor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

public class SendKeys {

	public static void main(String[] args) throws InterruptedException 
	{

		String path = System.setProperty("webdriver.chrome.driver","E:\\Automation\\Selenium Driver\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		WebDriverWait wait10 = new WebDriverWait(driver, 10);
		driver.get("https://www.google.com");
		WebElement s1 = driver.findElementByXPath("//*[@id='tsf']/div[2]/div/div[1]/div/div[1]/input");
		WebElement s2 = driver.findElementByXPath("//*[@id='gbw']/div/div/div[1]/div[1]/a");

		try
		{
			//SendKeys
			((JavascriptExecutor)driver).executeAsyncScript("arguments[0].value='hello'", s1);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		Thread.sleep(3000);
		driver.quit();

	}

}
