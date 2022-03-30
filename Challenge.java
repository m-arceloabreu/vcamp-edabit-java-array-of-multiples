package challenge.challenge;



public class Challenge {
	public static void main(String[] args) {
		// Declarando variaveis
		int num = 7;	// Será o valor do index 0 da minha array
		int length = 5; // Será o numero de indexs da minha array
		
		
		/* 
---Caso queira inserir outros valores para Num e Length  utilize o codigo abaixo  ---
		Scanner sc = new Scanner(System.in);
		System.out.println("Type a value: ");
		int num = sc.nextInt();
		System.out.println("Type a value: ");
		int length = sc.nextInt();
		
		*/
		
		// Puxando o método arrayOfMultiples que vai gerar meu código
		arrayOfMultiples(num, length);
		
		
	}
	
	//Método utilizado para realizar o desafio
	public static int[] arrayOfMultiples(int num, int length) {
			
			int[] list = new int[length];	// Criação da array com length como tamanho
			for(int i=0; i<list.length ;i++) //Laço de repetição que ocorrera até minha array ter Length de tamanho
		    {
				list[i] = ((i + 1)* num);
		        System.out.print(list[i] + " ");
		    }
		return list;
	}
}


