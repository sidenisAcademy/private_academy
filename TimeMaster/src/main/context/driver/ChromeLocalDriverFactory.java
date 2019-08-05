package context.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

class ChromeLocalDriverFactory implements MvcDriverFactory {

    @Override
    public WebDriver create() {
        ChromeOptions options = new ChromeOptions();
        return new ChromeDriver(options);
    }

    public WebDriver createWithoutHead() {
        ChromeOptions options = new ChromeOptions();

        if (System.getProperty("HEADLESS_MODE").equals("true"))
            options.addArguments("--headless");

        return new ChromeDriver(options);
    }
}
