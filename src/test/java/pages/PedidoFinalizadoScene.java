package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PedidoFinalizadoScene {

    private WebDriver driver;

    @FindBy(css = "#root > div > div > div.box.success > div.success-body > h1")
    WebElement pedidoSucesso;
    @FindBy(css = "#root > div > div > div.box.infos-purchase > div > div:nth-child(1) > span") WebElement planoPedidoSucesso;
    @FindBy(css = "#root > div > div > div.box.insureds > div > strong:nth-child(1)") WebElement nomePedidoSucesso;
    @FindBy(css = "#root > div > div > div.box.insureds > div > span") WebElement cpfPedidoSucesso;

    public PedidoFinalizadoScene(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String pedidoSucesso(){
        //Definir espera explicita pela informação de "Pedido recebido com sucesso!"
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(500));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#root > div > div > div.box.success > div.success-body > h1")));
        String pedidoConfirmado = pedidoSucesso.getText();
        return pedidoConfirmado;
    }

    public String planoPedidoSucesso(){
        //Definir variavel para coletar plono do pedido

        String planoConfirmado = planoPedidoSucesso.getText();
        return planoConfirmado;
    }

    public String nomePedidoSucesso(){
        //Definir variavel para coletar o nome do cliente no pedido confirmado

        String nomeConfirmado = nomePedidoSucesso.getText();
        return nomeConfirmado;
    }

    public String cpfPedidoSucesso(){
        //Definir variavel para coletar o cpf do cliente no pedido confirmado

        String cpfConfirmado = cpfPedidoSucesso.getText();
        return cpfConfirmado;
    }
}
