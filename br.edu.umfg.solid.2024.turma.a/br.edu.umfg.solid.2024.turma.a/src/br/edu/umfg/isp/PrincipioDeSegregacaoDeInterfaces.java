package br.edu.umfg.isp;

import br.edu.umfg.isp.legado.ContaCorrete;
import br.edu.umfg.isp.legado.ContaPoupanca;
import br.edu.umfg.isp.refatorado.ContaCorrenteRefatorada;
import br.edu.umfg.isp.refatorado.ContaInvestimento;
import br.edu.umfg.isp.refatorado.ContaPoupancaRefatorada;

public class PrincipioDeSegregacaoDeInterfaces {
    public static void executarLegado(){
        ContaCorrete contaCorrete
                = new ContaCorrete("0001", "TESTE 1");
        ContaPoupanca contaPoupanca
                = new ContaPoupanca("0002", "TESTE 2");

        contaCorrete.creditar(1000.00);
        contaCorrete.debitar(55.70);

        contaPoupanca.creditar(300.00);
        contaPoupanca.debitar(13.50);

        System.out.println("CC: " + contaCorrete.getSaldo());
        System.out.println("CP: " + contaPoupanca.getSaldo());
    }

    public static void executarRefatorado(){
        ContaCorrenteRefatorada contaCorrenteRefatorada
                = new ContaCorrenteRefatorada("0001", "TESTE 1");
        ContaPoupancaRefatorada contaPoupancaRefatorada
                = new ContaPoupancaRefatorada("0002", "TESTE 2");
        ContaInvestimento contaInvestimento
                = new ContaInvestimento("0003", "TESTE 3");

        contaCorrenteRefatorada.creditar(1000.00);
        contaCorrenteRefatorada.debitar(55.70);

        contaPoupancaRefatorada.creditar(300.00);
        contaPoupancaRefatorada.debitar(13.50);

        contaInvestimento.creditar(600.00);
        contaInvestimento.investir(175.90);

        System.out.println("CC: " + contaCorrenteRefatorada.getSaldo());
        System.out.println("CP: " + contaPoupancaRefatorada.getSaldo());
        System.out.println("CI: " + contaInvestimento.getSaldo());
    }
}
