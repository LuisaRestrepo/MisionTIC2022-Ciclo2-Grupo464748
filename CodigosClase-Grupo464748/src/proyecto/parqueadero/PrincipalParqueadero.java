
package proyecto.parqueadero;


public class PrincipalParqueadero {
    public static void main(String[] args) throws InterruptedException {
        //Vehiculo v1 = new Vehiculo("gty675");
        //System.out.println(v1.info());
        
        Carro c1 = new Carro("GTY6576");
        System.out.println(c1.info());
        
        Carro.precio = 500;
        Thread.sleep(30000);
        System.out.println(c1.pago());
        
    }
    
}
