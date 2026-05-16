package model;

import visitor.VisitanteSetor;

public class Frota implements Setor {

    private int quantidadeVeiculos;
    private boolean manutencaoEmDia;
    private String supervisor;

    public Frota(int quantidadeVeiculos, boolean manutencaoEmDia, String supervisor) {
        this.quantidadeVeiculos = quantidadeVeiculos;
        this.manutencaoEmDia = manutencaoEmDia;
        this.supervisor = supervisor;
    }

    public int getQuantidadeVeiculos() {
        return quantidadeVeiculos;
    }

    public boolean isManutencaoEmDia() {
        return manutencaoEmDia;
    }

    public String getSupervisor() {
        return supervisor;
    }

    @Override
    public void aceitar(VisitanteSetor visitante) {
        visitante.visitarFrota(this);
    }
}