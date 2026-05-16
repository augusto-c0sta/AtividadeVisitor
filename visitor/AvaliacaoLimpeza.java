package visitor;

import model.Administrativo;
import model.Armazem;
import model.Frota;
import model.Producao;

public class AvaliacaoLimpeza implements VisitanteSetor {

    @Override
    public void visitarArmazem(Armazem armazem) {

        System.out.println(" Avaliação de Limpeza Armazém ");

        if (armazem.getQuantidadeEquipamentos() > 50) {
            System.out.println("Necessária limpeza reforçada no armazém");
        } else {
            System.out.println("Armazém limpo e organizado");
        }

        System.out.println();
    }

    @Override
    public void visitarAdministrativo(Administrativo administrativo) {

        System.out.println(" Avaliação de Limpeza Administrativo ");

        if (administrativo.isDocumentosOrganizados()) {
            System.out.println("Mesas e documentos organizados");
        } else {
            System.out.println("Necessária reorganização do setor");
        }

        System.out.println();
    }

    @Override
    public void visitarFrota(Frota frota) {

        System.out.println("Avaliação de Limpeza Frota ");

        if (frota.getQuantidadeVeiculos() > 10) {
            System.out.println(" Lavagem completa da frota recomendada");
        } else {
            System.out.println("Frota limpa e conservada");
        }

        System.out.println();
    }

    @Override
    public void visitarProducao(Producao producao) {

        System.out.println(" Avaliação de Limpeza Produção");

        if (producao.isAmbienteLimpo()) {
            System.out.println("Ambiente de produção limpo");
        } else {
            System.out.println("Setor precisa de higienização");
        }

        System.out.println();
    }
}