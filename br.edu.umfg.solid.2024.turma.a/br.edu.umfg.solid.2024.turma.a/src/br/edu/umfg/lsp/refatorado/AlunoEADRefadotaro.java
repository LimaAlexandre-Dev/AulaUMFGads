package br.edu.umfg.lsp.refatorado;

import br.edu.umfg.lsp.legado.AlunoEAD;

public class AlunoEADRefadotaro extends AbstractAluno {
    private String email;
    private String senha;

    public AlunoEADRefadotaro(String ra, String nome, Double notaFinal, String email, String senha) {
        super(ra, nome, notaFinal);
        this.email = email;
        this.senha = senha;
    }
}
