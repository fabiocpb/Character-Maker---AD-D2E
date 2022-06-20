package fichaRPG;

import java.util.Random;

public class MetodoII {

	public static void main(String[] args) {
		int[] atributos = new int[6];
		int upper_bound = 6;
		int rolagem = 0;
		int ValorFinal = 0;
		int[] jogadas = new int [2];
		int resultado = 0;
		int[][][] parcial = new int[2][6][3];
		Random dado = new Random();	
		for(int i = 0; i<=5 ; i++) {
			for(int z = 0; z<2; z++) {
					for(int r = 0; r<3; r++) {
						rolagem = dado.nextInt(upper_bound);
						rolagem += 1;
						parcial[z][i][r] = rolagem;
						ValorFinal += rolagem;
					}
				jogadas[z] = ValorFinal;
				ValorFinal = 0;
			}
			if(jogadas[0]>jogadas[1]) {
				resultado = jogadas[0];
			}else {
				resultado = jogadas[1];
			}
			atributos[i] = resultado;
		}
		System.out.println("Atributos preenchidos!");
        System.out.println("Força = " + atributos[0] + " (" + parcial[0][0][0] + "+" + parcial[0][0][1] + "+" + parcial[0][0][2] + ") " + "e" + " (" + parcial[1][0][0] + "+" + parcial[1][0][1] + "+" + parcial[1][0][2] + ")" );
        System.out.println("Destreza = " + atributos[1] + " (" + parcial[0][1][0] + "+" + parcial[0][1][1] + "+" + parcial[0][1][2] + ") " + "e" + " (" + parcial[1][1][0] + "+" + parcial[1][1][1] + "+" + parcial[1][1][2] + ")");
        System.out.println("Constituição = " + atributos[2] + " (" + parcial[0][2][0] + "+" + parcial[0][2][1] + "+" + parcial[0][2][2] + ") " + "e" + " (" + parcial[1][2][0] + "+" + parcial[1][2][1] + "+" + parcial[1][2][2] + ")");
        System.out.println("Inteligência = " + atributos[3] + " (" + parcial[0][3][0] + "+" + parcial[0][3][1] + "+" + parcial[0][3][2] + ") " + "e" + " (" + parcial[1][3][0] + "+" + parcial[1][3][1] + "+" + parcial[1][3][2] + ")");
        System.out.println("Sabedoria = " + atributos[4] + " (" + parcial[0][4][0] + "+" + parcial[0][4][1] + "+" + parcial[0][4][2] + ") " + "e" + " (" + parcial[1][4][0] + "+" + parcial[1][4][1] + "+" + parcial[1][4][2] + ")");
        System.out.println("Carisma = " + atributos[5] + " (" + parcial[0][5][0] + "+" + parcial[0][5][1] + "+" + parcial[0][5][2] + ") " + "e" + " (" + parcial[1][5][0] + "+" + parcial[1][5][1] + "+" + parcial[1][5][2] + ")");
	}

	}


