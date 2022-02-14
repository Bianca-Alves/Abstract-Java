
public class Moto extends Veiculo {

	public Moto(String modelo, String cor, String combustivel, double valorTabela) {
		super(modelo, cor, combustivel, valorTabela);
	}

	@Override
	public double calculaIpva() {
		this.setIpva((super.getValorTabela() * 0.02));
		return this.getIpva();
	}
}