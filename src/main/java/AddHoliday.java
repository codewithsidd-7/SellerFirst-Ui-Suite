package main.java;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class AddHoliday {
    public static void main (String[] args) throws InterruptedException {

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

        WebElement Profile = driver.findElement(By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav/div/mat-nav-list/app-menu-list-item/div[10]/mat-list-item"));
        Profile.click();

        WebElement Holidays = driver.findElement(By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav/div/mat-nav-list/app-menu-list-item/div[10]/div/a[3]/span/div"));
        Holidays.click();

        WebElement UploadHoliday = driver.findElement(By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div[2]/edd-holidays/div/div/div/mat-card[1]/div/button"));
        UploadHoliday.click();

        WebElement UploadFile = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/holiday-import-modal/div/div[2]/div/div/upload-media/input"));
        UploadFile.sendKeys("/home/neebal/Downloads/holiday import selenium test.csv");

        WebElement ImportHoliday = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/holiday-import-modal/div/div[2]/div/div/mat-dialog-actions/div/button[2]"));
        ImportHoliday.click();

        //Dynamic table handling for Holidays to print values

        List<WebElement> rows = driver.findElements(By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div[2]/edd-holidays/div/div/div/mat-card[2]/div/table/tbody/tr"));
        System.out.println("Number of rows are: " + rows.size());;
        int rowsize = rows.size();

        List<WebElement> cols = driver.findElements(By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div[2]/edd-holidays/div/div/div/mat-card[2]/div/table/tbody/tr/td"));
        System.out.println("Number of columns are: " + cols.size());
        int colsize = cols.size();

        for (int i=1; i<=rowsize;i++){
            for (int j = 1; j<colsize; j++){
                System.out.println(driver.findElement(By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div[2]/edd-holidays/div/div/div/mat-card[2]/div/table/tbody/tr["+ i +"]/td["+ j +"]")).getText());
            }
        }

        Thread.sleep(2000);
        driver.quit();


    }
}

