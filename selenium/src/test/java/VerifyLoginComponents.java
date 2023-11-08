import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class VerifyLoginComponents {

  @Test
  public void verifyLoginComponenets()
  {
    System.setProperty("webdriver.chrome.driver","E:\\Project\\selenium\\src\\test\\resources\\drivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://demo.evershop.io/account/login");
    driver.manage().window().maximize();

    System.out.println("verify user is sucessfully naviagted to login page");
    String expectedURL = "https://demo.evershop.io/account/login";
    String actualURL= driver.getCurrentUrl();
    System.out.println(actualURL);
    Assert.assertEquals(expectedURL,actualURL);

    System.out.println("verify forgot password option is availble on login page")
    boolean isSignUpDisplayed = driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div[2]/div/div/div/a[2]")).isDisplayed();
    Assert.assertEquals(isSignUpDisplayed, true);

    System.out.println("verify singnup option displayed");
    boolean isSignUpDisplayed = driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div[2]/div/div/div/a[1]")).isDisplayed();
    Assert.assertEquals(isForgotPasswordDisplayed, true);
  }

}
