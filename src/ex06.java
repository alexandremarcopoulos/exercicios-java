import java.util.Scanner;
public class ex06 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String sexo = null;
		String condicao;
		int idade = 0;
		int psCalma = 0;
		int psNervosa = 0;
		int psAgressiva = 0;
		int mlrNervosa = 0;
		int hmAgressivo = 0;
		int nvsQuarenta = 0;
		int clmDezoito = 0;
		
		for(int i = 0; i <= 150; i ++) {
			System.out.println("Sexo da pessoa: ");
			sexo = leitor.nextLine();
			System.out.println("Idade da pessoa: ");
			idade = leitor.nextInt();
			System.out.println("Qual a condição da pessoa?\n 1 - Calma\n 2 - Nervosa\n 3 - Agressiva\n");
			condicao = leitor.nextLine();
			
			if(condicao.equalsIgnoreCase("calma")) {
				psCalma++;
			}
			if(condicao.equalsIgnoreCase("nervosa") && sexo.equalsIgnoreCase("mulher")) {
				mlrNervosa ++;
				psNervosa ++;
			}
			if(condicao.equalsIgnoreCase("Agressiva") && sexo.equalsIgnoreCase("Homem") ) {
				hmAgressivo ++;
				psAgressiva ++;
			}
			if(condicao.equalsIgnoreCase("Nervosa") && idade > 40) {
				nvsQuarenta ++;
				psNervosa ++;
			}
			if(condicao.equalsIgnoreCase("Calma") && idade < 18) {
				clmDezoito ++;
				psCalma ++;
			}
			
		}
		
	}

}
