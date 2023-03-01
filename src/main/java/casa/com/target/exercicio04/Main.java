package casa.com.target.exercicio04;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		calculaPercentual(67836.43, "SP", 36678.66, "RJ", 29229.88, "MG", 27165.48, "ES", 19849.53, "Outros");
	}

	static void calculaPercentual(Double valor1, String estado1, Double valor2, String estado2, Double valor3,
			String estado3, Double valor4, String estado4, Double valor5, String estado5) {

		NumberFormat formatarMoeda = NumberFormat.getCurrencyInstance(Locale.getDefault());
		DecimalFormat formatoDecimal = new DecimalFormat("0.0");

		Double total = (valor1 + valor2 + valor3 + valor4 + valor5);
		Double porcentagemValor1 = valor1 * 100 / total;
		Double porcentagemValor2 = valor2 * 100 / total;
		Double porcentagemValor3 = valor3 * 100 / total;
		Double porcentagemValor4 = valor4 * 100 / total;
		Double porcentagemValor5 = valor5 * 100 / total;

		System.out.println("Valor Total: " + formatarMoeda.format(total));
		System.out.println(estado1 + " " + formatoDecimal.format(porcentagemValor1) + "%");
		System.out.println(estado2 + " " + formatoDecimal.format(porcentagemValor2) + "%");
		System.out.println(estado3 + " " + formatoDecimal.format(porcentagemValor3) + "%");
		System.out.println(estado4 + " " + formatoDecimal.format(porcentagemValor4) + "%");
		System.out.println(estado5 + " " + formatoDecimal.format(porcentagemValor5) + "%");

	}

}
