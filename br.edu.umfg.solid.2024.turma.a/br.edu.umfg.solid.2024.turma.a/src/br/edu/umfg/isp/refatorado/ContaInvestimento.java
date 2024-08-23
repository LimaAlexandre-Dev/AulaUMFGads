package br.edu.umfg.isp.refatorado;

public class ContaInvestimento
        extends AbstractConta implements IContaRefatorada, IContaInvestimento{

    private Double investido = 0.0;

    public ContaInvestimento(String documento, String nome) {
        super(documento, nome);
    }

    @Override
    public void investir(Double valor) {
        debitar(valor);
        this.investido += valor;
    }

    @Override
    public Double getSaldo() {
        return super.getSaldo() + this.investido;
    }
}
