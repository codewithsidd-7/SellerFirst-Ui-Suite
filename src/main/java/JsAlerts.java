package main.java;
import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsAlerts {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();


        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();


        driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[1]/button")).click();

        //Using alert interface
        Alert alert = driver.switchTo().alert();
        alert.accept();

        driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[2]/button")).click();
        alert.dismiss();

        driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[3]/button")).click();
        alert.sendKeys("sidd");
        alert.accept();

    }
}

//google autosuggestion webtable static and dyanic api status code for api