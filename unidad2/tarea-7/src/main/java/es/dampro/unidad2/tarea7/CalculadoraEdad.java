package es.dampro.unidad2.tarea7;

import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;

/**
 * TODO: Clase que calcula edad
 *
 * @author Mauro
 * @version 1.0.0
 */

public final class CalculadoraEdad {
    private CalculadoraEdad() { }
    public static void main(String[] args){
        LocalDate nacimiento = LocalDate.of(2007, 7, 7);
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(nacimiento, fechaActual);
        int anios = periodo.getYears();
        System.out.println("la edad es "+ anios);
    }
    /**
     * Realiza el calculo de la edad
     *
     * @param nacimiento LocalDate fecha de nacimiento
     * @param fechaActual LocalDate fecha actual
     * @return int con la edad
     */
    public static Period calcularEdad(LocalDate nacimiento, LocalDate fechaActual) {
        boolean posterio = nacimiento.isAfter(fechaActual);
        if (posterio){
            throw new IllegalArgumentException();
        }

        return Period.between(nacimiento, fechaActual);
    }
}
