package model;

import visitor.VisitanteSetor;

public class Producao implements Setor {

    private int quantidadeMaquinas;
    private String nivelRisco;
    private boolean ambienteLimpo;

    public Producao(int quantidadeMaquinas, String nivelRisco, boolean ambienteLimpo) {
        this.quantidadeMaquinas = quantidadeMaquinas;
        this.nivelRisco = nivelRisco;
        this.ambienteLimpo = ambienteLimpo;
    }

    public int getQuantidadeMaquinas() {
        return quantidadeMaquinas;
    }

    public String getNivelRisco() {
        return nivelRisco;
    }

    public boolean isAmbienteLimpo() {
        return ambienteLimpo;
    }

    @Override
    public void aceitar(VisitanteSetor visitante) {
        visitante.visitarProducao(this);
    }
}