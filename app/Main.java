package app;

import java.util.ArrayList;
import java.util.List;

import model.Administrativo;
import model.Armazem;
import model.Frota;
import model.Producao;
import model.Setor;
import visitor.AvaliacaoLimpeza;
import visitor.InspecaoSeguranca;
import visitor.VisitanteSetor;

public class Main {

    public static void main(String[] args) {

        List<Setor> setores = new ArrayList<>();

        setores.add(new Armazem("Carlos", 80, true));
        setores.add(new Administrativo("Mariana", 25, false));
        setores.add(new Frota(15, false, "Roberto"));
        setores.add(new Producao(40, "Alto", true));

        VisitanteSetor inspecao = new InspecaoSeguranca();
        VisitanteSetor limpeza = new AvaliacaoLimpeza();

        System.out.println(" Inspeçao de Segurança \n");

        for (Setor setor : setores) {
            setor.aceitar(inspecao);
        }

        System.out.println(" Avaliação de Limpeza \n");

        for (Setor setor : setores) {
            setor.aceitar(limpeza);
        }
    }
}