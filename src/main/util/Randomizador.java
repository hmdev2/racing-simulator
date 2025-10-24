package main.util;

import java.util.Random;

public class Randomizador {
	private static final Random random = new Random();
    
    public static int gerarVelocidade() {
        return random.nextInt(3) + 1;
    }
}
