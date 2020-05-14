import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = null;
		double notaA = 0;
		double notaB = 0;
		double media;
		int cont = 0;
		boolean validLaco = false;
		boolean validNota = false;

		Scanner leitor = new Scanner(System.in);
		
		while(validLaco == false) {
			
			System.out.println("Entre com o nome do aluno:");
			nome = leitor.nextLine();
			
			validNota = false;
			
			while(validNota == false) {
				
				System.out.println("Digite a nota 1:");
				notaA = leitor.nextDouble();
				
				System.out.println("Digite a nota 2:");
				notaB = leitor.nextDouble();
				
				if((notaA > 10 || notaA < 0) || (notaB > 10 || notaB <0)) {
					
					System.err.println("\n Digite apenas notas que estajam entre 0 e 10! \n");
					validNota = false;
					
				}
				else {
					
					validNota = true;
					
				}
			}

			media  = (notaA * 0.40 + notaB * 0.60)/2;

			System.out.println("O aluno " + nome + " tem uma média" + media);

			cont ++;

			if (cont == 5) {
				
				break;
				
			}

		}
	}

}
