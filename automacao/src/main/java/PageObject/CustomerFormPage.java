package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerFormPage {
    private WebDriver driver;

    private By customerName = By.name("customerName");
    private By contactLastName = By.name("contactLastName");
    private By contactFirstName = By.name("contactFirstName");
    private By phone = By.name("phone");
    private By addressLine1 = By.name("addressLine1");
    private By addressLine2 = By.name("addressLine2");
    private By city = By.name("city");
    private By state = By.name("state");
    private By postalCode = By.name("postalCode");
    private By country = By.name("country");
    private By salesRepEmployeeNumber = By.id("field_salesRepEmployeeNumber_chosen");
    private By creditLimit = By.name("creditLimit");
    private By saveButton = By.id("form-button-save");

    public CustomerFormPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillCustomerForm(String name, String lastName, String firstName, String phone, String address1, String address2, String city, String state, String postalCode, String country, String creditLimit) {
        driver.findElement(customerName).sendKeys(name);
        driver.findElement(contactLastName).sendKeys(lastName);
        driver.findElement(contactFirstName).sendKeys(firstName);
        driver.findElement(this.phone).sendKeys(phone);
        driver.findElement(addressLine1).sendKeys(address1);
        driver.findElement(addressLine2).sendKeys(address2);
        driver.findElement(this.city).sendKeys(city);
        driver.findElement(this.state).sendKeys(state);
        driver.findElement(this.postalCode).sendKeys(postalCode);
        driver.findElement(this.country).sendKeys(country);
        driver.findElement(salesRepEmployeeNumber).click();
        driver.findElement(this.creditLimit).sendKeys(creditLimit);
    }

    public void save() {
        driver.findElement(saveButton).click();
    }
}
