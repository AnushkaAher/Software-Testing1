import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NavigationTest {
    WebDriver driver = new ChromeDriver();
    @BeforeTest
    public void start() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\Project\\STQA\\STQA\\src\\test\\resources\\drivers\\chromedriver.exe");

        driver.get("https://demo.evershop.io");
        driver.manage().window().maximize();
    }

    @Test
    public void Nav_test1() throws InterruptedException {
        WebElement men = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/ul/li[1]/a"));
        men.click();
        Thread.sleep(500);
        String s1 = driver.getCurrentUrl();
        assertEquals(s1, "https://demo.evershop.io/men");

        Thread.sleep(2000);
    }

    @Test
    public void Nav_test2() throws InterruptedException {
        WebElement women = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/ul/li[2]/a"));
        women.click();
        Thread.sleep(500);
        String s2 = driver.getCurrentUrl();
        assertEquals(s2, "https://demo.evershop.io/women");

        driver.quit();
    }
}
