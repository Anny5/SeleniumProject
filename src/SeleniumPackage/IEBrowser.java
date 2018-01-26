package SeleniumPackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class IEBrowser {
	
	@Test
	
	public void test12() throws Exception{
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\user\\Tools1\\IEDriverServer.exe");
		
		WebDriver driver=new InternetExplorerDriver();
		
		driver.get("https://www.google.ca");
		
		driver.quit();
		
	}

}
