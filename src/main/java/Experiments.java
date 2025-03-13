import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Experiments {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://stage.nurture.farm/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div/seller-landing-page/div/div/div[1]/mat-toolbar/div[2]/button[1]")).click();
        driver.findElement(By.xpath("mat-input-element mat-form-field-autofill-control ng-tns-c66-1 ng-pristine ng-invalid cdk-text-field-autofill-monitored ng-touched")).sendKeys();
    }

}
