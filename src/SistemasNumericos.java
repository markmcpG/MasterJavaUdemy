public class SistemasNumericos {
    public static void main(String[] args) {

        int numeroDecimal = 500;
        // convirtiendo a Binario
        System.out.println("numeroDecimal = " + numeroDecimal);
        System.out.println("numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));
        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);

        // convirtiendo a Octal
        System.out.println("numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));
        int numeroOctal = 0764;  // se antepone un 0 para que el compilador sepa que esta en octal
        System.out.println("numeroOctal = " + numeroDecimal);

        // convirtiendo a Hexadecimal
        System.out.println("numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));
        int numeroHexadecimal = 0x1f4;
        System.out.println("numero Hexadecimal = " + numeroHexadecimal);
    }
}
