package test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class gridprct {

	@Test(dataProvider="dataname")
	public void rwdp(Platform platform,String browsername) throws MalformedURLException
	{
	 URL u = new URL("http://10.3.0.1:4444/wd/hub");
	DesiredCapabilities d = new DesiredCapabilities();
	
	d.setPlatform(platform);
	d.setBrowserName(browsername);
	RemoteWebDriver driver = new RemoteWebDriver(u,d);
	
	driver.get("http://gmail.com");
	}
	@DataProvider(name="dataname",parallel=true)
	public Object[][] getdata()
	{
		Object[][]data=new Object[][]
		{
			{Platform.WINDOWS,"chrome"},
			{Platform.WINDOWS,"firefox"}
		};
		return data;
		}
}
