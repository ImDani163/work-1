import javax.lang.model.SourceVersion;

public class Caracteres {
    public static void main(String[] args) {

        char caracter = 'A';
        System.out.println("caracter = " + caracter);

        char caracterNumerico = '1';
        System.out.println("caracterNumerico = " + caracterNumerico);

        char caracterUnicode = '\u0040';
        System.out.println("caracterUnicode = " + caracterUnicode);

        char caracterUnicodeDedicmal = 64;
        System.out.println("caracterUnicodeDedicmal = " + caracterUnicodeDedicmal);

        System.out.println("caracterUnicodeDedicmal = caracterUnicode " + (caracterUnicodeDedicmal == caracterUnicode));

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracterUnicode " + (simbolo == caracterUnicode));

        var tambienSirve = '\u0040';

        System.out.println("char corresponde en byte = " + Character.BYTES);
        System.out.println("char corresponde en bites = " + Character.SIZE);
        System.out.println("valor maximo de un char = " + Character.MAX_VALUE);
        System.out.println("valor maximo de un char = " + Character.MIN_VALUE);

    }
}
