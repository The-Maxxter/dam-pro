package es.dampro.unidad2.tarea7;

import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;

/**
 * TODO: Describe la finalidad de ProximoCumpleanios.
 *
 * @author Mauro
 * @version 1.0.0
 */
public final class ProximoCumpleanios {
    private ProximoCumpleanios() { }

    /**
     * Devuelve el proximo cumpleanios, contando hoy.
     * IllegalArgumentException si el nacimiento es futuro.
     *
     * @param nacimiento fecha de nacimiento
     * @param hoy fecha de hoy
     * @return fecha del proximo cumpleanios (si es hoy, hoy)
     */
    public static LocalDate calcularProximoCumpleanios(LocalDate nacimiento, LocalDate hoy) {
        if (nacimiento.isAfter(hoy)) {
            throw new IllegalArgumentException("El nacimiento es posterior a hoy");
        }
        LocalDate cumple = nacimiento.withYear(hoy.getYear());
        if (cumple.isBefore(hoy)) {
            cumple = nacimiento.withYear(hoy.getYear() + 1);
        }
        return cumple;
    }
}