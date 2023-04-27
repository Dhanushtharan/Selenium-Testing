package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day4task5 {

	public static void main (String [] args) throws InterruptedException {
	WebDriverManager.chromedriver () . setup () ;
	WebDriver driver;
	ChromeOptions co = new ChromeOptions () ;
	co.addArguments ("--remote-allow-origins=*");
	driver=new ChromeDriver (co) ;
	driver.get ("https://www.abhibus.com/bus-ticket-booking");
	WebElement source=driver.findElement(By.id("source"));
    source.sendKeys("Coimbatore");
    Thread.sleep(3000);
    source.sendKeys(Keys.ENTER);
    WebElement destination=driver.findElement(By.id("destination"));
    destination.sendKeys("Salem");
    Thread.sleep(3000);
    destination.sendKeys(Keys.ENTER);
    WebElement date= driver.findElement(By.id("datepicker1"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].setAttribute('value','04-05-2023')",date);
	WebElement ser= driver.findElement(By.id("seo_search_btn"));
	ser.click();
}
}