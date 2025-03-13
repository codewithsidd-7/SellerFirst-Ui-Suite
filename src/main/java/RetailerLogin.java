package main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RetailerLogin {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        String baseUrl = "https://stage.nurture.farm/reward-points";
        driver.get(baseUrl);
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("9425790844");
        driver.findElement(By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div/seller-signin/div/div[2]/div[1]/form/button")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div/seller-signin/div/div[2]/div[1]/form/div/ng-otp-input/div/input[1]")).sendKeys("1");
        driver.findElement(By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div/seller-signin/div/div[2]/div[1]/form/div/ng-otp-input/div/input[2]")).sendKeys("0");
        driver.findElement(By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div/seller-signin/div/div[2]/div[1]/form/div/ng-otp-input/div/input[3]")).sendKeys("0");
        driver.findElement(By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div/seller-signin/div/div[2]/div[1]/form/div/ng-otp-input/div/input[4]")).sendKeys("0");
        driver.findElement(By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div/seller-signin/div/div[2]/div[1]/form/button")).click();

        //Logout
        driver.findElement(By.xpath("")).click();
    }
}
