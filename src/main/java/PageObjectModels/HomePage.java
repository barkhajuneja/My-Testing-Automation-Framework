package PageObjectModels;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    WebDriver driver;
    WebDriverWait wait;
    ElectronicsPage electronicsPage;

   public HomePage(WebDriver driver, WebDriverWait wait){
       this.driver = driver;
       this.wait = wait;
       PageFactory.initElements(driver, this);
   }


     @FindBy(xpath ="//li[@class='hl-cat-nav__js-tab']/a[contains(text(),'Electronics')]")
    WebElement Electronics;


    public ElectronicsPage clickElectronics(){
        Electronics.click();
        electronicsPage = new ElectronicsPage(driver, wait);
        return electronicsPage;
    }
}
