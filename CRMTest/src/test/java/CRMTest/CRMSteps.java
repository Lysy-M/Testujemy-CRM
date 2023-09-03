package CRMTest;

import CRMTest.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.pl.Gdy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CRMSteps {

    private static WebDriver driver;

    @Given("The user logs into their account")
    public void theUserLogsIntoTheirAccount() {

        // Inicjalizacja przeglądarki
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        LoginPage loginPage = new LoginPage(driver);
        driver.get("https://crm-testlab.coderslab.pl/");
        loginPage.loginAs("mlysinski@wp.pl", "Likwidator25");
    }

    @When("the user navigates to the {string} module through the path: ALL -> Workflows")
    public void theUserNavigatesToTheModuleThroughThePathALLWorkflows(String arg0) {
        WebElement selectAll = driver.findElement(By.id("grouptab_5"));
        selectAll.click();
        WebElement workFlow = driver.findElement(By.xpath("//*[@id='toolbar']/ul/li[7]/span[2]/ul/li[33]/a"));
        workFlow.click();
    }

    @And("selects the {string} option")
    public void selectsTheOption(String arg0) throws InterruptedException {
        Thread.sleep(1000);
        WebElement createNewWorkFlow = driver.findElement(By.xpath("//*[@id='actionMenuSidebar']/ul/li[1]/a/div[1]/span"));
        createNewWorkFlow.click();
    }

    @And("creates a workflow named {string} and configures it according to the documentation")
    public void createsAWorkflowNamedAndConfiguresItAccordingToTheDocumentation(String arg0) throws InterruptedException {
        Thread.sleep(1000);
        WebElement selectName = driver.findElement(By.xpath("//*[@id='name']"));
        selectName.click();
        selectName.sendKeys("Customers to Target List");
        WebElement WorkFlowModules = driver.findElement(By.id("flow_module"));
        WorkFlowModules.click();
        Thread.sleep(1000);
        WebElement selectElement = driver.findElement(By.xpath("/html/body/div[4]/div/form/div[2]/div[3]/div[2]/div[2]/div/div/div[5]/div[2]/select"));
        Select select = new Select(selectElement);
        select.selectByValue("Accounts");
    }

    @And("saves and activates this workflow")
    public void savesAndActivatesThisWorkflow() {
        WebElement SaveButton = driver.findElement(By.id("SAVE"));
        SaveButton.click();
    }

    //I przechodzi do modułu zawierającego klientów (Customers)
    @And("navigates to the module containing customers")
    public void navigatesToTheModuleContainingCustomers() {
    }

    //Wybiera jednego z klientów i przypisuje go do określonej listy docelowej (Target List).
    @And("selects one of the customers and assigns them to a specific target list")
    public void selectsOneOfTheCustomersAndAssignsThemToASpecificTargetList() {
    }
    //Gdy użytkownik przejdzie do modułu "Workflows"
    @When("the user goes to the {string} module")
    public void theUserGoesToTheModule(String arg0) {
    }
    //Znajduje i otwiera przepływ pracy "Klienci do listy docelowej".
    @And("finds and opens the {string} workflow")
    public void findsAndOpensTheWorkflow(String arg0) {
    }
    //Sprawdza ustawienia przepływu pracy, w szczególności reguły i akcje
    @And("checks the workflow settings, especially rules and actions")
    public void checksTheWorkflowSettingsEspeciallyRulesAndActions() {
    }
    //I przechodzi do modułu z klientami (Customers)
    @And("goes to the module with customers")
    public void goesToTheModuleWithCustomers() {
    }
    //I wybiera klienta, który spełnia warunki przepływu pracy.
    @And("selects a customer who meets the workflow conditions")
    public void selectsACustomerWhoMeetsTheWorkflowConditions() {
    }
}
