package automateBooking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Booking {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\browserdrivers\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		
		//URL Launch
        driver.get("https://www.booking.com/index.html?aid=375653&label=msn-LOcHQGfA16aswDjFb7_rcw-80539252256335:tikwd-80539278535451:aud-808219487:loc-90:neo:mte:lp158527:dec:qsBooking.com&utm_campaign=Booking%20Name&utm_medium=cpc&utm_source=bing&utm_term=LOcHQGfA16aswDjFb7_rcw&msclkid=ff9ced48fe5610c759978f607873f402");
        driver.manage().window().maximize();
        
        //driver.findElement(By.xpath("//span[@class='bui-button__text']")).click();
        driver.findElement(By.xpath("//a[@class='bui-button bui-button--secondary js-header-login-link']")).click();
        
        WebElement login = driver.findElement(By.xpath("//input[@name='username']"));
        login.click();
        login.sendKeys("kakaderiddhi18@gmail.com");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(1000);
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.click();
        password.sendKeys("Riddhi@123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
       
        Thread.sleep(000);
        driver.findElement(By.className("bui-tab__text")).click();
        WebElement city = driver.findElement(By.name("ss"));
        city.sendKeys("pune");
        city.submit();
        //Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@aria-label='16 March 2022']")).click();
        driver.close();
        //driver.findElement(By.xpath("//button[@type='button'][2]")).click();
        
               
        
	}

}
