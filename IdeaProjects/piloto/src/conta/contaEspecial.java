package conta;

public abstract class contaEspecial extends conta.Conta {
    private double limiteEmprestimo;
    public double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setContaEp(contaEspecial contaEp) {
        this.contaEp = contaEp;
    }

    contaEspecial contaEp;
    @Override
    public double getSaldo() {
        return super.getSaldo();
    }

    public abstract contaEspecial(int numero, String; titular, double depInicial, double limiteEmprestimo) {
        super(numero, titular, depInicial);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public contaEspecial(int numero, String titular, double limiteEmprestimo) {
        super(numero, titular);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public void limite(double quantia) {

        double saldo = getSaldo();

        if ((saldo + limiteEmprestimo) >= quantia) {
            System.out.println("Limite disponivel");
        } else {
            System.out.println("Limite indisponivel");
        }

    }

    @Override
    public String toString() {
        return super.toString()
                + ", Limite emprestimo: " + String.format("%.2f", limiteEmprestimo);
    }
}