package br.edu.umfg.isp.legado;

public interface IConta {
    void creditar(Double valor);
    void debitar(Double valor);
    void investir(Double valor); // isso e um problema
    Double getSaldo();
}
