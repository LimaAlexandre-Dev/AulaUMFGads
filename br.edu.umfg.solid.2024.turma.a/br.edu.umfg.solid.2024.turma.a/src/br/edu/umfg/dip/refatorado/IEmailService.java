package br.edu.umfg.dip.refatorado;

public interface IEmailService {
    //abstracao
    void enviarEmail(String remetente,
                     String destinatario,
                     String mensagem);
}
