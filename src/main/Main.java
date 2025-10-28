package main;
import main.model.Corrida;
import main.model.Veiculo;
public class Main {

	public static void main(String[] args) {
		Veiculo veiculo1=new Veiculo("Supra");
		Veiculo veiculo2=new Veiculo("GTR-R34");
		Corrida corrida=new Corrida(veiculo1, veiculo2);
		corrida.iniciarCorrida();
	}

}
