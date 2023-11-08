import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class VerifyForgotPassword {

  @Test
  public void verifyForgotPasswordPage() {
    System.setProperty("webdriver.chrome.driver", "E:\\Project\\selenium\\src\\test\\resources\\drivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://demo.evershop.io/account/reset-password");
    driver.manage().window().maximize();

    System.out.println("validate the label of the reset password")
    String resetLabel = driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div[2]/div/div/h1")).getText();
    String expectedLabel = "Enter your email address";
    Assert.assertEquals(resetLabel,expectedLabel);

    System.out.println("Enter the data invalid email address to text field");
    driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div[2]/div/div/h1")).sendKeys("stqa12");
    System.out.println("when the invalid email is entered we should get popup error msg");
    boolean invalidEmailError = driver.findElement(By.xpath("//*[@id=\"resetPasswordForm\"]/div[1]/div[2]/span")).isDisplayed();
    Assert.assertEquals(invalidEmailError, true);

    System.out.println("verify user is able to reset password when valid email is entered");
    driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div[2]/div/div/h1")).sendKeys("anushkaaher946@gmail.com");
    driver.findElement(By.xpath("//*[@id=\"resetPasswordForm\"]/div[2]/button/span")).click();

    System.out.println("verify after valid email input the user get sucessful password link recieved message");
    boolean resetPasswordSucessMsg = driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div[2]/div/div/p")).isDisplayed();
    Assert.assertEquals(resetPasswordSucessMsg, true);


  }
}
