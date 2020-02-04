package br.com.acc.uberEats.Steps;

import br.com.acc.uberEats.Action.HomeAction;
import io.cucumber.java8.Pt;

public class HomeSteps extends HomeAction implements Pt {

	public HomeSteps() {
		Entao("pesquiso por {string}", (String string) -> {
			preencherTxtEndereco(string);
			SelecionarEndereco();
		});

	}

}
