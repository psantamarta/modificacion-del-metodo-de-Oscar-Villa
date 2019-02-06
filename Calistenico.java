public class Calistenico{
    private String nombre;
    private boolean tieneEquipo;
    private int altura;
    private double peso;
    private int id;

    public Calistenico(int codigoDeIdentificacion, String nombre, int alturaEnCentimetros, double pesoEnKilos, boolean tieneEquipo){
        id = codigoDeIdentificacion;
        this.nombre = nombre;
        altura = alturaEnCentimetros;
        peso = pesoEnKilos;
        this.tieneEquipo = tieneEquipo;
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

    public double getPeso(){
        return peso;
    }

    public void setPeso(double pesoEnKilos){
        peso = pesoEnKilos;
    }

    public String getTodaLaInformacion(){
        String todaLainformacion = "";
        if(tieneEquipo){
            todaLainformacion = nombre + " de id " + id + " con una altura de " + altura + "cm " + "y un peso de " + peso + "Kg y tiene equipo.";
        }
        else{
            todaLainformacion = nombre + " de id " + id + " con una altura de " + altura + "cm " + "y un peso de " + peso + "Kg y no tiene equipo.";
        }
        return todaLainformacion;
    }
    
    public int getId(){
        return id;
    }
}
