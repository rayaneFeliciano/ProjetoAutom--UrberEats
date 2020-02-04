package br.com.acc.uberEats.Action;

import java.util.concurrent.TimeUnit;

import javax.swing.Box.Filler;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.acc.uberEats.util.DriverContext;

public class FeedAction {

	public void buscarRestaurante(String nomeRestaurante) {
		String xpath = "//div[contains(text(),'" + nomeRestaurante + "')]";

		WebDriver driver = DriverContext.getDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement restaurante = driver.findElement(By.xpath(xpath));
		Boolean clicou = false;
		while (!clicou) {
			try {
				restaurante.click();
				clicou = true;
			} catch (ElementClickInterceptedException e) {
				restaurante.sendKeys(Keys.DOWN);
			}

		}
	}

	public void buscarPrato(String nomePrato) {
		String xpath = "//div[contains(text(),'" + nomePrato + "')]";

		WebDriver driver = DriverContext.getDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement prato = driver.findElement(By.xpath(xpath));
		Boolean clicou = false;
		while (!clicou) {
			try {
				prato.click();
				clicou = true;
			} catch (ElementClickInterceptedException e) {
				prato.sendKeys(Keys.DOWN);
			}
		}

	}

	public void digitarComentario(String comentario) {
		WebDriver driver = DriverContext.getDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement comen = driver.findElement(By.xpath("//textarea"));
		comen.sendKeys(comentario);
	}

	public void validarPreco() {
		WebDriver driver = DriverContext.getDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement preco = driver.findElement(By.xpath("//div[@style=\"color: rgb(255, 255, 255);\"]"));
		String precouni = preco.getText();
		//return precouni;
	}
	public void adicionarCarrrinho() throws InterruptedException {
		Thread.sleep(2000);
		WebDriver driver = DriverContext.getDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement btnAdicionarCarrinho= driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[4]/div/div[2]/div[2]/div[4]/button"));
		btnAdicionarCarrinho.click();
	}

}
