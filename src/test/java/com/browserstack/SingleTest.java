package com.browserstack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SingleTest extends BrowserStackTestNGTest {

    @Test
    public void test() throws Exception {
        System.out.println("Username: " + System.getenv("BROWSERSTACK_USERNAME"));
        System.out.println("Access Key: " + System.getenv("BROWSERSTACK_ACCESS_KEY"));
        driver.get("https://www.google.com/ncr");
        WebElement element = driver.findElement(By.name("qsdfsdf"));
        element.sendKeys("BrowserStack");
        element.submit();
        Thread.sleep(5000);

        Assert.assertEquals("BrowserStack - Google Search", driver.getTitle());
    }
}
