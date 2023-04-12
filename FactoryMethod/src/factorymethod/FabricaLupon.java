package factorymethod;

public class FabricaLupon implements FabricaDeMaterial {

	@Override
	public Material criarMaterial() {
		return new Ziper();
	}

}
