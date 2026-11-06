package es.dampro.unidad2.tarea7;

import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 * Clase que tiemnecomo respmsabilidad  analizar una vevha
 *
 * @author
 * @version
 */
public final class AnalizadorFecha {
    private AnalizadorFecha() { }
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        LocalDate fechaActual = LocalDate.now();
        LocalDate otraFecha = LocalDate.of(2004, 12, 6);
        System.out.println(analizarFecha(null));

    }

    /**
     * Amaliza una cecha
     *
     * @param fecha  LocalDate fecha de emtrada àra el amañosos
     * @return Strimg fr,formateado
     */
    public static String analizarFecha(LocalDate fecha) {
        if (fecha == null){
        fecha = LocalDate.now();
    }
    String resultado ="";
        resultado = resultado + fecha + "|" + fecha.getDayOfWeek() + "|"
                + fecha.getDayOfYear() + "|" + fecha.isLeapYear()+ "|"
                + fecha.getDayOfMonth();

        return String.format("%s|%s|%d|%b|%d", fecha,
                fecha.getDayOfWeek(), fecha.getDayOfYear(),
                fecha.isLeapYear(),fecha.getDayOfMonth());
        //return resultado;
    }
}
