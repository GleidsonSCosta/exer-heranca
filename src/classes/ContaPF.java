package classes;

public class ContaPF {
	private Integer numConta;
	private String titular;
	protected Double saldo;
	
	public ContaPF () {
		
	}

	public ContaPF(Integer numConta, String titular, Double saldo) {
		super();
		this.numConta = numConta;
		this.titular = titular;
		this.saldo = saldo;
	}

	public Integer getNumConta() {
		return numConta;
	}

	public void setNumConta(Integer numConta) {
		this.numConta = numConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void depositar(Double valor) {
		saldo += valor;
	}
	public void sacar(Double valor) {
		saldo -= valor + 5.0;
	}

	@Override
	public String toString() {
		return "Conta: " 
				+ numConta
				+"\n"
				+ "Titular:"
				+ titular
				+"\n"
				+ "Saldo :"
				+ saldo;
	}
	
	
	
	
}
