package es.dampro.unidad2.tarea7;

import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;

/**
 * Calcula fechas de vencimiento.
 *
 * @author Mauro
 * @version 1.0
 */

public final class CalculadoraVencimientos {
    private CalculadoraVencimientos() { }

    /**
     * Suma anios, meses y dias a una fecha.
     *
     * Ejemplo real (el de los tests): {@code calcularVencimiento(LocalDate.of(2026, 1, 31), 0, 1, 0)} da {@code 2026-02-28}.
     *
     * @param fecha fecha de inicio
     * @param dias dias a sumar
     * @param meses meses a sumar
     * @param anios anios a sumar
     * @return la fecha de vencimiento
     */
    public static LocalDate calcularVencimiento(LocalDate fecha, int dias, int meses, int anios) {
        return fecha.plusYears(anios).plusMonths(meses).plusDays(dias);
    }
}