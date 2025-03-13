package main.java;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import java.io.File;
import java.io.IOException;

public class Practise {

    WebDriver driver;

    @Test (priority = 1)
    public void login()
    {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/index.html");
        driver.manage().window().maximize();

        //Login
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        driver.findElement(By.className("btn_action")).click();
    }

    @Test (priority = 2)
    public void addToCart()
    {
        //Add Product to cart
        driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();

        //Cart actions
        driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div[2]/a")).click();
        driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/a[2]")).click();

    }

    @Test (priority = 3)
    public void detailsForm() throws IOException, InterruptedException
    {
        //Fill Details
        driver.findElement(By.id("first-name")).sendKeys("Sidd");
        driver.findElement(By.id("last-name")).sendKeys("Test");
        driver.findElement(By.id("postal-code")).sendKeys("400064");
        driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/form/div[2]/input")).click();

        //Add some functionality to store the details or take screenshot
        Thread.sleep(1000);
        File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(f,new File("/home/neebal/Downloads/test.png"));

        //Files.copy(f, new File("/home/neebal/testss.jpg"));

        driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/div[8]/a[2]")).click();

    }
    @Test (priority = 4)
    public void close() throws IOException, InterruptedException
    {
        driver.quit();
    }

}
