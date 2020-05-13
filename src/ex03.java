
public class ex03 {

	public static void main(String[] args) {
		int cont3 = 0;
		int cont5 = 0;
		
		for(int i = 233; i < 456; i++) 
			
			if(i >= 300 && i<= 400) {
				cont3 ++;
				if (cont3 == 3) {
					System.out.println("3 em 3: " + i);
					cont3 = 0;
				}
				
			}
			else {
				cont5 ++;
				if (cont5 == 5) {
					System.out.println("5 em 5: " + i);
					cont5 = 0;
				}
			}

		}

	}

