#language: pt
Funcionalidade: Adcionar pedido ao carrinho

  Cenario de Fundo: abrir site e pesquisar por endereço
    Dado Abro o site do ubereats
    Entao pesquiso por "Empresarial Charles Darwin"

  Cenario: selecionar um restaurante
    Entao seleciono o restaurante "Queen Cook Pizzaria"
    E seleciono o prato "Pizza de atum (grande 8 fatias)"
    Entao escreva um comentario 'Capriche'
    E validar preco
    Entao adicionar o carrinho
    E fecho navegador
    	