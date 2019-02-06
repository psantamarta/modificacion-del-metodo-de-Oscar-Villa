import java.util.ArrayList;
public class Campeonato{
    private Calistenico participante;
    private ArrayList<Calistenico> listaParticipantes;
    public Campeonato(){
        listaParticipantes  = new ArrayList<Calistenico>();
    }
    //01.Es un metodo para poder añadir participantes
    public void anadirParticipante(int codigoDeIdentificacion, String nombre, int alturaEnCentimetros, double pesoEnKilos){
        Calistenico nuevoParticipante = new Calistenico(codigoDeIdentificacion, nombre, alturaEnCentimetros, pesoEnKilos);
        listaParticipantes.add(nuevoParticipante);
    }
    
    //02.Es un metodo para obtener la informacion de los participantes cada uno en una linea
    public String informacionParticipantes(){
        String informacion = "";
        for(Calistenico participante : listaParticipantes){
            informacion += participante.getTodaLaInformacion() + "\n";
        }
        return informacion;
    }
}
