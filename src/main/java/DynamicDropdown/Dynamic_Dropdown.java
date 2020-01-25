package DynamicDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dynamic_Dropdown {

	public static void main(String[] args) throws InterruptedException
	{
		String path = System.setProperty("webdriver.chrome.driver","E:\\Automation\\Selenium Driver\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		WebDriverWait wait10 = new WebDriverWait(driver, 10);
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		wait10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/tbody/tr[11]/td[2]/select")));
		Select oSelect = new Select(driver.findElement(By.xpath("//table/tbody/tr[11]/td[2]/select")));
		List <WebElement> elementCount = oSelect.getOptions();
		int iSize = elementCount.size(); 
		System.out.println("size = "+iSize);
		for(int i =0; i<iSize ; i++)
		{
			 String sValue = elementCount.get(i).getText();
			 if(sValue.equals("EGYPT"))
			 {
				 oSelect.selectByVisibleText("EGYPT");
				 Thread.sleep(3000);
				 oSelect.deselectByVisibleText("EGYPT");
			 }
			 System.out.println(sValue);
		}
		Thread.sleep(4000);
		driver.quit();	
	}
}