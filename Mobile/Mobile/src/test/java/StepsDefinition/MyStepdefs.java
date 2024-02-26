package StepsDefinition;

import Base.quiz.*;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class MyStepdefs {
    public AndroidDriver _driver;
    public MainPage mainPage;
    public StartPage startPage;
    public  TriggerPage triggerPage;
    public  MacrosPage macrosPage;
    public  ActionPage actionPage;
    public ContraintsPage contraintsPage;
    public LocalVariablesPage localVariablesPage;

    @Given("I open the application")
    public void iOpenTheApplication() throws MalformedURLException {
        File app = new File("apk/Final_Exam_MacroDroid.apk");
        DesiredCapabilities capabilities =new DesiredCapabilities();
        capabilities.setCapability("app",app.getAbsolutePath());
        capabilities.setCapability("deviceName","PhoneTest");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion","12.0");
        capabilities.setCapability("automationName","UiAutomator2");
        capabilities.setCapability("autoGranPermission","true");
        capabilities.setCapability("appPackage","com.arlosoft.macrodroid");
        capabilities.setCapability("appWaitActivity","com.arlosoft.macrodroid.intro.IntroActivity");
        this._driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);

    }

    @When("I select the iten Dashboard Page tap on click Macros")
    public void iSelectTheItenDashboardPageTapOnClickMacros() {
        mainPage.AllownPage();
        startPage.startApp();
        startPage.startApp();
        startPage.startApp();
        startPage.startApp();
    }

    @When("I select Macro Page tap on Trigger to add a trigger")
    public void iSelectMacroPageTapOnTriggerToAddATrigger() {
        macrosPage.MacrosFooter("Macros");
        macrosPage.AddMacrosPage();
        macrosPage.ImagebtnAddTrigger();
    }

    @And("I select On Trigger Page tap on Application")
    public void iSelectOnTriggerPageTapOnApplication() {
        triggerPage.ItemApp("Applications");
    }

    @And("Tap on App Install\\/Remove\\/Update")
    public void tapOnAppInstallRemoveUpdate() {
        triggerPage.slectedItemAppInstall("App Install/Remove/Update");
    }

    @And("Select Application Removed radio button")
    public void selectApplicationRemovedRadioButton() {
        triggerPage.RemoveApp("Application Removed");
    }

    @And("Select Any Application and OK")
    public void selectAnyApplicationAndOK() {
        triggerPage.bttonOk();
    }

    @And("On Macro Page, tap on Action to add an action")
    public void onMacroPageTapOnActionToAddAnAction() {
        triggerPage.slectedItemAnyOption("Any Application");
        triggerPage.bttonOk();
    }

    @And("On Action page, tap on Logging")
    public void onActionPageTapOnLogging() {
        MacrosPage macrosPage = new MacrosPage(_driver);
        macrosPage.ImagebtnAddAction();
    }

    @And("Select Clear Log")
    public void selectClearLog() {
        ActionPage actionPage = new ActionPage(_driver);
        actionPage.selectItemLogin("Logging");
        actionPage.selectItemLogin("Clear Log");

    }

    @And("Select System Log and OK")
    public void selectSystemLogAndOK() {
        actionPage.selectItemLogin("System Log");
        actionPage.bttonOk();
    }

    @And("On Macro Page, tap on Constrains to add an contrains")
    public void onMacroPageTapOnConstrainsToAddAnContrains() {
        macrosPage.ImagebtnAddConstraintsPage();
        contraintsPage.ItemPhone("Phone");
        contraintsPage.ItemPhone("Call State");
    }

    @And("Select Device State")
    public void selectDeviceState() {
        contraintsPage.ItemPhone("Device State");

    }

    @And("Select Airplan Mode")
    public void selectAirplanMode() {
        contraintsPage.ItemPhone("Airplane Mode");

    }

    @And("Select Airplan Mode Disable and OK")
    public void selectAirplanModeDisableAndOK() {
        contraintsPage.ItemPhone("Airplane Mode Disabled");
        contraintsPage.bttonOk();
    }

    @And("On Macro Page, select add Local Variable")
    public void onMacroPageSelectAddLocalVariable() {
        macrosPage.ImagebtnLocalVariables();
    }

    @And("Add an Interger Variable with Name “Test Case”")
    public void addAnIntergerVariableWithNameTestCase() {
        localVariablesPage.fillInformation();
        localVariablesPage.VariableType("Integer");
        localVariablesPage.bttonOk();
    }

    @Then("Select new added Variable, and input Value")
    public void selectNewAddedVariableAndInputValue() {
        localVariablesPage.fillIfmattion();
        localVariablesPage.VariableType("String");
        localVariablesPage.bttonOk();
    }
}
