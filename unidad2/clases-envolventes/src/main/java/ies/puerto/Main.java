package ies.puerto;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mauro
 * @version 1.0.0
 */
public class Main {
    static void main() {

        /**int numero = 0;
        Integer numeroObjeto = 10;

        System.out.println("Numero primitivo" + numero);
        System.out.println("Clase evolvente" + numeroObjeto);
        List<Integer> numeros = new ArrayList<>();

        numeros.add(numero);
        numeros.add(numeroObjeto);
        numeros.add(null);
        numeros.add(new Integer(3));
        numeros.remove(2);

        //System.out.println(numeros);

        String sBooleano = "true";
        System.out.println("Booleanoen string"+sBooleano);
        boolean primitivoBooleano = Boolean.valueOf(sBooleano);
        System.out.println("boolean primitivo "+primitivoBooleano);
        boolean noBooleano = Boolean.valueOf("algo");
        System.out.println("No boolean primitivo "+noBooleano);
        **/

        String texto = "100";
        byte numeroByte = Byte.parseByte(texto);
        System.out.println(numeroByte);
    }
}
