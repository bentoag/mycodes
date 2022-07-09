package bento.javaoo.interfaces;

import bento.javaoo.excecoes.AbastecimentoVeiculoLigadoException;

public interface Veiculo {
	
	void abastecer (float litros) throws AbastecimentoVeiculoLigadoException;
	void preparar();
}
