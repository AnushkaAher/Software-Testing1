import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SeleniumAdmin {
    WebDriver driver = new ChromeDriver();

    @BeforeTest
    public void start()
    {
        System.setProperty("webdriver.chrome.driver", "E:\\Project\\STQA\\STQA\\src\\test\\resources\\drivers\\chromedriver.exe");

        driver.get("https://demo.evershop.io/admin/login");
        driver.manage().window().maximize();
    }

    @AfterTest
    public void close()
    {
        driver.quit();
    }

    @Test
    public void admin_test1() throws InterruptedException {
        WebElement email = driver.findElement(By.xpath("//*[@id=\"adminLoginForm\"]/div[1]/div/input"));
        email.sendKeys("demo@evershop.io");

        WebElement password = driver.findElement(By.xpath("//*[@id=\"adminLoginForm\"]/div[2]/div/input"));
        password.sendKeys("123456");

        WebElement admin =  driver.findElement(By.xpath("//*[@id=\"adminLoginForm\"]/div[3]/button"));
        admin.click();

        Thread.sleep(500);

        String s1 = driver.getCurrentUrl();
        assertEquals(s1, "https://demo.evershop.io/admin");

    }

}

