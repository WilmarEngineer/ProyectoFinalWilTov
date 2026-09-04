
package proyectofinalwiltov;


public class Hulk extends SuperHeroe{
    private String tipoDeHulk="";
    private int nivelDeFuria=0;
    private boolean mantieneControlMental=false;
    private long energiaLiberada=0;
    
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
    
}
