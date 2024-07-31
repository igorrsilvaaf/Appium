import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class ScreenRealizaCompra {
    private WebDriver driver;

    public ScreenRealizaCompra(RemoteWebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(accessibility = "address-button")
    @iOSXCUITFindBy(accessibility = "NaoHabilitado")
    private WebElement SelecionaEndereco;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Pastelaria da Maria\"]")
    @iOSXCUITFindBy(accessibility = "//android.widget.TextView[@text=\"Pastelaria da Maria\"]")
    private WebElement SelecionaLoja;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(accessibility = "NaoHabilitado")
    private WebElement PermiteLocalizacao;

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"add-item-buttom\"])[1]/android.widget.ImageView")
    @iOSXCUITFindBy(accessibility = "NaoHabilitado")
    private WebElement AddItem;

    @AndroidFindBy(accessibility = "open-cart-button")
    @iOSXCUITFindBy(accessibility = "NaoHabilitado")
    private WebElement OpenCart;

    @AndroidFindBy(accessibility = "confirm-order-button")
    @iOSXCUITFindBy(accessibility = "NaoHabilitado")
    private WebElement ConfirmOrder;

    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[9]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup")
    @iOSXCUITFindBy(accessibility = "NaoHabilitado")
    private WebElement FormaPagamento;

    @AndroidFindBy(accessibility = "do-order-button")
    @iOSXCUITFindBy(accessibility = "NaoHabilitado")
    private WebElement FazerPedido;

    public void realizaCompra() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));

        wait.until(ExpectedConditions.visibilityOf(SelecionaEndereco));
        SelecionaEndereco.click();

        wait.until(ExpectedConditions.visibilityOf(PermiteLocalizacao));
        PermiteLocalizacao.click();

        wait.until(ExpectedConditions.visibilityOf(SelecionaLoja));
        SelecionaLoja.click();

        wait.until(ExpectedConditions.visibilityOf(AddItem));
        AddItem.click();

        wait.until(ExpectedConditions.visibilityOf(OpenCart));
        OpenCart.click();

        wait.until(ExpectedConditions.visibilityOf(ConfirmOrder));
        ConfirmOrder.click();

        wait.until(ExpectedConditions.visibilityOf(FormaPagamento));
        FormaPagamento.click();

        wait.until(ExpectedConditions.visibilityOf(FazerPedido));
        FazerPedido.click();
    }
}