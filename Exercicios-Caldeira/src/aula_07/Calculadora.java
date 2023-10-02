package aula_07;

public enum Calculadora implements Calculavel{

    Adicao {
        @Override
        public double calcular(double N1, double N2) {
            return N1 + N2;
        }
    },

    Subtracao {
        @Override
        public double calcular(double N1, double N2) {
            return N1 - N2;
        }
    },

    Multiplicar {
        @Override
        public double calcular(double N1, double N2) {
            return N1 * N2;
        }
    },

    Dividir {
        @Override
        public double calcular(double N1, double N2) {
            if (N1 == 0 || N2 == 0) {
                System.out.println("É Zero!");
                System.exit(1);
            }
            return N1 / N2;
        }
    };
}

