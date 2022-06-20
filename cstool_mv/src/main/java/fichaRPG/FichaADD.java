package fichaRPG;
import fichaRPG.atributos;

import java.util.Arrays;
import java.util.Scanner;

public class FichaADD {

	public static void main(String[] args) {
		
		atributos d = new atributos();
		
		Scanner s = new Scanner(System.in);		
		
		int opcaoInicial = 0;
		int opcaoMet = 0;
		int opcoesChar = 0;
		//boolean contains = Arrays.stream(racas).anyMatch(raca::equals);						 
		 System.out.println("Bem-vindo ao AD&D 2E Character Creator!");
		 System.out.println(" ");
		 System.out.println("Aqui você poderá criar o seu personagem rapidamente, sem precisar consultar tabelas!");
		 System.out.println("Deseja criar um novo personagem? Digite 1 caso queira continuar e 2 caso queira sair.");
		 
		 opcaoInicial = s.nextInt();
		 
		 if(opcaoInicial == 1) {
			 while(opcoesChar != 5) {
				 System.out.println("Escolha uma das opçoes abaixo:");
				 System.out.println("1. Nome.");
				 System.out.println("2. Tendência.");
				 System.out.println("3. Raça");
				 System.out.println("4. Classe.");
				 System.out.println("5. Sair.");
				 opcoesChar = s.nextInt();
				 switch (opcoesChar)  {
		         case 1: // Nome
		        	 	  d.nome();
		                 break;
		         case 2: // Tendêcia
		        	     System.out.println("Escolha sua tendência: Justo, Bondoso, Honrado, Ordeiro, Neutro, Inconstante, Egoísta, Vil ou Cruel");
		    		     d.tendencia = s.nextLine();
		                 break;
		         case 3: // Raça
		        	     System.out.println("Escolha a sua raça: Anão, Elfo, Meio-Elfo, Humano, Halfling ou Gnomo");		
		    		     d.raca =  s.nextLine();
		                 break;
		         case 4: // Classe
		        	     System.out.println("Escolha a sua classe: Guerreiro, Mago, Ladrão, Clérigo, Paladino, Ranger, Bardo ou Druida.");
		    		     d.classe =  s.nextLine();
		                 break;	        
		         }
		         try { 	Thread.sleep(3000);  }

		         catch(Exception e)  {   e.printStackTrace(); }
				 
			 }
			if(!d.nome.isEmpty() & !d.tendencia.isEmpty() & !d.raca.isEmpty() & !d.classe.isEmpty() ) {
				
				while (d.atributos[0] == 0 && d.atributos[1] == 0 && d.atributos[2] == 0 && d.atributos[3] == 0 && d.atributos[4] == 0 && d.atributos[5] == 0 || opcaoMet!=7) {
				 
					System.out.println("Agora vamos determinar os atributos do seu personagem. Escolha o método de rolagem de sua preferência (consulte o DM). Digite um número de 1 a 6. Digite 7 se quiser sair:");
					System.out.println(" ");
					System.out.println("1. Método I: 3d6 uma vez em ordem.");
					System.out.println("2. Método II: 3d6 duas vezes, ficando com o maior e colocando em ordem.");
					System.out.println("3. Método III: 3d6 escolhendo onde colocar.");
					System.out.println("4. Método IV: 3d6 duas vezes, escolhendo onde colocar.");
					System.out.println("5. Método V: 4d6, tirando o menor dado e escolhendo onde colocar.");
					System.out.println("6. Método VI: distribuir 75 pontos entre os atributos.");
					System.out.println("7. Sair");
					opcaoMet = s.nextInt();
					switch (opcaoMet)  {
					case 1: // 3d6 uma vez em ordem
						d.metodoI();
	                	break;
					case 2: // 3d6 duas vezes, ficando com o maior e colocando em ordem
						d.metodoII();
						break;
					case 3: // 3d6 escolhendo onde colocar
						d.metodoIII();
						break;
					case 4: // 3d6 duas vezes, escolhendo onde colocar
						d.metodoIV();
						break;
					case 5: // 4d6, tirando o menor dado e escolhendo onde colocar
						d.metodoV();
						break;
					case 6: // Distribuir 75 pontos entre os atributos
						d.metodoVI();
						break;
	         }
	         try { 	Thread.sleep(3000);  }

	         catch(Exception e)  {   e.printStackTrace(); }
			 
			 }
			} 
			 if(d.atributos[0] != 0 & d.atributos[1] != 0 & d.atributos[2] != 0 & d.atributos[3] != 0 & d.atributos[4] != 0 & d.atributos[5] != 0) {
				 System.out.println("Coloque o nível do seu personagem:");
				 d.nivel = s.nextInt();
				 System.out.println("Aguarde enquanto as outras características são incluídas...");			 
				 //SetClass(classe);
				 //SetRace(raca);
				 //SetEquip(classe, nivel);
				 //SetSaves(classe, nivel);
				 //WriteTxt();
			 }else {
				 System.out.println("Obrigado por usar o AD&D 2E Character Creator!"); 
			 }
		}else {
			 System.out.println("Obrigado por usar o AD&D 2E Character Creator!");
			}

}

}
