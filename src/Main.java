
import model.EquipeManutencao;
import model.TrechoRodovia;

public class Main {
    public static void main(String[] args) {
        double limiteVegetacaoCritica = 30.0;

        TrechoRodovia trechoSerra = new TrechoRodovia("BR-116", 10, 15, 10);
        TrechoRodovia trechoVale = new TrechoRodovia("SP-348", 40, 45, 22);

        trechoSerra.registrarCrescimento(5);
        trechoVale.registrarCrescimento(13);

        EquipeManutencao equipeRocada = new EquipeManutencao("Equipe Alfa", 4, "rocada mecanizada");

        TrechoRodovia trechoCritico = trechoSerra;
        if (trechoVale.getNivelVegetacao() > trechoSerra.getNivelVegetacao()) {
            trechoCritico = trechoVale;
        }

        if (trechoCritico.verificarCriticidade(limiteVegetacaoCritica)) {
            trechoCritico.associarEquipeManutencao(equipeRocada);
        }

        System.out.println("Monitoramento de vegetacao em rodovias");
        System.out.println("--------------------------------------");

        String statusTrechoSerra = "normal";
        if (trechoSerra.verificarCriticidade(limiteVegetacaoCritica)) {
            statusTrechoSerra = "CRITICO";
        }

        String statusTrechoVale = "normal";
        if (trechoVale.verificarCriticidade(limiteVegetacaoCritica)) {
            statusTrechoVale = "CRITICO";
        }

        System.out.println(trechoSerra.obterDescricao() + " | vegetacao: " + trechoSerra.getNivelVegetacao() + " cm | status: " + statusTrechoSerra);
        System.out.println(trechoVale.obterDescricao() + " | vegetacao: " + trechoVale.getNivelVegetacao() + " cm | status: " + statusTrechoVale);

        System.out.println();
        if (trechoCritico.getEquipeManutencao() != null) {
            System.out.println("Prioridade de atendimento:");
            System.out.println(trechoCritico.obterDescricao() + " recebeu " + trechoCritico.getEquipeManutencao().obterResumo());
        } else {
            System.out.println("Nenhum trecho ultrapassou o limite critico de vegetacao.");
        }
    }
}
