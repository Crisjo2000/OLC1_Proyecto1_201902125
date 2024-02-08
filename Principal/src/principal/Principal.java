package principal;
/**
 *
 * @author Christian
 */
import javax.swing.*;      
        
public class Principal extends JFrame {
    public Principal(){
        setTitle("DataForge");
        setSize(1200, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    
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
        
        
        
    }
    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.setVisible(true);
    }
    
}
