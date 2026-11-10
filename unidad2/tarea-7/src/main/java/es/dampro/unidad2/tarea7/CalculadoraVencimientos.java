package es.dampro.unidad2.tarea7;

import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;

/**
 * TODO: Describe la finalidad de CalculadoraVencimientos.
 *
 * @author
 * @version
 */
public final class CalculadoraVencimientos {
    private CalculadoraVencimientos() { }
    public static void main(String[] args) {
        LocalDate fecha=LocalDate.now();
        LocalDate calcularVencimiento = LocalDate.of(2026, 11, 6);
        Period dias = Period.between(fecha, calcularVencimiento);
        int
    }

    /**
     * TODO: Describe lo que hace el método.
     *
     * @param fecha
     * @param dias
     * @param meses
     * @param anios
     * @return
     */
    public static LocalDate calcularVencimiento(LocalDate fecha, int dias, int meses, int anios) {
        // TODO: Implementa el algoritmo según el enunciado.
        return LocalDate.MIN;
    }
}
