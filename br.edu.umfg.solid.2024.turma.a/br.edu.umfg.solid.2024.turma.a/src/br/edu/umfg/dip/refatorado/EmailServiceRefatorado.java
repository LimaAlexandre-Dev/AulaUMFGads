package br.edu.umfg.dip.refatorado;

public class EmailServiceRefatorado implements IEmailService{
    //implementacao concreta
    @Override
    public void enviarEmail(String remetente,
                            String destinatario,
                            String mensagem) {
        System.out.println("De: " + remetente + "\n" +
                "Para: " + destinatario + "\n" +
                "Mensagem: " + mensagem);

    }
}
