package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ForRentPage {

	WebDriver driver;
	WebElement element;
	ForRentPage frp;
	
	@FindBy(xpath="//div[@class='he-select-base__container']")
	WebElement selectCityBar;
	
	@FindBy(xpath="//input[@placeholder='İl Ara']")
	WebElement selectCityList;
	
	@FindBy(xpath="//div[@class='he-radio he-select__radio']")
	WebElement selectCityRadioBtn;
	
	@FindBy(xpath="//*[contains(text(),'İlçe Seçiniz')]")
	WebElement selectCountyBar;
	
	@FindBy(xpath="//input[@placeholder='İlçe Ara']")
	WebElement selectCountyList;
	
	@FindBy(xpath="//div[@class='he-checkbox he-multiselect__checkbox']")
	WebElement selectCountyCheckBox;
	
	@FindBy(xpath="//*[contains(text(),'Oda Seçiniz')]")
	WebElement selectRoomBar;
	
	@FindBy(linkText="Ara")
	WebElement clickSearchBtn;
	
	@FindBy(xpath="//a[@href='/ankara-cankaya-isci-bloklari-kiralik/daire/7388-2350']")
	WebElement thirdOption;
	

	public ForRentPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public ForRentPage select_City() throws InterruptedException
	{
		ForRentPage frp = new ForRentPage(driver);
		frp.selectCityBar.click();
		frp.selectCityList.sendKeys("Ankara");
		frp.selectCityRadioBtn.click();
		Thread.sleep(3000);
		return this;
	}
	
	public ForRentPage select_County() throws InterruptedException
	{
		ForRentPage frp = new ForRentPage(driver);
		frp.selectCountyBar.click();
		frp.selectCountyList.sendKeys("Çankaya");
		Thread.sleep(2000);
		frp.selectCountyCheckBox.click();
		Thread.sleep(2000);
		return this;
	}
	
	public ForRentPage selectRoom_searchAll() throws InterruptedException
	{
		ForRentPage frp = new ForRentPage(driver);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Thread.sleep(3000);
		frp.selectRoomBar.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div[2]/div[1]/section[2]/div/section[6]/section/div/div[2]/div/div/ul/li[3]/label/span"))).click();
		Thread.sleep(3000);
		frp.clickSearchBtn.click();
		return this;
	}
	
	public ListingDetailPage goto_ListingPage() throws InterruptedException
	{
		ListingDetailPage ldp = new ListingDetailPage(driver);
		Thread.sleep(5000);
		thirdOption.click();
		return ldp;
	}
	
}
