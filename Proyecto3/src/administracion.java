
import java.util.LinkedList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class administracion {
    
    private LinkedList<PrimerAjuste> contenido;

    public administracion() {
        contenido = new LinkedList<PrimerAjuste>();
    }
    
    public void addContenido(PrimerAjuste valores){
        contenido.add(valores);
    }  
    
}
