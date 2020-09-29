//L’exercici consisteix en mostrar per consola quantes vegades apareix cada lletra del teu nom i cognoms amb
//diferents variants (fases).

/**
 * 
 * * FASE 1
* Crea una taula (char[]) amb el teu nom on cada posició correspongui a una lletra.
* Fes un bucle que recorri aquesta taula i mostri per consola cadascuna de les lletres.
* 
*  @author monts
 */


package letters.java;

public class Fase1 {

    // main() method declaration

    public static void main(String[] args) {

        // array Nombre=Montse
    	char[] name = {'M','o','n','t','s','e'};

        //instamos array como  String y se imprima Nombre
        String nombre = new String(name);
        System.out.println(nombre);

        //declaro nueva array para suar name String y lo convierto en array 
        //El java string toCharArray () método nos convierte string into character array.
        char[] nombre1 = nombre.toCharArray();

        //for para bucle que recorri aquesta taula
        for (char a: nombre1) {
            System.out.println(a);
        }
    }
}
