import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Search_AddToCart {
    WebDriver driver = new ChromeDriver();
    @Test
    public void AddToCart() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "E:\\Project\\STQA\\STQA\\src\\test\\resources\\drivers\\chromedriver.exe");

        driver.get("https://demo.evershop.io");
        driver.manage().window().maximize();

        WebElement buttonSearch = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[3]/div[1]/a"));
        buttonSearch.click();

        WebElement searchBar = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[3]/div[1]/div/div/div/div/input"));
        searchBar.sendKeys("Nike revolution 5");
        searchBar.sendKeys(Keys.ENTER);

        WebElement addToCart = driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div[3]/div/div[2]/div/div/div[2]/a"));
        addToCart.click();

        WebElement size = driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div[2]/div[2]/div/div[2]/div[2]/div[1]/ul/li[1]"));
        size.click();


        WebElement color = driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div[2]/div[2]/div/div[2]/div[2]/div[2]/ul/li[2]"));
        color.click();


        WebElement addToCartButton = driver.findElement(By.xpath("//*[@id=\"productForm\"]/div/div/div[2]/button"));
        addToCartButton.click();

        driver.quit();

    }
}
