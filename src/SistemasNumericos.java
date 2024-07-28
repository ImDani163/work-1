import javax.swing.*;
import javax.swing.plaf.InsetsUIResource;

public class SistemasNumericos {

    public static void main(String[] args) {



        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese el numero entero");
        int numeroDecimal = Integer.parseInt(numeroStr);

        System.out.println("numeroDecimal = " + numeroDecimal);

        System.out.println("numero binario de = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));

        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroDecimal);

        System.out.println("numero octal de = " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));
        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);

        System.out.println("numero hexadecimal de = " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));
        int numeroHex = 0x1f4;
        System.out.println("numeroHex = " + numeroHex);


    }



}
