
package proyectofinalwiltov;


public class IronMan extends SuperHeroe{
    private String creadorTrajeIronman="";
    private int version =0;
    private boolean volador=true;
    private long precioTraje=0;
    
   public IronMan() {
        this("", 0, false, 0L, "", 0, false, 0.0);
   }
    public IronMan(String creadorTrajeIronman, int version, boolean volador, long precioTraje, String nombre, int edad, boolean mataCiviles, double altura) {
        super(nombre, edad, mataCiviles, altura);
        this.creadorTrajeIronman = creadorTrajeIronman;
        this.version = version;
        this.volador = volador;
        this.precioTraje = precioTraje;
    }
    public IronMan(String creadorTrajeIronman, int version, boolean volador, long precioTraje, String nombre, int edad, boolean mataCiviles) {
        this(creadorTrajeIronman, version, volador, precioTraje, nombre, edad, mataCiviles, 0.0);
    }
    public IronMan(String creadorTrajeIronman, int version, long precioTraje, String nombre, boolean mataCiviles) {
        this(creadorTrajeIronman, version, true, precioTraje, nombre, 0, mataCiviles, 0.0);
    }
    public IronMan(long precioTraje, String nombre, boolean mataCiviles) {
        this("", 0, true, precioTraje, nombre, 0, mataCiviles, 0.0);
    }
    
}
