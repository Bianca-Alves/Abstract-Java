
public class Principal {

	public static void main(String[] args) {

		Carro hb20 = new Carro("HB20", "Preto", "Gasolina", 59290);
		Carro onix = new Carro("Onix", "Vermelho", "�lcool", 62150);
		Moto bmw = new Moto("BMW", "Prata", "Gasolina", 76900);
		Moto suzuki = new Moto("Suzuki", "Azul", "�lcool", 56261);

		hb20.imprimirFicha();
		onix.imprimirFicha();
		bmw.imprimirFicha();
		suzuki.imprimirFicha();
	}
}