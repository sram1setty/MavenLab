package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class dynamicData {
	WebDriver driver;
	@Test
	public void MathCalc()
	{
		driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Simple-Math-Captcha-Plugin-for-jQuery-ebcaptcha/demo/");
		driver.manage().window().maximize();
		String str=driver.findElement(By.id("ebcaptchatext")).getText();
		System.out.println(str);
		String str1=str.substring(8,9);
		String str2=str.substring(12,13);
		System.out.println(str1+" : "+str2);
		Integer res=Integer.valueOf(str1) + Integer.valueOf(str2);
		driver.findElement(By.id("ebcaptchainput")).sendKeys(String.valueOf(res));
		boolean chkSub=driver.findElement(By.xpath("//*[@id=\"form\"]/input[2]")).isEnabled();
		System.out.println(chkSub);
		if(chkSub==true)
		{
			System.out.println("Value entered is correct");
		}
		else
		{
			System.out.println("Value entered is incorrect");
		}
		//driver.quit();
		
	}

}
