package UIAutomationTests;

import PageObject.*;
import Suporte.Gerador;
import Suporte.Screenshot;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class GroceryCrudTest {

    private WebDriver driver;
    private WebDriverWait wait;
    private LoginPage loginPage;
    private HomePage homePage;
    private CustomerFormPage customerFormPage;
    private ResultPage resultPage;
    private SearchPage searchPage;

    @Before
    public void setUp() {
        driver = Web.openChrome();
        wait = new WebDriverWait(driver, 10);
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        customerFormPage = new CustomerFormPage(driver);
        resultPage = new ResultPage(driver);
        searchPage = new SearchPage(driver);

        // Mudar o valor da combo Select version para “Bootstrap V4 Theme”
        loginPage.switchToBootstrapV4();
    }

    @Test
    public void testCadastroUsuario() throws InterruptedException {
        // Clicar no botão Add Customer
        homePage.clickAddCustomer();

        // Preencher os campos do formulário com dados fakes
        customerFormPage.fillCustomerForm("NTConsult", "Teste", "Emillyy", "92 9999-9999", "Rua Wagner, 1340", "Torre 11", "Manaus", "AM", "69000-000", "Brasil", "200");

        // Clicar no botão Save
        customerFormPage.save();

        // Validar a mensagem
        Thread.sleep(10000L);
        String successMessage = resultPage.getSuccessMessage();
        assertTrue(successMessage.contains("Your data has been successfully stored into the database."));

        Screenshot.tirar(driver, "C:\\Users\\Emilly\\Pictures\\screenshots\\" + Gerador.dataHoraParaArquivo() + "_testCadastroUsuario.png");
    }

    @Test
    public void testDeleteData() throws InterruptedException {
        // Pesquisar pelo nome do cliente
        searchPage.searchCustomer("NTConsult");
        Thread.sleep(10000L);

        // Selecionar todos os resultados
        searchPage.selectAll();

        // Clicar no botão de deletar
        searchPage.clickDelete();

        // Confirmar a exclusão
        searchPage.confirmDelete();

        // Esperar pela mensagem de sucesso e validar
        Thread.sleep(10000L);
        String successMessage = searchPage.getSuccessMessage();
        assertTrue(successMessage.contains("Your data has been successfully deleted from the database."));

        // Tirar screenshot
        Screenshot.tirar(driver, "C:\\Users\\Emilly\\Pictures\\screenshots\\" + Gerador.dataHoraParaArquivo() + "_testDeleteData.png");
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
