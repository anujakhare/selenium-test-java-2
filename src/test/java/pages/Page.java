package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class Page {

    private WebDriver driver = Driver.getDriver();

    public void getUrl(final String url) {
        driver.navigate().to(url);
    }
    public void getInput(final String input){
       driver.findElement(By.id("twotabsearchtextbox")).sendKeys(input);
    }
    public void submitButton(){ driver.findElement(By.xpath("//*[@id=\"nav-search-form\"]/div[2]/div/input")).click(); }
    public void seeResultPage(){
       Assert.assertTrue(driver.getTitle().contains("Amazon.co.uk : book"));
    }

}
