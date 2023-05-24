package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GooglePage;

import static org.testng.Assert.assertEquals;

public class GoogleSteps {
    private String textToSearch = "qa automation";
    GooglePage google = new GooglePage();
    @Given("^The user is located on google.com$")
    public void ubicado_en_google() {
        google.navigateToGoogle();

    }

    @When("^The user try to search for qa automation$")
    public void intenta_buscar_qa_automation() {
         google.searchInBar(textToSearch);
    }

    @And("^The user clicks on the button 'Search in Google'$")
    public void hace_click_en_boton_busqueda() {
        google.clickButtonSearch();
    }

    @Then("^It should show the related search$")
    public void deberia_mostrarme_la_busqueda_relacionada() {
        try {
            assertEquals("qa automation", google.validateresults());
            System.out.println("******* Test Aprobado!!! ******");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}


