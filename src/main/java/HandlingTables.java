import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class HandlingTables {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://the-internet.herokuapp.com/tables");
        driver.manage().window().maximize();


        List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"table1\"]/tbody/tr"));
        int rowsize = rows.size();
        System.out.println(rowsize);

        List<WebElement> columns = driver.findElements(By.xpath("//*[@id=\"table1\"]/thead/tr/th"));
        int columnsize = columns.size();
        System.out.println(columnsize);

        for(int i=1; i<=rowsize; i++) {
            for(int j=1; j<=columnsize; j++) {
               String tableval = driver.findElements(By.xpath("//*[@id=\"table1\"]/tbody/tr["+i+"]/td["+j+"]")).toString();
                System.out.println(tableval);

            }
        }

        driver.quit();
    }
}
