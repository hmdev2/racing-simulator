package main.view;

import main.model.Veiculo;

public class CorridaView {

    public static void exibirInicio() {
        System.out.println("\n🏁 Iniciando a Corrida! 🏁\n");
    }

    public static void exibirEstado(Veiculo v1, Veiculo v2, int distanciaMaxima) {
        limparConsole();

        System.out.println("--------------------------------------------------");
        imprimirPista(v1, distanciaMaxima);
        System.out.println("--------------------------------------------------");
        imprimirPista(v2, distanciaMaxima);
        System.out.println("--------------------------------------------------");

        System.out.printf("\n%s -> Velocidade: %d | Distância: %d\n",
                v1.getNome(), v1.getVelocidadeAtual(), v1.getDistanciaPercorrida());
        System.out.printf("%s -> Velocidade: %d | Distância: %d\n\n",
                v2.getNome(), v2.getVelocidadeAtual(), v2.getDistanciaPercorrida());
    }

    private static void imprimirPista(Veiculo v, int distanciaMaxima) {
        int posicao = Math.min(v.getDistanciaPercorrida(), distanciaMaxima);
        StringBuilder pista = new StringBuilder();

        for (int i = 0; i < distanciaMaxima; i++) {
            if (i == posicao) {
                pista.append("#");
            } else {
                pista.append(" ");
            }
        }

        System.out.println(pista + " (" + v.getNome() + ")");
    }

    public static void exibirResultado(Veiculo v1, Veiculo v2) {
        System.out.println("\n🏆 Resultado Final 🏆");

        if (v1.getDistanciaPercorrida() >= v2.getDistanciaPercorrida() &&
            v1.getDistanciaPercorrida() >= 50) {
            System.out.println(v1.getNome() + " venceu a corrida!");
        } else if (v2.getDistanciaPercorrida() >= v1.getDistanciaPercorrida() &&
                   v2.getDistanciaPercorrida() >= 50) {
            System.out.println(v2.getNome() + " venceu a corrida!");
        } else {
            System.out.println("A corrida terminou em empate!");
        }
    }

    private static void limparConsole() {
        for (int i = 0; i < 30; i++) {
            System.out.println();
        }
    }
}