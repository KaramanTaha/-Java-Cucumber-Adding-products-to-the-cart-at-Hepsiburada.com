package HepsiStepDefinitions;

import HepsiPages.HepsiburadaPages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import util.DriverFactory;

public class HepsiStepDef {
    WebDriver driver = DriverFactory.getDriver();
    HepsiburadaPages hepsiburadaPages = new HepsiburadaPages(driver);
    @Given(": User is on homepage")
    public void userIsOnHomepage() {
    }

    @When(": Click accept cookies")
    public void clickAcceptCookies() {
        HepsiburadaPages.acceptCookies();
    }



    @When(": Click the search box")
    public void clickTheSearchBox() {
        HepsiburadaPages.searchBox();
    }

    @When(": Type {string} in the search box")
    public void typeInTheSearchBox(String arg0) {
        HepsiburadaPages.fillTheSearchBox();
    }

    @When(": Click the search button")
    public void clickTheSearchButton() {
        HepsiburadaPages.searchButton();
    }

    @When(": Filter the seller as Hepsiburada")
    public void filterTheSellerAsHepsiburada() {
        HepsiburadaPages.sellerFilter();
    }

    @When(": Click the Sort by button")
    public void clickTheSortByButton() {
        HepsiburadaPages.clickSortBy();
    }

    @When(": Apply the Sort by ascending price filter")
    public void applyTheSortByAscendingPriceFilter() {
        HepsiburadaPages.theSortBy();
    }

    @When(": Click on the first product")
    public void clickOnTheFirstProduct() {
        HepsiburadaPages.firstProduct();
    }

    @When(": Click Black from the color options")
    public void clickBlackFromTheColorOptions() {
        HepsiburadaPages.colorOptions();
    }

    @When(": Click Other Sellers")
    public void clickOtherSellers() {
        HepsiburadaPages.otherSellers();
    }

    @When(": Click on the seller of Hepsiburada")
    public void clickOnTheSellerOfHepsiburada() {
        HepsiburadaPages.otherSellerFilter();
    }

    @When(": Click the add to cart button")
    public void clickTheAddToCartButton() {
        HepsiburadaPages.addToCart();
    }

    @When(": Close the popUp that opens")
    public void closeThePopUpThatOpens() {
        HepsiburadaPages.closePopUp();
    }

    @When(": Click the My Bag button")
    public void clickTheMyBagButton() {
        HepsiburadaPages.myBag();
    }

    @Then(": Check the product in the cart")
    public void checkTheProductInTheCar() {
        HepsiburadaPages.productCheck();
    }

}
