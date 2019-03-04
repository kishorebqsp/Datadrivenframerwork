package script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic.Constant;
import generic.Exceldata;

public class Testcase implements Constant {
	public static void main(String[] args) {
		System.setProperty(key,value);
		WebDriver driver = new ChromeDriver();
		driver.get(Exceldata.getdata(excelpath,"Sheet1",1,0));
		driver.findElement(By.xpath("//span[.=\"Hello, Sign in\"]")).click();
		driver.findElement(By.id("ap_email")).sendKeys(Exceldata.getdata(excelpath,"Sheet1",1,1));
		driver.findElement(By.id("ap_password")).sendKeys(Exceldata.getdata(excelpath,"Sheet1",1,2));
		
		
	}

}
