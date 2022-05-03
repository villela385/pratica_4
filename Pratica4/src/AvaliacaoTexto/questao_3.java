package AvaliacaoTexto;
import java.util.Scanner;
import java.util.ArrayList;

public class Questão3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		int i=0, opcao, cont=0, n, ctcons = 0;
		int ctvog = 0;
		String Frase;
		
		System.out.println("Digite uma frase para ser avaliada: ");
		Frase=ler.nextLine();

			do {
			System.out.println("1- Número de sentenças (ponto final, exclamação e interrogação) ");
			System.out.println("2- Número de Palavras ");
			System.out.println("3- Número de Vogais ");
			System.out.println("4- Número de Consoantes ");
			System.out.println("5- Sair ");
			opcao=ler.nextInt();
		
			switch(opcao) 
			    {
				case 1:
					n = Frase.length();
					for (i = 0; i<n; i++)
					if((Frase.charAt(i)=='.') || (Frase.charAt(i)=='!')|| (Frase.charAt(i)=='?')){
						cont++;
						}                                   
					System.out.println(" Número de sentenças é: " + cont);
					break;
			
				case 2:
					
				break;
			
				case 3:
					n = Frase.length();
					ctvog=0;
					for (i = 0; i<n; i++) {
							   if ((Frase.charAt(i) == 'A') || (Frase.charAt(i) == 'a') ||
							      (Frase.charAt(i) == 'E') || (Frase.charAt(i) == 'e') ||
							      (Frase.charAt(i) == 'I') || (Frase.charAt(i) == 'i') ||
							      (Frase.charAt(i) == 'O') || (Frase.charAt(i) == 'o')  ||
							      (Frase.charAt(i) == 'U') || (Frase.charAt(i) == 'u')) {
							     
							      ctvog = ctvog + 1;
							       }
							   }
					System.out.println(" Número de vogais na frase é: " + ctvog);
				break;
			
				case 4:
					n = Frase.length();
					for (i = 0; i<n; i++) {
					if (((Frase.charAt(i) >= 'A') && (Frase.charAt(i) <= 'Z')) ||
							   ((Frase.charAt(i) >= 'a') && (Frase.charAt(i) <= 'z'))) {

							   if ((Frase.charAt(i) != 'A') && (Frase.charAt(i) != 'a') &&
							      (Frase.charAt(i) != 'E') && (Frase.charAt(i) != 'e') &&
							      (Frase.charAt(i) != 'I') && (Frase.charAt(i) != 'i') &&
							      (Frase.charAt(i) != 'O') && (Frase.charAt(i) != 'o') &&
							      (Frase.charAt(i) != 'U') && (Frase.charAt(i) != 'u')) {
							      ctcons = ctcons + 1;
							       }
							   }
                     	}
					System.out.println("Número de consoantes: " + ctcons);
				break;
				
				case 5:
					System.out.println("Finalizado");
				break;
			
				default:
					System.out.println("Finalizado");
					break;
			}	
		
		
		}
			while (opcao!=5);
	}
}