import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ScreenLogin {
    private WebDriver driver;

    public ScreenLogin(RemoteWebDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    // Mapeamento do Android e IOS
    @AndroidFindBy(accessibility = "email")
    @iOSXCUITFindBy(accessibility = "NaoUsar")
    private WebElement inputEmail;

    @AndroidFindBy(accessibility = "password")
    @iOSXCUITFindBy(accessibility = "NaoUsar")
    private WebElement inputPassword;

    @AndroidFindBy(accessibility = "login-button")
    @iOSXCUITFindBy(accessibility = "NaoUsar")
    private WebElement buttonLogin;

    public void realizaLogin() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Espera até que o campo de email esteja visível
        wait.until(ExpectedConditions.visibilityOf(inputEmail));
        inputEmail.sendKeys("teste@teste.com");

        // Espera até que o campo de senha esteja visível
        wait.until(ExpectedConditions.visibilityOf(inputPassword));
        inputPassword.sendKeys("123456");

        // Espera até que o botão de login esteja clicável
        wait.until(ExpectedConditions.elementToBeClickable(buttonLogin));
        buttonLogin.click();
    }
}
