package StepClasses;

import PageObjectModels.ElectronicsPage;
import PageObjectModels.HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class UITestClass {

       private static WebDriver driver;
       WebDriverWait wait ;
       HomePage homePage ;
       ElectronicsPage electronicsPage;

        public void openBrowser() throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\b.juneja\\Selenium-Webdriver\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();

        }

        public void openSite(String site) {
            driver.get(site);
        }

        public void navigate_to_home_page_and_choose_electronics(){
            wait= new WebDriverWait(driver, Duration.ofSeconds(45));
            homePage = new HomePage(driver, wait);
            electronicsPage=homePage.clickElectronics();
        }

        public void headphones_should_be_listed_Top_Selling_Electronics(){
            electronicsPage.verify_headphones_should_be_listed_Top_Selling_Electronics();
        }

        public void close_the_browser(){
            driver.quit();
        }


}

