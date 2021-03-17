package Tests;

import java.io.IOException;

import org.testng.annotations.Test;

import Pages.ForRentPage;
import Pages.LandingPage;
import Pages.ListingDetailPage;
import Resources.Base;

public class TestScenarios extends Base{


	@Test
	public void BasePageNavigation() throws IOException 
	{
		driver = initializeDriver();
		driver.get("https://www.hurriyetemlak.com/");
	}
	
	@Test(priority=1)
	public void goTo_ForRentPage()
	{
		LandingPage lp = new LandingPage(driver);
		ForRentPage frp = lp.click_forRent();
	}
	
	@Test(priority=2)
	public void selectCity() throws InterruptedException
	{
		ForRentPage frp = new ForRentPage(driver);
		frp.select_City();
	}
	
	@Test(priority=3)
	public void selectCounty() throws InterruptedException
	{
		ForRentPage frp = new ForRentPage(driver);
		frp.select_County();
	}
	
	@Test(priority=4)
	public void selectRoomAndsearchAll() throws InterruptedException
	{
		ForRentPage frp = new ForRentPage(driver);
		frp.selectRoom_searchAll();
	}
	
	@Test(priority=5)
	public void gotoListingPage() throws InterruptedException
	{
		ForRentPage frp = new ForRentPage(driver);
		ListingDetailPage ldp = frp.goto_ListingPage();
	}
	
	@Test(priority=6)
	public void showPhoneNumber() throws InterruptedException
	{
		ListingDetailPage ldp = new ListingDetailPage(driver);
		ldp.click_ShowPhoneNumber();
	}
	
}
