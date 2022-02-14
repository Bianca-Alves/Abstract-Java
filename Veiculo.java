import java.text.DecimalFormat;

public abstract class Veiculo {

	private String modelo;
	private String cor;
	private String combustivel;
	private double ipva;
	private double valorTabela;

	// Construtor
	public Veiculo(String modelo, String cor, String combustivel, double valorTabela) {
		this.modelo = modelo;
		this.cor = cor;
		this.combustivel = combustivel;
		this.ipva = this.calculaIpva();
		this.valorTabela = valorTabela;
	}

	// Getters e Setters
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public double getIpva() {
		return ipva;
	}

	public void setIpva(double ipva) {
		this.ipva = ipva;
	}

	public double getValorTabela() {
		return valorTabela;
	}

	public void setValorTabela(double valorTabela) {
		this.valorTabela = valorTabela;
	}

	// Métodos
	public abstract double calculaIpva();

	DecimalFormat df = new DecimalFormat("###,###,###,###,###.00");

	public void imprimirFicha() {
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Valor de Tabela: R$ " + df.format(this.getValorTabela()));
		System.out.println("Cor: " + this.getCor());
		System.out.println("Combustível: " + this.getCombustivel());
		System.out.println("Ipva: R$ " + df.format(this.getIpva()));
		System.out.println("-----------------------------");
	}
}