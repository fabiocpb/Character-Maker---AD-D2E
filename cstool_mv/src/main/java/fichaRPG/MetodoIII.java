package fichaRPG;

import java.util.Random;
import java.util.Scanner;

public class MetodoIII {

	public static void main(String[] args) {
		int[] atributos = new int[6];
		Random dado = new Random();
		Scanner s = new Scanner(System.in);
		int[] lances = new int[6];
		int resultado = 0;
		int upper_bound = 6;
		int jogada = 0;
		int opcao = 0;
		
		for(int i = 0; i<atributos.length; i++) {
			
			resultado = 0;
			
				for(int r = 0; r<3; r++) {					
					jogada = dado.nextInt(upper_bound);
					jogada += 1;
					resultado += jogada;
				}
				
			lances[i] = resultado;
			System.out.println(lances[i]);							
		}
		
				  for(int z = 0; z<lances.length; z++) {
					  
					System.out.println("O resultado da jogada foi: " + lances[z]);
					System.out.println("Em qual atributo deseja colocar o resultado? Tecle '9' caso queira sair.");
					if(atributos[0] == 0) {
						System.out.println("1 - For?a");
					}else{
						System.out.println("1 - For?a: " + atributos[0]);	
					}
					if(atributos[1] == 0) {
						System.out.println("2 - Destreza");
					}else{
						System.out.println("2 - Destreza: " + atributos[1]);	
					}
					if(atributos[2] == 0) {
						System.out.println("3 - Constitui??o");
					}else{
						System.out.println("3 - Constitui??o: " + atributos[2]);	
					}
					if(atributos[3] == 0) {
						System.out.println("4 - Intelig?ncia");
					}else{
						System.out.println("4 - Intelig?ncia: " + atributos[3]);	
					}
					if(atributos[4] == 0) {
						System.out.println("5 - Sabedoria");
					}else{
						System.out.println("5 - Sabedoria: " + atributos[4]);	
					}
					if(atributos[5] == 0) {
						System.out.println("6 - Carisma");
					}else{
						System.out.println("6 - Carisma: " + atributos[5]);	
					}
					System.out.print("Sua op??o: ");
						
					opcao = s.nextInt();
					
					switch (opcao)  {
					case 1: // colocar em For?a
                		if(atributos[0] != lances[z]) {	
                			atributos[0] = lances[z];
                			break;
                		}else{
                			System.out.println("Esse atributo j? foi alocado. Escolha outro ou altere mais tarde.");
                			break;
                		}
					case 2: // colocar em Destreza
						if(atributos[1] != lances[z]) {	
							atributos[1] = lances[z];
							break;
						}else{
							System.out.println("Esse atributo j? foi alocado. Escolha outro ou altere mais tarde.");
							break;
						}
					case 3:// colocar em Constitui??o
						if(atributos[2] != lances[z]) {	
							atributos[2] = lances[z];
							break;
						}else{
							System.out.println("Esse atributo j? foi alocado. Escolha outro ou altere mais tarde.");
							break;
						}
					case 4: // colocar em Intelig?ncia
						if(atributos[3] != lances[z]) {	
							atributos[3] = lances[z];
            			break;
						}else{
							System.out.println("Esse atributo j? foi alocado. Escolha outro ou altere mais tarde.");
            			break;
						}
					case 5: // colocar em Sabedoria
						if(atributos[4] != lances[z]) {	
							atributos[4] = lances[z];
            			break;
						}else{
							System.out.println("Esse atributo j? foi alocado. Escolha outro ou altere mais tarde.");
            			break;
						}
					case 6: // colocar em Carisma
						if(atributos[5] != lances[z]) {	
							atributos[5] = lances[z];
            			break;
						}else{
							System.out.println("Esse atributo j? foi alocado. Escolha outro ou altere mais tarde.");
            			break;
						}
					default: 
						break;
					}
                try { 	Thread.sleep(3000);  }

                catch(Exception e)  {   e.printStackTrace(); }
				  }
			
        // encerramento do programa...
        System.out.println("Atributos preenchidos!");
        System.out.println("For?a = " + atributos[0]);
        System.out.println("Destreza = " + atributos[1]);
        System.out.println("Constitui??o = " + atributos[2]);
        System.out.println("Intelig?ncia = " + atributos[3]);
        System.out.println("Sabedoria = " + atributos[4]);
        System.out.println("Carisma = " + atributos[5]);
		return;
			//atributos[i] = jogada;
		
		}
}
