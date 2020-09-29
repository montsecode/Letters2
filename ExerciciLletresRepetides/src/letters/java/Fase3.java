////L’exercici consisteix en mostrar per consola quantes vegades apareix cada lletra del teu nom i cognoms amb
//diferents variants (fases).

/**
 * 
 * FASE 3
 * Emmagatzemar en un Map tant les lletres de la llista com el nombre de vegades que apareixen
  *@author monts

 */




package letters.java;


import java.util.*;

public class Fase3 {

    public static void main(String[] args) {
        // instamos la variable, Scanner es una clase en el paquete java.util
    	//// Declarar el objeto e inicializar con el objeto de entrada estándar predefinido
    	
        Scanner sc = new Scanner(System.in);
        //entrada de datos en este caso nombre
        String strName = null;
        // Imprima los valores para verificar si la entrada fue obtenida correctamente
        System.out.println("Enter your name : ");
        strName = sc.nextLine();
        System.out.println("Your name is " + strName);

        //String - ArrayList
        ArrayList<Character> firstName = new ArrayList<>();
        for (Character c : strName.toCharArray()) {
            firstName.add(c);
        }

       //loop 
        for (char c : firstName) {
            String fName = Character.toString(c);
            System.out.println(fName);
        }

        //declare a int variable for ArrayList size (a.k.a. number of char on it) to run the for i loop
        int len = firstName.size();
        int[] nameSize = new int[255];

        for (int i = 0; i < len; i++) {
            nameSize[firstName.get(i)]++;
        }

        char[] ch = new char[len];
        for (int i = 0; i < len; i++) {
            ch[i] = firstName.get(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {
                if (firstName.get(i) == ch[j])
                    find++;
            }
            if (find == 1) {
                System.out.println("Frequency of letter " + firstName.get(i) + " is " + nameSize[firstName.get(i)]);
            }
        }
        //declare the map
        Map<Character, Integer> ltMap = new HashMap<>();

        //populate the map from the arrayList
        for (int i = 0; i < len; i++) {

            char ltName = firstName.get(i);
            int ltIndex = nameSize[firstName.get(i)];

            ltMap.put(ltName, ltIndex);
            //System.out.println(ltMap);
        }


    }
}
