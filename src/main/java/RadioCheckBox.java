package main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioCheckBox {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.singaporeair.com/en_UK/in/home?gad_source=1&gclid=CjwKCAjw9eO3BhBNEiwAoc0-j" +
                  "bDsAa_aEjHq6uOc4I1p0USyIeOjKuvq4SIxYrdD4JmMZMdWzu0hFxoC4jUQAvD_BwE&gclsrc=aw.ds#/book/bookflight");
        driver.manage().window().maximize();

        //Check Box
        //driver.findElement(By.name("")).click();

        //Radio Box
        WebElement rb = driver.findElement(By.id("redeemFlights"));
        rb.click();
        System.out.println(rb.isSelected());







    }
}
