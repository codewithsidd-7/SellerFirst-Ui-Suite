package main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewLogin {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/index.html");
        driver.manage().window().maximize();

        //find elements by id
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.name("password")).sendKeys("secret_sauce");

        //Login button
        driver.findElement(By.className("btn_action")).click();

        driver.findElement(By.xpath("/html/body/div/div[1]/div/div[3]/div/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("logout_sidebar_link")).click();

//       WebElement logout = driver.findElement(By.xpath("//a[@id=\"logout_sidebar_link\"]"));
//       Thread.sleep(1000);
//       logout.click();

        //driver.close();











    }
}

