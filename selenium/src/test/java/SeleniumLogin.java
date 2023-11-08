
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLogin {

    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","E:\\Project\\selenium\\src\\test\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.evershop.io/account/login");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/input")).sendKeys("hulevaibhavi21@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/input")).sendKeys("vh21");
        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]/button")).click();

    }

}
