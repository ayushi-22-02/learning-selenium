//package org.example;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.time.Duration;
//
//public class googleTest {
//
//    @Test
//    public void testGoogle() {
//        WebDriverManager.chromedriver().setup();
////    WebDriverManager.chromedriver().setup();
//
//        WebDriver driver = new ChromeDriver();
//
//        driver.get("http://google.com");
////        WebElement searchBox = driver.findElement(By.name("q"));
//        searchBox.click();
//        searchBox.sendKeys("selenium testing");
//        searchBox.sendKeys(Keys.ENTER);
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//
//        WebElement result = driver.findElement(By.cssSelector("div.g:nth-child(18) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1) "));
//        result.click();
//
//    }
//
//}