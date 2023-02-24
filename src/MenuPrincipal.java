//Utilizar a classe JOptionPane da biblioteca Javax.swing;
//Utilizar o m�todo showInputDialog como objeto para apresentar mais de uma op��o;

import javax.swing.JOptionPane;

public class MenuPrincipal {

	public static void main(String[] args) {

		String comprimento1 = "km";
		String comprimento2 = "hm";
		String comprimento3 = "dam";
		String comprimento4 = "m";
		String comprimento5 = "dm";
		String comprimento6 = "cm";
		String comprimento7 = "mm";

		String area1 = "km�";
		String area2 = "hm�";
		String area3 = "dam�";
		String area4 = "m�";
		String area5 = "dm�";
		String area6 = "cm�";
		String area7 = "mm�";

		String volume1 = "km�";
		String volume2 = "hm�";
		String volume3 = "dam�";
		String volume4 = "m�";
		String volume5 = "dm�";
		String volume6 = "cm�";
		String volume7 = "mm�";

		String massa1 = "kg";
		String massa2 = "hg";
		String massa3 = "dag";
		String massa4 = "g";
		String massa5 = "dg";
		String massa6 = "cg";
		String massa7 = "mg";

		String temperatura1 = "Celsius";
		String temperatura2 = "Fahrenheit";
		String temperatura3 = "Kelvin";

		String moeda1 = "Real";
		String moeda2 = "D�lar";
		String moeda3 = "Euro";
		String moeda4 = "Libra";
		String moeda5 = "Yene";
		String moeda6 = "Franco Su��o";
		String moeda7 = "D�lar canadense";
		String moeda8 = "D�lar australiano";

		String conversor1 = "Conversor de Moeda";
		String conversor2 = "Conversor de Temperatura";
		String conversor3 = "Conversor de Medidas";
		String conversor4 = "Conversor de �rea";
		String conversor5 = "Conversor de Volume";
		String conversor6 = "Conversor de Massa";

		Object[] conversor = { conversor1, conversor2, conversor3, conversor4, conversor5, conversor6 };

		int continua = 0;

		while (continua == 0) {

			Object opcao = JOptionPane.showInputDialog(null, "Escolha uma op��o", "Menu",
					JOptionPane.INFORMATION_MESSAGE, null, conversor, conversor[0]);

			if (!(opcao == null)) {

				int tipoConversor = buscaIndice(opcao, conversor);

				String valor = JOptionPane.showInputDialog("Insira um valor:");

				try {
					Double.parseDouble(valor);

//					System.out.println("Valor a ser convertido: " + valor);

					switch (tipoConversor) {

					case 0:
						Object[] moedas = { moeda1, moeda2, moeda3, moeda4, moeda5, moeda6, moeda7, moeda8 };
						ConverteValores moeda = new ConverteValores("Moeda", moedas, valor, tipoConversor);
						break;

					case 1:
						Object[] temperaturas = { temperatura1, temperatura2, temperatura3 };
						ConverteValores temperatura = new ConverteValores("Temperatura", temperaturas, valor,
								tipoConversor);
						break;

					case 2:
						Object[] comprimentos = { comprimento1, comprimento2, comprimento3, comprimento4, comprimento5,
								comprimento6, comprimento7 };
						ConverteValores comprimento = new ConverteValores("Comprimento", comprimentos, valor,
								tipoConversor);
						break;

					case 3:
						Object[] areas = { area1, area2, area3, area4, area5, area6, area7 };
						ConverteValores area = new ConverteValores("�rea", areas, valor, tipoConversor);
						break;

					case 4:
						Object[] volumes = { volume1, volume2, volume3, volume4, volume5, volume6, volume7 };
						ConverteValores volume = new ConverteValores("Volume", volumes, valor, tipoConversor);
						break;

					case 5:
						Object[] massas = { massa1, massa2, massa3, massa4, massa5, massa6, massa7 };
						ConverteValores massa = new ConverteValores("Massa", massas, valor, tipoConversor);
						break;

					default:
						// bloco de c�digo que ser� executado se nenhum dos cases for aceito
					}
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Valor inv�lido!");
				}

			}

			continua = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Escolha uma op��o ...",
					JOptionPane.YES_NO_CANCEL_OPTION);

//			Object[] botoes = { "Sim", "N�o", "Cancelar" };
//			continua = JOptionPane.showOptionDialog(null, "Deseja continuar?", 
//					"Escolha uma op��o ...", JOptionPane.YES_NO_OPTION,
//					JOptionPane.QUESTION_MESSAGE, null, botoes, botoes[0]);

		}
		if (continua == 2) {
			JOptionPane.showMessageDialog(null, "Programa conclu�do");
		} else
			JOptionPane.showMessageDialog(null, "Programa finalizado");
	}

	private static int buscaIndice(Object escolha, Object[] lista) {
		int indice = 0;
		for (int i = 0; i < lista.length; i++) {
			if (escolha == lista[i])
				indice = i;
		}
		return indice;
	}
}
