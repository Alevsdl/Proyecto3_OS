
import java.util.Iterator;
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
    private int contador = 0;
    public administracion() {
        contenido = new LinkedList<PrimerAjuste>();
    }
    
    public void addContenido(PrimerAjuste valores){
        contenido.add(valores);
    }  
    
    public void mostrar(){
        if(contenido.isEmpty()){
            System.out.println("La lista esta vacia");
        }
        for (int i = 0; i<contenido.size(); i++) {
            System.out.println("Tipo " + ":" + contenido.get(i).getTipo());
            System.out.println("Empieza en: "  + ":" + contenido.get(i).getEmpieza());
            System.out.println("Con longitud"  + ":" + contenido.get(i).getLongitud());
        }
    }
    
}
