package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tasl3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origin=*");
        WebDriver driver=new ChromeDriver(co);
        driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
	}

}