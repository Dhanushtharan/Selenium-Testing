package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origin=*");
        WebDriver driver=new  ChromeDriver(co);
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);
        Actions a =new Actions(driver);
        //drag_id="draggable;
        //drop_id="droppable";
        WebElement src= driver.findElement(By.id("draggable"));
        WebElement dst= driver.findElement(By.id("droppable"));
        a.clickAndHold(src).release(dst).build().perform();
        a.dragAndDrop(src, dst).build().perform();
	}

}
