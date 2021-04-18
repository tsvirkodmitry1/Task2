import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class LoginPwa {
    WebDriver driver;

    @BeforeTest

    public void preCondition() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src\\chromedriver.exe.exe");
        driver = new ChromeDriver();
        driver.get("https://...prowritingaid.com/");//Ask me for the details
    }
    @Test
    public void loginPwa() throws InterruptedException
    {
        //login and logoff testing
        driver.findElement(By.xpath("//a[@href=\"/en/Account/Login2\"]")).click();
        driver.findElement(By.xpath("//input[@name=\"UserName\"]")).sendKeys("alex.com");
        driver.findElement(By.xpath("//input[@name=\"Password\"]")).sendKeys("password");
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        Thread.sleep(2500);
        Assert.assertTrue(driver.getCurrentUrl().contains("https://develop.prowritingaid.com/Premium"));
        Thread.sleep(2500);
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div[1]/div/ul/li[12]/a")).isDisplayed());
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div[1]/div/ul/li[13]/a")).click();
        Thread.sleep(1500);
        Assert.assertTrue(driver.getCurrentUrl().contains("https://develop.prowritingaid.com/"));
        driver.findElement(By.xpath("//a[@href=\"/en/Account/Login2\"]")).click();
        driver.findElement(By.xpath("//input[@name=\"UserName\"]")).sendKeys("alex.com");
        driver.findElement(By.xpath("//input[@name=\"Password\"]")).sendKeys("password");
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        Thread.sleep(2500);
        Assert.assertTrue(driver.getCurrentUrl().contains("https://develop.prowritingaid.com/Premium"));
        Thread.sleep(2500);
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div[1]/div/ul/li[12]/a")).isDisplayed());
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div[1]/div/ul/li[13]/a")).click();
        Thread.sleep(1500);
        Assert.assertTrue(driver.getCurrentUrl().contains("https://develop.prowritingaid.com/"));
        driver.findElement(By.xpath("//a[@href=\"/en/Account/Login2\"]")).click();
        driver.findElement(By.xpath("//input[@name=\"UserName\"]")).sendKeys("alex.com");
        driver.findElement(By.xpath("//input[@name=\"Password\"]")).sendKeys("password");
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        Thread.sleep(2500);
        Assert.assertTrue(driver.getCurrentUrl().contains("https://develop.prowritingaid.com/Premium"));
        Thread.sleep(2500);
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div[1]/div/ul/li[12]/a")).isDisplayed());
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div[1]/div/ul/li[13]/a")).click();
        Thread.sleep(1500);
        Assert.assertTrue(driver.getCurrentUrl().contains("https://develop.prowritingaid.com/"));


    }

    @AfterTest
    public void postTest() {
        driver.quit();
    }
}
