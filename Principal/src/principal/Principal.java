package principal;
/**
 *
 * @author Christian
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.*;      
import javax.swing.filechooser.FileNameExtensionFilter;
        
public class Principal extends JFrame {
    public Principal(){
        setTitle("DataForge");
        setSize(1200, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);
    
    //**********************BARRA DE MENÚ*************************
    
        JMenuBar  mb = new JMenuBar();
        
    //**********************OPCIONES DE MENÚ*************************
        JMenu ArchivoMenu = new JMenu("Archivo");
        JMenu PestaniaMenu = new JMenu("Pestañas");
        JMenu ReportesMenu = new JMenu("Reportes");
    //**********************Elementos de cada opción*************************
        JMenuItem AbrirItem = new JMenuItem("Abrir");
        JMenuItem GuardarItem = new JMenuItem("Guardar");
        
        JMenuItem NuevoItem = new JMenuItem("Nueva Pestaña");
        JMenuItem EliminarItem = new JMenuItem("Eliminar Pestaña");
        
        JMenuItem TokensItem = new JMenuItem("Reporte de Tokens");
        JMenuItem ErroresItem = new JMenuItem("Reporte de Errores");
        JMenuItem TablaItem = new JMenuItem("Tabla de Simbolos");
        
        ArchivoMenu.add(AbrirItem);
        ArchivoMenu.add(GuardarItem);
        
        PestaniaMenu.add(NuevoItem);
        PestaniaMenu.add(EliminarItem);
        
        ReportesMenu.add(TokensItem);
        ReportesMenu.add(ErroresItem);
        ReportesMenu.add(TablaItem);
        
        mb.add(ArchivoMenu);
        mb.add(PestaniaMenu);
        mb.add(ReportesMenu);
            
        setJMenuBar(mb);
        
        AbrirItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de texto (*.df)", "df");
                fileChooser.setFileFilter(filter);
                int resultado = fileChooser.showOpenDialog(Principal.this);
                if (resultado == JFileChooser.APPROVE_OPTION) {
                    File archivoSeleccionado = fileChooser.getSelectedFile(); 
                    JOptionPane.showMessageDialog(Principal.this, "Archivo seleccionado correctamente" );
                }
            }
        });
        
    //**********************LABELS***************************
    
    JLabel LEntrada = new JLabel("Entrada");
    LEntrada.setFont(new Font("Arial", Font.BOLD, 18));
    LEntrada.setBounds(15, 10, 100, 15);
    this.add(LEntrada);
    
    JLabel LConsola = new JLabel("Consola");
    LConsola.setFont(new Font("Arial", Font.BOLD, 18));
    LConsola.setBounds(15, 445, 100, 15);
    this.add(LConsola);
    
    JLabel LGraficas = new JLabel("Ver Gráficas");
    LGraficas.setFont(new Font("Arial", Font.BOLD, 18));
    LGraficas.setBounds(530, 10, 120, 15);
    this.add(LGraficas);
        
    //*******************PESTAÑAS********************************
    JPanel Panel = new JPanel(new BorderLayout());
    Panel.setBounds(15, 30, 500, 400);
    
    JTabbedPane TabbedPane = new JTabbedPane();
    
    JPanel Panel1 = new JPanel(new BorderLayout());
    TextArea TA1 = new TextArea();
    JScrollPane SP1 = new JScrollPane(TA1);
    Panel1.add(SP1);
    
    JPanel Panel2 = new JPanel(new BorderLayout());
    TextArea TA2 = new TextArea();
    JScrollPane SP2 = new JScrollPane(TA2);
    Panel2.add(SP2);
    
    JPanel Panel3 = new JPanel(new BorderLayout());
    TextArea TA3 = new TextArea();
    JScrollPane SP3 = new JScrollPane(TA3);
    Panel3.add(SP3);
    
    TabbedPane.addTab("Pestaña 1", Panel1);
    TabbedPane.addTab("Pestaña 2", Panel2);
    TabbedPane.addTab("Pestaña 3", Panel3);
    Panel.add(TabbedPane, BorderLayout.CENTER);
    
    getContentPane().add(Panel);
    
    JPanel PanelText = new JPanel(new BorderLayout());
    PanelText.setBounds(15, 475, 1150, 245);
    
    JTextArea TextArea = new JTextArea();
    TextArea.setEditable(false);
    
    JScrollPane scrollPane = new JScrollPane(TextArea);
    
    PanelText.add(scrollPane);
    
    
    getContentPane().add(PanelText);
    
    }
    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.setVisible(true);
    }
    
}