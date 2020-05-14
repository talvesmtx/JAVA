public class Boleto extends Pagamento{
	private String numeroDoBoleto;
	private int diaVencimento, mesVencimento, anoVencimento;

	public Boleto(String nomePagador, String cpf, double valorASerPago, String numeroDoBoleto) {
		super(nomePagador, cpf, valorASerPago);
		this.numeroDoBoleto = numeroDoBoleto;
	}

	public String getNumeroDoBoleto() {
		return numeroDoBoleto;
	}

	public void setNumeroDoBoleto(String numeroDoBoleto) {
		this.numeroDoBoleto = numeroDoBoleto;
	}

	public int getDiaVencimento() {
		return diaVencimento;
	}

	public void setDiaVencimento(int diaVencimento) {
		this.diaVencimento = diaVencimento;
	}

	public int getMesVencimento() {
		return mesVencimento;
	}

	public void setMesVencimento(int mesVencimento) {
		this.mesVencimento = mesVencimento;
	}

	public int getAnoVencimento() {
		return anoVencimento;
	}

	public void setAnoVencimento(int anoVencimento) {
		this.anoVencimento = anoVencimento;
	}





}