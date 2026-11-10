package es.educacion.arrays;


public final class Ejercicio04ContarAprobados {
    private Ejercicio04ContarAprobados() { }

    public static void main(String[] args) {
        int [] notas = {5,2,1,10,8};
        int aprobados = contarAprobados(notas);
        System.out.println("Num. aprobados ="+aprobados);
    }
    /**
     * calculas la nota
     * @param notas
     * @return
     */
    public static int contarAprobados(int[] notas) {
        if (notas ==null || notas.length==0){
            throw new IllegalArgumentException();
        }
        int aprobados =0;
        for (int nota:notas){
            if (nota >= 5){
                aprobados=aprobados+1; //aprobados++;
            }
        }
        return aprobados;
    }
    public static int contarSuspensos (int[] notas) {
        if (notas == null || notas.length == 0) {
            throw new IllegalArgumentException();
        }
        int suspensos = 0;
        for (int nota : notas) {
            if (nota <= 5) {
                suspensos = suspensos + 1; //suspensos++;
            }
        }
        return suspensos;
    }
    public static int contarSuspensosTop (int[] notas) {
        if (notas==null){
            throw new IllegalArgumentException();
        }
        return notas.length - contarAprobados(notas);
    }
}
