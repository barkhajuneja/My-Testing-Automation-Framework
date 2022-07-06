package PageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElectronicsPage {
    WebDriver driver;
    WebDriverWait wait;

    public ElectronicsPage(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath ="//a[contains(text(),'Headphones') and (@class ='b-textlink b-textlink--parent')]")
    WebElement Headphones;

    public void verify_headphones_should_be_listed_Top_Selling_Electronics(){
        Headphones.click();
    }
}
