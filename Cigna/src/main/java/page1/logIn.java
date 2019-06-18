package page1;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class logIn extends CommonAPI {

    @FindBy(xpath ="//*[@id=\"includes-content\"]/div[1]/nav[2]/div/ul/li[2]/a")
    WebElement logintomycigna;

    @FindBy(id = "username")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;


    @FindBy(xpath = "//*[@id=\"loginbutton\"]")
    WebElement loginbuttontab;



    public void clicklogintomycigna(){
        logintomycigna.click();
    }


    public void setUsername(String username){

        
    }
    public void setLoginPassword(String password){

    }


}
