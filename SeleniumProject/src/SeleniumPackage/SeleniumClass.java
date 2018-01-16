package SeleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumClass {

	public static void main(String[] args) {
		
		
		//System.setProperty("webdriver.gecko.driver" , "C:\\Users\\user\\Tools1\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Tools1\\chromedriver.exe");
		
        WebDriver driver=new ChromeDriver();
        
        driver.get("http://www.seleniumhq.org/");
        
        System.out.println("Application title is ==============" + driver.getTitle());
        
        driver.quit();

	}

}
