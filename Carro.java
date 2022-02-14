
public class Carro extends Veiculo {

	public Carro(String modelo, String cor, String combustivel, double valorTabela) {
		super(modelo, cor, combustivel, valorTabela);
	}

	@Override
	public double calculaIpva() {
		this.setIpva((super.getValorTabela() * 0.04));
		return this.getIpva();
	}
}