package exemplos;
import java.util.Scanner;


public class vetores_A_e_B {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		//Vetores criados
		int A[]= {4,6,7,1,0};
		
		int B[]= {7,1,3,1,2};
		//Variaveis criadas
		int x, C = 0;
		
		//Laco de repeticao programado para rodar 5 vezes 
		for ( x=0 ;x<5; x++){ 
		//Condicao para caso haja numeros maior que 4 no vetor "A" ira imprimir a proxima mensagem na tela 
		if(A[x]>4)
	    //exibindo mensagem e resultado 
		System.out.printf("Numeros maiores que 4 no vetor A: %d\n", A[x]);}
		//Laco de repeticao programado para rodar 5 vezes 
		for ( x=0 ;x<5; x++) {
		//Condicao para caso haja numeros maior que 4 no vetor "B" ira imprimir a proxima mensagem na tela
		if ( B[x]>4)
		//exibindo mensagem e resultado
		System.out.printf("Numeros maiores que 4 no vetor B: %d\n\n", B[x]);}
		//Laco de repeticao programado para rodar 5 vezes 
		for (x=0 ;x<5; x++) { 
		//Condicao para caso haja numeros menores ou iguais a 5 no vetor "A" ira imprimir a proxima mensagem na tela
		if (A[x]<=5)
		//exibindo mensagem e resultado
		System.out.printf("Numeros menores ou iguais a 5 no vetor A: %d\n", A[x]);
		//Condicao para caso haja numeros menores ou iguais a 5 no vetor "B" ira imprimir a proxima mensagem na tela
		if (B[x]<=5)
		//exibindo mensagem e resultado
		System.out.printf("Numeros menores ou iguais a 5 no vetor B: %d\n", B[x]);
		//Calculo para obter valor da variavel "C"
		C=A[x]*B[x];}
		//exibindo resultado
		System.out.printf("C = : %d", C);
		
		
		
		
		
		
			}
}
