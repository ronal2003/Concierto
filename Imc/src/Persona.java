import javax.swing.*;
import java.awt.*;

public class Persona {
static float mts,kg;
    public static void main(String[] args) {


        System.out.println("1 persona");
        Imc imc = new Imc();
        imc.setPeso(53);
        imc.setAltura(1.71);
        System.out.println(imc.calcular( ));
        System.out.println();

        System.out.println("2 persona");
        Imc peso = new Imc();
        peso.setPeso(53);
        peso.setAltura(1.71);
        System.out.println(peso.calcular( ));
        System.out.println();

        System.out.println("3 persona");
        Imc x = new Imc(45,1.72);
        System.out.println(x.calcular());
        System.out.println();






    }



}
