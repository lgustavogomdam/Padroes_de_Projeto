package factorymethod;

/*
* Autor: Luiz Gustavo Gomes Damasceno, Gustavo Pereira Marianelli e Matheus Gonçalves
*/

public class FactoryMethod {
    
    public static void main(String[] args) {
        
		FabricaDeMaterial fabrica = new FabricaDohler();
		Material material = fabrica.criarMaterial();
		material.exibirInfo();
		System.out.println();

		fabrica = new FabricaVelcro();
		material = fabrica.criarMaterial();
		material.exibirInfo();
		System.out.println();

		fabrica = new FabricaSetta();
		material = fabrica.criarMaterial();
		material.exibirInfo();
		System.out.println();

		fabrica = new FabricaLupon();
		material = fabrica.criarMaterial();
		material.exibirInfo();    
    }
}
