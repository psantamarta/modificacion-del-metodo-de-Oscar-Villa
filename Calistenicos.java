public class Calistenicos{
    private String nombre;
    private boolean tieneEquipo;
    private int altura;
    private double peso;
    
    public Calistenicos(String nombre, int alturaEnCentimetros, double pesoEnKilos){
        this.nombre = nombre;
        altura = alturaEnCentimetros;
        peso = pesoEnKilos;
        tieneEquipo = false;
    }
    
    public boolean getTieneEquipo(){
        return tieneEquipo;
    }
    
    public void setTieneEquipo(boolean tieneEquipo){
        this.tieneEquipo = tieneEquipo;
    }
    
    public int getAltura(){
        return altura;
    }
    
    public void setAltura(int alturaEnCentimetros){
        altura = alturaEnCentimetros;
    }
    
    public double peso(){
        return peso;
    }
    
    public void setPeso(double pesoEnKilos){
        peso = pesoEnKilos;
    }
}
