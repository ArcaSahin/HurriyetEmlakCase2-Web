package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListingDetailPage {

	public WebDriver driver;
	WebElement element;
	
	@FindBy(xpath="//*[contains(text(),'Telefon Numarasını Göster')]")
	WebElement showPhoneNumberBtn;
	
	@FindBy(xpath="//a[@href='tel:+905324008656']")
	WebElement mobilePhoneNumberText;
	
	
	public ListingDetailPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void click_ShowPhoneNumber() throws InterruptedException
	{
		ListingDetailPage ldp = new ListingDetailPage(driver);
		Thread.sleep(4000);
		ldp.showPhoneNumberBtn.click();
		mobilePhoneNumberText.getText();
	}
}
