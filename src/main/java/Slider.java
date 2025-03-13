import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/slider/#colorpicker");
        driver.manage().window().maximize();

        //Switching frames
        WebElement frame = driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(frame);


        WebElement S1 = driver.findElement(By.xpath("/html/body/div[1]/span"));
        WebElement S2 = driver.findElement(By.xpath("/html/body/div[2]/span"));
        WebElement S3 = driver.findElement(By.xpath("/html/body/div[3]/span"));

        Actions action = new Actions (driver);
        action.dragAndDropBy(S1,100,125).perform();
//        action.dragAndDropBy(S2,120,130).perform();
//        action.dragAndDropBy(S3,100,150).perform();




    }
}
