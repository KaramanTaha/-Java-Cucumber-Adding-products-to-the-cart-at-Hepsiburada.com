package HepsiPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

import java.util.Set;

public class HepsiburadaPages {
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;


    static By cookies = By.cssSelector("#onetrust-accept-btn-handler");
    static By searchBox = By.cssSelector(".desktopOldAutosuggestTheme-UyU36RyhCTcuRs_sXL9b");
    static By fillSearchBox = By.cssSelector(".desktopOldAutosuggestTheme-UyU36RyhCTcuRs_sXL9b");
    static By searchButton = By.xpath("//div[@class='SearchBoxOld-cHxjyU99nxdIaAbGyX7F']");
    static By sellerFilter = By.xpath("//div[contains(text(),'Hepsiburada')]");
    static By theSortByButton = By.xpath("//label[@class='horizontalSortingBar-Ce404X9mUYVCRa5bjV4D']");
    static By theSortBy = By.xpath("//div[contains(text(),'Artan fiyat')]");
    static By firstProduct = By.xpath("//h3[normalize-space()='iPhone 13 128 GB']");
    static By colorOptions = By.xpath("//label[@for='Renk4']");
    static By otherSellers = By.xpath("//a[@class='optionsLength']");
    static By otherSellerFilter = By.xpath("//tbody/tr[11]/td[3]");
    static By addToCart = By.xpath("//button[@id='addToCart']");
    static By closePopUp = By.xpath("//a[@class='checkoutui-Modal-2iZXl']//*[name()='svg']//*[name()='path' and contains(@fill,'#484848')]");
    static By myBag = By.xpath("//span[@id='shoppingCart']");
    static By checkProduct = By.cssSelector("div[class='product_name_3Lh3t'] a");




    public HepsiburadaPages(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }


    public static void acceptCookies() {
        elementHelper.click(cookies);
    }
    public static void searchBox() {
        elementHelper.click(searchBox);
    }
    public static void fillTheSearchBox() {
        elementHelper.sendKey(fillSearchBox,"Iphone 13");
    }
    public static void searchButton() {
        elementHelper.click(searchButton);
    }
    public static void sellerFilter() { driver.navigate().refresh();
        elementHelper.click(sellerFilter);
        driver.navigate().refresh();
    }


    public static void clickSortBy() {
        elementHelper.click(theSortByButton);
    }
    public static void theSortBy() {
        elementHelper.click(theSortBy);
    }
    public static void firstProduct() { elementHelper.click(firstProduct);
    }
    public static void colorOptions() {
        Set<String> windowAllWindows = driver.getWindowHandles();
        for (String window:windowAllWindows){
            driver.switchTo().window(window);
        }
        elementHelper.click(colorOptions);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void otherSellers() {
        elementHelper.click(otherSellers);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void otherSellerFilter() {
        elementHelper.click(otherSellerFilter);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void addToCart() {
        elementHelper.click(addToCart);
    }
    public static void closePopUp() {
        elementHelper.click(closePopUp);
    }
    public static void myBag() {
        elementHelper.click(myBag);
    }
    public static void productCheck() {
        elementHelper.checkVisible(checkProduct);
    }

}
