package br.com.acc.uberEats.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import br.com.acc.uberEats.util.DriverContext;

public class HomePage {
	
	public HomePage() {
		PageFactory.initElements(DriverContext.getDriver(), this);
	}
	
	@FindBy(how = How.XPATH,using = "//a[contains(text(),'Entrar')]")
	protected WebElement lnkEntrar;
	
	@FindBy(how = How.ID, using = "location-enter-address-input")
	protected WebElement txtBucarEndereco;
	
	@FindBy(how = How.ID,using = "location-enter-address-menu")
	protected WebElement ulEnderecos;
	
	@FindBy(how = How.XPATH,using = "//button[contains(text(),'Pesquisar')]")
	protected WebElement btnPesquisar;
	
	@FindBy(how = How.XPATH,using = "//textarea")
	protected WebElement txtComentario;
	
	

}
