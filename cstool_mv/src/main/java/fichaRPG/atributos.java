package fichaRPG;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class atributos {
	
	static int[] atributos = new int[6];
	static int forca = atributos[0];
	static int destreza = atributos[1];
	static int constituicao = atributos[2];
	static int inteligencia = atributos[3];
	static int sabedoria = atributos[4];
	static int carisma = atributos[5];
	static String[] equip = new String[20];
	static String[] classes = {"guerreiro", "mago", "ladrão", "clérigo","paladino","ranger", "bardo", "druida", "mago especialista", "guerreira", "maga", "clériga", "ladra", "paladina", "barda", "maga especialista"};
	static String[] racas = {"Elfo", "Meio-Elfo", "Humano", "Anão", "Halfling", "Gnomo", "Elfa", "Meia-Elfa", "Humana", "Anã", "Gnoma"};
	static int[] resistencias = new int[6];
	static int thaco = 0;
	static int CA = 0;
	static int nivel = 0;
	static int pvs = 0;
	static String tendencia = "";
	static String nome = "";
	static String raca = "";
	static String classe = "";
	

	public static void main(String[] args) {
		
	}
	
	//Dar um nome ao personagem.
	
	public static void nome() {
		Scanner s = new Scanner(System.in);
		int nomeopt = 0;		
	 	if (!nome.isEmpty()) {
	 		System.out.println("Seu nome é " + nome);
	 		System.out.println("Deseja escolher outro nome? Se sim, digite 1, se não, digite 2");
	 		nomeopt = s.nextInt();
	 		if(nomeopt == 1) {
	 			System.out.println("Escolha o seu nome:");
	 		 	nome =  s.nextLine();
	 		 	System.out.println("Seu nome agora é " + nome);
	 		}
	 	}else {
	 		System.out.println("Escolha o seu nome:");
		 	nome =  s.nextLine();
		 	System.out.println("Seu nome agora é " + nome);
	 	}
	}
	
	/*Métodos de geração de atributos. São 6: Força, Destreza, Constituição, Inteligência, Sabedoria e Carisma.
	 O atributos ficam entre 3 e 18 como recomendação, e caso a Força passe de 18, rola-se o d100 para tirar a "Força
	 Extraórdinaria", que se trata de um subatributo que determina força sobre-humana.
	 
	 São 6 métodos diferentes. 5 com rolagem de dados usando o math.random e 1 usando distribuição de pontos.
	 
	 */
	
	public static void metodoI() {
		int upper_bound = 6;
		int ForExt = 0;
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
      		
      		if(atributos[0] ==18) {
				System.out.println(" ");
				System.out.print("Rolando força extraordinária..");
				System.out.println(" ");
				ForExt = dado.nextInt(101);
				ForExt += 1;
				System.out.println("Sua força total é 18/" + ForExt);
				System.out.println(" ");
				}
      		
		System.out.println("Atributos preenchidos!");
        System.out.println("Força = " + atributos[0] + " (" + parcial[0][0] + "+" + parcial[0][1] + "+" + parcial[0][2] + ")" );
        if (atributos [0] == 18 & ForExt >0 ){
			System.out.println("Força: " + atributos[0] + "/" + ForExt + " (" + parcial[0][0] + "+" + parcial[0][1] + "+" + parcial[0][2] + ")"); }
        System.out.println("Destreza = " + atributos[1] + " (" + parcial[1][0] + "+" + parcial[1][1] + "+" + parcial[1][2] + ")");
        System.out.println("Constituição = " + atributos[2] + " (" + parcial[2][0] + "+" + parcial[2][1] + "+" + parcial[2][2] + ")");
        System.out.println("Inteligência = " + atributos[3] + " (" + parcial[3][0] + "+" + parcial[3][1] + "+" + parcial[3][2] + ")");
        System.out.println("Sabedoria = " + atributos[4] + " (" + parcial[4][0] + "+" + parcial[4][1] + "+" + parcial[4][2] + ")");
        System.out.println("Carisma = " + atributos[5] + " (" + parcial[5][0] + "+" + parcial[5][1] + "+" + parcial[5][2] + ")");
        return;
        
      	}else {
      		return;
      	}
      	
      	}
	
	public static void metodoII() {
		int upper_bound = 6;
		int ForExt = 0;
		int rolagem = 0;
		int ValorFinal = 0;
		int[] jogadas = new int [2];
		int resultado = 0;
		int opcao = 0;
		int[][][] parcial = new int[2][6][3];
		Scanner s = new Scanner(System.in);
		Random dado = new Random();
		
		System.out.println("Método II consiste em rolar 3d6 duas vezes, escolher o maior e alocar os resultados na seguinte ordem: Força, Destreza, Constituição, Inteligência, Sabedoria e Carisma.");
		System.out.println("Deseja continuar? Digite 1 para sim e 2 para sair.");
		
		opcao = s.nextInt();
		if(opcao == 1) {
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
			
			if(atributos[0] ==18) {
				System.out.println(" ");
				System.out.print("Rolando força extraordinária..");
				System.out.println(" ");
				ForExt = dado.nextInt(101);
				ForExt += 1;
				System.out.println("Sua força total é 18/" + ForExt);
				System.out.println(" ");
				}
			
		System.out.println("Atributos preenchidos!");
        System.out.println("Força = " + atributos[0] + " (" + parcial[0][0][0] + "+" + parcial[0][0][1] + "+" + parcial[0][0][2] + ") " + "e" + " (" + parcial[1][0][0] + "+" + parcial[1][0][1] + "+" + parcial[1][0][2] + ")" );
        if (atributos [0] == 18 & ForExt >0 ){
			System.out.println("Força: " + atributos[0] + " (" + parcial[0][0][0] + "+" + parcial[0][0][1] + "+" + parcial[0][0][2] + ") " + "e" + " (" + parcial[1][0][0] + "+" + parcial[1][0][1] + "+" + parcial[1][0][2] + ")");}
        System.out.println("Destreza = " + atributos[1] + " (" + parcial[0][1][0] + "+" + parcial[0][1][1] + "+" + parcial[0][1][2] + ") " + "e" + " (" + parcial[1][1][0] + "+" + parcial[1][1][1] + "+" + parcial[1][1][2] + ")");
        System.out.println("Constituição = " + atributos[2] + " (" + parcial[0][2][0] + "+" + parcial[0][2][1] + "+" + parcial[0][2][2] + ") " + "e" + " (" + parcial[1][2][0] + "+" + parcial[1][2][1] + "+" + parcial[1][2][2] + ")");
        System.out.println("Inteligência = " + atributos[3] + " (" + parcial[0][3][0] + "+" + parcial[0][3][1] + "+" + parcial[0][3][2] + ") " + "e" + " (" + parcial[1][3][0] + "+" + parcial[1][3][1] + "+" + parcial[1][3][2] + ")");
        System.out.println("Sabedoria = " + atributos[4] + " (" + parcial[0][4][0] + "+" + parcial[0][4][1] + "+" + parcial[0][4][2] + ") " + "e" + " (" + parcial[1][4][0] + "+" + parcial[1][4][1] + "+" + parcial[1][4][2] + ")");
        System.out.println("Carisma = " + atributos[5] + " (" + parcial[0][5][0] + "+" + parcial[0][5][1] + "+" + parcial[0][5][2] + ") " + "e" + " (" + parcial[1][5][0] + "+" + parcial[1][5][1] + "+" + parcial[1][5][2] + ")");
	}else {
		return;
	}
	}
	
	public static void metodoIII() {
		Random dado = new Random();
		Scanner s = new Scanner(System.in);
		int[] lances = new int[6];
		int ForExt = 0;
		int resultado = 0;
		int upper_bound = 6;
		int jogada = 0;
		int opcao = 0;
		int OpcaoInicial = 0;
		
		System.out.println("Método III consiste em rolar 3d6 e escolher o atributo onde colocar o valor.");
		System.out.println("Deseja continuar? Digite 1 para sim e 2 para sair.");
		
		OpcaoInicial = s.nextInt();
		
		if(OpcaoInicial == 1) {
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
		System.out.println(" ");
        System.out.println("Atributos preenchidos!");
        System.out.println(" ");
        System.out.println("Força = " + atributos[0]);
        if (atributos [0] == 18 & ForExt >0 ){
			System.out.println("Força: " + atributos[0] + "/" + ForExt ); }
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
	
	public static void metodoIV() {
		Random dado = new Random();
		Scanner s = new Scanner(System.in);
		int[] lances = new int[6];
		int[][][] parcial = new int[2][6][3];
		int[] jogadas = new int [2];
		int ForExt = 0;
		int ValorFinal = 0;
		int resultado = 0;
		int upper_bound = 6;
		int jogada = 0;
		int opcao = 0;
		int OpcaoInicial = 0;
		
		System.out.println("Método IV consiste em rolar 3d6 duas vezes, pegar o maior e escolher onde colocar o valor.");
		System.out.println("Deseja continuar? Digite 1 para sim e 2 para sair.");
		
		OpcaoInicial = s.nextInt();
		
			if(OpcaoInicial == 1) {
				for(int i = 0; i<=5 ; i++) {
					for(int w = 0; w<2; w++) {
						for(int r = 0; r<3; r++) {
							jogada = dado.nextInt(upper_bound);
							jogada += 1;
							parcial[w][i][r] = jogada;
							ValorFinal += jogada;
						}
					jogadas[w] = ValorFinal;
					ValorFinal = 0;
					}
				if(jogadas[0]>jogadas[1]) {
					resultado = jogadas[0];
				}else {
					resultado = jogadas[1];
				}
				lances[i] = resultado;
				}
				  for(int z = 0; z<lances.length; z++) {
					  
					System.out.println("O resultado da jogada foi: " + lances[z]);
					System.out.println("Em qual atributo deseja colocar o resultado? Tecle '9' caso queira sair.");
					if(atributos[0] == 0) {
						System.out.println("1 - Força");
					}else if (atributos [0] == 18 & ForExt >0){
						System.out.println("1 - Força: " + atributos[0] + "/" + ForExt);
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
                			if(atributos[0] ==18) {
                				System.out.println(" ");
        						System.out.print("Rolando força extraordinária..");
        						System.out.println(" ");
        						ForExt = dado.nextInt(101);
        						ForExt += 1;
        						System.out.println("Sua força total é 18/" + ForExt);
        						System.out.println(" ");
        						}
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
		System.out.println(" ");
        System.out.println("Atributos preenchidos!");
        System.out.println(" ");
        System.out.println("Força = " + atributos[0]);
        if (atributos [0] == 18 & ForExt >0 ){
			System.out.println("Força: " + atributos[0] + "/" + ForExt ); }
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
	
	public static void metodoV() {			
			Random dado = new Random();
			Scanner s = new Scanner(System.in);
			int[] lances = new int[6];
			int[][] parcial = new int[6][4];
			int ForExt = 0;
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
						resultado = 0;
							for(int r = 0; r<4; r++) {							
								jogada = dado.nextInt(upper_bound);
								jogada += 1;
								parcial[i][r] = jogada;
								resultado += jogada;
								//System.out.println("O resultado da jogada foi: " + parcial[i][r]);
							}
					System.out.println(" ");		
					System.out.println("O resultado total do 4d6 foi: " + resultado);
					System.out.println("As parciais foram: " + parcial[i][0] + " , " + parcial[i][1] + " , " + parcial[i][2] + " , " + parcial[i][3]);
					orgMatrix(parcial);
					System.out.println("O menor valor foi: " + parcial[i][0]);
					resultado -= parcial[i][0];
					lances[i] = resultado;
					System.out.println(" ");
					System.out.println("O resultado da final jogada foi: " + lances[i]);
					System.out.println(" ");
					System.out.println("Em qual atributo deseja colocar o resultado? Tecle '9' caso queira sair.");
						if(atributos[0] == 0) {
							System.out.println("1 - Força");
						}else if (atributos [0] == 18 & ForExt >0){
							System.out.println("1 - Força: " + atributos[0] + "/" + ForExt);
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
	                		if(atributos[0] != lances[i]) {	
	                			atributos[0] = lances[i];
	                			if(atributos[0] ==18) {
	                				System.out.println(" ");
	        						System.out.print("Rolando força extraordinária..");
	        						System.out.println(" ");
	        						ForExt = dado.nextInt(101);
	        						ForExt += 1;
	        						System.out.println("Sua força total é 18/" + ForExt);
	        						System.out.println(" ");
	        						}
	                			break;
	                		}else{
	                			System.out.println("Esse atributo já foi alocado. Escolha outro ou altere mais tarde.");
	                			break;
	                		}
						case 2: // colocar em Destreza
							if(atributos[1] != lances[i]) {	
								atributos[1] = lances[i];
								break;
							}else{
								System.out.println("Esse atributo já foi alocado. Escolha outro ou altere mais tarde.");
								break;
							}
						case 3:// colocar em Constituição
							if(atributos[2] != lances[i]) {	
								atributos[2] = lances[i];
								break;
							}else{
								System.out.println("Esse atributo já foi alocado. Escolha outro ou altere mais tarde.");
								break;
							}
						case 4: // colocar em Inteligência
							if(atributos[3] != lances[i]) {	
								atributos[3] = lances[i];
	            			break;
							}else{
								System.out.println("Esse atributo já foi alocado. Escolha outro ou altere mais tarde.");
	            			break;
							}
						case 5: // colocar em Sabedoria
							if(atributos[4] != lances[i]) {	
								atributos[4] = lances[i];
	            			break;
							}else{
								System.out.println("Esse atributo já foi alocado. Escolha outro ou altere mais tarde.");
	            			break;
							}
						case 6: // colocar em Carisma
							if(atributos[5] != lances[i]) {	
								atributos[5] = lances[i];
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
			System.out.println(" ");
	        System.out.println("Atributos preenchidos!");
	        System.out.println(" ");
	        System.out.println("Força = " + atributos[0]);
	        if (atributos [0] == 18 & ForExt >0 ){
				System.out.println("Força: " + atributos[0] + "/" + ForExt ); }
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

	
	
	public static void metodoVI() {
		Random dado = new Random();
		int ForExt = 0;
		int score = 75;
		int valor[] = new int[6];
		int OpcaoInicial = 0;
		int opcao = 0;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Método VI consiste em distribuir 75 pontos entre os 6 atributos, com o mínimo sendo 3 e o máximo sendo 18.");
		System.out.println("Deseja continuar? Digite 1 para sim e 2 para sair.");
		
		OpcaoInicial = s.nextInt();
		
		if(OpcaoInicial == 1) {
				
			for(int z = 0; z<valor.length && score>0 && opcao !=9; z++) {
				if (score < 0) {
					score = 0;
				}				
				System.out.println(" ");
				System.out.println("Você tem " + score + " pontos para distribuir.");
				System.out.println("Em qual atributo deseja colocar pontos? Tecle '9' caso queira sair.");
				if(atributos[0] == 0) {
					System.out.println("1 - Força");
				}else if (atributos [0] == 18 & ForExt >0){
					System.out.println("1 - Força: " + atributos[0] + "/" + ForExt);
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
            		if(atributos[0] == 0) {
            			while(valor[z] <3 | valor[z]>18) {
							System.out.println(" ");
							System.out.print("Digite o valor que quer colocar: ");
							valor[z] = s.nextInt();
							if(valor[z]<=18 && valor[z]>=3) {
								atributos[0] = valor[z];
								score -= valor[z];
							}else {
								System.out.print("O atributo deve ser menor que 18 e maior que 3. Coloque outro valor.");	
							}
						}
						
            			if(atributos[0] ==18) {
            				System.out.println(" ");
    						System.out.print("Rolando força extraordinária..");
    						System.out.println(" ");
    						ForExt = dado.nextInt(101);
    						ForExt += 1;
    						System.out.println("Sua força total é 18/" + ForExt);
    						System.out.println(" ");
    						}
            			break;
            		}else{
            			System.out.println("Esse atributo já foi alocado. Escolha outro ou altere mais tarde.");
            			break;
            		}
		
				case 2: // colocar em Destreza
					if(atributos[1] == 0) {
							while(valor[z] <3 | valor[z]>18) {
								System.out.println(" ");
								System.out.print("Digite o valor que quer colocar: ");
								valor[z] = s.nextInt();
								if(valor[z]<18 && valor[z]>3) {
									atributos[1] = valor[z];
									score -= valor[z];
								}else{
									System.out.print("O atributo deve ser menor que 18 e maior que 3. Coloque outro valor.");	
								}
							}	
						break;
					}else{
						System.out.println("Esse atributo já foi alocado. Escolha outro ou altere mais tarde.");
						break;
					}
				case 3:// colocar em Constituição
					if(atributos[2] == 0) {
						while(valor[z] >18 | valor[z]<3) {
							System.out.println(" ");
							System.out.print("Digite o valor que quer colocar: ");
							valor[z] = s.nextInt();
							if(valor[z]<18 && valor[z]>3) {
								atributos[2] = valor[z];
								score -= valor[z];
							}else {
								System.out.print("O atributo deve ser menor que 18 e maior que 3. Coloque outro valor.");	
							}
						}
						break;
					}else{
						System.out.println("Esse atributo já foi alocado. Escolha outro ou altere mais tarde.");
						break;
					}
				case 4: // colocar em Inteligência
					if(atributos[3] == 0) {
						while(valor[z] >18 | valor[z]<3) {
							System.out.println(" ");
							System.out.print("Digite o valor que quer colocar: ");
							valor[z] = s.nextInt();
							if(valor[z]<18 && valor[z]>3) {
								atributos[3] = valor[z];
								score -= valor[z];
							}else {
								System.out.print("O atributo deve ser menor que 18 e maior que 3. Coloque outro valor.");	
							}
						}
        			break;
					}else{
						System.out.println("Esse atributo já foi alocado. Escolha outro ou altere mais tarde.");
        			break;
					}
				case 5: // colocar em Sabedoria
					if(atributos[4] == 0) {
						while(valor[z] <3 | valor[z]>18) {
							System.out.println(" ");
							System.out.print("Digite o valor que quer colocar: ");
							valor[z] = s.nextInt();
							if(valor[z]<18 && valor[z]>3) {
								atributos[4] = valor[z];
								score -= valor[z];
							}else {
								System.out.print("O atributo deve ser menor que 18 e maior que 3. Coloque outro valor.");	
							}
						}
        			break;
					}else{
						System.out.println("Esse atributo já foi alocado. Escolha outro ou altere mais tarde.");
        			break;
					}
				case 6: // colocar em Carisma
					if(atributos[5] == 0) {
						while(valor[z] <3 | valor[z]>18) {
							System.out.println(" ");
							System.out.print("Digite o valor que quer colocar: ");
							valor[z] = s.nextInt();
							if(valor[z]<18 && valor[z]>3) {
								atributos[5] = valor[z];
								score -= valor[z];
							}else {
								System.out.print("O atributo deve ser menor que 18 e maior que 3. Coloque outro valor.");	
							}
						}
        			break;
					}else{
						System.out.println("Esse atributo já foi alocado. Escolha outro ou altere mais tarde.");
        			break;
					}
				default:
					return;
				}
            try { 	Thread.sleep(1000);  }

            catch(Exception e)  {   e.printStackTrace(); }
			  }
			
    // Definidos os atributos...
			
	System.out.println(" ");
    System.out.println("Atributos preenchidos!");
    System.out.println(" ");
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
		
	

	public static void SetClass(String classe) {
		if(classe.equalsIgnoreCase("guerreiro") | classe.equalsIgnoreCase("paladino") | classe.equalsIgnoreCase("ranger")) {
			GetThaco(classe, nivel);
			//getHitPoints(classe, nivel);
			
		}else if(classe.equalsIgnoreCase("ladrão") | classe.equalsIgnoreCase("bardo")) {
			//getThaco(classe, nivel);
			//getHitPoints(classe, nivel);
			
		}else if(classe.equalsIgnoreCase("clérigo") | classe.equalsIgnoreCase("druida")) {
			//getThaco(classe, nivel);]
			//getHitPoints(classe, nivel);
			
		}else if(classe.equalsIgnoreCase("mago") | classe.equalsIgnoreCase("mago especialista")) {
			//getThaco(classe, nivel);
			//getHitPoints(classe, nivel);
		}
	
	}
	
	/*Pegar o grupo de classe: homem de armas(guerreiro, paladino ou ranger), arcano(arcano ou arcano especialista), 
	sacerdote(clérigo ou druida) ou ladino(ladrão ou bardo).*/
	
	public static int GetClassGroup(String classe) {
		
			int clIndex = 0;
		
			if(classe.equalsIgnoreCase("guerreiro") | classe.equalsIgnoreCase("paladino") | classe.equalsIgnoreCase("ranger")) {
				clIndex = 2;				
			}else if(classe.equalsIgnoreCase("ladrão") | classe.equalsIgnoreCase("bardo")) {							
				clIndex = 1;			
			}else if(classe.equalsIgnoreCase("clérigo") | classe.equalsIgnoreCase("druida")) {
				clIndex = 0;
			}else if(classe.equalsIgnoreCase("mago") | classe.equalsIgnoreCase("mago especialista")) {
				clIndex = 3;
			}
		
			return clIndex;
	}
	
	/*Pegar a THAC0 (Tentativa de Atacar Categoria Zero, que seria a habilidade base de combate do personagem). 
	Esse parâmetro é definido pelo grupo de classes.*/
	
	public static void GetThaco(String classe, int nivel) {
			int GrupoClasseIndex = 0;
			int[][] thacos = {{20, 20, 20, 20},{20, 20, 19, 20},{20, 19, 18, 20},{18, 19, 17, 19},
					{18, 18, 16, 19},{18, 18, 15, 19}, {16, 17, 14, 18}, {16, 17, 14, 18}, {16, 17, 13, 18},
					{16, 16, 12, 18}, {14, 16, 11, 17}, {14, 15, 10, 17}, {14, 15, 9, 17}, {12, 14, 8, 16}, 
					{12, 14, 7, 16}, {12, 14, 6, 16}, {10, 13, 5, 15}, {10, 12, 4, 15}, {10, 12, 3, 15}, 
					{8, 11, 2, 14}, {8, 11, 1, 14}};
			
			nivel = nivel -1;
			
			GrupoClasseIndex = GetClassGroup(classe);
						
			thaco = thacos[nivel][GrupoClasseIndex];
		}
	
	//Assimilar o equipamento básico(depende do grupo de classes).
	
	public static void GetEquip(String classe) {
			int GrupoClasseIndex = 0;
			GrupoClasseIndex = GetClassGroup(classe);
			if (GrupoClasseIndex == 0) {
			
			}else if (GrupoClasseIndex == 1) {
			
			}else if (GrupoClasseIndex == 2) {
			
			}else if (GrupoClasseIndex == 3) {
			
			}
		}
	
	}



