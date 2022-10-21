import javax.swing.*;

public class Util {

    public static int tomarValorNumerico(String mensaje){

        int opcion = 0;

        try{
            opcion= Integer.parseInt(JOptionPane.showInputDialog(mensaje));

        }catch (Exception e){
    JOptionPane.showMessageDialog(null,
            "Error con los datos",
            "Error",
            JOptionPane.ERROR_MESSAGE);
        }
        return opcion;
    }
}
