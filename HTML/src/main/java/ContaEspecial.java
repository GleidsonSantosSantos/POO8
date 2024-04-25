import model.ContaBancaria;

public class ContaEspecial extends ContaBancaria {
    private float limite;

    public ContaEspecial(String cliente, int num_conta, float saldo, float limite) {
        super(cliente, num_conta, saldo);
        this.limite = limite;
    }

    
    @Override
    public void sacar(float valor) {
        if (valor > saldo + limite) {
            System.out.println("Valor de saque excede o limite.");
        } else {
            saldo -= valor;
        }
    }


}