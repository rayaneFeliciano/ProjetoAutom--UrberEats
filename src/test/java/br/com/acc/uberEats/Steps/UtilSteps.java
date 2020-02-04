package br.com.acc.uberEats.Steps;

import org.openqa.selenium.WebDriver;

import br.com.acc.uberEats.util.DriverContext;
import br.com.acc.uberEats.util.GenericMethods;
import io.cucumber.java8.Pt;

public class UtilSteps implements Pt {

	public UtilSteps() {
		Dado("Abro o site do ubereats", () -> {
			WebDriver driver = DriverContext.getDriver();
			driver.manage().window().maximize();
			driver.get("https://www.ubereats.com/");
			DriverContext.setDriver(driver);
		});

		Dado("fecho navegador", () -> {
			GenericMethods.waitPageLoad();
			Thread.sleep(5000);
			WebDriver driver = DriverContext.getDriver();
			driver.quit();
			driver = null;
			DriverContext.setDriver(driver);

		});
	}
}
