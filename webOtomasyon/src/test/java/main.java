import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class main {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com");

        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0,300)","");

        WebElement elements = driver.findElement(By.xpath("//h5[normalize-space()='Elements']"));
        elements.click();

        jsx.executeScript("window.scrollBy(0,300)","");

        WebElement webTables = driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-3']"));
        webTables.click();

        WebElement add = driver.findElement(By.xpath("//button[@id='addNewRecordButton']"));
        add.click();

        WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
        firstName.click();
        firstName.sendKeys("murat");

        WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
        lastName.click();
        lastName.sendKeys("civek");

        WebElement mail = driver.findElement(By.xpath("//input[@id='userEmail']"));
        mail.click();
        mail.sendKeys("muratttcivek@gmail.com");

        WebElement age = driver.findElement(By.xpath("//input[@id='age']"));
        age.click();
        age.sendKeys("23");

        WebElement salary = driver.findElement(By.xpath("//input[@id='salary']"));
        salary.click();
        salary.sendKeys("20000");

        WebElement department = driver.findElement(By.xpath("//input[@id='department']"));
        department.click();
        department.sendKeys("bilgisayar mühendisi");

        WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
        submit.click();


    }
}
