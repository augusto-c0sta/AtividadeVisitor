package model;

import visitor.VisitanteSetor;

public class Administrativo implements Setor {

    private String gerente;
    private int quantidadeFuncionarios;
    private boolean documentosOrganizados;

    public Administrativo(String gerente, int quantidadeFuncionarios, boolean documentosOrganizados) {
        this.gerente = gerente;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.documentosOrganizados = documentosOrganizados;
    }

    public String getGerente() {
        return gerente;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public boolean isDocumentosOrganizados() {
        return documentosOrganizados;
    }

    @Override
    public void aceitar(VisitanteSetor visitante) {
        visitante.visitarAdministrativo(this);
    }
}