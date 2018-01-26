//package SeleniumPackage;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.testng.annotations.Test;
//
//public class StartEdgeBrowser {
//	
//	@Test
//	public void launchEdgeBrowser() throws Exception{
//		
//		WebDriver driver=null;
//		
//		System.setProperty("webdriver.edge.driver", "C:\\Program Files (x86)\\Microsoft Web Driver\\MicrosoftWebDriver.exe");
//		
//		driver=new EdgeDriver();
//		
//		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//		driver.manage().window().maximize();
//		
//		String domain="https://www.google.ca";
//		
//		driver.get(domain);
//		
//		driver.quit();
//
//	}
//
//}
