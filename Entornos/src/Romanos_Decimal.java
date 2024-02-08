//Miguel Angel Romero Lopez
public class Romanos_Decimal {
    private static final int[] VALORES_DECIMALES = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] SIMBOLOS_ROMANOS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public static String decimalARomano(int numero) {
        if (numero <= 0 || numero > 3999) {
            return "Número no válido para conversión a romano";
        }

        StringBuilder resultado = new StringBuilder();
        int i = 0;

        while (numero > 0) {
            if (numero >= VALORES_DECIMALES[i]) {
                resultado.append(SIMBOLOS_ROMANOS[i]);
                numero -= VALORES_DECIMALES[i];
            } else {
                i++;
            }
        }

        return resultado.toString();
    }

    public static int romanoADecimal(String numeroRomano) {
        String romano = numeroRomano.toUpperCase();
        int resultado = 0;
        int i = 0;

        for (int j = 0; j < SIMBOLOS_ROMANOS.length; j++) {
            while (romano.startsWith(SIMBOLOS_ROMANOS[j])) {
                resultado += VALORES_DECIMALES[j];
                romano = romano.substring(SIMBOLOS_ROMANOS[j].length());
            }
        }

        if (romano.length() > 0) {
            return -1;
        }

        return resultado;
    }
}
