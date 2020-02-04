package br.com.acc.uberEats.Action;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.acc.uberEats.Page.HomePage;
import br.com.acc.uberEats.util.DriverContext;
import br.com.acc.uberEats.util.GenericMethods;

public class HomeAction extends HomePage {
	String enderecoGlobal;
	WebDriverWait wait;
	String comentarioGlobal;
	

	public void clicarEntrar() {
		GenericMethods.waitPageLoad();
		lnkEntrar.click();
	}

	public void preencherTxtEndereco(String endereco) throws InterruptedException {
		Thread.sleep(3000);
		txtBucarEndereco.sendKeys(endereco);
		enderecoGlobal = endereco;
	}

	public void SelecionarEndereco() {
		wait = new WebDriverWait(DriverContext.getDriver(),60);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//ul[@id='location-enter-address-menu']/li")));
		List<WebElement> endList = ulEnderecos.findElements(By.tagName("li"));
		for (WebElement item : endList) {
			System.out.println(item.getText());
			if (item.getText().contains(enderecoGlobal)) {
				item.click();
				break;
			}}
	
//		public void digitarComentario(String comentario) {
//			GenericMethods.waitPageLoad();
//			txtComentario.clear();
//			txtComentario.sendKeys(comentario);
//		}
	
	
}}
