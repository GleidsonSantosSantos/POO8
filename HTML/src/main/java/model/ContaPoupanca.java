package model;
@Getters 
@Setters
public class ContaPoupanca {

	public class ContaPoupanca extends ContaBancaria {
	    private int diaRendimento;

	    public ContaPoupanca(String cliente, int num_conta, float saldo, int diaRendimento) {
	        super(cliente, num_conta, saldo);
	        this.diaRendimento = diaRendimento;
	    }

	    // Método para calcular novo saldo com rendimento
	    public void calcularNovoSaldo(float taxaRendimento) {
	        saldo += saldo * taxaRendimento;
	    }

	    
	}
}
