import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class CheckedNicotine {
        WebDriver driver;

        @BeforeTest

        public void preCondition(){
            System.setProperty("webdriver.chrome.driver", "src\\chromedriver.exe.exe");
            driver = new ChromeDriver();
            driver.get("https://medsoftpro.ru/");
        }


        @Test
        public void checkedNicotine() throws InterruptedException {
            //nicotine addiction testing
            driver.findElement(By.xpath("//*[@id=\"navbarTogglerDemo01\"]/ul/li[3]/a")).click();
            driver.findElement(By.xpath("//*[@id=\"button_confirm\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"all-calcs\"]/div[1]/div[11]/a/div/div[2]/div")).click();
            driver.findElement(By.xpath("//*[@id=\"fager_question_1_ans_2\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"fager_question_2_ans_2\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"fager_question_3_ans_1\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"fager_question_4_ans_3\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"fager_question_5_ans_1\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"fager_question_6_ans_2\"]")).click();
            Assert.assertTrue(driver.getCurrentUrl().contains("https://medsoftpro.ru/kalkulyatory/nicotin-calc.html"));
            Assert.assertFalse(driver.findElement(By.xpath("//*[@id=\"fager_result_test\"]/div")).getText().equalsIgnoreCase("Набрано 6 баллов. Высокая зависимость. При решении прекратить курение резкий отказ от курения может вызвать неприятные ощущения в организме. Справиться с ними помогут препараты замещения никотина."));
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"article-body\"]/div[2]/div[2]/div[4]/div[2]/div[2]/fieldset/div[8]/button")).click();


        }

        @AfterTest
        public void postTest() {
            driver.close();
        }


}
