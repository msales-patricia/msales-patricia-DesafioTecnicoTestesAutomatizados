package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PesquisaScene {

    private WebDriver driver;

    @FindBy(css = "#root > div > main > div > div > section > div > div > section > div > div > div:nth-child(45) > div > div.box-footer-plans > div > div:nth-child(2) > div.box-plans-row.flex-dkt > a")
    WebElement selecionarSeguro1;
    @FindBy(css = "#root > div > main > div > div > section > div > div > section > div > div > div:nth-child(45) > div > div.box-footer-plans > div > div:nth-child(2) > div.box-plans-row.flex-dkt > a") WebElement selecionarSeguro43;
    @FindBy(id = "Layer_1") WebElement fecharModal;
    @FindBy(css = "body > div.bGGcZJZR7IsEsQjTbspD-box.bGGcZJZR7IsEsQjTbspD-width-400.bGGcZJZR7IsEsQjTbspD-margin-14.tsG0HQh7bcmTha7pyanx-pos.tsG0HQh7bcmTha7pyanx-h-center.tsG0HQh7bcmTha7pyanx-v-top.tsG0HQh7bcmTha7pyanx-animation-fade-in2 > div.bGGcZJZR7IsEsQjTbspD-content-wrapper > div.bGGcZJZR7IsEsQjTbspD-html-content > div.tsG0HQh7bcmTha7pyanx-button-wrapper > button.tsG0HQh7bcmTha7pyanx-box-btn.tsG0HQh7bcmTha7pyanx-btn-close") WebElement fecharModalQueroNovidades;
    @FindBy(css = "#root > div > main > div > div > section > div > div > section > div > div > div:nth-child(2) > div > div.box-body-plans > div:nth-child(2) > div.box-plans-row.plan > div.names-plans") WebElement getSelecionarSeguro1;
    @FindBy(css = "#root > div > main > div > div > section > div > div > section > div > div > div:nth-child(45) > div > div.box-body-plans > div:nth-child(2) > div.box-plans-row.plan.no-special > div.names-plans") WebElement getSelecionarSeguro43;

    public PesquisaScene(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getSelecionarSeguro1(){
        //Coletar informações do plano selecionado
        String seguro1 = getSelecionarSeguro1.getText();
        return seguro1;

    }

    public String getSelecionarSeguro43(){
        //Coletar informações do plano selecionado
        String seguro43 = getSelecionarSeguro43.getText();
        return seguro43;

    }

    public void selecionarSeguro1(){
        //Selecionar seguro1
        selecionarSeguro1.click();
    }

    public void selecionarSeguro43(){
        //Selecionar seguro43
        selecionarSeguro43.click();
    }

    public void esperaModal(){
        //Definir espera explicita para carregar modais de "Cupom" e "Quero receber mais novidades"
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("\"Layer_1']\"")));
    }

    public void fecharModal(){
        //Fechar modal de "Cupom"
        driver.switchTo().activeElement().click();
        fecharModal.click();
    }

    public void fecharModalQueroNovidades(){
        //Fechar modal de "Quero receber mais novidades"
        driver.switchTo().activeElement().click();
        fecharModalQueroNovidades.click();
    }






}
