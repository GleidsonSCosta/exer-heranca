package classes;

public class ContaPoup extends ContaPF {
	
	private Double rendimento;
	
	public ContaPoup () {
		super();
	}

	public ContaPoup(Integer numConta, String titular, Double saldo, Double rendimento) {
		super(numConta, titular, saldo);
		this.rendimento = rendimento;
	}

	public Double getRendimento() {
		return rendimento;
	}

	public void setRendimento(Double rendimento) {
		this.rendimento = rendimento;
	}
	
	public void atualizarSaldo() {
		saldo += saldo * rendimento;
	}
	
	@Override
	public void sacar (Double valor) {
		saldo -= valor;
	}
	
	
}
