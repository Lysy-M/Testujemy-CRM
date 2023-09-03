package CRMTest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/Cucumber/features", plugin = {"pretty", "html:out.html"}, tags = "@CustomersToTargetList") 
public final class StartCRMTest {

//    @Test
//    @DisplayName("Testy aplikacji CRM")
//    @RepeatedTest(2)
//    public void testGoogleSearch() {
//    }
}
