package fichaRPG;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MetodoV {
	
	public static int orgMatrix(int a[][]){  
		int temp;  
		 
			for (int r = 0; r < a.length; r++) 
			      {
		            for (int j = 0; j < a[r].length; j++)   
		            {  
		              for(int k =0; k< a[r].length - j - 1; k++ ) {  
		            	if (a[r][k] > a[r][k + 1])   
		                {  
		                    temp = a[r][k];  
		                    a[r][k] = a[r][k + 1];  
		                    a[r][k + 1] = temp;  
		                }
		              }
		            }
				  }  
		         
		       return 0;  
		}  
	
	public static void main(String[] args) {
		int[] atributos = new int[6];
		Random dado = new Random();
		Scanner s = new Scanner(System.in);
		int[] lances = new int[6];
		int[][] parcial = new int[6][4];
		int resultado = 0;
		int menorValor = 0;
		int upper_bound = 6;
		int jogada = 0;
		int opcao = 0;
		int OpcaoInicial = 0;
		
		System.out.println("Método V consiste em rolar 4d6 excluir o menor resultado no d6 e escolher onde colocar o valor.");
		System.out.println("Deseja continuar? Digite 1 para sim e 2 para sair.");
		
		OpcaoInicial = s.nextInt();
		
			if(OpcaoInicial == 1) {
				for(int i = 0; i<=5 ; i++) {					
						for(int r = 0; r<4; r++) {							
							jogada = dado.nextInt(upper_bound);
							jogada += 1;
							parcial[i][r] = jogada;
							resultado += jogada;
							//System.out.println("O resultado da jogada foi: " + parcial[i][r]);
						}
				System.out.println("O resultado total do 4d6 foi: " + resultado);
				System.out.println("As parciais foram: " + parcial[i][0] + " , " + parcial[i][1] + " , " + parcial[i][2] + " , " + parcial[i][3]);
				orgMatrix(parcial);
				System.out.println("O menor valor foi: " + parcial[i][0]);
				resultado -= parcial[i][0];
				System.out.println("O resultado total do 4d6 tirando o menor valor foi: " + resultado);
				lances[i] = resultado;
				resultado = 0;
				}
		
				  for(int z = 0; z<lances.length; z++) {
					  
					System.out.println("O resultado da jogada foi: " + lances[z]);
					System.out.println("Em qual atributo deseja colocar o resultado? Tecle '9' caso queira sair.");
					if(atributos[0] == 0) {
						System.out.println("1 - Força");
					}else{
						System.out.println("1 - Força: " + atributos[0]);	
					}
					if(atributos[1] == 0) {
						System.out.println("2 - Destreza");
					}else{
						System.out.println("2 - Destreza: " + atributos[1]);	
					}
					if(atributos[2] == 0) {
						System.out.println("3 - Constituição");
					}else{
						System.out.println("3 - Constituição: " + atributos[2]);	
					}
					if(atributos[3] == 0) {
						System.out.println("4 - Inteligência");
					}else{
						System.out.println("4 - Inteligência: " + atributos[3]);	
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
					System.out.print("Sua opção: ");
						
					opcao = s.nextInt();
					
					switch (opcao)  {
					case 1: // colocar em Força
                		if(atributos[0] != lances[z]) {	
                			atributos[0] = lances[z];
                			break;
                		}else{
                			System.out.println("Esse atributo já foi alocado. Escolha outro ou altere mais tarde.");
                			break;
                		}
					case 2: // colocar em Destreza
						if(atributos[1] != lances[z]) {	
							atributos[1] = lances[z];
							break;
						}else{
							System.out.println("Esse atributo já foi alocado. Escolha outro ou altere mais tarde.");
							break;
						}
					case 3:// colocar em Constituição
						if(atributos[2] != lances[z]) {	
							atributos[2] = lances[z];
							break;
						}else{
							System.out.println("Esse atributo já foi alocado. Escolha outro ou altere mais tarde.");
							break;
						}
					case 4: // colocar em Inteligência
						if(atributos[3] != lances[z]) {	
							atributos[3] = lances[z];
            			break;
						}else{
							System.out.println("Esse atributo já foi alocado. Escolha outro ou altere mais tarde.");
            			break;
						}
					case 5: // colocar em Sabedoria
						if(atributos[4] != lances[z]) {	
							atributos[4] = lances[z];
            			break;
						}else{
							System.out.println("Esse atributo já foi alocado. Escolha outro ou altere mais tarde.");
            			break;
						}
					case 6: // colocar em Carisma
						if(atributos[5] != lances[z]) {	
							atributos[5] = lances[z];
            			break;
						}else{
							System.out.println("Esse atributo já foi alocado. Escolha outro ou altere mais tarde.");
            			break;
						}
					default: 
						break;
					}
                try { 	Thread.sleep(1000);  }

                catch(Exception e)  {   e.printStackTrace(); }
				  }
			
        // encerramento do programa...
        System.out.println("Atributos preenchidos!");
        System.out.println("Força = " + atributos[0]);
        System.out.println("Destreza = " + atributos[1]);
        System.out.println("Constituição = " + atributos[2]);
        System.out.println("Inteligência = " + atributos[3]);
        System.out.println("Sabedoria = " + atributos[4]);
        System.out.println("Carisma = " + atributos[5]);
		return;
			//atributos[i] = jogada;
		
		}else {
			return;
		}
	}

}
