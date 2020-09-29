////L’exercici consisteix en mostrar per consola quantes vegades apareix cada lletra del teu nom i cognoms amb
//diferents variants (fases).

/**
 * FASE 4
Crea una altra llista amb el teu cognom on cada posició correspongui a una lletra.
*Fusiona les dues llistes en una sola. A més, afegeix una posició amb un espai buit entre la primera i la
*segona. És a dir, partim de la llista name i surname i al acabar l’execució només tindrem una que es dirà
*fullName.
*FullName: [‘N’, ‘A’, ‘M’, ‘E’, ‘ ‘, ‘S’, ‘U’, ‘R‘, ‘N’, ‘A’, ‘M’, ‘E’]
*@author monts
 */



package letters.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Fase4 {

    public static void main(String[] args) {

        //instamos la variable, Scanner es una clase en el paquete java.util
    	// Declarar el objeto e inicializar con el objeto de entrada estándar predefinido
        Scanner sc1 = new Scanner(System.in);
        //entrada de datos en este caso nombre
        String strName = null;
        // Imprima los valores para verificar si la entrada fue obtenida correctamente
        System.out.println("Enter your name : ");
        strName = sc1.nextLine();
        Scanner nominator2 = new Scanner(System.in);
        //entrada de datos en este caso apellido
        String strSurname = null;
        System.out.println("Enter your surname : ");
        strSurname = nominator2.nextLine();
        System.out.println("Your name and surname are "+strName+ " " +strSurname);

        //String -ArrayLists
        ArrayList<Character> name = new ArrayList<>();
        for (Character c : strName.toCharArray()) {
            name.add(c);
        }

        ArrayList<Character> surname = new ArrayList<>();
        for (Character c : strSurname.toCharArray()) {
            surname.add(c);
        }

        //print 
        System.out.println("The letters of your name are: ");
        for (char c : name) {
            String fname = Character.toString(c);
            System.out.println(fname);
        }
        System.out.println("The letters of your surname are: ");
        for (char c : surname) {
            String sname = Character.toString(c);
            System.out.println(sname);
        }

        // lists
        //declare a joint list
        ArrayList<Character> fullName = new ArrayList<>();
        //add the first list
        for (char c : name) {
            fullName.add(c);
        }
        // second list
        for (char c : surname) {
            fullName.add(c);
        }
        //intro empty space in between
        int blank = name.size();
        fullName.add(blank, ' ');

        System.out.println("Your full name is: "+fullName);
    }
}
