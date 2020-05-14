import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		double numero;
		double soma = 0;
		boolean validacao = false;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Entre com um numero e obtenha a soma deles, o processo sera parado quando o numero digitado for negativo.");
		
		
		while(validacao == false) {
			numero = leitor.nextDouble();
			soma = soma + numero;
						
			if(numero <= 0) {
				soma = soma + (numero * -1);
				validacao = true;
				
			}
						
		}
		System.out.println("A soma total é de: " + soma);

	}

}
