
package proyectofinalwiltov;


public class SuperHerore {
    protected String nombre= "";
    protected int edad=0;
    protected boolean mataCiviles=false;
    protected double altura=0;
    
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
