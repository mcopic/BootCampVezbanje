package test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FillOutRegister {

//	    1. Otici na http://www.newtours.demoaut.com
//		2. Kliknuti na register
//		3. Popuniti formu
//		4. kliknuti na submit

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		try {

			String url = "http://newtours.demoaut.com/";
			driver.get(url);

			WebElement staGod = driver.findElement(
					By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
			staGod.click();

			WebElement firstName = driver.findElement(By.name("firstName"));
			firstName.sendKeys("Rick");

			WebElement lastName = driver.findElement(By.name("lastName"));
			lastName.sendKeys("Astley");

			WebElement phone = driver.findElement(By.name("phone"));
			phone.sendKeys("555333");

			WebElement email = driver.findElement(By.name("userName"));
			email.sendKeys("rickey@hotmail.com");

			WebElement address = driver.findElement(By.name("address1"));
			address.sendKeys("Hollywood road");

			WebElement city = driver.findElement(By.name("city"));
			city.sendKeys("Los Angeles");

			WebElement stateProvince = driver.findElement(By.name("state"));
			stateProvince.sendKeys("California");

			WebElement postalCode = driver.findElement(By.name("postalCode"));
			postalCode.sendKeys("12345");

			WebElement userName = driver.findElement(By.name("email"));
			userName.sendKeys("kikiriki");

			WebElement pass = driver.findElement(By.name("password"));
			pass.sendKeys("rick");

			WebElement confirmPass = driver.findElement(By.name("confirmPassword"));
			confirmPass.sendKeys("rick");

			WebElement submit = driver.findElement(By.xpath(
					"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[18]/td/input"));
			submit.click();
			
		} catch (Exception ex) {
			
			System.out.println(ex.toString());
			
		} finally {
			
			driver.quit();
			
		}

	}

}
