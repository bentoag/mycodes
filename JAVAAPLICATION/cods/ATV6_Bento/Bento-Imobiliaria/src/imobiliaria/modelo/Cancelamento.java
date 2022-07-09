package imobiliaria.modelo;

public class Cancelamento {

	private String motivo;
	private double multa;
	private TipoCliente solicitante;
	
	public Cancelamento (String motivo, double multa, TipoCliente solicitante) {
		this.motivo = motivo;
		this.multa = multa;
		this.solicitante = solicitante;
	}

	public String getMotivo() {
		return motivo;
	}

	public double getMulta() {
		return multa;
	}

	public TipoCliente getSolicitante() {
		return solicitante;
	}
	
	
}
