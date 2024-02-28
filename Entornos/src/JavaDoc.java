 /**
     * @author Miguel Angel
     * @version 1.0
     * @since 28/02/2024
     */
    public class JavaDoc {
        private int numero;

        /**
         * @param numero
         */
        public void Ejemplo(int numero) {
            this.numero = numero;
        }

        /**
         * @param sumando .
         * @return
         */
        public int sumar(int sumando) {
            return numero + sumando;
        }

        /**
         * @param sustraendo
         * @return
         * @throws IllegalArgumentException
         */
        public int restar(int sustraendo) {
            if (sustraendo > numero) {
                throw new IllegalArgumentException("El sustraendo no puede ser mayor que el número almacenado.");
            }
            return numero - sustraendo;
        }

        /**
         * @return
         */
        @Override
        public String toString() {
            return "Ejemplo [numero=" + numero + "]";
        }
    }

