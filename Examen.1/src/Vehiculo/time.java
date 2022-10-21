package Vehiculo;
import java.util.Calendar;

public class time {
    public static void main(String[] args) {
        int edad, diaHoy, mesHoy, añoHoy;

        diaHoy = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        mesHoy = Calendar.getInstance().get(Calendar.MONTH) +1;
        añoHoy = Calendar.getInstance().get(Calendar.YEAR);

        System.out.println("La feca de hoy es: " +
                diaHoy + "/" +
                mesHoy + "/" +
                añoHoy);

    }
}
