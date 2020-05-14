public class Pagamento {
	protected String nomePagador, cpf;
	protected double valorASerPago;

	public Pagamento(String nomePagador, String cpf, double valorASerPago) {
		super();
		this.nomePagador = nomePagador;
		this.cpf = cpf;
		this.valorASerPago = valorASerPago;
	}

	public String getNomePagador() {
		return nomePagador;
	}

	public void setNomePagador(String nomePagador) {
		this.nomePagador = nomePagador;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getValorASerPago() {
		return valorASerPago;
	}

	public void setValorASerPago(double valorASerPago) {
		this.valorASerPago = valorASerPago;
	}

}