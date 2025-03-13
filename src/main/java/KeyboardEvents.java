import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEvents {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://jsonformatter.org/json-pretty-print");
        driver.manage().window().maximize();

        WebElement element1 = driver.findElement(By.xpath("/html/body/header/div/div[3]/div[1]/div/div/div[2]/div"));

        Actions action = new Actions(driver);
        action.contextClick(element1).perform();




    }
}
