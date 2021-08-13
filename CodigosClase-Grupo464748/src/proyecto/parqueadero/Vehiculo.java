
package proyecto.parqueadero;

import java.util.Date;


public abstract class Vehiculo {
    
    public String placa;
    public Date ingreso;
    
    public Vehiculo(String placa){
        this.placa = placa;
        this.ingreso = new Date();
    }
    
    public String info(){
      String mensaje = "Placa: "+this.placa+", Fecha ingreso: "+this.ingreso;
      return mensaje;
    }
    
    public abstract String pago();
    
}
