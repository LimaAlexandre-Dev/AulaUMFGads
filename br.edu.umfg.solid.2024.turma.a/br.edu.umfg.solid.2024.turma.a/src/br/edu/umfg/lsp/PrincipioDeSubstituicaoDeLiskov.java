package br.edu.umfg.lsp;

import br.edu.umfg.lsp.legado.AlunoEAD;
import br.edu.umfg.lsp.legado.AlunoPresencial;
import br.edu.umfg.lsp.refatorado.AbstractAluno;
import br.edu.umfg.lsp.refatorado.AlunoEADRefadotaro;
import br.edu.umfg.lsp.refatorado.AlunoPresencialRefatorado;

import java.sql.SQLOutput;

public class PrincipioDeSubstituicaoDeLiskov {
    public static void executarLegado(){
        AlunoPresencial alunoPresencial = new AlunoPresencial("001", "teste 1", 8.7);
        AlunoEAD alunoEAD = new AlunoEAD("002", "Teste 2 ", 9.3, "test2@gmail.com", "123Mudar@");

        System.out.println(("RA | NOME | NOTA FINAL"));
        System.out.println(alunoPresencial.getRa() + " | " + alunoPresencial.getNome() + " | " + alunoPresencial.getNotaFinal());
        System.out.println(alunoEAD.getRa() + " | " + alunoEAD.getNome() + " | " + alunoEAD.getNotaFinal());
    }

    public static void executarRefatorado(){
        AlunoPresencialRefatorado alunoPresencialRefatorado = new AlunoPresencialRefatorado("001", "teste 1", 8.7);
        AlunoEADRefadotaro alunoEADRefadotaro = new AlunoEADRefadotaro("002", "Teste 2", 9.3, "test2@gmail.com", "123Mudar@");

        System.out.println(("RA | NOME | NOTA FINAL"));

    }
    private static void imprimir(AbstractAluno aluno){
        System.out.println(aluno.getRa()+ " | " + aluno.getNome() + " | " + aluno.getNotaFinal());
    }
}
