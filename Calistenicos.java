public class Calistenicos{
    private String nombre;
    private boolean tieneEquipo;
    private int altura;
    private double peso;
    private int id;
    
    public Calistenicos(int codigoDeIdentificacion, String nombre, int alturaEnCentimetros, double pesoEnKilos){
        id = codigoDeIdentificacion;
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
    
    public String getTodaLaInformacion(){
        String todaLainformacion = nombre + "de id " + id + " con una altura de " + altura + "cm " + "y un peso de " + peso + "Kg.";
        return todaLainformacion;
    }
}
