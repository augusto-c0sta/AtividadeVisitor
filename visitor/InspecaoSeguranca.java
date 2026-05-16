package visitor;

import model.Administrativo;
import model.Armazem;
import model.Frota;
import model.Producao;

public class InspecaoSeguranca implements VisitanteSetor {

    @Override
    public void visitarArmazem(Armazem armazem) {

        System.out.println(" Inspeção de segurança Armazém ");

        if (armazem.isPossuiProdutosInflamaveis()) {
            System.out.println("Atenção: Produtos inflamáveis exigem cuidados especiais");
        } else {
            System.out.println("Armazém dentro das normas de segurança");
        }

        System.out.println();
    }

    @Override
    public void visitarAdministrativo(Administrativo administrativo) {

        System.out.println(" Inspeção de Segurança Administratio ");

        if (administrativo.getQuantidadeFuncionarios() > 20) {
            System.out.println("Necessário revisar plano de evacuação");
        } else {
            System.out.println("Setor administrativo seguro");
        }

        System.out.println();
    }

    @Override
    public void visitarFrota(Frota frota) {

        System.out.println(" Inspeção de Segurança Frota ");

        if (frota.isManutencaoEmDia()) {
            System.out.println("Veículos com manutenção em dia");
        } else {
            System.out.println("Atenção: Existem veículos sem manutenção");
        }

        System.out.println();
    }

    @Override
    public void visitarProducao(Producao producao) {

        System.out.println(" Inspeçaõ de Segurança Produção");

        if (producao.getNivelRisco().equalsIgnoreCase("alto")) {
            System.out.println("Uso obrigatório de equipamentos de proteção");
        } else {
            System.out.println("Risco operacional controlado");
        }

        System.out.println();
    }
}