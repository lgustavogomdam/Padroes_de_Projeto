package factorymethod;
public class FabricaDohler implements FabricaDeMaterial {

	@Override
	public Material criarMaterial() {
		return new ToalhaBanho();
	}

}
