package br.edu.umfg.dip;

import br.edu.umfg.dip.legado.UsuarioService;
import br.edu.umfg.dip.refatorado.EmailServiceRefatorado;
import br.edu.umfg.dip.refatorado.IEmailService;
import br.edu.umfg.dip.refatorado.UsuarioServiceRefatorado;

public class PrincipioDeInversaoDeDependencia {
    public static void executarLegado(){
        UsuarioService usuarioService = new UsuarioService();
        usuarioService.registrarUsuario("teste1@email.com");

    }
    public static void executarRefatorado(){
        /*
        a classe de baixo nivel EmailServiceRefatorado
        implementa a abstracao ou seja a interface IEmailService
        isso permite a maior flexibilidade para a injecao/inversao
         de dependencia
         */
        IEmailService emailService = new EmailServiceRefatorado();

        /*
        a classe de alto nivel UsuarioServiceRefatorado
        depende de uma abstracao ou seja a interface IEmailService
        ao inves de uma implementacao (classe concreta EmailService)
        permite maior flexibilidade e substituicao
         */
        UsuarioServiceRefatorado usuarioServiceRefatorado = new UsuarioServiceRefatorado(emailService);
        usuarioServiceRefatorado.registrarUsuario("teste1@email.com");

    }
}
