package bento.javaoo.classes;

import bento.javaoo.excecoes.AceleracaoException;
import bento.javaoo.excecoes.FrenagemException;

//uma classe final indica que ela nao pode ser extendida (herdada)
public final class Moto extends VeiculoBase {

	public Moto() {
		this.qtdRodas = 2;		
	}
	
	public Moto (String nome, String marca) {
		this.qtdRodas = 2;
		this.setNome(nome);
		this.setMarca(marca);
	}
	
	@Override
	public void acelerar() throws AceleracaoException {
		if (this.isLigado()) {
			this.velocidade += 3;
		} else {
			throw new AceleracaoException();
		}

	}
	@Override
	public void freiar() throws FrenagemException {
		if (this.isLigado()) {
			this.velocidade -= 3;
		} else {
			throw new FrenagemException();
		}
	}

	@Override
	public void preparar() {
		System.out.println("Colocar o capacete");
		
	}
}
