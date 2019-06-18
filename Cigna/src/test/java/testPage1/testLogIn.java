package testPage1;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import page1.logIn;
import reporting.TestLogger;

public class testLogIn extends CommonAPI {

    String homeUrl ="https://www.cigna.com/";
    logIn logInit;

    @BeforeClass
    public void initializing(){
        driver.get(homeUrl);
        logInit = PageFactory.initElements(driver,logIn.class);
    }
@Test
    public void testsignIn(){

        TestLogger.log(getClass().getSimpleName() + ": " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        logInit.clicklogintomycigna();
    }

    @AfterMethod
    public void re_init(){
        driver.get(homeUrl);
    }


}
