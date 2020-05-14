public class CartaoDeCredito extends Pagamento{
	private String numeroCartao;

	public CartaoDeCredito(String nomePagador, String cpf, double valorASerPago, String numeroCartao) {
		super(nomePagador, cpf, valorASerPago);
		this.numeroCartao = numeroCartao;
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}


}