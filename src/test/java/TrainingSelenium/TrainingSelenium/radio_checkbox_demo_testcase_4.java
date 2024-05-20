package TrainingSelenium.TrainingSelenium;

import static org.junit.Assert.*;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class radio_checkbox_demo_testcase_4 {

	WebDriver driver = new ChromeDriver();

	@Before
	public void setUp() throws Exception {
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();

	}

	@Test
	public void test() throws Exception {
		WebElement BMWradio = driver.findElement(By.id("bmwradio"));
		BMWradio.click();

		Thread.sleep(2000);
		WebElement benzradio = driver.findElement(By.id("benzradio"));
		benzradio.click();

		Thread.sleep(2000);
		WebElement bmwcheck = driver.findElement(By.id("bmwcheck"));
		bmwcheck.click();

		Thread.sleep(2000);
		WebElement benzcheck = driver.findElement(By.id("benzcheck"));
		benzcheck.click();

		/*
		Thread.sleep(2000);
		WebElement hondacheck =driver.findElement(By.id("hondacheck"));
		hondacheck.click();
		*/
		
		System.out.println("The BMW radio Selected? : " + BMWradio.isSelected());
		System.out.println("The BENZ radio Selected? : " + benzradio.isSelected());
		System.out.println("The BMW checkbox Selected? : " + bmwcheck.isSelected());
		System.out.println("The BENZ checkbox Selected? : " + benzcheck.isSelected());
		//System.out.println("The Honda checkbox Selected? : " +hondacheck.isSelected());

	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(5000);
		driver.quit();
	}

}
