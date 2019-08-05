package context.driver;

import org.openqa.selenium.WebDriver;

interface MvcDriverFactory {
    WebDriver create();
    WebDriver createWithoutHead();
}

