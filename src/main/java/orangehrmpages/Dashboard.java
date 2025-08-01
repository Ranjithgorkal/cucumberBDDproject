package orangehrmpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dashboard {
		 private WebDriver driver;

		    public Dashboard(WebDriver driver) {
		        this.driver = driver;
		    }

		    // Locators
		    private By popupCloseButton = By.xpath("//button[@aria-label='Close']"); // Adjust if needed
		    private By profileDropdown = By.xpath("//span[@class='oxd-userdropdown-tab']");
		    private By supportLink = By.linkText("Support");
		    private By gettingStartedText = By.xpath("//h6[normalize-space()='Getting Started with OrangeHRM']");

		    // Actions
		    public void closePopupIfPresent() {
		        try {
		            driver.findElement(popupCloseButton).click();
		        } catch (Exception e) {
		            // Ignore if not present
		        }
		    }

		    public void clickProfileDropdown() {
		        driver.findElement(profileDropdown).click();
		    }

		    public void clickSupport() {
		        driver.findElement(supportLink).click();
		    }

		    public boolean isGettingStartedTextVisible() {
		        return driver.findElement(gettingStartedText).isDisplayed();
		    }
}
