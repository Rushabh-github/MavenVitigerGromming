package Basic;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pomVtiger1.LoginVtiger;

public class BaseClassPomVtiger1 {
    WebDriver driver;

    @Test
    public void vtiger() throws IOException, InterruptedException {
    //WebDriver driver=new ChromeDriver();  ===============no need to write bcoz downside it is written
    //driver.get("https://demo.actitime.com/login.do");


    FileInputStream fis=new FileInputStream("src\\test\\resources\\Vtiger.properties");

    Properties p=new Properties();

    //to fetch location of file
    p.load(fis);


    //TO LAUNCH THE browser
    String BROWSER = p.getProperty("browser");


    //CROSS BROWSER TESTING

    if (BROWSER.equals("Chrome")) {

    driver=new ChromeDriver();

    } else if(BROWSER.equals("Firefox")) {
    driver=new FirefoxDriver();

    }
    else {
    driver=new EdgeDriver();

    }




    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));







    //to fetch location
    String URL = p.getProperty("url");
    String NAME = p.getProperty("CampaignName");
    String DATE = p.getProperty("Date");
    String SIZE = p.getProperty("targetsize");
    String TARGET = p.getProperty("targetaudience");
    String SPONSOR = p.getProperty("sponsor");
    String NUMSENT = p.getProperty("numsent");
    String BCOST = p.getProperty("budgetcost");
    String ESC = p.getProperty("expectedsalescount");
    String ERC = p.getProperty("expectedresponsecount");
       String ROI = p.getProperty("expectedroi");
       String ACTCOST = p.getProperty("actualcost");
       String EXPREVEN = p.getProperty("expectedrevenue");
       String ACTSALCOUNT = p.getProperty("actualsalescount");
       String ACTRESPCOUNT = p.getProperty("actualresponsecount");
       String ACTUALR = p.getProperty("actualroi");
       String DESC = p.getProperty("description");



    driver.get(URL);


    LoginVtiger lvp=new  LoginVtiger();
    PageFactory.initElements(driver, lvp);
    lvp.getSigninbtn().click();
    lvp.getThreeline().click();
    Thread.sleep(2000);
    Actions a=new Actions(driver);
    a.moveToElement(lvp.getMarketing()).perform();

    lvp.getCampaigns().click();
    lvp.getAddcampaigns().click();

    lvp.getCampaignsname().sendKeys(NAME);
    lvp.getDates().sendKeys(DATE);
    lvp.getDates().sendKeys(Keys.ENTER);
    lvp.getTsize().sendKeys(SIZE);
    lvp.getTaudience().sendKeys(TARGET);
    lvp.getSponser().sendKeys(SPONSOR);
    lvp.getNumsentt().sendKeys(NUMSENT);
    lvp.getBudjecost().sendKeys(BCOST);
    lvp.getExpsalescount().sendKeys(ESC);
    lvp.getExprespocount().sendKeys(ERC);
    lvp.getExpectroi().sendKeys(ROI);
    lvp.getActcost().sendKeys(ACTCOST);
    lvp.getExprevenue().sendKeys(EXPREVEN);
    lvp.getActsalescount().sendKeys(ACTSALCOUNT);
    lvp.getActresponcount().sendKeys(ACTRESPCOUNT);
    lvp.getActualro().sendKeys(ACTUALR);
    lvp.getDescptn().sendKeys(DESC);
    lvp.getSaveb().click();










    }

    }

