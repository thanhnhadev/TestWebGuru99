package Pages.BasePage;

import locator.LocatorPractive;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EditCustomerPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private  By   ip_CustomerName= By.xpath(LocatorPractive.ip_CustomerName);
    private  By  Gd_Male=By.xpath(LocatorPractive.Gd_Male);
    private  By Gd_female=By.xpath(LocatorPractive.Gd_female);
    private  By ip_Date=By.xpath(LocatorPractive.ip_Date);
    private By ip_Adress=By.xpath(LocatorPractive.ip_Adress);
    private By ip_City=By.xpath(LocatorPractive.ip_City);
    private By ip_State=By.xpath(LocatorPractive.ip_State);
    private By  ip_Pin=By.xpath(LocatorPractive.ip_Pin);
    private  By ip_Mb_number=By.xpath(LocatorPractive.ip_Mb_number);
    public By  ip_Email=By.xpath(LocatorPractive.ip_Email);
    public By ip_password=By.xpath(LocatorPractive.ip_password);
    public By btnSubmit1=By.xpath(LocatorPractive.btnSubmit1);
    public By btnReset2=By.xpath(LocatorPractive.btnReset2);
    public EditCustomerPage(WebDriver driver){
        this.driver=driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public void Edit(){
        driver.findElement(ip_CustomerName).sendKeys("ThanhNha");
        driver.findElement(ip_Date).sendKeys("05/12/1995");
        driver.findElement(ip_Adress).sendKeys("13/1 tpchm");
        driver.findElement(ip_City).sendKeys("TPHCM");
        driver.findElement(ip_State).sendKeys("70000");
        driver.findElement(ip_Pin).sendKeys("999");
        driver.findElement(ip_Mb_number).sendKeys("086.205.12");
        driver.findElement(ip_Email).sendKeys("thanhnhadev@gmail.com");
        driver.findElement(ip_password).sendKeys("VNSDATA");
        driver.findElement(btnSubmit1).click();

    }
//    public String sendKeyToDatePiker(By locator, String key) {
//        String res = "";
//        try {
//            WebElement element = click(locator);
//
//            String[] dateParts = key.split("/");
//            String day = dateParts[0];
//            String month = dateParts[1];
//            String year = dateParts[2];
//            // Chọn tháng
//            Select selectMonth = new Select(this._driver.findElement(By.className("react-datepicker__month-select")));
//            selectMonth.selectByVisibleText(getMonthName(Integer.parseInt(month)));  // Chọn tháng mới
//            // Chọn năm
//            Select selectYear = new Select(this._driver.findElement(By.className("react-datepicker__year-select")));
//            selectYear.selectByVisibleText(year);  // Chọn năm mới
//            // Chọn ngày
//            WebElement dayElement = this._driver.findElement(By.xpath("//*[contains(@aria-label, '" + getMonthName(Integer.parseInt(month)) + " ') and contains(@aria-label, '" + Integer.parseInt(day) + "')]"));
//            click(dayElement);
//            res = day + " " + getMonthName(Integer.parseInt(month)) + "," + year;
//        } catch (WebDriverException e) {
//
//            e.printStackTrace();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//        return res;
//    }
}
