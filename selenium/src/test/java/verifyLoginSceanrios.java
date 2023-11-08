import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class verifyLoginSceanrios {

  @Test
  public void testInvalidSceanriosForLogin() {
    System.setProperty("webdriver.chrome.driver", "E:\\Project\\selenium\\src\\test\\resources\\drivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://demo.evershop.io/account/login");
    driver.manage().window().maximize();

    System.out.println("validates the textboxes with empty inputs");
    driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div[1]/input")).sendKeys(" ");
    driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div[1]/input")).sendKeys(" ");
    driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]/button/span")).click();

    System.out.println("verify the error msg");
    boolean verifyErrorMsg =driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div[2]/span")).isDisplayed();
    Assert.assertEquals(verifyErrorMsg,true);

  }

}
