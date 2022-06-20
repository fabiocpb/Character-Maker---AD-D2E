package fichaRPG;
import java.util.Random;
import java.util.Scanner;

public class MetodoI {

	public static void main(String[] args) {
		int[] atributos = new int[6];
		int upper_bound = 6;
		int jogada = 0;
		int ValorFinal = 0;
		int opcao = 0;
		int[][] parcial = new int[6][3];
		Random dado = new Random();
		Scanner s = new Scanner(System.in);
		
		System.out.println("Método I consiste em rolar 3d6 e alocar os resultados na seguinte ordem: Força, Destreza, Constituição, Inteligência, Sabedoria e Carisma.");
		System.out.println("Deseja continuar? Digite 1 para sim e 2 para sair.");
		
		opcao = s.nextInt();
		
      	if (opcao == 1) {	
      		for(int i = 0; i<=atributos.length -1; i++) {			
				for(int r = 0; r<3; r++) {
					jogada = dado.nextInt(upper_bound);
					jogada += 1;
					parcial[i][r] = jogada;
					ValorFinal += jogada;
					}
			//System.out.println(parcial[i][0] + "," + parcial[i][1] + "," + parcial[i][2]);
			atributos[i] = ValorFinal;
			//System.out.println(atributos[i]);
			ValorFinal = 0;
      		}
      		
		System.out.println("Atributos preenchidos!");
		
        System.out.println("Força = " + atributos[0] + " (" + parcial[0][0] + "+" + parcial[0][1] + "+" + parcial[0][2] + ")" );
        System.out.println("Destreza = " + atributos[1] + " (" + parcial[1][0] + "+" + parcial[1][1] + "+" + parcial[1][2] + ")");
        System.out.println("Constituição = " + atributos[2] + " (" + parcial[2][0] + "+" + parcial[2][1] + "+" + parcial[2][2] + ")");
        System.out.println("Inteligência = " + atributos[3] + " (" + parcial[3][0] + "+" + parcial[3][1] + "+" + parcial[3][2] + ")");
        System.out.println("Sabedoria = " + atributos[4] + " (" + parcial[4][0] + "+" + parcial[4][1] + "+" + parcial[4][2] + ")");
        System.out.println("Carisma = " + atributos[5] + " (" + parcial[5][0] + "+" + parcial[5][1] + "+" + parcial[5][2] + ")");
        
        System.out.println("Deseja rerolar?");
        
        return;
        
      	}else {
      		
      		return;
      	}
	}
}
