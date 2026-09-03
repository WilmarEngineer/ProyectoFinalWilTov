
package proyectofinalwiltov;


public class SuperHeroe {
    protected String nombre= "";
    protected int edad=0;
    protected boolean mataCiviles=false;
    protected double altura=0;
    
    public SuperHeroe(String nombre, int edad, boolean mataCiviles, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.mataCiviles = mataCiviles;
        this.altura = altura;
    }
    public SuperHeroe(String nombre, int edad, boolean mataCiviles) {
        this(nombre, edad, mataCiviles, 0);
    }
    public SuperHeroe(String nombre, int edad) {
        this(nombre, edad, false, 0);
    }
    public SuperHeroe(String nombre, boolean mataCiviles, double altura) {
        this(nombre, 0, mataCiviles, altura);
    }
    public SuperHeroe(String nombre, int edad, double altura) {
        this(nombre, edad, false, altura);
    }      
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public boolean getMataCiviles(){
        return mataCiviles;
    }
    public void setMataCiviles(boolean mataCiviles){
        this.mataCiviles = mataCiviles;
    }
    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
}
