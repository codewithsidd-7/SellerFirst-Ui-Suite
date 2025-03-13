package main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class DragAndDrop {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        driver.manage().window().maximize();

        WebElement drag = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]"));
        WebElement drop = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]"));
        WebElement rclick = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]"));


        Actions action = new Actions (driver);
        action.dragAndDrop(drag,drop).perform();
        action.contextClick(rclick).perform();




    }
}
