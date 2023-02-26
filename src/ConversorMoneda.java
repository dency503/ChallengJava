import javax.swing.JOptionPane;

public class ConversorMoneda {
    public static void main(String[] args) {
        String[] opciones = {"Conversor de Moneda", "Conversor de Temperatura"};
        String seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion",
                "Conversor de Moneda", JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

        if (seleccion == null) {
            // Si el usuario presiona cancelar o cierra la ventana sin seleccionar una opción
            return;
        } else if (seleccion.equals("Convertir moneda")) {
            // Aquí iría el código para convertir la moneda
        } else if (seleccion.equals("Conversor de Temperatura")) {
            System.out.println("Hola mundo");
        }
    }
}