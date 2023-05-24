package pages;

import static org.testng.Assert.assertEquals;

public class GooglePage extends BasePage {

    private String writeBar = "//textarea[@id='APjFqb']";
    private String buttonSearch = "//input[@value='Buscar con Google']";
    private String textElement = "//textarea[@value=\"qa automation\"]";

    public GooglePage() {
        super(driver);    
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

