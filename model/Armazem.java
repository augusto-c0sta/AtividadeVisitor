package model;

import visitor.VisitanteSetor;

public class Armazem implements Setor {

    private String responsavel;
    private int quantidadeEquipamentos;
    private boolean possuiProdutosInflamaveis;

    public Armazem(String responsavel, int quantidadeEquipamentos, boolean possuiProdutosInflamaveis) {
        this.responsavel = responsavel;
        this.quantidadeEquipamentos = quantidadeEquipamentos;
        this.possuiProdutosInflamaveis = possuiProdutosInflamaveis;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public int getQuantidadeEquipamentos() {
        return quantidadeEquipamentos;
    }

    public boolean isPossuiProdutosInflamaveis() {
        return possuiProdutosInflamaveis;
    }

    @Override
    public void aceitar(VisitanteSetor visitante) {
        visitante.visitarArmazem(this);
    }
}