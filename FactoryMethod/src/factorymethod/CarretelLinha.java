package factorymethod;
public class CarretelLinha implements Material 
{
	@Override
	public void exibirInfo() {
            System.out.println("Material: Linha de Bordado\nFabricante: Linhas Setta");
	}
}
