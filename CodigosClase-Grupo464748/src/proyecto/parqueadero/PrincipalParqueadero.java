
package proyecto.parqueadero;


public class PrincipalParqueadero {
    public static void main(String[] args) throws InterruptedException {
        //Vehiculo v1 = new Vehiculo("gty675");
        //System.out.println(v1.info());
        
        Carro c1 = new Carro("GTY6576");
        System.out.println(c1.info());
        
        Carro.precio = 500;
        //Thread.sleep(30000);
        System.out.println(c1.pago());
        
        Parqueadero p1 = new Parqueadero(4,5,500,300);
        System.out.println(p1.imprimeVacios());
        
        System.out.println(p1.parqueaVehiculo(1, 1, 1, "KLP988"));
        //Thread.sleep(5000);
        System.out.println(p1.parqueaVehiculo(1, 1, 1, "KLP988"));
        System.out.println(p1.parqueaVehiculo(1, 2, 7, "KLP988"));
        System.out.println(p1.parqueaVehiculo(5, 2, 1, "KLP988"));
        
        System.out.println(p1.parqueaVehiculo(2, 3, 2, "FRT564"));
        
        System.out.println("****************************************");
        System.out.println(p1.estadoParqueadero());
    }
    
}
