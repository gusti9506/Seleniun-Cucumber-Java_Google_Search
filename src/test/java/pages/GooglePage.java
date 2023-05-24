package pages;

import static org.testng.Assert.assertEquals;

public class GooglePage extends BasePage {

    private String writeBar = "//textarea[@id='APjFqb']";
    private String buttonSearch = "//input[@value='Buscar con Google']";
    private String textElement = "//textarea[@value=\"qa automation\"]";

    public GooglePage() { //este constructor lo pide el sistema automatic. al extender de BasePage
        super(driver);    // y tambien te obliga al "super", usa la instancia creada en BasePage cuando
                          // usemos esta "clase"
    }

    public void navigateToGoogle() {
        navigateTo("https://www.google.com//");

 
    }
    public void searchInBar(String textToSearch) {
        wordsToSearch(writeBar, textToSearch);
    }

    public void clickButtonSearch() {
        clickElement(buttonSearch);
    }
    public String validateresults() {
        return textFromElement(textElement);

    }
}

