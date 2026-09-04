
package proyectofinalwiltov;


public class Hulk extends SuperHeroe{
    private String tipoDeHulk="";
    private int nivelDeFuria=0;
    private boolean mantieneControlMental=false;
    private long energiaLiberada=0;
    
    public Hulk() {
        this("", 0, false, 0, "", 0, false, 0.0);
    }
    public Hulk(String tipoDeHulk, int nivelDeFuria, boolean mantieneControlMental, long energiaLiberada, String nombre, int edad, boolean mataCiviles, double altura) {
        super(nombre, edad, mataCiviles, altura);
        this.tipoDeHulk = tipoDeHulk;
        this.nivelDeFuria = nivelDeFuria;
        this.mantieneControlMental = mantieneControlMental;
        this.energiaLiberada = energiaLiberada;
    }
    public Hulk(String tipoDeHulk, int nivelDeFuria, boolean mantieneControlMental, long energiaLiberada, String nombre, int edad, boolean mataCiviles) {
        this(tipoDeHulk, nivelDeFuria, mantieneControlMental, energiaLiberada, nombre, edad, mataCiviles, 0.0);
    }
    public Hulk(String tipoDeHulk, int nivelDeFuria, long energiaLiberada, String nombre, boolean mataCiviles) {
        this(tipoDeHulk, nivelDeFuria, true, energiaLiberada, nombre, 0, mataCiviles, 0.0);
    }
    public Hulk(long distanciaMaximaVuelo, String nombre, boolean mataCiviles) {
        this("", 0, true, distanciaMaximaVuelo, nombre, 0, mataCiviles, 0.0);
    }
    public String getTipoDeHulk(){
        return tipoDeHulk;
    }
    public void setTipoDeHulk(String tipoDeHulk){
        this.tipoDeHulk = tipoDeHulk;
    }
    public int getNivelDeFuria(){
        return nivelDeFuria;
    }
    public void setNivelDeFuria(int nivelDeFuria){
        this.nivelDeFuria = nivelDeFuria;
    }
    public boolean getMantieneControlMental(){
        return mantieneControlMental;
    }
    public void setMantieneControlMental(boolean mantieneControlMental){
        this.mantieneControlMental = mantieneControlMental;
    }
    public long getEnergiaLiberada(){
        return energiaLiberada;
    }
    public void setEnergiaLiberada(long energiaLiberada){
        this.energiaLiberada = energiaLiberada;
    }
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Mata civiles: " + mataCiviles  + ", Altura: " + altura 
                + ", Tipo de hulk: " + tipoDeHulk + ", Nivel de furia: " + nivelDeFuria + ", Mantiene el control mental: " + mantieneControlMental + ", Energia liberada:" + energiaLiberada;        
    }
}
