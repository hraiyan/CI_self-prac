package tst;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class first {

	@Test
	public void chk(){
		WebDriver d=new FirefoxDriver();
		d.manage().window().maximize();
		d.get("https://www.google.co.in");
		System.out.println("chk");
		d.close();
		//Assert.assertTrue(false);
	}
	
	
}
