package Interfaz;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class VentanaPrincipal extends JFrame implements ActionListener{

    private Container contenedor;
    private JPanel panelCategoria;
    private JPanel panelLaminas;
    private JButton botonCabezaYCuello;
    private JButton botonDorsoYMedulaEspinal;
    private JButton botonTorax;
    private JButton botonAbdomen;
    private JButton botonPelvisYPerine;
    private JButton botonMiembroSuperior;
    private JButton botonMiembroInferior;
    
    
    public void mostrarVentana(){
        this.setTitle(".: Anatomia :.");
        //setIconImage (new ImageIcon(getClass().getResource("/Imagenes/robotIcon.png")).getImage());
        this.setSize(1200,700); 
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); 
        
        contenedor = this.getContentPane();
        contenedor.setLayout(new FlowLayout());
        
        seleccionCategoria();
        seleccionLamina();
       /*
        crearMenu();
        espacioArbol();
        espacioMapa();
        espacioDatos();*/
        
        this.setVisible(true);
    }
    
    private void seleccionCategoria(){
        panelCategoria = new JPanel(new GridLayout(7,0));
        panelCategoria.setBorder(BorderFactory.createTitledBorder("Categoria")); 
        Dimension dimension = new Dimension();
        dimension.setSize(480, 480);
        panelCategoria.setPreferredSize(dimension);
        botonesCategorias();
        contenedor.add(panelCategoria);     
    }
    
    private void seleccionLamina(){
        panelLaminas = new JPanel(new BorderLayout());
        panelLaminas.setBorder(BorderFactory.createTitledBorder("Laminas")); 
        Dimension dimension = new Dimension();
        dimension.setSize(480, 480);
        panelLaminas.setPreferredSize(dimension);
        contenedor.add(panelLaminas);
    }
    
    private void botonesCategorias(){
        botonCabezaYCuello = new JButton("Cabeza y Cuello");
        //ImageIcon iconoSiguiente = new ImageIcon(getClass().getResource("/Imagenes/siguiente.png"));
        //botonCabezaYCuello.setIcon(iconoSiguiente);
        botonCabezaYCuello.addActionListener(this);
        botonCabezaYCuello.setBorder(null);
        botonCabezaYCuello.setBackground(null);
        botonCabezaYCuello.setEnabled(true);
        
        botonDorsoYMedulaEspinal = new JButton("Dorso y Medula Espinal");
        //ImageIcon iconoSiguiente = new ImageIcon(getClass().getResource("/Imagenes/siguiente.png"));
        //botonDorsoYMedulaEspinal.setIcon(iconoSiguiente);
        botonDorsoYMedulaEspinal.addActionListener(this);
        botonDorsoYMedulaEspinal.setBorder(null);
        botonDorsoYMedulaEspinal.setBackground(null);
        botonDorsoYMedulaEspinal.setEnabled(true);
        
        botonTorax = new JButton("Torax");
        //ImageIcon iconoSiguiente = new ImageIcon(getClass().getResource("/Imagenes/siguiente.png"));
        //botonTorax.setIcon(iconoSiguiente);
        botonTorax.addActionListener(this);
        botonTorax.setBorder(null);
        botonTorax.setBackground(null);
        botonTorax.setEnabled(true);
        
        botonAbdomen = new JButton("Abdomen");
        //ImageIcon iconoSiguiente = new ImageIcon(getClass().getResource("/Imagenes/siguiente.png"));
        //botonAbdomen.setIcon(iconoSiguiente);
        botonAbdomen.addActionListener(this);
        botonAbdomen.setBorder(null);
        botonAbdomen.setBackground(null);
        botonAbdomen.setEnabled(true);
        
        botonPelvisYPerine = new JButton("Pelvis y Perine");
        //ImageIcon iconoSiguiente = new ImageIcon(getClass().getResource("/Imagenes/siguiente.png"));
        //botonPelvisYPerine.setIcon(iconoSiguiente);
        botonPelvisYPerine.addActionListener(this);
        botonPelvisYPerine.setBorder(null);
        botonPelvisYPerine.setBackground(null);
        botonPelvisYPerine.setEnabled(true);
        
        botonMiembroSuperior = new JButton("Miembro Superior");
        //ImageIcon iconoSiguiente = new ImageIcon(getClass().getResource("/Imagenes/siguiente.png"));
        //botonMiembroSuperior.setIcon(iconoSiguiente);
        botonMiembroSuperior.addActionListener(this);
        botonMiembroSuperior.setBorder(null);
        botonMiembroSuperior.setBackground(null);
        botonMiembroSuperior.setEnabled(true);
        
        botonMiembroInferior = new JButton("Miembro Inferior");
        //ImageIcon iconoSiguiente = new ImageIcon(getClass().getResource("/Imagenes/siguiente.png"));
        //botonMiembroInferior.setIcon(iconoSiguiente);
        botonMiembroInferior.addActionListener(this);
        botonMiembroInferior.setBorder(null);
        botonMiembroInferior.setBackground(null);
        botonMiembroInferior.setEnabled(true);
        
        panelCategoria.add(botonCabezaYCuello);
        panelCategoria.add(botonDorsoYMedulaEspinal);
        panelCategoria.add(botonTorax);
        panelCategoria.add(botonAbdomen);
        panelCategoria.add(botonPelvisYPerine);
        panelCategoria.add(botonMiembroSuperior);
        panelCategoria.add(botonMiembroInferior);
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
