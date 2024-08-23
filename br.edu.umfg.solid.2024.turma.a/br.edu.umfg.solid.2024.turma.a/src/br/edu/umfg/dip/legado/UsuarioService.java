package br.edu.umfg.dip.legado;
//classe de alto nivel
public class UsuarioService {
    private final String EMAIL_PADRAO = "minha.empresa@email.com";
    private EmailService emailService;//dependencia direta


    public UsuarioService() {
        this.emailService = new EmailService();//alto acoplamento
    }
    public void registrarUsuario(String email){
        String mensagem = "Bem Vindo! VOcê foi registrado.";
        this.emailService.enviarEmail(EMAIL_PADRAO, email, mensagem);
    }
}
