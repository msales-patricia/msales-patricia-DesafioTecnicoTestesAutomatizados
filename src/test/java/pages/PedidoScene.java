package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PedidoScene {

    private WebDriver driver;

    @FindBy(css = "#root > div > main > div.comp_main.clearfixs > section > div.component.component-pagamento > div > div.card-segurados > div > div.body-box-item > div > form > div > div:nth-child(1) > input[type=text]")
    WebElement nomeDoSegurado1;
    @FindBy(name = "birth_date") WebElement dataNascimentoSegurado1;
    @FindBy(name = "birth_date") WebElement dataNascimentoSegurado43;
    @FindBy(name = "cpf") WebElement cpfSegurado1;
    @FindBy(id = "pix") WebElement selecionarOptionPix;
    @FindBy(id = "cartao-credito") WebElement selecionarOptionCartao;
    @FindBy(id = "card2") WebElement selecionarOptionOperadoraCartao;
    @FindBy(id = "cc-number") WebElement numeroCartaoCompra;
    @FindBy(id = "cc-holder-name") WebElement nomeClienteCartaoCompra;
    @FindBy(id = "cc-holder-cpf") WebElement cpfClienteCartaoCompra;
    @FindBy(id = "cc-expiry-month") WebElement mesValidadeCartaoCompra;
    @FindBy(id = "cc-expiry-year") WebElement anoValidadeCartaoCompra;
    @FindBy(id = "cc-verfication-code") WebElement cvvCartaoCompra;
    @FindBy(id = "radio9") WebElement selecionarOptionQuantidadeParcelas;
    @FindBy(id = "boleto") WebElement selecionarOptionBoleto;
    @FindBy(css = "#root > div > main > div.comp_main.clearfixs > section > div.component.component-pagamento > div > div.card-forma-pagamento > div > div.body-box-item > div.area-forma-pagamento > div > button") WebElement copiarDadosPrimeiroSegurado;
    @FindBy(name = "contact_name") WebElement nomeContatoCompra;
    @FindBy(name = "email") WebElement emailContatoCompra;
    @FindBy(name = "phone_number") WebElement telefoneContatoCompra;
    @FindBy(name = "cep") WebElement cepContatoCompra;
    @FindBy(css = "#root > div > main > div.comp_main.clearfixs > section > div.component.component-pagamento > div > div.card-contato-compra > div > div.body-box-item > form > div:nth-child(2) > div.grupo-campo.gnumero > input[type=text]") WebElement numeroEnderecoContatoCompra;
    @FindBy(xpath = "//div[@class='confirm-purchase']/button[.='Efetuar pagamento']")
    WebElement efetuarPagamento;
    @FindBy(id = "cupom") WebElement codigoCupomCompra;
    @FindBy(css = "#root > div > main > div.comp_main.clearfixs > section > div.component.component-description > div > div.item-1 > div.box.box-coupon > form > button") WebElement aplicarCupom;
    @FindBy(css = "#root > div > main > div.comp_main.clearfixs > section > div.component.component-description > div > div.item-1 > div.box.box-coupon > form > span.custom-tooltip > b") WebElement tooltipErroCupom;

    public PedidoScene(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void nomeDoSegurado1(){
        //Informar nome completo segurado1
        nomeDoSegurado1.sendKeys("Raimundo Benedito Sales");
    }

    public void dataNascimentoSegurado1(){
        //Informar data de nascimento segurado1
        dataNascimentoSegurado1.sendKeys("20031986");
    }

    public void dataNascimentoSegurado43(){
        //Informar data de nascimento segurado43
        dataNascimentoSegurado43.sendKeys("06011946");
    }

    public void cpfSegurado1(){
        //Informar cpf segurado1
        cpfSegurado1.sendKeys("44443890360");
    }

    public void selecionarOptionPix(){
        //Selecionar pagamento via PIX
        if (false)
            selecionarOptionPix.isSelected();
        else selecionarOptionPix.click();
    }

    public void selecionarOptionCartao(){
        //Selecionar pagamento via Cartao
        if (false)
            selecionarOptionCartao.isSelected();
        else selecionarOptionCartao.click();
    }

    public void selecionarOptionOperadoraCartao(){
        //Selecionar operadora do Cartao / Mastercard
        if (false)
            selecionarOptionOperadoraCartao.isSelected();
        else selecionarOptionOperadoraCartao.click();
    }

    public void numeroCartaoCompra(){
        //Informar numero do cartao / Mastercard
        numeroCartaoCompra.sendKeys("5198 3364 7031 0573");
    }

    public void nomeClienteCartaoCompra(){
        //Informar nome conforme cartao / Mastercard
        nomeClienteCartaoCompra.sendKeys("Raimundo Benedito Sales");
    }

    public void cpfClienteCartaoCompra(){
        //Informar cpf conforme cartao / Mastercard
        cpfClienteCartaoCompra.sendKeys("44443890360");
    }

    public void mesValidadeCartaoCompra(){
        //Informar mes de validade do cartao / Mastercard
        Select month = new Select(driver.findElement(By.id("cc-expiry-month")));
        month.selectByVisibleText("06");

    }

    public void anoValidadeCartaoCompra(){
        //Informar ano de validade do cartao / Mastercard
        Select year = new Select(driver.findElement(By.id("cc-expiry-year")));
        year.selectByVisibleText("2023");

    }

    public void cvvCartaoCompra(){
        //Informar cvv cartao / Mastercard
        cvvCartaoCompra.sendKeys("152");
    }

    public void selecionarOptionQuantidadeParcelas(){
        //Selecionar quantidade de parcelas
        if (false)
            selecionarOptionQuantidadeParcelas.isSelected();
        else selecionarOptionQuantidadeParcelas.click();
    }

    public void selecionarOptionBoleto(){
        //Selecionar pagamento via PIX
        if (false)
            selecionarOptionBoleto.isSelected();
        else selecionarOptionBoleto.click();
    }


    public void copiarDadosPrimeiroSegurado(){
        //Copiar Dados do Primeiro Segurado
        copiarDadosPrimeiroSegurado.click();
    }

    public void nomeContatoCompra(){
        //Informar nome de contato da compra
        nomeContatoCompra.sendKeys("Raimundo Benedito Sales");
    }

    public void emailContatoCompra(){
        //Informar nome de contato da compra
        emailContatoCompra.sendKeys("raimundobenedito@gmail.com");
    }

    public void telefoneContatoCompra(){

        //Informar nome de contato da compra
        telefoneContatoCompra.sendKeys("88988043095");
    }

    public void cepContatoCompra(){

        //Informar nome de contato da compra
        cepContatoCompra.sendKeys("60710000");
    }

    public void numeroEnderecoContatoCompra(){
        //Informar nome de contato da compra
        numeroEnderecoContatoCompra.sendKeys("749");
    }

    public void codigoCupomCompra(){
        //Informar codigo de cupom da compra
        codigoCupomCompra.sendKeys("AMOPROMO");
    }

    public void aplicarCupom(){
        //Clicar em "Aplicar" cupom da compra
        aplicarCupom.click();
    }

    public String tooltipErroCupom(){
        //Coletar string de erro: cupom invalido

        String tooltipErro = tooltipErroCupom.getText();
        return tooltipErro;
    }

    public void clicarEfetuarPagamento() throws InterruptedException {
        //Finalizar compra (Efetuar pagamento)
        Thread.sleep(500);
        efetuarPagamento.click();

    }

    public void scroll(){
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
    }



}
