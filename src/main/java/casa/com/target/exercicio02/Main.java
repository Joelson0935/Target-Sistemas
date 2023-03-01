package casa.com.target.exercicio02;

public class Main {

	static void isFibonacci(Integer numero) {
		Integer a = 0, b = 1, aux;
		
		if(numero.equals(0)) {
			System.out.println("O número " + numero + " pertence a sequência de Fibonacci.");
		}
		
		for (int i = 0; i < numero; i++) {
			aux = a;
			a += b;
			b = aux;
			if (a.equals(numero)) {
				System.out.println("O número " + a + " pertence a sequência de Fibonacci.");
			}
		}
	}

	public static void main(String[] args) {
		// se o número pertencer a sequancia de fibonacci o programa retorna valor
		// caso contrário, nada acontece.
		isFibonacci(21);
	}

}
