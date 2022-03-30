package challenge.challenge;



public class Challenge {
	public static void main(String[] args) {
		
		int num = 7;
		int length = 5;
		
		/* ---Option if you want to type your own values  ---
		Scanner sc = new Scanner(System.in);
		System.out.println("Type a value: ");
		int num = sc.nextInt();
		System.out.println("Type a value: ");
		int length = sc.nextInt();
		
		*/
		
		arrayOfMultiples(num, length);
		
		
	}
	
	public static int[] arrayOfMultiples(int num, int length) {
			
			int[] list = new int[length];
			for(int i=0; i<list.length ;i++)
		    {
				list[i] = ((i + 1)* num);
		        System.out.print(list[i] + " ");
		    }
		return list;
	}
}




