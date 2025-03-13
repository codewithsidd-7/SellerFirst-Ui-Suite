package main.java;

import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

//Need to update date everyday in the file to avoid error

public class SkuDiscount {
    public static void main(String[] args) throws InterruptedException {

        //Utils
        String baseUrl = "https://stage.nurture.farm/reward-points";
        String loginNo = "9425790844";
        String retailerNo ="7021383669";

        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        //Login
        WebElement PhoneNumber = driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]"));
        PhoneNumber.sendKeys(loginNo);

        WebElement SendOtp = driver.findElement(By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div/seller-signin/div/div[2]/div[1]/form/button"));
        SendOtp.click();

        //Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div/seller-signin/div/div[2]/div[1]/form/div/ng-otp-input/div/input[1]")).sendKeys("1");
        driver.findElement(By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div/seller-signin/div/div[2]/div[1]/form/div/ng-otp-input/div/input[2]")).sendKeys("0");
        driver.findElement(By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div/seller-signin/div/div[2]/div[1]/form/div/ng-otp-input/div/input[3]")).sendKeys("0");
        driver.findElement(By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div/seller-signin/div/div[2]/div[1]/form/div/ng-otp-input/div/input[4]")).sendKeys("0");
        driver.findElement(By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div/seller-signin/div/div[2]/div[1]/form/button")).click();

        WebElement Promotions = driver.findElement(By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav/div/mat-nav-list/app-menu-list-item/div[7]"));
        Promotions.click();

        WebElement Discounts = driver.findElement(By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav/div/mat-nav-list/app-menu-list-item/div[7]/div/a[2]/span/div"));
        Discounts.click();

        WebElement SkuDiscountImport = driver.findElement(By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div[2]/discounts/mat-tab-group/div/mat-tab-body[1]/div/sku-discount/div/div/div/mat-card[1]/div[1]/div/button[2]"));
        SkuDiscountImport.click();

        WebElement DiscountUpload = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/sku-discount-import-modal/div/div[2]/form/div/div/upload-media/input"));
        DiscountUpload.sendKeys("/home/neebal/Downloads/sku automation.csv");

        WebElement ImportDiscount = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/sku-discount-import-modal/div/div[2]/form/mat-dialog-actions/div/button[2]"));
        ImportDiscount.click();

        //Capturing the added discount
        Thread.sleep(2000);

        System.out.println(driver.findElement(By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div[2]/discounts/mat-tab-group/div/mat-tab-body[1]/div/sku-discount/div/div/div/mat-card[2]/div/table/thead/tr")).getText());
        System.out.println(driver.findElement(By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div[2]/discounts/mat-tab-group/div/mat-tab-body[1]/div/sku-discount/div/div/div/mat-card[2]/div/table/tbody/tr[1]")).getText());

        //Searching the added discount
        WebElement SearchBar = driver.findElement(By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div[2]/discounts/mat-tab-group/div/mat-tab-body[1]/div/sku-discount/div/div/div/mat-card[1]/div[1]/div/div/div/div/div/div[1]/input"));
        SearchBar.sendKeys("6309000");

        WebElement SearchButton = driver.findElement(By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div[2]/discounts/mat-tab-group/div/mat-tab-body[1]/div/sku-discount/div/div/div/mat-card[1]/div[1]/div/div/div/div/div/div[2]/button"));
        SearchButton.click();

        Thread.sleep(1000);

        //Deleting the added discount
        WebElement DeleteDiscount = driver.findElement(By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div[2]/discounts/mat-tab-group/div/mat-tab-body[1]/div/sku-discount/div/div/div/mat-card[2]/div/table/tbody/tr/td[13]/button[2]"));
        DeleteDiscount.click();

        WebElement YesButton = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/pop-up/div/mat-dialog-actions/div/button[2]"));
        YesButton.click();

//        Printing after deleting
//        Thread.sleep(2000);
//        System.out.println("After Deleting the Discount " + driver.findElement(By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div[2]/discounts/mat-tab-group/div/mat-tab-body[1]/div/sku-discount/div/div/div/mat-card[2]/div/table/tbody/tr[1]")).getText());

        Thread.sleep(2000);
        driver.quit();


    }
}
