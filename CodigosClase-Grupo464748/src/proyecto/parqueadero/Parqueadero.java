
package proyecto.parqueadero;


public class Parqueadero {
    public int pisos;
    public int espacios;
    public int cantidadParqueados;
    public int historial;
    public Vehiculo[][] matriz;

    public Parqueadero(int pisos, int espacios, int pCarro, int pMoto) {
        this.pisos = pisos;
        this.espacios = espacios;
        Carro.precio = pCarro;
        Moto.precio = pMoto;
        this.matriz = new Vehiculo[pisos][espacios];
    }
    
}
