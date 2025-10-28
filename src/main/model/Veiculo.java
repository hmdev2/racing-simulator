package main.model;

import main.util.Randomizador;

public class Veiculo {
	 private String nome;
	    private int velocidadeAtual;
	    private int distanciaPercorrida;

	    public Veiculo(String nome) {
	        this.nome = nome;
	        this.velocidadeAtual = 0;
	        this.distanciaPercorrida = 0;
	    }

	    public void sortearVelocidade() {
	        this.velocidadeAtual = Randomizador.gerarVelocidade();
	    }

	    public void atualizarDistancia() {
	        this.distanciaPercorrida += this.velocidadeAtual;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public int getVelocidadeAtual() {
	        return velocidadeAtual;
	    }

	    public int getDistanciaPercorrida() {
	        return distanciaPercorrida;
	    }

	    @Override
	    public String toString() {
	        return nome + " Distância: " + distanciaPercorrida + " Velocidade: " + velocidadeAtual;
	    }
}
