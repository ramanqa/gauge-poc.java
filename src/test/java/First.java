import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class First {

    WebDriver wd;

    @Step("run me")
    public void addItemToTheBasket() {
        wd = new ChromeDriver();
        wd.get("http://www.google.com");
    }

    @Step("run me too")
    public void runMeToo(){
        wd.get("http://www.qainfotech.com");
        wd.quit();
    }
}
