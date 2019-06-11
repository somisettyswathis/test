package AutomationScripts;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import com.sun.tools.javac.util.Assert;
import org.openqa.selenium.JavascriptExecutor;

public class TestCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  WebDriver driver= new ChromeDriver();
	
	}
//To Rgister with new user
    public static void Register(WebDriver driver) 
    {
driver.navigate().to("http://automationpractice.com/index.php");
driver.manage().window().maximize();
driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
JavascriptExecutor jsx = (JavascriptExecutor)driver;
jsx.executeScript("window.scrollBy(0,250)", "");
driver.findElement(By.id("email_create")).sendKeys("ssgmail@gmail.com");
driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span/i")).click();
driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
driver.findElement(By.id("customer_firstname")).sendKeys("ssgmail");
driver.findElement(By.id("customer_lastname")).sendKeys("ssgmail");
driver.findElement(By.id("passwd")).sendKeys("ssgmail@gmail.com");
driver.findElement(By.id("firstname")).sendKeys("ssgmail");
driver.findElement(By.id("lastname")).sendKeys("ssgmail");
driver.findElement(By.id("address1")).sendKeys("ssgmail");
driver.findElement(By.id("city")).sendKeys("city");
new Select (driver.findElement(By.id("id_state"))).selectByIndex(2);
driver.findElement(By.id("postcode")).sendKeys("123456");
driver.findElement(By.id("phone_mobile")).sendKeys("8765345622");
driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span")).click();
driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
    
    // verify the sign In with newly Created User
public static void SignIN(WebDriver driver)
{
	driver.navigate().to("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	driver.findElement(By.id("email")).sendKeys("ssgmail@gmail.com");
	driver.findElement(By.id("passwd")).sendKeys("ssgmail@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
}

//Add an item to a cart and verify

public static void AddCart(WebDriver driver)
{
	driver.navigate().to("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[1]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	JavascriptExecutor jsx = (JavascriptExecutor)driver;
	jsx.executeScript("window.scrollBy(0,450)", "");
	Actions action = new Actions(driver);
	WebElement we = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img"));
	action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]/span"))).click().build().perform();
  String SelectedItem= driver.findElement(By.xpath("//*[@id=\"layer_cart_product_title\"]")).getText();
driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")).click();
String CartItem= driver.findElement(By.xpath("//*[@id=\"product_1_1_0_182560\"]/td[2]/p/a")).getText();
Assert.assertEquals(SelectedItem,CartItem);
		  
}






	}

}
