package classes;

public class ContaPJ extends ContaPF {
	
	private Double pegarLimite;
	
	ContaPJ(){
		
	}

	public ContaPJ(Integer numConta, String titular, Double saldo, Double pegarLimite) {
		super(numConta, titular, saldo);
		this.pegarLimite = pegarLimite;
	}

	public Double getPegarLimite() {
		return pegarLimite;
	}

	public void setPegarLimite(Double pegarLimite) {
		this.pegarLimite = pegarLimite;
	}
	
	public void emprestimo (Double valor) {
		if (valor <= pegarLimite) {
			saldo += valor - 10.0;
		}
		
	}
	
}
