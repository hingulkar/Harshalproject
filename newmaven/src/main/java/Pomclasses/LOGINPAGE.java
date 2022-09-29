package Pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LOGINPAGE {

	@FindBy(xpath="//input[@id='email']")
	private WebElement username;
	
	@FindBy(xpath="//input[@id='pass']")
	private WebElement password;
	
	@FindBy(xpath="//button[text()='Log in']")
	private WebElement loginbutton;
	
	public LOGINPAGE(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void sendusername()
	{
		username.sendKeys("hingulkar@gmail.com");
	}
	
	
	public void sendpassword()
	{
		password.sendKeys("pagalhaikyabesle");
	}
	
	public void clickonlogin()
	{
		loginbutton.click();
	}
	
}
