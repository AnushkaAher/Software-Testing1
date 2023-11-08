import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class VerifyAddToCart {

  @Test
  public void verifyAddToCartPage() {
    System.setProperty("webdriver.chrome.driver", "E:\\Project\\selenium\\src\\test\\resources\\drivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://demo.evershop.io/cart");
    driver.manage().window().maximize();

    System.out.println("verify the heading")
    String actualTitle = driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div[2]/div/div[1]/h2")).getText();
    String expectedTitle = "Shopping cart";
    Assert.assertEquals(actualTitle,expectedTitle);

    System.out.println("verify the subheading ")
    String actualTitle1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div[2]/div/div[2]/span")).getText();
    String expectedTitle1 = "Your cart is empty!";
    Assert.assertEquals(actualTitle1,expectedTitle1);


    System.out.println("click on add to cart page");
    driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div[2]/div/div[3]/a/span/span")).click();
    System.out.println("verify user is sucessfully naviagted to home page");
    String expectedURL = "https://demo.evershop.io";
    String actualURL= driver.getCurrentUrl();
    System.out.println(actualURL);
    Assert.assertEquals(expectedURL,actualURL);

  }
}
