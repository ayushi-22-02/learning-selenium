package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    public static void main(String[] args) {
        // only for me
//        ChromeOptions options = new ChromeOptions();
//        options.setBinary("/usr/bin/brave-browser");

        WebDriver driver = new ChromeDriver();
//        FirefoxDriver driver=new FirefoxDriver();

        driver.get("http://google.com");

        // document.getElementsByName("q")[0]
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.click();
        // document.getElementsByName("q")[0].value = "Selenium Testing"
        searchBox.sendKeys("Selenium Testing");
        searchBox.sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//a[@href='https://www.guru99.com/introduction-to-selenium.html']")).click();
    }
}
