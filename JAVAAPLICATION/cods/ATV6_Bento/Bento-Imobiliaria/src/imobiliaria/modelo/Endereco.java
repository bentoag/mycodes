package imobiliaria.modelo;

public class Endereco{

	
	private String rua, bairro, cep;
	private int num;
	
	public Endereco (String r, String b, String cep, int n)
	{
		this.rua = r;
		this.num = n;
		this.bairro = b;
		this.cep = cep;
		
	}

	public Endereco ()
	{
		this.rua = " ";
		this.num = 0;
		this.bairro = " ";
		this.cep = "00000-000";
	}
	
	

	
	public String setEndereco(String rua, String bairro, String cep, int num) {
		this.rua = rua;
		this.num = num;
		this.bairro = bairro;
		this.cep = cep;
		
		return rua + bairro + cep + num;
	}

	

	public String getRua() {
		return rua;
	}

	public String getBairro() {
		return bairro;
	}

	public String getCep() {
		return cep;
	}

	public int getNum() {
		return num;
	}
	
}
