package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewTestclass {
public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sony\\eclipse-workspace\\myfirstProject\\src\\chromedriver.exe");
	  
	  WebDriver driver = new ChromeDriver();
	  
	  
	  
	  driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
	 
}
}
