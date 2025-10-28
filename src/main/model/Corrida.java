	package main.model;

	import main.view.CorridaView;

	public class Corrida {
	    private static final int DISTANCIA_MAXIMA = 50;

	    private Veiculo veiculo1;
	    private Veiculo veiculo2;
	    private boolean terminou;

	    public Corrida(Veiculo veiculo1, Veiculo veiculo2) {
	        this.veiculo1 = veiculo1;
	        this.veiculo2 = veiculo2;
	        this.terminou = false;
	    }

	    public void iniciarCorrida() {
	        CorridaView.exibirInicio();

	        while (!terminou) {
	            veiculo1.sortearVelocidade();
	            veiculo2.sortearVelocidade();

	            veiculo1.atualizarDistancia();
	            veiculo2.atualizarDistancia();

	            CorridaView.exibirEstado(veiculo1, veiculo2, DISTANCIA_MAXIMA);

	            verificarTermino();

	            try {
	                Thread.sleep(300);
	            } catch (InterruptedException e) {
	                Thread.currentThread().interrupt();
	            }
	        }

	        CorridaView.exibirResultado(veiculo1, veiculo2);
	    }

	    private void verificarTermino() {
	        if (veiculo1.getDistanciaPercorrida() >= DISTANCIA_MAXIMA ||
	            veiculo2.getDistanciaPercorrida() >= DISTANCIA_MAXIMA) {
	            terminou = true;
	        }
	    }

	    public boolean terminou() {
	        return terminou;
	    }

	    public Veiculo getVeiculo1() {
	        return veiculo1;
	    }

	    public Veiculo getVeiculo2() {
	        return veiculo2;
	    }

	    public int getDistanciaMaxima() {
	        return DISTANCIA_MAXIMA;
	    }
	}



