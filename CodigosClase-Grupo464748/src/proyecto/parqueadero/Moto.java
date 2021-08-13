
package proyecto.parqueadero;

import java.util.Date;


public class Moto extends Vehiculo{
    
public static int precio = 0;

    public Moto(String placa) {
        super(placa);
    }
    
    public String info(){
        return "Moto -" + super.info();
    }

    public String pago() {
        Date hoy = new Date();
        long differencia = hoy.getTime() - super.ingreso.getTime();
        long difSegundos = differencia/1000;
        double precioTotal = difSegundos * (precio/60);
        return "La Moto de placa " + super.placa + ", tiempo: "+difSegundos/60.0+ ", TOTAL PAGAR: "+precioTotal+"$";
    }
    
}
