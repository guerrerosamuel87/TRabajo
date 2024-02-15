import javax.swing.JOptionPane;

public class Trabajo {
    private int edad;
    
    public Trabajo() {
        edad=0;
    }

    public void pedirDatos() {

        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del niño:"));
        
        
        
        if (edad >= 18) {
            JOptionPane.showMessageDialog(null, "Este juego solo es permitido para mayores de edad.");
        } 
        
        else if (edad < 10) {
            JOptionPane.showMessageDialog(null, "Edad no permitida para este juego.");
        } 
        
        else {
            JOptionPane.showMessageDialog(null, "Bienvenido al juego.");
        }
    }
    public static void main(String[] args) {
        Trabajo programa = new Trabajo();
        programa.pedirDatos();
    }

}