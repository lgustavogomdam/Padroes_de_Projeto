package factorymethod;

public class FabricaVelcro implements FabricaDeMaterial {

	@Override
	public Material criarMaterial() {
		return new Velcro();
	}

}
