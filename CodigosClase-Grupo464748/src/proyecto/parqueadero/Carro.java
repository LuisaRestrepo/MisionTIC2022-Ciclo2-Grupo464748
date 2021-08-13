
package proyecto.parqueadero;

import java.util.Date;


public class Carro extends Vehiculo{
    
    public static int precio = 0;

    public Carro(String placa) {
        super(placa);
    }
    
    public String info(){
        return "CARRO -" + super.info();
    }

    public String pago() {
        Date hoy = new Date();
        long differencia = hoy.getTime() - super.ingreso.getTime();
        long difSegundos = differencia/1000;
        double precioTotal = difSegundos * (precio/60);
        return "El carro de placa " + super.placa + ", tiempo: "+difSegundos/60.0+ ", TOTAL PAGAR: "+precioTotal+"$";
    }
    
}
