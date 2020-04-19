package POM_Without_Page_Factor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Testcase {
	String path=System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	WebDriverWait wait10 = new WebDriverWait(driver,10);	
	@Test
	public void LoginPage_Validation()
	{
		driver.manage().window().maximize();
		driver.get("https://allworkjob.com/clients/login");
		
		Login_Page Login = new Login_Page(driver);
		
		Login.TypeUserName();
		Login.TypePassword();
		Login.ClickLogin_btn();		
	}
}
