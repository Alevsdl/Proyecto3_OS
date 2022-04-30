/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PrimerAjuste c1 = new PrimerAjuste('h',180,190);
        PrimerAjuste c2 = new PrimerAjuste('p',140,150);
        PrimerAjuste c3 = new PrimerAjuste('h',120,130);
        
        administracion admin=new administracion();
        
        admin.addContenido(c1);
        admin.addContenido(c2);
        admin.addContenido(c3);
        
        admin.mostrar();
        
        
        
    }
    
}
