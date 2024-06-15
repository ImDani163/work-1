public class HolaMundo {
    public static void main(String[] args) {

        String welcome = "Hola mundo desde Java";
        System.out.println(welcome);

        System.out.println(welcome.toUpperCase());

        int numero = 10;
        boolean valor = true;
        int numero2 = 10;

        if(valor){
            System.out.println(numero);
            numero2 = 15;
        }

        System.out.println(numero2);

        var numero3 = 40;

        String nombre;

        nombre = "andres";

        if (numero > 10){
            nombre = "biel";
        }
        System.out.println("nombre = " + nombre);

    }
}