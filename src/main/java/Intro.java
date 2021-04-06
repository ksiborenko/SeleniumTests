import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Intro {


    @BeforeClass
    public static void setup() {
        WebDriverManager.edgedriver().setup();
    }

    @Test
    public void all() {
        hero();
        example();
        first();
    }

    @Test
    public void hero() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com");
        driver.quit();

    }

    @Test
    public void example() {
        WebDriver driver = new EdgeDriver();
        driver.get("http://example.cypress.io");
        driver.quit();
    }

    @Test
    public void first() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://react-shopping-cart-67954.firebaseapp.com");
        driver.quit();
    }
}
