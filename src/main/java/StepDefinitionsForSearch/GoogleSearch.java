package StepDefinitionsForSearch;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//import java.time.Duration;

public class GoogleSearch {
    WebDriver driver=null;
    @Given("Browser is open")
    public void browserIsOpen()  {
        System.out.println("Inside Step - Browser is open!");
        String projectPath=System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/Driver/chromedriver.exe");
        driver=new ChromeDriver();
//        driver.wait(40000);
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofDays(40));
        driver.manage().window().fullscreen();
    }

    @And("user is on google search page")
    public void userIsOnGoogleSearchPage() {
        System.out.println("Inside step- user is on google search page");
        driver.navigate().to("https://google.com");
    }

    @When("user enters text in the search field")
    public void userEntersInTheSearchField() {
        System.out.println("user enters text in the search field");
        driver.findElement(By.name("q")).sendKeys("Bangladesh");

    }

    @And("Hit enter")
    public void hitEnter() throws InterruptedException {
        System.out.println(" Hit enter");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        Thread.sleep(4000);
    }

    @Then("user will be navigated to search result page")
    public void userWillBeNavigatedToSearchResultPage() throws InterruptedException {
        System.out.println("user will be navigated to search result page");
        driver.getPageSource().contains("Bangla");
        Thread.sleep(4000);
        driver.close();

    }
}