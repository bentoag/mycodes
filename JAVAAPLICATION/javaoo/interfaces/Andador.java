package bento.javaoo.interfaces;

import bento.javaoo.excecoes.AceleracaoException;
import bento.javaoo.excecoes.FrenagemException;

public interface Andador {
	void acelerar() throws AceleracaoException;
	void freiar() throws FrenagemException;
}
