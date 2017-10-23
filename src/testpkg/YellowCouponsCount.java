package testpkg;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YellowCouponsCount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Thread.sleep(25000);
		
		try {
			
		String userdir = System.getProperty("user.dir");
		System.out.println("userdir : " + userdir);
		//userdir : C:\Users\109563\Documents\GS\Workspace\SeleniumTestProject
		
		/*
		Properties p = new Properties();
		
		//path of properties file
		FileInputStream i = new FileInputStream(userdir);
		
		//Load properties file
		p.load(i); 
		*/
		
		//Create object for FileClass
		File f = new File(userdir + "\\YellowCouponNames.xls");
		//File f = new File("C:\\Users\\109563\\Documents\\GS\Workspace\\SeleniumTestProject\\YellowCouponNames.xlsx");
		
		//File, FileReader, BufferedReader, FileWriter, BufferedWriter
		System.out.println("File path Defined");
		
		//Create file
		f.createNewFile();
		System.out.println("File Created");
		
		//Write into the file
		FileWriter fw = new FileWriter(f); 
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		//C:\Users\109563\Documents\GS\Workspace\SeleniumTestProject
		LaunchChrome cd = new LaunchChrome();
				
		WebDriver driver = cd.launchChromeDriver();
		
		driver.get("https://web-heb-uat.unata.com");
		Thread.sleep(10000);
		
		driver.findElement(By.id("nav-register")).click();
		//driver.findElement(By.cssSelector("#nav-register")).click();
		
		driver.findElement(By.id("login-email")).sendKeys("gopalakrishnan.shivranjit@heb.com");
		//driver.findElement(By.cssSelector("input[type*='mail']")).sendKeys("gopalakrishnan.shivranjit@heb.com");
		
		driver.findElement(By.id("login-password")).sendKeys("smark0lsb");
		//driver.findElement(By.cssSelector("form div:nth-child(2)>div:nth-child(1)>input[ng-model='password']")).sendKeys("smark0lsb");
		
		driver.findElement(By.id("login-submit")).click();
		//driver.findElement(By.cssSelector("[class='button mobile-bottom']")).click();
		
		System.out.println("User logged in");	
		
		Thread.sleep(5000);
		
		//YELLOW COUPONS Link
		//WebElement ylwCpnLnk = driver.findElement(By.id("nav-main-shop-coupons"));
		
		//WAYS TO SHOP > YELLOW COUPONS Link
		WebElement ylwCpnLnk = driver.findElement(By.xpath("html/body/div[3]/div/div/div[2]/div[3]/div[2]/ul/li[7]/a/div[2]/div"));
		//WebElement ylwCpnLnk = driver.findElement(By.cssSelector("div.info[linkText='Yellow Coupons']"));
		//WebElement ylwCpnLnk = driver.findElement(By.linkText("Yellow Coupons"));
		//WebElement ylwCpnLnk = driver.findElement(By.className("info"));
		//WebElement ylwCpnLnk = driver.findElement(By.cssSelector(".info>div']"));
		//WebElement ylwCpnLnk = driver.findElement(By.xpath("html/body/div[3]/div/div/div[2]/div[3]/div[2]/ul/li[7]/a/div[2]"));
		
		//NoSuchELementException
		//try {
			//WebElement ylwCpnLnk = driver.findElement(By.cssSelector("div.info[linkText='Yellow Coupons']"));
			//System.out.println("found element");
			//ylwCpnLnk.click();
			//System.out.println("clicked element");
		//}
		//catch(NoSuchElementException e)
		//{		
			//System.out.println("Exception message : " + e.getMessage());
			//driver.quit();
		//}
		
		System.out.println("found element");		
		
		ylwCpnLnk.click();
		
		System.out.println("clicked element");	

		Thread.sleep(20000);

		//driver.navigate().back();
		//System.out.println("back on home page");
		//List<WebElement> ylwCpnNames = driver.findElements(By.className("go link"));	
		//ylwCpnNames.size();
		//System.out.println("No.of Coupons : " + ylwCpnNames.size());
		
		List<WebElement> ylwCpnNameSet = driver.findElements(By.className("cell-title"));
		
		//ArrayList<String> ylwCpnNames = driver.findElements(By.className("cell-title"));
		//ylwCpnNames.size();
		
		System.out.println("WebElemet list assigned");
		
		System.out.println("No.of Coupons : " + ylwCpnNameSet.size());
		
		//System.out.println("No.of Coupons : " + ylwCpnNames.size() + ((WebElement)ylwCpnNames).getAttribute("cell-title"));
		//Thread.sleep(25000);
		
		//WebElement ylwCpnNames = driver.findElements(By.)
		//List<WebElement> ylwCpnNames = driver.findElements(By.cssSelector(div.cell-title));
		
		//String[] ylwCpnNames2 = ylwCpnNames.toArray();
		
		int i = 1;
		//for (int i=1;i<=ylwCpnNameSet.size();i++){			
		for(WebElement eachElement : ylwCpnNameSet) {
			//YELLOW COUPONS Link
			//WebElement ylwCpnName = driver.findElement(By.xpath("html/body/div[3]/div/div/div[2]/div/div[4]/div[3]/div[1]/ol/li["+i+"]/span/div/div[2]/div[2]"));
			
			//WAYS TO SHOP > YELLOW COUPONS Link
			//WebElement ylwCpnName = driver.findElement(By.xpath("html/body/div[3]/div/div/div[2]/div/div[4]/div[3]/div[1]/ol/li["+i+"]/span/div/div[3]/button"));
			
			//System.out.println("Coupon Name["+i+"] : " + ylwCpnName.getText());
			
			System.out.println("Coupon Name["+i+"] : " + eachElement.getText());
			i++;
			
			//bw.write(ylwCpnName.getText());
			
			//System.out.println("File Write Successful");
			
			//bw.newLine();
			
			//System.out.println("File NewLine navigation Successful");
			//System.out.println(((WebElement)ylwCpnNames).getAttribute("cell-title"));
		}	
		
		/*while  {
			
		}*/
		
		bw.flush();
		bw.close();
					
		/* FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);

		while (br.ready()){
			String s = br.readLine();
			System.out.println(s);			
			
		}
		br.close(); */
			
		driver.quit();
		}
		
		catch (Exception e){
			//System.out.println("File not found");
			//System.out.println(e.getMessage());
			//driver.quit();
		};
		
	}

}
