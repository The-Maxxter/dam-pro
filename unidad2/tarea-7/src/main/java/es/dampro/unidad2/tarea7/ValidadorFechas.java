package es.dampro.unidad2.tarea7;

import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;

/**
 * TODO: Describe la finalidad de ValidadorFechas.
 *
 * @author Mauro
 * @version 1.0.0
 */
public final class ValidadorFechas {
    private ValidadorFechas() { }

    /**
     * Convierte un texto dd/MM/uuuu (2 digitos de dia y mes, 4 de anio) en fecha usando ResolverStyle.STRICT.
     * DateTimeParseException si la fecha es imposible o el texto esta mal
     *
     * @param texto la fecha escrita
     * @return la fecha ya convertida
     */
    public static LocalDate validarFecha(String texto) {
        // STRICT: no acepta fechas imposibles como 31/04/2026
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/uuuu")
                .withResolverStyle(ResolverStyle.STRICT);
        return LocalDate.parse(texto, formato);
    }
}