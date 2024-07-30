import io.appium.java_client.android.AndroidDriver;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class LoginTest {

    private static ScreenLogin testScreenLogin;

    @BeforeClass
    public static void caps() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("app", "E:/MEGA/Cursos/QAZando/Appium/QAFood_app_release.apk");
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("automationName", "UiAutomator2");
        RemoteWebDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), capabilities);
        testScreenLogin = new ScreenLogin(driver);
    }

    @Test
    public void testLogin() throws InterruptedException {
        testScreenLogin.realizaLogin();
    }
}