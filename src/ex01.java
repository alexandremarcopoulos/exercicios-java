
public class ex01 {

	public static void main(String[] args) {
		int soma = 0;
		
		for(int i = 0; i < 500; i++) {
			if(i % 2 == 1 && i % 3 == 0) {
				soma = soma + i;
			}
		}
		
		System.out.println("Total = " + soma );
	}

}
