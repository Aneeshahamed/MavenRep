package POM_Without_Page_Factor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Page {
	
	WebDriver driver;
	
	By username = By.xpath("//*[@name=\"username\"]");
	By password = By.xpath("//*[@name=\"password\"]");
	By Login_btn = By.xpath("(//*[@type=\"submit\"])[1]");
	
	Login_Page(WebDriver driver)
	{
		this.driver = driver;
	}
	public void TypeUserName()
	{
		driver.findElement(username).sendKeys("admin");
	}
	
	public void TypePassword()
	{
		driver.findElement(password).sendKeys("admin");
	}
	
	public void ClickLogin_btn()
	{
		driver.findElement(Login_btn).click();
	}

}
