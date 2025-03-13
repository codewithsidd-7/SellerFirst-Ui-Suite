package main.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SellerFirstLogin {

    WebDriver driver;

    @BeforeClass
    void setup() {
    driver = new ChromeDriver();
        String baseUrl = "https://stage.nurture.farm/reward-points";
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    void testLogin()
    {
        LoginPageObject lpo = new LoginPageObject(driver);
        lpo.setPhoneNumber("9425790844");
        lpo.clickSendOtp();
        lpo.enterOtp1("1");
        lpo.enterOtp2("0");
        lpo.enterOtp3("0");
        lpo.enterOtp4("0");
        lpo.clickLogin();
    }
    //This a test
    @AfterClass
    void teardown(){
        driver.quit();
    }


}


