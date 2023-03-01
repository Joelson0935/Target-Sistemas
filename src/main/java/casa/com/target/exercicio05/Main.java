package casa.com.target.exercicio05;

public class Main {

	static void inverterCaracteres(String texto) {
		char[] colecao = texto.toCharArray();
		String novoTexto = "";
		for (int i = colecao.length - 1; i >= 0; i--) {
			novoTexto += texto.charAt(i);
		}
		System.out.println(novoTexto);
	}

	public static void main(String[] args) {
		inverterCaracteres("O rato roeu a roupa do rei de roma.");
	}

}
