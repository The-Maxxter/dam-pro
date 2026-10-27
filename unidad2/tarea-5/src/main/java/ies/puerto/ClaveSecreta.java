package ies.puerto;

public class ClaveSecreta {
    static void main() {
        //o 0 = 0
        //i I = 2
        //u U = 3
        //e E = *
        //a A = ?

    }
    static String generarClaveSegura(String palabra){
        String clave = "";

        if (palabra == null || palabra.isEmpty()){
            return "";
        }
        palabra.replace("a|A", "?");
        palabra.replace("e|E", "*");

        return clave;
    }
}
