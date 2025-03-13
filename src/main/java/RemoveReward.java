package main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.TimeUnit;


public class RemoveReward {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        String baseUrl = "https://stage.nurture.farm/reward-points";
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        String loginNo = "9425790844";
        String retailerNo ="7021383669";

        //Login
        driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys(loginNo);
        driver.findElement(By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div/seller-signin/div/div[2]/div[1]/form/button")).click();
        //Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div/seller-signin/div/div[2]/div[1]/form/div/ng-otp-input/div/input[1]")).sendKeys("1");
        driver.findElement(By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div/seller-signin/div/div[2]/div[1]/form/div/ng-otp-input/div/input[2]")).sendKeys("0");
        driver.findElement(By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div/seller-signin/div/div[2]/div[1]/form/div/ng-otp-input/div/input[3]")).sendKeys("0");
        driver.findElement(By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div/seller-signin/div/div[2]/div[1]/form/div/ng-otp-input/div/input[4]")).sendKeys("0");
        driver.findElement(By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div/seller-signin/div/div[2]/div[1]/form/button")).click();

        //Remove Reward
        driver.findElement(By.xpath("/html/body/anms-root/div/div/div/mat-toolbar/button")).click();
        driver.findElement(By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav/div/mat-nav-list/app-menu-list-item/div[8]")).click();
        driver.findElement(By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav/div/mat-nav-list/app-menu-list-item/div[8]/div/a[5]")).click();

        driver.findElement(By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div[2]/reward-points/div/div/div/mat-card[1]/div/div/div/div/div/div/div[1]/input")).sendKeys(retailerNo);
        driver.findElement(By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div[2]/reward-points/div/div/div/mat-card[1]/div/div/div/div/div/div/div[2]/button")).click();
        driver.findElement(By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div[2]/reward-points/div/div/div/mat-card[2]/div/table/tbody/tr/td[4]/button")).click();

        //Remove Radio Button
        WebElement radioButton = driver.findElement(By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div[2]/add-points/div/div/div/mat-card/mat-card-content/form/div[1]/div/mat-label/mat-radio-group/mat-radio-button[2]"));
        radioButton.click();

        //Reasons Dropdown
        WebElement reasonsDrop = driver.findElement(By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div[2]/add-points/div/div/div/mat-card/mat-card-content/form/div[2]/div[1]/div/div/ng-select"));
        reasonsDrop.click();
        //ng-select error while using select
//        Select nselect = new Select(reasonsDrop);
//        nselect.selectByVisibleText("Offer Cashback");

        driver.findElement(By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div[2]/add-points/div/div/div/mat-card/mat-card-content/form/div[2]/div[1]/div/div/ng-select/ng-dropdown-panel/div/div[2]/div[2]")).click();
        driver.findElement(By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div[2]/add-points/div/div/div/mat-card/mat-card-content/form/div[3]/div/mat-form-field/div/div[1]/div[3]/input")).sendKeys("100");
        driver.findElement(By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div[2]/add-points/div/div/div/mat-card/mat-card-content/form/div[4]/div/button[2]")).click();

        //Confirmation pop-up
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/pop-up/div/mat-dialog-actions/div/button[2]")).click();

        Thread.sleep(2000);
        driver.quit();


    }
}
