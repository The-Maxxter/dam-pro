package es.educacion.arrays;

// Suma todos los valores. Array vacío: 0. Array null: IllegalArgumentException.
// 
// TODO: implementar el método y documentar la clase y el método mediante Javadoc.
public final class Ejercicio01Sumar {
    private Ejercicio01Sumar() { }

    public static void main(String[] args) {
        int [] elementos = new int[6];
        elementos[0] = 7;
        elementos[1] = 8;
        elementos[2] = 2;
        elementos[3] = 3;
        elementos[4] = 414;
        elementos[5] = 280;
        int sumaElementos=sumar(elementos);
        System.out.println("La suma es "+sumaElementos);
    }

    /**
     * calcula la suma de un array
     * @param numeros int[] de enteros
     * @return int suma de numeros
     */

    // Suma todos los valores. Array vacío: 0. Array null: IllegalArgumentException.
    public static int sumar(int[] numeros) {

        if (numeros==null ||numeros.length==0){
            throw new IllegalArgumentException("El array es nulo o vacio");
        }
        if (numeros.length==0){
            return 0;
        }
        int suma =0;
        for (int numero:numeros){
            suma += numero;
        }
        /**for int i = 0; i < numeros.length; i++) {
            int numero = numeros[i];
         **/

        return suma;
    }
}
