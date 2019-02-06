import java.util.ArrayList;
public class Campeonato{
    private Calistenicos participante;
    private ArrayList<Calistenicos> listaParticipantes;

    public void anadirParticipante(int codigoDeIdentificacion, String nombre, int alturaEnCentimetros, double pesoEnKilos){
        Calistenicos nuevoParticipante = new Calistenicos(codigoDeIdentificacion, nombre, alturaEnCentimetros, pesoEnKilos);
        listaParticipantes.add(nuevoParticipante);
    }
}
