package bento.javaoo.classes;

import bento.javaoo.excecoes.AbastecimentoVeiculoLigadoException;
import bento.javaoo.excecoes.AceleracaoException;
import bento.javaoo.excecoes.ChassiInvalidoException;
import bento.javaoo.excecoes.FrenagemException;
import bento.javaoo.interfaces.Andador;
import bento.javaoo.interfaces.Ligador;
import bento.javaoo.interfaces.Veiculo;

public abstract class VeiculoBase implements Veiculo, Ligador, Andador {

	private String nome;
	private String marca;
	private String chassi;
	protected int qtdRodas;
	private float qtdCombustivel;
	private Boolean ligado;
	protected float velocidade;

	public VeiculoBase() {
		this.ligado = false;
		this.velocidade = 0;
	}

	// Padrao POJO - Plain Old Java Object - Atributos "privados"
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) throws ChassiInvalidoException {
		if (chassi.length() == 5) {
			this.chassi = chassi;
		} else {
			throw new ChassiInvalidoException(chassi);
		}

	}

	public int getQtdRodas() {
		return qtdRodas;
	}

	public float getQtdCombustivel() {
		return qtdCombustivel;
	}

	public Boolean isLigado() { // para metodos que retornam Boolean usa-se prefixo 'is'
		return ligado;
	}

	public float getVelocidade() {
		return velocidade;
	}

	public final void ligar() {
		this.ligado = true;
		this.velocidade = 0;
		System.out.println(" O veiculo ligou! \n");
	}

	public final void desligar() {
		this.ligado = false;
		this.velocidade = 0;
		System.out.println(" O veiculo desligou! \n");
	}

	//final evita que o metodo seja sobreescrito em outras classes
	public final void abastecer(float litros) throws AbastecimentoVeiculoLigadoException {
		if (!this.ligado) {
			qtdCombustivel += litros;
		} else {
			throw new AbastecimentoVeiculoLigadoException();
		}

	}

	public void acelerar() throws AceleracaoException {
		if (this.ligado) {
			this.velocidade += 10;
		} else {
			throw new AceleracaoException();
		}

	}

	public void freiar() throws FrenagemException {
		if (this.ligado) {
			this.velocidade -= 10;
		} else {
			throw new FrenagemException();
		}
	}
	
	public abstract void preparar();
}
