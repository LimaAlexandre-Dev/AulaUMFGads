package br.edu.umfg.dip.refatorado;

public class UsuarioServiceRefatorado {
    private final String EMAIL_PADRAO = "minha.empresa@email.com";
    private IEmailService emailService;

    /*
    a classe de alto nivel UsuarioRefatoradoService recebe
    como inversao/injecao de dependencia o contrato de IEmailService
     */
    public UsuarioServiceRefatorado(IEmailService emailService) {
        this.emailService = emailService;
    }
    public void registrarUsuario(String email){
        String mensagem = "Bem Vindo! Você foi registrado.";
        this.emailService.enviarEmail(this.EMAIL_PADRAO, email, mensagem);
    }
}
