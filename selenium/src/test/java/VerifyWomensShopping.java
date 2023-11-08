import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class VerifyWomensShoppingPage {

  @Test
  public void testWomensShoppingPage() {
    System.setProperty("webdriver.chrome.driver", "E:\\Project\\selenium\\src\\test\\resources\\drivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://demo.evershop.io/women");
    driver.manage().window().maximize();

    System.out.println("verify the heading of page");
    String actualText = driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div[2]/div/div/h1")).getText();
    String expectedText = "WOMEN";
    Assert.assertEquals(actualText, expectedText);

    System.out.println("verify is user is sucessfully navigated to mens shopping page");
    String expectedURL = "https://demo.evershop.io/women";
    String actualURL = driver.getCurrentUrl();
    System.out.println(actualURL);
    Assert.assertEquals(expectedURL, actualURL);

    System.out.println("verify colourwise purple filteration of items");
    driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div[3]/div[1]/div/div[3]/ul/li[1]/a/span")).click();
    System.out.println("after applying filter user should see 2 products as purple shoes");
    boolean verifyProductsCount = driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div[3]/div[2]/div[2]/span")).isDisplayed();
    Assert.assertEquals(verifyProductsCount, true);

    System.out.println("now check on more checkbox and see products count is updated");
    driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div[3]/div[1]/div/div[3]/ul/li[2]/a/span")).click();
    System.out.println("after applying filter user should see 6 products as white and black shoes");
    boolean verifyProductsCount2 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div[3]/div[2]/div[2]/span")).isDisplayed();
    Assert.assertEquals(verifyProductsCount2, true);

    System.out.println("verify back navigation");
    driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div[1]/span[1]/a")).click();
    String expectedURL1 = "https://demo.evershop.io/";
    String actualURL1 = driver.getCurrentUrl();
    Assert.assertEquals(expectedURL1, actualURL1);

  }

}
