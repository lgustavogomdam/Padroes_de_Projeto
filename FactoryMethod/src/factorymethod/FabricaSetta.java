package factorymethod;
public class FabricaSetta implements FabricaDeMaterial {
	@Override
	public Material criarMaterial() {
		return new CarretelLinha();
	}
}
