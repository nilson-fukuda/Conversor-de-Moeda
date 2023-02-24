import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class AcertaValor {

	private BigDecimal valor;
	// private static final String unidadeMonetaria = "R$ ";
	private static final DecimalFormat formato = new DecimalFormat(",##0.00");
	
	
	public AcertaValor(String valor) {
		this.valor = new BigDecimal(valor);
	}
	
	public void adiconadoPor(String valorASomar) {
		this.valor = this.valor.add(new BigDecimal(valorASomar));
	}

	public void subtrairPor(String valorASubtrair) {
		this.valor = this.valor.subtract(new BigDecimal(valorASubtrair));
	}

	public void multiplicarPor(String valorAMultiplicar) {
		this.valor = this.valor.multiply(new BigDecimal(valorAMultiplicar));
	}
	
	public void dividirPor(BigDecimal valorADividir) {
		this.valor = this.valor.divide(valorADividir, 2,RoundingMode.HALF_EVEN);
	}
	public BigDecimal getValor() {
		return valor;
	}
	
	public String getValorFormatado() {
		return formato.format(valor);
	}
}
	
