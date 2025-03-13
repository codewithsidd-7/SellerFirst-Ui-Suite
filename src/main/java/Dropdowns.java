package main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        //find elements by id
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.name("password")).sendKeys("secret_sauce");

        //Login button
        driver.findElement(By.className("btn_action")).click();

        //Selecting dropdown
        WebElement ddown = driver.findElement(By.className("product_sort_container"));

        Select select = new Select(ddown);
        select.selectByValue("hilo");
        select.selectByIndex(1);





        //driver.close();




    }
}
