package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * About this class.
 *
 * @version 1.0
 * @author leo
 */

public class DemoSelenium {

    /**
     * ...method doSomething documentation comment...
     */
    public static void main(String[] args) {
        // comment here
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
        System.out.println(driver.getTitle());
        driver.getTitle();
        driver.quit();

    }

}
