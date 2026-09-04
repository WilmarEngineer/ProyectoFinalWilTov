
package proyectofinalwiltov;


public class ProyectoFinalWilTov {

    
    public static void main(String[] args) {
        
// Se realiza la instanciacion de un primer objeto perteneciente a la Superclase Superheroe
        // Se usa el constructor con todos los parametros debido a que se conocen todos los valores de los atributos
        SuperHeroe vengador1 = new SuperHeroe ("Wilmar", 16, false, 1.75);
       
        // Se realiza la instanciacion de un segundo objeto perteneciente a la Superclase SuperHeroe
        // Se usa el constructor con tres de los parametros debido a que no se conocen todos los valores de los atributos
        SuperHeroe vengador2 = new SuperHeroe ("Stiven", 18, 1.70);
        
        // Se realiza la instanciacion de un primer objeto perteneciente a la Subclase IronMan
        // Se usa el constructor con tres de los parametros debido a que no se conocen todos los valores de los atributos
        IronMan ironman1 = new IronMan(10000000,"Will", true );
       
        // Se realiza la instanciacion de un segundo objeto perteneciente a la Subclase IronMan
        // Se usa el constructor con todos los parametros debido a que se conocen todos los valores de los atributos
        IronMan ironman2 = new IronMan("Tovar", 10, true, 100000, "Tony", 16, true, 1.80 );
        
        // Se realiza la instanciacion de un primer objeto perteneciente a la Subclase SuperMan
        // Se usa el constructor con cero parametros debido a que no se conoce ningnun valor de los atributos
        SuperMan superman1 = new SuperMan( );
        
         // Se realiza la instanciacion de un primer objeto perteneciente a la Subclase SuperMan
        // Se usa el constructor con cinco parametros debido a que solo se conocen cinco valores de los atributos
        SuperMan superman2 = new SuperMan("Kim Jong Hun", 60, 1000000,"Presi", true);
        
        // Se realiza la instanciacion de un primer objeto perteneciente a la Subclase Hulk
        // Se usa el constructor con siete parametros debido a que solo se conocen siete valores de los atributos
        Hulk hulk1 = new Hulk("Furioso", 26, false,100000000, "Hulksito", 20, true );
        
        // Se realiza la instanciacion de un segundo objeto perteneciente a la Subclase Hulk
        // Se usa el constructor con cero parametros debido a que no se conoce ningnun valor de los atributos
        Hulk hulk2 = new Hulk();
        
        //IMPRESION POR CONSOLA 
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("Superheroe 1 " + vengador1 );
        System.out.println("Superheroe 2 " + vengador2 );
        System.out.println("-------------------------------------------------------------------------------------");
        
        //IMPRESION POR CONSOLA 
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("Ironman 1 " + ironman1 );
        System.out.println("Ironman 2 " + ironman2 );
        System.out.println("-------------------------------------------------------------------------------------");
        
        //IMPRESION POR CONSOLA 
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("Superman 1 " + superman1 );
        System.out.println("Superman 2 " + superman2 );
        System.out.println("-------------------------------------------------------------------------------------");
        
        //IMPRESION POR CONSOLA 
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("Hulk 1 " + hulk1 );
        System.out.println("Hulk 2 " + hulk2 );
        System.out.println("-------------------------------------------------------------------------------------");
   
    }
    
}
