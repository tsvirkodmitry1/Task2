import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CoviScaleTest {

        WebDriver driver;

        @BeforeTest

        public void preCondition(){
            System.setProperty("webdriver.chrome.driver", "src\\chromedriver.exe.exe");
            driver = new ChromeDriver();
            driver.get("https://medsoftpro.ru/");
        }


        @Test
        public void coviScaleTest() throws InterruptedException
        {
            //searchsubmit testing
            Thread.sleep(1500);
            driver.findElement(By.xpath("//*[@id=\"button_confirm\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"mod-search-searchword\"]")).sendKeys("кови");
            driver.findElement(By.xpath("//*[@id=\"searchsubmit\"]/i")).click();
            driver.findElement(By.xpath("//*[@id=\"article-body\"]/div/div[2]/dl/dt[1]/a")).click();
            driver.findElement(By.xpath("//*[@id=\"covy_question_1_ans_5\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"covy_question_2_ans_4\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"covy_question_3_ans_2\"]")).click();
            Assert.assertTrue(driver.getCurrentUrl().contains("https://medsoftpro.ru/kalkulyatory/covy-scale.html"));
            Assert.assertFalse(driver.findElement(By.xpath("//*[@id=\"covy_result_test\"]/div")).getText().equalsIgnoreCase("Набрано 8 баллов. Тревожное состояние"));
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"article-body\"]/div[2]/div[2]/div[4]/div[2]/div[2]/fieldset/div[5]/button")).click();


        }

        @AfterTest
        public void postTest() {
            driver.close();
        }


    }

