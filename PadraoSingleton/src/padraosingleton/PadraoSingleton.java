package padraosingleton;

/**
 *
 * @author Pedro Caliman Cecato
 */

public class PadraoSingleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Carro carro1 = Carro.getInstance();
        Carro carro2 = Carro.getInstance();
        
        carro1.setNome("Corolla");
        carro1.setPotencia(150.86);
        
        carro2.setNome("Kwid");
        carro2.setPotencia(134.86);
        
        System.out.println("O carro " + carro1.getNome() + 
                " possui potência de: " + carro1.getPotencia());
        
        System.out.println("O carro " + carro2.getNome() + 
                " possui potência de: " + carro2.getPotencia());
    }
    
}
