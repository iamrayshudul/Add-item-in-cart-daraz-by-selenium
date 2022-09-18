package daraz.com;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddingItemIntoCart {

	static WebDriver driver;


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\\\Work\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// got to url
		driver.get("https://www.daraz.com.bd");
		
		// click on sign up/login
		WebElement clickOne = driver.findElement(By.xpath("//a[contains(text(),'Signup / Login')]"));
		clickOne.click();

		// username or mobile number
		WebElement clickTwo = driver.findElement(
				By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		clickTwo.sendKeys("########");

		// password
		WebElement clickThree = driver.findElement(
				By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]"));
		clickThree.sendKeys("########");

		// click on login
		WebElement clickFour = driver.findElement(
				By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/button[1]"));
		clickFour.click();

		// click on product
		WebElement clickSix = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[3]/div[2]/div[2]/a[1]"));
		clickSix.click();

		// select size of product
		WebElement clickSeven = driver.findElement(By.xpath("//span[@title='XL']"));
		clickSeven.click();

		// select quantity
		for (int i = 1; i < 3; i++) {
			WebElement clickEight = driver.findElement(By.xpath(
					"//body/div[@id='container']/div[@id='root']/div[@id='block-UZTgZStr7R']/div[@id='block-_JE09b6jla']/div[@id='block-rySfY_7xeI']/div[@id='block-spqxNJtNrx']/div[@id='module_quantity-input']/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]/i[1]"));
			clickEight.click();

			// add to cart
			WebElement clickNine = driver.findElement(
					By.xpath("/html[1]/body[1]/div[4]/div[1]/div[3]/div[2]/div[1]/div[1]/div[15]/div[1]/button[2]"));
			clickNine.click();

			// go to cart
			WebElement clickTen = driver.findElement(By.xpath("//button[contains(text(),'GO TO CART')]"));
			clickTen.click();

		}

	}

}
