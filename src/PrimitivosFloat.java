public class PrimitivosFloat{

    static float varStaticFloat;
    public static void main(String[] args) {

        float realFloat = 2.12e3f; //2120f  //2.12e-3f
        System.out.println("realFloat = " + realFloat);
        System.out.println("float corresponde en byte a = " + Float.BYTES);
        System.out.println("float corresponde en bits a = " + Float.SIZE);
        System.out.println("valor maximo de un float = " + Float.MAX_VALUE);
        System.out.println("valor maximo de un float = " + Float.MIN_VALUE);

        double realDouble = 1.7976931348623157E308;
        System.out.println("realDouble = " + realDouble);
        System.out.println("double corresponde en byte a = " + Double.BYTES);
        System.out.println("double corresponde en bits a = " + Double.SIZE);
        System.out.println("valor maximo de un double = " + Double.MAX_VALUE);
        System.out.println("valor maximo de un double = " + Double.MIN_VALUE);
        
        var varFlotante = 3.1416f;
        System.out.println("varFlotante = " + varFlotante);

        var varDouble = 3.1416;
        System.out.println("varDouble = " + varDouble);

        System.out.println("varStaticFloat = " + varStaticFloat);

    }
}
