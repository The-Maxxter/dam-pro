package ies.puerto;

public class ClaveSecreta {
    static void main() {
        //o 0 = 0
        //i I = 2
        //u U = 3
        //e E = *
        //a A = ?

    }
    /**
     * Remplaza las vocales por otros caracteres
     * @param sPalabra String
     * @return String
     */
    static String generarClaveSegura(String sPalabra){
        String clave = "";

        if (sPalabra == null || sPalabra.isEmpty()){
            return "";
        }
        sPalabra = sPalabra.replace("a|A", "?");
        sPalabra = sPalabra.replace("e|E", "*");
        sPalabra = sPalabra.replace("i|I", "2");
        sPalabra = sPalabra.replace("o|O", "0");
        sPalabra = sPalabra.replace("u|U", "3");
        sPalabra = sPalabra.replace("d|D", "[");
        sPalabra = sPalabra.replace("r|R", "$");

        return clave;
    }
}
