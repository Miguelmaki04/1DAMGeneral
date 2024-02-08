//Miguel Angel Romero Lopez

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Romanos_DecimalTest {

    @Test
    void decimalARomano() {
        assertEquals("XXI", Romanos_Decimal.decimalARomano(21));
        assertEquals("MMXXII", Romanos_Decimal.decimalARomano(2022));
        assertEquals("Número no válido para conversión a romano", Romanos_Decimal.decimalARomano(0));
        assertEquals("Número no válido para conversión a romano", Romanos_Decimal.decimalARomano(4000));
    }

    @Test
    void romanoADecimal() {
        assertEquals(21, Romanos_Decimal.romanoADecimal("XXI"));
        assertEquals(2022, Romanos_Decimal.romanoADecimal("MMXXII"));
        assertEquals(4, Romanos_Decimal.romanoADecimal("IV"));
        assertEquals(3999, Romanos_Decimal.romanoADecimal("MMMCMXCIX"));
    }

}