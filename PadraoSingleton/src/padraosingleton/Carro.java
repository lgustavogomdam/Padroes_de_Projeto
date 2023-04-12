package padraosingleton;

/**
 *
 * @author Pedro Caliman Cecato
 */
public class Carro {
    
    private String nome;
    
    private double potencia;
    
    private static Carro carro;
    
    public static Carro getInstance(){
        if(carro == null)
            carro = new Carro();
        
        return carro;
    }
    
    private Carro(){
        this.nome = "Não informado";
        this.potencia = 0;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPotencia() {
        return this.potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
    
    
    
}
