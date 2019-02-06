import java.util.ArrayList;
public class Campeonato{
    private Calistenico participante;
    private ArrayList<Calistenico> listaParticipantes;
    public Campeonato(){
        listaParticipantes  = new ArrayList<Calistenico>();
    }
    //01.Es un metodo para poder añadir participantes
    public void anadirParticipante(int codigoDeIdentificacion, String nombre, int alturaEnCentimetros, double pesoEnKilos, boolean tieneEquipo){
        Calistenico nuevoParticipante = new Calistenico(codigoDeIdentificacion, nombre, alturaEnCentimetros, pesoEnKilos, tieneEquipo);
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

    //03.Es un metodo para obtener a los participantes ordenados por altura
    public String participantesOrdenadosPorAltura(){
        ArrayList<Calistenico> participantesOrdenar = new ArrayList();
        for(Calistenico participante : listaParticipantes){
            participantesOrdenar.add(participante);
        }
        boolean completado = true;
        String calistenicosPorAltura = "";
        while(completado){
            completado = false;
            int contador = 0;
            while(contador < participantesOrdenar.size() - 1){
                if(participantesOrdenar.get(contador).getAltura() > participantesOrdenar.get(contador + 1).getAltura()){
                    Calistenico guardada =participantesOrdenar.get(contador);
                    participantesOrdenar.set(contador, participantesOrdenar.get(contador + 1));
                    participantesOrdenar.set(contador + 1, guardada);
                    completado = true;
                }
                contador ++;
            }
        }

        for(Calistenico participante : participantesOrdenar){
            calistenicosPorAltura += participante.getTodaLaInformacion() + "\n";
        }

        return calistenicosPorAltura;
    }
}
