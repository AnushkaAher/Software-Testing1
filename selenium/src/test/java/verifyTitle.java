import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class verifyTitle {

  @Test
  public void TitleVerification() {
    System.setProperty("webdriver.chrome.driver", "E:\\Project\\selenium\\src\\test\\resources\\drivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://demo.evershop.io/");
    driver.manage().window().maximize();

    System.out.println("fetching the title");
    WebDriverWait wait = new WebDriverWait(driver,60);
    String expectedTitle = "Charka Nurture";
    wait.until(ExpectedConditions.titleContains(expectedTitle));
    String actualTitle = driver.getTitle();

    System.out.println("checkpoint for title verification");
    Assert.assertEquals(expectedTitle, actualTitle)

  }
}
