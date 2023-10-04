package pomVtiger1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginVtiger {
	
	@FindBy(xpath="//button[text()='Sign in' ]")
	private WebElement signinbtn;

	public WebElement getSigninbtn() {
	return signinbtn;
	}

	@FindBy(xpath = "(//span[@class='app-icon fa fa-bars'])[1]")
	private WebElement threeline;

	public WebElement getThreeline() {
	return threeline;
	}

	@FindBy(xpath = "//span[text()=' MARKETING']")
	private WebElement marketing;

	public WebElement getMarketing() {
	return marketing;
	}

	@FindBy(xpath = "//span[text()=' Campaigns']")
	private WebElement campaigns;

	public WebElement getCampaigns() {
	return campaigns;
	}

	@FindBy(id = "Campaigns_listView_basicAction_LBL_ADD_RECORD")
	private WebElement Addcampaigns;

	public WebElement getAddcampaigns() {
	return Addcampaigns;
	}

	@FindBy(id = "Campaigns_editView_fieldName_campaignname")
	private WebElement campaignsname;

	public WebElement getCampaignsname() {
	return campaignsname;
	}

	@FindBy(id = "Campaigns_editView_fieldName_closingdate")
	private WebElement dates;

	public WebElement getDates() {
	return dates;
	}

	@FindBy(id = "Campaigns_editView_fieldName_targetsize")
	private WebElement tsize;

	public WebElement getTsize() {
	return tsize;
	}

	@FindBy(id = "Campaigns_editView_fieldName_targetaudience")
	private WebElement taudience;

	public WebElement getTaudience() {
	return taudience;
	}

	@FindBy(id = "Campaigns_editView_fieldName_sponsor")
	private WebElement sponser;

	public WebElement getSponser() {
	return sponser;
	}

	@FindBy(id = "Campaigns_editView_fieldName_numsent")
	private WebElement numsentt;

	public WebElement getNumsentt() {
	return numsentt;
	}

	@FindBy(id = "Campaigns_editView_fieldName_budgetcost")
	private WebElement budjecost;

	public WebElement getBudjecost() {
	return budjecost;
	}

	@FindBy(id = "Campaigns_editView_fieldName_expectedsalescount")
	private WebElement expsalescount;

	public WebElement getExpsalescount() {
	return expsalescount;
	}

	@FindBy(id = "Campaigns_editView_fieldName_expectedresponsecount")
	private WebElement exprespocount;

	public WebElement getExprespocount() {
	return exprespocount;
	}

	@FindBy(id = "Campaigns_editView_fieldName_expectedroi")
	private WebElement expectroi;

	public WebElement getExpectroi() {
	return expectroi;
	}
	@FindBy(id = "Campaigns_editView_fieldName_actualcost")
	private WebElement actcost;

	public WebElement getActcost() {
	return actcost;
	}
	@FindBy(id = "Campaigns_editView_fieldName_expectedrevenue")
	private WebElement exprevenue;

	public WebElement getExprevenue() {
	return exprevenue;
	}
	@FindBy(id = "Campaigns_editView_fieldName_actualsalescount")
	private WebElement actsalescount;

	public WebElement getActsalescount() {
	return actsalescount;
	}
	@FindBy(id = "Campaigns_editView_fieldName_actualresponsecount")
	private WebElement actresponcount;

	public WebElement getActresponcount() {
	return actresponcount;
	}
	@FindBy(id="Campaigns_editView_fieldName_actualroi")
	private WebElement actualro;

	public WebElement getActualro() {
	return actualro;
	}
	@FindBy(id = "Campaigns_editView_fieldName_description")
	private WebElement descptn;

	public WebElement getDescptn() {
	return descptn;
	}
	@FindBy(xpath = "//button[text()='Save']")
	private WebElement saveb;

	public WebElement getSaveb() {
	return saveb;
}
}
	

