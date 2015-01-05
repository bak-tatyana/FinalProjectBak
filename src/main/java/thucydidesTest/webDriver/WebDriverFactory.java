package thucydidesTest.webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by Tanya on 05.01.2015.
 */
public class WebDriverFactory {
    private static ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<WebDriver>() {
        @Override
        protected WebDriver initialValue() {
            return createWebDriver();
        }
    };

    public static WebDriver getWebDriver() {
        WebDriver webDriver = driverThreadLocal.get();
        if (webDriver == null) {
            webDriver = createWebDriver();
            driverThreadLocal.set(webDriver);
        }
        return webDriver;
    }

    private static WebDriver createWebDriver() {
        WebDriverBrowser browser = WebDriverBrowser.valueOf(getBrowserName());
        System.out.println("I am using - " + browser.name());
        switch (browser) {
            case FIREFOX:
                return new FirefoxDriver();
            case CHROME:
                return new ChromeDriver();
            case HTML_UNIT:
                return new HtmlUnitDriver();
            case IE:
                return new InternetExplorerDriver();
            default:
                return new FirefoxDriver();
        }
    }

    private static String getBrowserName() {
        String browser = System.getProperty("browser");
        if (StringUtils.isEmpty(browser)) {
            browser = "FIREFOX";
        }

        return browser.toUpperCase();
    }

    public static void quit() {
        WebDriver webDriver = driverThreadLocal.get();
        if (webDriver != null) {
            driverThreadLocal.set(null);
            webDriver.quit();
        }
    }
}
