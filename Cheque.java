public class Cheque extends Pagamento {
	private String numeroDoCheque;

	public Cheque(String nomePagador, String cpf, double valorASerPago, String numeroDoCheque) {
		super(nomePagador, cpf, valorASerPago);
		this.numeroDoCheque = numeroDoCheque;
	}

	public String getNumeroDoCheque() {
		return numeroDoCheque;
	}

	public void setNumeroDoCheque(String numeroDoCheque) {
		this.numeroDoCheque = numeroDoCheque;
	}


}