import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class SeleniumAdmin {

    @Test
    public void Admin() {
        System.setProperty("webdriver.chrome.driver", "E:\\Project\\selenium\\src\\test\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.evershop.io/admin/login");
        driver.manage().window().maximize();


        driver.findElement(By.xpath("//*[@id=\"adminLoginForm\"]/div[1]/div/input")).sendKeys("demo@evershop.io");
        driver.findElement(By.xpath("//*[@id=\"adminLoginForm\"]/div[2]/div/input")).sendKeys("123456");
        driver.findElement(By.xpath("//*[@id=\"adminLoginForm\"]/div[3]/button")).click();

        String s1 = driver.getCurrentUrl();
        assertEquals(s1, "https://demo.evershop.io/admin");

    }
}
