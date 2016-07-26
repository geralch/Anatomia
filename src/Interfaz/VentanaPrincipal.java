package Interfaz;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class VentanaPrincipal extends JFrame implements ActionListener{

    public void mostrarVentana(){
        this.setTitle(".: Anatomia :.");
        //setIconImage (new ImageIcon(getClass().getResource("/Imagenes/robotIcon.png")).getImage());
        this.setSize(1200,700); 
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); 
        
        /*contenedor = this.getContentPane();
        contenedor.setLayout(new FlowLayout());
       
        crearMenu();
        espacioArbol();
        espacioMapa();
        espacioDatos();*/
        
        this.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String args[]){
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
        ventanaPrincipal.mostrarVentana();
    }
}
