
package proyectofinalwiltov;


public class SuperMan extends SuperHeroe{
    private String nombreKryptoniano="";
    private int aniosEntrenamiento=0;
    private boolean viajaEnElTiempo = false;
    private long distanciaMaximaVuelo=0;
    
    public SuperMan() {
        this("", 0, false, 0, "", 0, false, 0.0);
   }
    public SuperMan(String nombreKryptoniano, int aniosEntrenamiento, boolean viajaEnElTiempo, long distanciaMaximaVuelo, String nombre, int edad, boolean mataCiviles, double altura) {
        super(nombre, edad, mataCiviles, altura);
        this.nombreKryptoniano = nombreKryptoniano;
        this.aniosEntrenamiento = aniosEntrenamiento;
        this.viajaEnElTiempo = viajaEnElTiempo;
        this.distanciaMaximaVuelo = distanciaMaximaVuelo;
    }
    public SuperMan(String nombreKryptoniano, int aniosEntrenamiento, boolean viajaEnElTiempo, long distanciaMaximaVuelo, String nombre, int edad, boolean mataCiviles) {
        this(nombreKryptoniano, aniosEntrenamiento, viajaEnElTiempo, distanciaMaximaVuelo, nombre, edad, mataCiviles, 0.0);
    }
    public SuperMan(String nombreKryptoniano, int aniosEntrenamiento, long distanciaMaximaVuelo, String nombre, boolean mataCiviles) {
        this(nombreKryptoniano, aniosEntrenamiento, true, distanciaMaximaVuelo, nombre, 0, mataCiviles, 0.0);
    }
    public SuperMan(long distanciaMaximaVuelo, String nombre, boolean mataCiviles) {
        this("", 0, true, distanciaMaximaVuelo, nombre, 0, mataCiviles, 0.0);
    }
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
