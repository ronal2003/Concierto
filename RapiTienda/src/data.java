import javax.swing.*;

public class data {
    int valor;
    String producos[] = new String[3];
    int saldo = 10000;

    public data() {
        notifi();
    }

    public void notifi() {

        if (JOptionPane.showConfirmDialog(null, "compras a la sar tienes un salo de 10000 pesos, diezmil pesos desea seguir") == 0) {
            datos();
        } else {
            System.exit(0);
        }

    }

    public void datos() {
        String menu = "Menu de compras \n\n";
        menu += "1. banano 500\n";
        menu += "2. zanahoria 1700\n";
        menu += "3. pepinos 2000\n";
        menu += "4. info-saldo\n";
        menu += "5. tu lista de productos\n";
        menu += "6. salir\n";
        String option = JOptionPane.showInputDialog(menu);

        switch (option) {
            case "1":
                saldo -= 500;
                if (saldo < 500) {
                    JOptionPane.showMessageDialog(null, "Saldo insuficiente ");
                } else {
                    JOptionPane.showMessageDialog(null, "A comprado un banano sera descontado de su sueldo");
                    producos[0] = "banano";
                }
                datos();
                break;
            case "2":
                saldo -= 1700;

                if (saldo < 1700) {
                    JOptionPane.showMessageDialog(null, "Saldo insuficiente ");
                } else {
                    JOptionPane.showMessageDialog(null, "A comprado una zanahoria sera descontado de su sueldo");
                    producos[1] = "zanahoria";
                }
                datos();
                break;
            case "3":
                saldo -= 2000;

                if (saldo < 2000) {
                    JOptionPane.showMessageDialog(null, "Saldo insuficiente " + saldo);
                } else {
                    JOptionPane.showMessageDialog(null, "A comprado un pepino sera descontado de su sueldo");
                    producos[2] = "pepinos";

                }
                datos();

                break;
            case "4":
                JOptionPane.showMessageDialog(null, "Info de saldo su saldo actual es de " + saldo);
                if (saldo == 0) {
                    if (JOptionPane.showConfirmDialog(null, "Info de saldo su saldo actual es de " + saldo + "desea sacar de su tarjeta?") == 0) {
                        saldo = 10000;
                    } else {
                        JOptionPane.showMessageDialog(null, "ok");
                        saldo = saldo;
                    }
                }
                datos();
                break;
            case "5":

                    if (producos[0] != null) {
                        System.out.println("cantidad de productos: " + producos[0] +
                                producos[1] +
                                producos[2]);
                        datos();
                    } else {
                        producos[0] = null;
                        producos[1] = null;
                        producos[2] = null;

                    }


                break;
            case "6":
                System.exit(0);
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opcion fuera de lugar");
                datos();

        }
    }

    public static void main(String[] args) {
        new data();
    }
}
