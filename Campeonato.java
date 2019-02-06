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

    //04.Metodo para ordenar por peso siempre y cuando tengan un equipo e imprimir cada uno en una linea
    public String participantesConEquipoOrdenadosPorPeso(){
        ArrayList<Calistenico> participantesOrdenar = new ArrayList();
        for(Calistenico participante : listaParticipantes){
            if(participante.getTieneEquipo()){
                participantesOrdenar.add(participante);
            }
        }
        boolean completado = true;
        String calistenicosPorAltura = "";
        while(completado){
            completado = false;
            int contador = 0;
            while(contador < participantesOrdenar.size() - 1){
                if(participantesOrdenar.get(contador).getPeso() > participantesOrdenar.get(contador + 1).getPeso()){
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

    //05. Metodo para modificar la altura 
    public void modificarSiTieneEquipo(int numeroIdenficativo, boolean ahoraTieneEquipo){
        for(Calistenico participante : listaParticipantes){
            if(participante.getId() == numeroIdenficativo){
                participante.setTieneEquipo(ahoraTieneEquipo);
            }
        }
    }
    
    //06.Metodo para eliminar participantes que tengan un peso inferior al indicado
    public void eliminarLosQueTenganMenosPeso(int peso){
        int contador = 0;
        while(contador < listaParticipantes.size()){
            if(listaParticipantes.get(contador).getPeso() <= peso){
                listaParticipantes.remove(contador);
                contador --;
            }
            contador ++;
        }
    }
}
