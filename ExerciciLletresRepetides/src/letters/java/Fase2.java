////L’exercici consisteix en mostrar per consola quantes vegades apareix cada lletra del teu nom i cognoms amb
//diferents variants (fases).

/*
* * FASE 2
* Canvia la taula per una llista (List<Character>)
* Al bucle, si la lletra és una vocal imprimeix a la consola: ‘VOCAL’. Sinó, imprimeix: ‘CONSONTANT’.
* Si trobes un numero, mostra per pantalla: ‘Els noms de persones no contenen números!’.
* @author monts
*/

package letters.java;

import java.util.ArrayList;
import java.util.List;

public class Fase2 {

    public static void main(String[] args) {

        //arraylist

        List<Character> nombre = new ArrayList<>();
        nombre.add('M');
        nombre.add('o');
        nombre.add('n');
        nombre.add('t');
        nombre.add('s');
        nombre.add('e');
        System.out.println(nombre);

        //letras

        for (char ch : nombre) {

            // vocales y consonantes
            if (ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'|| ch == 'A'|| ch == 'E'|| ch == 'I' ||ch == 'O'
                    ||ch == 'U') {
                String vocal = "VOCAL";
                System.out.println(vocal);

            } else if (ch == 'b'|| ch == 'c'|| ch == 'd'|| ch == 'f'|| ch == 'g'|| ch == 'h'|| ch == 'j'|| ch == 'k'||
                    ch == 'l'||ch == 'm'|| ch == 'n'||ch == 'p'||ch == 'q'||ch == 'r'||ch == 's'||ch == 't'||ch == 'v'||
                    ch == 'w'||ch == 'y'||ch == 'z'|| ch == 'B'|| ch == 'C'|| ch == 'D'|| ch == 'F'|| ch == 'G'|| ch == 'H'||
                    ch == 'J'|| ch == 'K'||ch == 'L'||ch == 'M'|| ch == 'N'||ch == 'P'||ch == 'Q'||ch == 'R'||ch == 'S'||
                    ch == 'T'||ch == 'V'||ch == 'W'||ch == 'Y'||ch == 'Z') {
                String novocal = "CONSONANTE";
                System.out.println(novocal);
            } else {
                String conNumero = "Els noms de persones no contenen números!";
                System.out.println(conNumero);
            }

        }

    }

}


