package fichaRPG;

import java.util.Scanner;
import java.util.Random;

public class MetodoVI {

	public static void main(String[] args) {
		Random dado = new Random();
		int[] atributos = new int[6];
		int ForExt = 0;
		int score = 75;
		int valor[] = new int[6];
		int OpcaoInicial = 0;
		int opcao = 0;
		Scanner s = new Scanner(System.in);
		
		System.out.println("M�todo VI consiste em distribuir 75 pontos entre os 6 atributos, com o m�nimo sendo 3 e o m�ximo sendo 18.");
		System.out.println("Deseja continuar? Digite 1 para sim e 2 para sair.");
		
		OpcaoInicial = s.nextInt();
		
		if(OpcaoInicial == 1) {
				
			for(int z = 0; z<valor.length && score>0 && opcao !=9; z++) {
				if (score < 0) {
					score = 0;
				}				
				System.out.println(" ");
				System.out.println("Voc� tem " + score + " pontos para distribuir.");
				System.out.println("Em qual atributo deseja colocar pontos? Tecle '9' caso queira sair.");
				if(atributos[0] == 0) {
					System.out.println("1 - For�a");
				}else if (atributos [0] == 18 & ForExt >0){
					System.out.println("1 - For�a: " + atributos[0] + "/" + ForExt);
				}else{
					System.out.println("1 - For�a: " + atributos[0]);	
				}
				if(atributos[1] == 0) {
					System.out.println("2 - Destreza");
				}else{
					System.out.println("2 - Destreza: " + atributos[1]);	
				}
				if(atributos[2] == 0) {
					System.out.println("3 - Constitui��o");
				}else{
					System.out.println("3 - Constitui��o: " + atributos[2]);	
				}
				if(atributos[3] == 0) {
					System.out.println("4 - Intelig�ncia");
				}else{
					System.out.println("4 - Intelig�ncia: " + atributos[3]);	
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
				System.out.print("Sua op��o: ");
					
				opcao = s.nextInt();
				
				switch (opcao)  {
				case 1: // colocar em For�a
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
    						System.out.print("Rolando for�a extraordin�ria..");
    						System.out.println(" ");
    						ForExt = dado.nextInt(101);
    						ForExt += 1;
    						System.out.println("Sua for�a total � 18/" + ForExt);
    						System.out.println(" ");
    						}
            			break;
            		}else{
            			System.out.println("Esse atributo j� foi alocado. Escolha outro ou altere mais tarde.");
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
						System.out.println("Esse atributo j� foi alocado. Escolha outro ou altere mais tarde.");
						break;
					}
				case 3:// colocar em Constitui��o
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
						System.out.println("Esse atributo j� foi alocado. Escolha outro ou altere mais tarde.");
						break;
					}
				case 4: // colocar em Intelig�ncia
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
						System.out.println("Esse atributo j� foi alocado. Escolha outro ou altere mais tarde.");
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
						System.out.println("Esse atributo j� foi alocado. Escolha outro ou altere mais tarde.");
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
						System.out.println("Esse atributo j� foi alocado. Escolha outro ou altere mais tarde.");
        			break;
					}
				default:
					return;
				}
            try { 	Thread.sleep(1000);  }

            catch(Exception e)  {   e.printStackTrace(); }
			  }
			
    // encerramento do programa...
	System.out.println(" ");
    System.out.println("Atributos preenchidos!");
    System.out.println(" ");
    System.out.println("For�a = " + atributos[0]);
    System.out.println("Destreza = " + atributos[1]);
    System.out.println("Constitui��o = " + atributos[2]);
    System.out.println("Intelig�ncia = " + atributos[3]);
    System.out.println("Sabedoria = " + atributos[4]);
    System.out.println("Carisma = " + atributos[5]);
	return;
		//atributos[i] = jogada;
			
	}else {
		return;	
		}
	}
}



