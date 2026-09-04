
package proyectofinalwiltov;


public class SuperMan extends SuperHeroe{
    private String nombreKryptoniano="";
    private int aniosEntrenamiento=0;
    private boolean viajaEnElTiempo = false;
    private long distanciaMaximaVuelo=0;
    public String getNombreKryptoniano(){
        return nombreKryptoniano;
    }
    public void setNombreKryptoniano(String nombreKryptoniano){
        this.nombreKryptoniano = nombreKryptoniano;
    }
    public int getAniosEntrenamiento(){
        return aniosEntrenamiento;
    }
    public void setAniosEntrenamiento(int aniosEntrenamiento){
        this.aniosEntrenamiento = aniosEntrenamiento;
    }
    public boolean getViajaEnElTiempo(){
        return viajaEnElTiempo;
    }
    public void setViajaEnElTiempo(boolean viajaEnElTiempo){
        this.viajaEnElTiempo = viajaEnElTiempo;
    }
    public long getDistanciaMaximaVuelo(){
        return distanciaMaximaVuelo;
    }
    public void setDistanciaMaximaVuelo(long distanciaMaximaVuelo){
        this.distanciaMaximaVuelo = distanciaMaximaVuelo;
    }
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Mata civiles: " + mataCiviles  + ", Altura: " + altura 
                + ", Nombre Kryptoniano: " + nombreKryptoniano + ", Años de entrenamiento: " + aniosEntrenamiento + ", Viaja en el tiempo: " + viajaEnElTiempo + ", Distancia maxima de vuelo:" + distanciaMaximaVuelo;        
    }
    
}
