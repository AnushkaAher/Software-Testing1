import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SeleniumLogin {
    WebDriver driver = new ChromeDriver();
    @Test
    public void Login() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","E:\\Project\\STQA\\STQA\\src\\test\\resources\\drivers\\chromedriver.exe");

        driver.get("https://demo.evershop.io/account/login");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/input")).sendKeys("hulevaibhavi21@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/input")).sendKeys("vh21");
        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]/button")).click();

        Thread.sleep(500);

        String s1 = driver.getCurrentUrl();
        assertEquals(s1, "https://demo.evershop.io/");

        driver.quit();
    }
}
