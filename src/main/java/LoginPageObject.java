package main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageObject {
    WebDriver driver;

    //Constructor
    LoginPageObject(WebDriver driver){
        this.driver=driver;
    }
    //Locators
    By txt_phn_loc = By.xpath("//*[@id=\"mat-input-0\"]");
    By sendotp_btn_loc = By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div/seller-signin/div/div[2]/div[1]/form/button");

    By otp_box1_loc = By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div/seller-signin/div/div[2]/div[1]/form/div/ng-otp-input/div/input[1]");
    By otp_box2_loc = By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div/seller-signin/div/div[2]/div[1]/form/div/ng-otp-input/div/input[2]");
    By otp_box3_loc = By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div/seller-signin/div/div[2]/div[1]/form/div/ng-otp-input/div/input[3]");
    By otp_box4_loc = By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div/seller-signin/div/div[2]/div[1]/form/div/ng-otp-input/div/input[4]");
    By login_btn_loc = By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div/seller-signin/div/div[2]/div[1]/form/button");

    //Action methods
    public void setPhoneNumber(String number)
    {
        driver.findElement(txt_phn_loc).sendKeys(number);
    }

    public void clickSendOtp ()
    {
        driver.findElement(sendotp_btn_loc).click();
    }

    public void enterOtp1 (String number)
    {
        driver.findElement(otp_box1_loc).sendKeys(number);
    }

    public void enterOtp2 (String number)
    {
        driver.findElement(otp_box2_loc).sendKeys(number);
    }

    public void enterOtp3 (String number)
    {
        driver.findElement(otp_box3_loc).sendKeys(number);
    }
    public void enterOtp4 (String number)
    {
        driver.findElement(otp_box4_loc).sendKeys(number);
    }
    public void clickLogin (){
        driver.findElement(login_btn_loc).click();
    }

}



