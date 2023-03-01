package casa.com.target.exercicio03;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Main {

	// Neste mètodo implementei a leitura do documento em formato json
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		String caminho = "C:\\Users\\JOELSON\\Documents\\novo-workspace-spring-tool-suite\\Target\\src\\main\\resources\\documento\\dados.json";
		JSONParser parser = new JSONParser();
		JSONArray colecao;

		List<Double> valores = new ArrayList<>();
		List<Integer> dias = new ArrayList<>();

		try (FileReader reader = new FileReader(caminho)) {
			Object obj = parser.parse(reader);
			colecao = (JSONArray) obj;

			colecao.forEach(objeto -> {
				JSONObject jsonObject = (JSONObject) objeto;
				valores.add((Double) jsonObject.get("valor"));
				String d = String.valueOf(jsonObject.get("dia"));
				Integer totalDias = Integer.parseInt(d);
				dias.add(totalDias);
			});

			Double media = 0.0, total = 0.0, contador = 0.0;

			for (Double numero : valores) {
				total = contador += numero;
			}
			media = total / dias.size();

			int iterador = 0;

			for (Double valor : valores) {
				if (valor > media) {
					iterador++;
				}
			}

			System.out.println("O menor valor de faturamento ocorrido em um dia do mês");
			System.out.println(Collections.min(valores));
			System.out.println("-----------------------------------------------------------");
			System.out.println("O maior valor de faturamento ocorrido em um dia do mês");
			System.out.println(Collections.max(valores));
			System.out.println("-----------------------------------------------------------");
			System.out
					.println("Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.");
			System.out.println(+iterador);
			System.out.println("-----------------------------------------------------------");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
