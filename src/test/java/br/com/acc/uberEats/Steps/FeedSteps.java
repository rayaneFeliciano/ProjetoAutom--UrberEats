package br.com.acc.uberEats.Steps;

import br.com.acc.uberEats.Action.FeedAction;
import io.cucumber.java8.Pt;

public class FeedSteps extends FeedAction implements Pt {

	public FeedSteps() {
		Entao("seleciono o restaurante {string}", (String string) -> {
			buscarRestaurante(string);
		});

		Entao("seleciono o prato {string}", (String string) -> {
			buscarPrato(string);
		});

		Entao("escreva um comentario {string}", (String string) -> {
			digitarComentario(string);
		});
		
		Entao("validar preco", () -> {
			validarPreco();

		});
		Entao("adicionar o carrinho", () -> {
				adicionarCarrrinho();
		});

	}

}
