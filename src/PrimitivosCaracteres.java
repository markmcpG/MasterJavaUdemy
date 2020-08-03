public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char carater = '\u0040';
        char decimal  = 64;
        System.out.println("caracter = " + decimal);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter" + (decimal == carater));

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter" + (simbolo == carater));

        char espacio = '\u0020';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';


        System.out.println("char corresponde en bytes = "+ System.getProperty("line.separator") + Character.BYTES);
        System.out.println("char corresponde en bites = " + Character.SIZE);
        System.out.println("Charater.MIN_VALUE = " + Character.MIN_VALUE);
        System.out.println("Charater.MAX_VALUE  = " + Character.MAX_VALUE);
    }

}
