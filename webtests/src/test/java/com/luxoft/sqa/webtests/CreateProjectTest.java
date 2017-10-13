package com.luxoft.sqa.webtests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CreateProjectTest {
    @Test
    public void testNewProject() {
        WebDriver driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://shipovalov.net/login_page.php");
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys("student");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("luxoft");
        driver.findElement(By.cssSelector("input.button")).click();

    }
}
