package main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class AddNewProduct {
    public static void main(String[] args) throws InterruptedException {

        //Utils
        String baseUrl = "https://stage.nurture.farm/reward-points";
        String loginNo = "9425790844";

        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setAcceptInsecureCerts(true);
        ChromeOptions coptions = new ChromeOptions();
        coptions.merge(dc);

        WebDriver driver = new ChromeDriver(coptions);
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

        //Master catalogue
        WebElement catalogue = driver.findElement(By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav/div/mat-nav-list/app-menu-list-item/div[3]"));
        catalogue.click();

        WebElement masterCatalogue = driver.findElement(By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav/div/mat-nav-list/app-menu-list-item/div[3]/div/a[1]/span/div"));
        masterCatalogue.click();

        WebElement showAllButton = driver.findElement(By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div[2]/master-catalogue/div/div/div/mat-card[2]/div[2]/button"));
        showAllButton.click();

        WebElement catalogueImport = driver.findElement(By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div[2]/master-catalogue/div/div/div/mat-card[1]/div[2]/button[3]"));
        catalogueImport.click();

        WebElement uploadCatalogue = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/master-catalogue-import-modal/div/div[2]/form/div/div/upload-media/input"));
        uploadCatalogue.sendKeys("/home/neebal/Documents/Crop Protect Master Cat.xlsx");

        WebElement importButton = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/master-catalogue-import-modal/div/div[2]/form/mat-dialog-actions/div/button[2]"));
        importButton.click();

        //Searching the Added product
        Thread.sleep(2000);
        WebElement searchBox = driver.findElement(By.xpath("//html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div[2]/master-catalogue/div/div/div/mat-card[1]/div[1]/div/div/div/div/div[1]/input"));
        searchBox.sendKeys("Shelby");

        WebElement searchButton = driver.findElement(By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div[2]/master-catalogue/div/div/div/mat-card[1]/div[1]/div/div/div/div/div[2]/button"));
        searchButton.click();

        //Selecting the added product
        Thread.sleep(2000);
        WebElement checkBox = driver.findElement(By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div[2]/master-catalogue/div/div/div/mat-card[2]/div/table/tbody/tr/td[1]/mat-checkbox/label"));
        checkBox.click();

        //Adding product to My Catalogue
        //Thread.sleep(2000);
        WebElement addProductToMyCatalogue = driver.findElement(By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div[2]/master-catalogue/div/div/div/mat-card[1]/div[2]/button[1]"));
        addProductToMyCatalogue.click();

        WebElement selectEnterpriseDrop = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/add-product-catalogue-modal/section/div/section/form/div/div/div/div/ng-select[1]/div/div/div[2]/input"));
        selectEnterpriseDrop.sendKeys("Godrej Agrovet Limited");
        selectEnterpriseDrop.sendKeys(Keys.ENTER);

//        Select select = new Select(selectEnterpriseDrop);
//        select.selectByValue("Godrej Agrovet Limited");

        Thread.sleep(2000);
        WebElement selectPlantDrop = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/add-product-catalogue-modal/section/div/section/form/div/div/div/div/ng-select[2]/div/div/div[2]/input"));
        selectPlantDrop.sendKeys("G002");
        selectPlantDrop.sendKeys(Keys.ENTER);

        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/add-product-catalogue-modal/section/div/section/form/div/div/div/div")).click();

        WebElement addProductButton = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/add-product-catalogue-modal/section/div/mat-dialog-actions/div/button[2]"));
        addProductButton.click();

        //My Catalogue Add Inventory and Price
        Thread.sleep(2000);
        driver.get("https://stage.nurture.farm/my-catalogue");

        Thread.sleep(6000);
        WebElement uploadProductDetails2 = driver.findElement(By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div[2]/my-product-catalogue/div/div/div/div/mat-card[1]/div[2]/button[2]"));
        uploadProductDetails2.click();

        Thread.sleep(2000);

        WebElement addPrice = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/catalogue-import-modal/div/div[2]/div/div[1]/div[2]/upload-media/input"));
        addPrice.sendKeys("/home/neebal/Documents/Price Import auto.xlsx");

        WebElement addInventory = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/catalogue-import-modal/div/div[2]/div/div[2]/div[2]/upload-media/input"));
        addInventory.sendKeys("/home/neebal/Documents/Inventory import auto.xlsx");

        WebElement selectDropMyCat = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/catalogue-import-modal/div/div[2]/form/div/ng-select/div/div/div[2]/input"));
        selectDropMyCat.sendKeys("Godrej Agrovet Limited");
        selectDropMyCat.sendKeys(Keys.ENTER);

        WebElement importMyCatalogue = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/catalogue-import-modal/div/div[2]/div/mat-dialog-actions/div/button[2]"));
        importMyCatalogue.click();

        Thread.sleep(5000);
        driver.quit();

    }
}
