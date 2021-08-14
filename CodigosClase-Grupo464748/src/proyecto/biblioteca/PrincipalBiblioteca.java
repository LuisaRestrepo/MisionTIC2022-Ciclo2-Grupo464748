package proyecto.biblioteca;

public class PrincipalBiblioteca {

    public static void main(String[] args) {
        Biblioteca b1 = new Biblioteca();
        //System.out.println(Biblioteca.libros.get(0).toString());
        
        Object[][] resultado3 = b1.listar();

        b1.agregar("La sombra del viento", "HUI212", "carlos ruiz", 2001);

        Object[][] resultado = b1.listar();

        info(resultado);

        System.out.println("**************************");

        Object[][] resultado2 = b1.obtenerPorId(2);
        for (int i = 0; i < resultado2.length; i++) {
            for (int j = 0; j < resultado2[0].length; j++) {
                System.out.print(resultado2[i][j] + ",");
            }
            System.out.println();
        }

        System.out.println("***********************");
        b1.modificar(2, "CARLOS RUIZ");
        resultado = b1.listar();
        info(resultado);
        
        System.out.println("***********************");
        b1.eliminar(2);
        resultado = b1.listar();
        info(resultado);

    }

    public static void info(Object[][] resultado) {
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[0].length; j++) {
                System.out.print(resultado[i][j] + ",");
            }
            System.out.println();
        }
    }

}
