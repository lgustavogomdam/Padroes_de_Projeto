package factorymethod;
public class ToalhaBanho implements Material 
{
	@Override
	public void exibirInfo() {
            System.out.println("Material: Toalha de Banho\nFabricante: Dohler");
	}
}
