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
}
