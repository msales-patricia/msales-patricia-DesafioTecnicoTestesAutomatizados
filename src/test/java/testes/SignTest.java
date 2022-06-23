package testes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.PedidoFinalizadoScene;
import pages.PedidoScene;
import pages.PesquisaScene;

import java.time.Duration;

import static org.junit.Assert.assertEquals;



public class SignTest {

    private static ChromeDriver driver;

    public PesquisaScene pesquisaScene;
    public PedidoScene pedidoScene;
    public PedidoFinalizadoScene pedidoFinalizadoScene;


    @Before
    public void setUp(){
        //Definindo caminho do Chrome Driver
        System.setProperty("webdriver.chrome.driver", "C:\\Projetos\\New\\TesteDesafioAmoPromo1\\src\\main\\resources\\chromedriver.exe");
        //Chamando/Instanciando navegador do Chrome
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://homolog1.segurospromo.com.br/site/pesquisa/brasil/2022-07-18/2022-07-23");


    }

    @After
    public void tearDown(){
        //Fechar janela
        //driver.close();
    }


    @Test
    public void PedidoViaPix() throws InterruptedException {

        pesquisaScene = new PesquisaScene(driver);
        pedidoScene = new PedidoScene(driver);
        pedidoFinalizadoScene = new PedidoFinalizadoScene(driver);


        //Definir espera explicita para carregar modais de "Cupom" e "Quero receber mais novidades"
        pesquisaScene.esperaModal();
        //Fechar modal de "Cupom"
        pesquisaScene.fecharModal();
        //Fechar modal de "Quero receber mais novidades"
        pesquisaScene.fecharModalQueroNovidades();
        //Definir espera explicita para modal de informar "Email"
        pesquisaScene.esperaModal();
        //Fechar modal de informar "Email"
        pesquisaScene.fecharModal();
        //Validar o plano selecionado
        assertEquals("Travel Assist 15 Brasil +COVID-19", pesquisaScene.getSelecionarSeguro1());
        //Selecionar seguro1
        pesquisaScene.selecionarSeguro1();
        //Informar nome completo segurado1
        pedidoScene.nomeDoSegurado1();
        //Informar data de nascimento segurado1
        pedidoScene.dataNascimentoSegurado1();
        //Informar cpf segurado1
        pedidoScene.cpfSegurado1();
        //Selecionar pagamento via PIX
        pedidoScene.selecionarOptionPix();
        //Copiar Dados do Primeiro Segurado
        pedidoScene.copiarDadosPrimeiroSegurado();
        //Informar nome de contato da compra
        pedidoScene.nomeContatoCompra();
        //Informar email de contato da compra
        pedidoScene.emailContatoCompra();
        //Informar telefone de contato da compra
        pedidoScene.telefoneContatoCompra();
        //Informar cep de contato da compra
        pedidoScene.cepContatoCompra();
        //Informar numero de contato da compra
        pedidoScene.numeroEnderecoContatoCompra();
        //Finalizar compra (Efetuar pagamento)
        pedidoScene.clicarEfetuarPagamento();

        //Validar que o pedido foi confirmado
        assertEquals("Pedido recebido com sucesso!", pedidoFinalizadoScene.pedidoSucesso());
        //Validar que o plano pedido foi confirmado
        assertEquals("Travel Assist 15 Brasil +COVID-19", pedidoFinalizadoScene.planoPedidoSucesso());
        //Validar que o nome do cliente esta no pedido confirmado
        assertEquals("Débora Maria Assis", pedidoFinalizadoScene.nomePedidoSucesso());
        //Validar que o cpf do cliente esta no pedido confirmado
        assertEquals("62078476366", pedidoFinalizadoScene.cpfPedidoSucesso());

    }


    @Test
    public void PedidoViaCartao() throws InterruptedException {

        pesquisaScene = new PesquisaScene(driver);
        pedidoScene = new PedidoScene(driver);
        pedidoFinalizadoScene = new PedidoFinalizadoScene(driver);


        //Definir espera explicita para carregar modais de "Cupom" e "Quero receber mais novidades"
        pesquisaScene.esperaModal();
        //Fechar modal de "Cupom"
        pesquisaScene.fecharModal();
        //Fechar modal de "Quero receber mais novidades"
        pesquisaScene.fecharModalQueroNovidades();
        //Definir espera explicita para modal de informar "Email"
        pesquisaScene.esperaModal();
        //Fechar modal de informar "Email"
        pesquisaScene.fecharModal();
        //Validar o plano selecionado
        assertEquals("Travel Assist 15 Brasil +COVID-19", pesquisaScene.getSelecionarSeguro1());
        //Selecionar seguro1
        pesquisaScene.selecionarSeguro1();
        //Informar nome completo segurado1
        pedidoScene.nomeDoSegurado1();
        //Informar data de nascimento segurado1
        pedidoScene.dataNascimentoSegurado1();
        //Informar cpf segurado1
        pedidoScene.cpfSegurado1();
        //Selecionar pagamento via CARTAO
        pedidoScene.selecionarOptionCartao();
        //Selecionar operadora do CARTAO
        pedidoScene.selecionarOptionOperadoraCartao();
        //Informar numero do cartao / Mastercard
        pedidoScene.numeroCartaoCompra();
        //Informar nome conforme cartao / Mastercard
        pedidoScene.nomeClienteCartaoCompra();
        //Informar cpf conforme cartao / Mastercard
        pedidoScene.cpfClienteCartaoCompra();
        //Informar mes de validade do cartao / Mastercard
        pedidoScene.mesValidadeCartaoCompra();
        //Informar ano de validade do cartao / Mastercard
        pedidoScene.anoValidadeCartaoCompra();
        //Informar cvv cartao / Mastercard
        pedidoScene.cvvCartaoCompra();
        //Informar nome de contato da compra
        pedidoScene.nomeContatoCompra();
        //Informar email de contato da compra
        pedidoScene.emailContatoCompra();
        //Informar telefone de contato da compra
        pedidoScene.telefoneContatoCompra();
        //Informar cep de contato da compra
        pedidoScene.cepContatoCompra();
        //Informar numero de contato da compra
        pedidoScene.numeroEnderecoContatoCompra();
        //Finalizar compra (Efetuar pagamento)
        pedidoScene.clicarEfetuarPagamento();

        //Validar que o pedido foi confirmado
        assertEquals("Pedido recebido com sucesso!", pedidoFinalizadoScene.pedidoSucesso());
        //Validar que o plano pedido foi confirmado
        assertEquals("Travel Assist 15 Brasil +COVID-19", pedidoFinalizadoScene.planoPedidoSucesso());
        //Validar que o nome do cliente esta no pedido confirmado
        assertEquals("Débora Maria Assis", pedidoFinalizadoScene.nomePedidoSucesso());
        //Validar que o cpf do cliente esta no pedido confirmado
        assertEquals("62078476366", pedidoFinalizadoScene.cpfPedidoSucesso());

    }


    @Test
    public void SelecionarUltimoItemLista() throws InterruptedException {

        pesquisaScene = new PesquisaScene(driver);
        pedidoScene = new PedidoScene(driver);
        pedidoFinalizadoScene = new PedidoFinalizadoScene(driver);


        //Definir espera explicita para carregar modais de "Cupom" e "Quero receber mais novidades"
        pesquisaScene.esperaModal();
        //Fechar modal de "Cupom"
        pesquisaScene.fecharModal();
        //Fechar modal de "Quero receber mais novidades"
        pesquisaScene.fecharModalQueroNovidades();
        //Definir espera explicita para modal de informar "Email"
        pesquisaScene.esperaModal();
        //Fechar modal de informar "Email"
        pesquisaScene.fecharModal();
        //Fazer scroll até o final da página
        pedidoScene.scroll();
        //Validar o plano selecionado
        assertEquals("Intermac 60 Brasil 64+", pesquisaScene.getSelecionarSeguro43());
        //Selecionar seguro43
        pesquisaScene.selecionarSeguro43();
        //Informar nome completo segurado1
        pedidoScene.nomeDoSegurado1();
        //Informar data de nascimento segurado1
        pedidoScene.dataNascimentoSegurado43();
        //Informar cpf segurado1
        pedidoScene.cpfSegurado1();
        //Selecionar pagamento via BOLETO
        pedidoScene.selecionarOptionBoleto();
        //Copiar Dados do Primeiro Segurado
        pedidoScene.copiarDadosPrimeiroSegurado();
        //Informar nome de contato da compra
        pedidoScene.nomeContatoCompra();
        //Informar email de contato da compra
        pedidoScene.emailContatoCompra();
        //Informar telefone de contato da compra
        pedidoScene.telefoneContatoCompra();
        //Informar cep de contato da compra
        pedidoScene.cepContatoCompra();
        //Informar numero de contato da compra
        pedidoScene.numeroEnderecoContatoCompra();
        //Finalizar compra (Efetuar pagamento)
        pedidoScene.clicarEfetuarPagamento();

        //Validar que o pedido foi confirmado
        assertEquals("Pedido recebido com sucesso!", pedidoFinalizadoScene.pedidoSucesso());
        //Validar que o plano pedido foi confirmado
        assertEquals("Travel Assist 15 Brasil +COVID-19", pedidoFinalizadoScene.planoPedidoSucesso());
        //Validar que o nome do cliente esta no pedido confirmado
        assertEquals("Débora Maria Assis", pedidoFinalizadoScene.nomePedidoSucesso());
        //Validar que o cpf do cliente esta no pedido confirmado
        assertEquals("62078476366", pedidoFinalizadoScene.cpfPedidoSucesso());

    }


    @Test
    public void InserirCupomDesconto() throws InterruptedException {

        pesquisaScene = new PesquisaScene(driver);
        pedidoScene = new PedidoScene(driver);
        pedidoFinalizadoScene = new PedidoFinalizadoScene(driver);


        //Definir espera explicita para carregar modais de "Cupom" e "Quero receber mais novidades"
        pesquisaScene.esperaModal();
        //Fechar modal de "Cupom"
        pesquisaScene.fecharModal();
        //Fechar modal de "Quero receber mais novidades"
        pesquisaScene.fecharModalQueroNovidades();
        //Definir espera explicita para modal de informar "Email"
        pesquisaScene.esperaModal();
        //Fechar modal de informar "Email"
        pesquisaScene.fecharModal();
        //Fazer scroll até o final da página
        pedidoScene.scroll();
        //Validar o plano selecionado
        assertEquals("Intermac 60 Brasil 64+", pesquisaScene.getSelecionarSeguro43());
        //Selecionar seguro43
        pesquisaScene.selecionarSeguro43();
        //Informar nome completo segurado1
        pedidoScene.nomeDoSegurado1();
        //Informar data de nascimento segurado1
        pedidoScene.dataNascimentoSegurado43();
        //Informar cpf segurado1
        pedidoScene.cpfSegurado1();
        //Selecionar pagamento via BOLETO
        pedidoScene.selecionarOptionBoleto();
        //Copiar Dados do Primeiro Segurado
        pedidoScene.copiarDadosPrimeiroSegurado();
        //Informar nome de contato da compra
        pedidoScene.nomeContatoCompra();
        //Informar email de contato da compra
        pedidoScene.emailContatoCompra();
        //Informar telefone de contato da compra
        pedidoScene.telefoneContatoCompra();
        //Informar cep de contato da compra
        pedidoScene.cepContatoCompra();
        //Informar numero de contato da compra
        pedidoScene.numeroEnderecoContatoCompra();
        //Informar codigo de cupom da compra
        pedidoScene.codigoCupomCompra();
        //Clicar em "Aplicar" cupom da compra
        pedidoScene.aplicarCupom();
        //Validar tooltip de erro Cupom Invalido
        assertEquals("Erro: Cupom Inválido ou expirado", pedidoScene.tooltipErroCupom());
        //Finalizar compra (Efetuar pagamento)
        pedidoScene.clicarEfetuarPagamento();

        //Validar que o pedido foi confirmado
        assertEquals("Pedido recebido com sucesso!", pedidoFinalizadoScene.pedidoSucesso());
        //Validar que o plano pedido foi confirmado
        assertEquals("Travel Assist 15 Brasil +COVID-19", pedidoFinalizadoScene.planoPedidoSucesso());
        //Validar que o nome do cliente esta no pedido confirmado
        assertEquals("Débora Maria Assis", pedidoFinalizadoScene.nomePedidoSucesso());
        //Validar que o cpf do cliente esta no pedido confirmado
        assertEquals("62078476366", pedidoFinalizadoScene.cpfPedidoSucesso());

    }

    }
