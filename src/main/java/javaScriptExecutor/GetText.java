package javaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetText {

	public static void main(String[] args) 
	{
		String path = System.setProperty("webdriver.chrome.driver","D:\\Automation\\Browser\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		WebDriverWait wait10 = new WebDriverWait(driver, 10);
		driver.get("https://www.google.com");
		WebElement s2 = driver.findElementByXPath("//a[contains(text(),'Gmail')]");
		//get Text
		try
		{
			JavascriptExecutor js = (JavascriptExecutor)driver;
			String text = (String) js.executeScript("return document.evaluate('//a[contains(text(),'Gmail')]').innerHTML").toString();
			System.out.println("WebElement Text is : "+ text);
			//String text1 = (String) js.executeScript("return document.evaluate('//a[contains(text(),'Gmail')]' ,document, null, XPathResult.ANY_TYPE, null ).singleNodeValue;");
		}
		catch (Exception e)
		{ 
			System.out.println(e);
			driver.quit();
			System.out.println("problem");
		}
		

	}

}
