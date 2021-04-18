import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class OpenedSite {

        WebDriver driver;

        @BeforeTest

        public void preCondition(){
            System.setProperty("webdriver.chrome.driver", "src\\chromedriver.exe.exe");
            driver = new ChromeDriver();
            driver.get("https://medsoftpro.ru/kalkulyatory/vyvedenie-alkogolya.html");
        }


        @Test
        public void openedSite() throws InterruptedException {
            //How long before you can drive if you have drunk 400 ml, 38% alcohol
            driver.findElement(By.id("button_confirm")).click();
            driver.findElement(By.id("weight_alc")).sendKeys("" + 80);
            driver.findElement(By.id("amount_alc")).sendKeys("" + 400);
            driver.findElement(By.id("strength_alc")).sendKeys("" + 38);
            driver.findElement(By.xpath("//*[@id=\"article-body\"]/div[2]/div[2]/div[4]/div[2]/div[2]/div[1]/div[1]/label[1]")).click();
            Thread.sleep(5000);
            Assert.assertTrue(driver.getCurrentUrl().contains("https://medsoftpro.ru/kalkulyatory/vyvedenie-alkogolya.html"));
            Assert.assertFalse(driver.findElement(By.xpath("//*[@id=\"result_alc\"]/div")).getText().equalsIgnoreCase("Количество алкоголя в крови 2.22 промилле (сильная степень опьянения)\n" +
                    "Количество алкоголя в выдыхаемом воздухе 1 мг/л\n" +
                    "Выведение до разрешенного уровня (0.16 мг/л в выдыхаемом воздухе) через 12 ч. 27 мин.\n" +
                    "Полное выведение через 14 ч. 47 мин."));
            driver.findElement(By.xpath("//*[@id=\"article-body\"]/div[2]/div[2]/div[4]/div[2]/div[2]/div[1]/div[6]/button[2]")).click();


        }

    @AfterTest
        public void postTest(){
              driver.close();
        }
}


