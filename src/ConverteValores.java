import java.math.BigDecimal;

import javax.swing.JOptionPane;

public class ConverteValores {
	private static final String[][] MatrizMoeda = new String[8][8];
	private String conversao;
	private Object[] lista;
	private String valor;
	private int modelo;

	public ConverteValores(String conversao, Object[] lista, String valor, int modelo) {
		MatrizMoeda[0][0] = "1.0";
		MatrizMoeda[1][0] = "5.1334";
		MatrizMoeda[2][0] = "5.4408";
		MatrizMoeda[3][0] = "6.1708";
		MatrizMoeda[4][0] = "0.03812";
		MatrizMoeda[5][0] = "5.4999";
		MatrizMoeda[6][0] = "3.7907";
		MatrizMoeda[7][0] = "3.4969";
		MatrizMoeda[0][1] = "0.1948";
		MatrizMoeda[1][1] = "1.0";
		MatrizMoeda[2][1] = "1.06";
		MatrizMoeda[3][1] = "1.202";
		MatrizMoeda[4][1] = "0.7426";
		MatrizMoeda[5][1] = "1.0714";
		MatrizMoeda[6][1] = "0.7386";
		MatrizMoeda[7][1] = "0.6812";
		MatrizMoeda[0][2] = "0.1838";
		MatrizMoeda[1][2] = "0.9435";
		MatrizMoeda[2][2] = "1.0";
		MatrizMoeda[3][2] = "1.1341";
		MatrizMoeda[4][2] = "0.007";
		MatrizMoeda[5][2] = "1.0107";
		MatrizMoeda[6][2] = "0.6967";
		MatrizMoeda[7][2] = "0.6427";
		MatrizMoeda[0][3] = "0.1621";
		MatrizMoeda[1][3] = "0.8318";
		MatrizMoeda[2][3] = "0.8818";
		MatrizMoeda[3][3] = "1.0";
		MatrizMoeda[4][3] = "0.006178";
		MatrizMoeda[5][3] = "0.8912";
		MatrizMoeda[6][3] = "0.6144";
		MatrizMoeda[7][3] = "0.5667";
		MatrizMoeda[0][4] = "26.2355";
		MatrizMoeda[1][4] = "134.67";
		MatrizMoeda[2][4] = "142.75";
		MatrizMoeda[3][4] = "161.87";
		MatrizMoeda[4][4] = "1.0";
		MatrizMoeda[5][4] = "144.28";
		MatrizMoeda[6][4] = "99.46";
		MatrizMoeda[7][4] = "91.75";
		MatrizMoeda[0][5] = "0.1818";
		MatrizMoeda[1][5] = "0.9334";
		MatrizMoeda[2][5] = "0.9893";
		MatrizMoeda[3][5] = "1.122";
		MatrizMoeda[4][5] = "0.6931";
		MatrizMoeda[5][5] = "1.0";
		MatrizMoeda[6][5] = "0.6894";
		MatrizMoeda[7][5] = "0.6359";
		MatrizMoeda[0][6] = "0.2637";
		MatrizMoeda[1][6] = "1.3541";
		MatrizMoeda[2][6] = "1.4353";
		MatrizMoeda[3][6] = "1.6274";
		MatrizMoeda[4][6] = "0.01006";
		MatrizMoeda[5][6] = "1.4506";
		MatrizMoeda[6][6] = "1.0";
		MatrizMoeda[7][6] = "0.9223";
		MatrizMoeda[0][7] = "0.286";
		MatrizMoeda[1][7] = "1.468";
		MatrizMoeda[2][7] = "1.5559";
		MatrizMoeda[3][7] = "1.7644";
		MatrizMoeda[4][7] = "0.0109";
		MatrizMoeda[5][7] = "1.5728";
		MatrizMoeda[6][7] = "1.0842";
		MatrizMoeda[7][7] = "1.0";

//		BRL, USD, EUR, GBP, JPY, CHF, CAD, AUD
//		1, 0.1947, 0.1837, 0.1620, 26.208, 0.1817, 0.2636, 0.2859
//		5.1361, 1, 0.9434, 0.8317, 134.61, 0.9334, 1.3540, 1.4688
//		5.4440, 1.0600, 1, 0.8816, 142.68, 0.9894, 1.4353, 1.5567
//		6.1757, 1.2024, 1.1343, 1, 161.85, 1.1223, 1.6280, 1.7660
//		0.03816, 0.74290, 0.70090, 0.00618, 1, 	0.6935, 0.01006, 0.01091
//		5.5026, 1.0713, 1.0107, 0.8911, 144.21, 1, 1.4506, 1.5736
//		3.7933, 0.7386, 0.6967, 0.6142, 99.41, 0.6894, 1, 1.0848
//		3.4967, 0.6808, 0.6424, 0.5663, 91.65, 0.6355, 0.9219, 1
//	    retirado do site https://br.investing.com/currencies/exchange-rates-table em 23/02/2023  

		this.conversao = conversao;
		this.lista = lista;
		this.valor = valor;
		this.modelo = modelo;
		String fatorConversao = null;
		int base = 10;
		
		Object valorInicial = JOptionPane.showInputDialog(null, "Escolha a unidade atual", conversao + " de Entrada",
				JOptionPane.INFORMATION_MESSAGE, null, this.lista, this.lista[0]);

		int indiceInicial = localizaIndice(valorInicial, this.lista);

		Object valorFinal = JOptionPane.showInputDialog(null, "Converter para qual unidade?", conversao + " de Saída",
				JOptionPane.INFORMATION_MESSAGE, null, this.lista, this.lista[0]);

		int indiceFinal = localizaIndice(valorFinal, this.lista);

		switch (modelo) { // define o tipo de conversão adotado
		case 0: // moeda
			fatorConversao = MatrizMoeda[indiceInicial][indiceFinal];
			break;
		case 1: // temperatura
			fatorConversao = "TEMPERATURA";
			break;
		case 2: // comprimento
			base = 10;
			fatorConversao = String.valueOf(Math.pow(base, indiceFinal) / Math.pow(base, indiceInicial));
			break;
		case 3: // área
			base = 100;
			fatorConversao = String.valueOf(Math.pow(base, indiceFinal) / Math.pow(base, indiceInicial));
			break;
		case 4: // volume
			base = 1000;
			fatorConversao = String.valueOf(Math.pow(base, indiceFinal) / Math.pow(base, indiceInicial));
			break;
		case 5: // massa
			base = 10;
			fatorConversao = String.valueOf(Math.pow(base, indiceFinal) / Math.pow(base, indiceInicial));
			break;
		default:
			break;
		}
		System.out.println("fator de conversão da "+conversao+" : "+fatorConversao);
		escolheConversao(valor, fatorConversao, valorInicial, valorFinal, modelo);

	}

	private static int localizaIndice(Object escolha, Object[] listagem) {
		int indice = 0;
		for (int i = 0; i < listagem.length; i++) {
			if (escolha == listagem[i])
				indice = i;
		}
		return indice;
	}

	private static void escolheConversao(String valor, String fator, Object inicial, Object termino, int modelo2) {

		AcertaValor valorEntrada = new AcertaValor(valor);

		switch (modelo2) {
		case 1:
			if (inicial == "Fahrenheit") {
				if (termino == "Celsius") {
					valorEntrada.subtrairPor("32");
					valorEntrada.dividirPor(new BigDecimal("1.8"));
				} else {
					if (termino == "Kelvin") {
						valorEntrada.subtrairPor("32");
						valorEntrada.dividirPor(new BigDecimal("1.8"));
						valorEntrada.adiconadoPor("273.15");
					} else {
						valorEntrada.multiplicarPor("1");
					}
				}
			} else {
				if (inicial == "Celsius") {
					if (termino == "Fahrenheit") {
						valorEntrada.multiplicarPor("1.8");
						valorEntrada.adiconadoPor("32");
					} else {
						if (termino == "Kelvin") {
							valorEntrada.adiconadoPor("273.15");
						} else {
							valorEntrada.multiplicarPor("1");
						}
					}
				} else {
					if (termino == "Celsius") {
						valorEntrada.subtrairPor("273.15");
					} else {
						if (termino == "Fahrenheit") {
							valorEntrada.subtrairPor("273.15");
							valorEntrada.multiplicarPor("1.8");
							valorEntrada.adiconadoPor("32");
						} else {
							valorEntrada.multiplicarPor("1");
						}
					}
				}
			}
			break;
		default:
			valorEntrada.multiplicarPor(fator);
			break;
		}
		System.out.println("Valor a ser convertido: " + valor);
		System.out.println("de " + inicial + " para " + termino + " = " + valorEntrada.getValor());

//		JOptionPane.showMessageDialog(null, "Valor a ser convertido: " + valor + "\n" + " de " + inicial + " para "
//				+ termino + " = " + valorEntrada.getValorFormatado());
		JOptionPane.showMessageDialog(null, valor +" "+ inicial + " equivale(m) a " + valorEntrada.getValorFormatado()+" "+ termino);

	}
}
