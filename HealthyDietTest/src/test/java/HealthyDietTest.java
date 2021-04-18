import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class HealthyDietTest {

        WebDriver driver;

        @BeforeTest

        public void preCondition(){
            System.setProperty("webdriver.chrome.driver", "src\\chromedriver.exe.exe");
            driver = new ChromeDriver();
            driver.get("https://medsoftpro.ru/");
        }


        @Test
        public void HealthyDietTest() throws InterruptedException
        {
            //searchsubmit diet testing
            Thread.sleep(1500);
            driver.findElement(By.xpath("//*[@id=\"button_confirm\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"mod-search-searchword\"]")).sendKeys("правильное питание");
            driver.findElement(By.xpath("//*[@id=\"searchsubmit\"]/i")).click();
            driver.findElement(By.xpath("//*[@id=\"article-body\"]/div/div[2]/dl/dt/a")).click();
            driver.findElement(By.xpath("//*[@id=\"food_question_1_var_3\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"food_question_2_var_3\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"food_question_3_var_1\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"food_question_4_var_3\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"food_question_5_var_2\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"food_question_6_var_3\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"food_question_7_var_1\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"food_question_8_var_3\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"food_question_9_var_2\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"food_question_10_var_2\"]")).click();
            driver.findElement(By.xpath("//button[@onclick=\"handler_test('food')\"]")).click();
            Assert.assertTrue(driver.getCurrentUrl().contains("https://medsoftpro.ru/medical-tests/proper-nutrition.html"));
           // Assert.assertFalse(driver.findElement(By.xpath("//*[@id=\"food_result_test\"]/div")).getText().equalsIgnoreCase("1Набрано 27 баллов. Пришла пора задуматься над тем, чтобы начать менять свои привычки, потому что, судя по всему, вы не очень заботитесь о том, как едите. В качестве первых шагов старайтесь не садиться за стол, когда очень устали или раздражены. Такой прием пищи не пойдет впрок. Не ешьте наскоро, это позволит вам не переедать. Возьмите себе за правило, минимум дважды в день не пренебрегать горячей пищей."));

            Thread.sleep(3000);
            driver.findElement(By.xpath("//button[@onclick=\"handler_clear_test('food')\"]")).click();


        }

        @AfterTest
        public void postTest() {
            driver.close();
        }



}
