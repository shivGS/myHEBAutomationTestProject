package testpkg;

//import java.util.List;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchChrome {
	
	public WebDriver launchChromeDriver() {
	//WebDriver
		
		//Step1-Map Driver Server to System properties
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\109563\\Documents\\GS\\SeleniumLibraries\\chromedriver.exe");
		//System.getProperty("user.dir")
		
		//Step2 - Launch WebDriver
		WebDriver driver = new ChromeDriver();
			
		//Maximize browser
		driver.manage().window().maximize();
		
		return driver;
		
		//Step3 - Launch application (fully qualified URL)
		//driver.get("https://web-heb-uat.unata.com");
	
		//String browserTitle = driver.getTitle();
		
		//Thread.sleep(2000);
		
		//System.out.println("Chrome Browser Title:" + " : " + driver.getTitle());
		
		//Thread.sleep(5000);
		
		//driver.quit();
		
	}
			
}
