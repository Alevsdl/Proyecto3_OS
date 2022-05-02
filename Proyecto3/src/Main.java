
import java.util.Scanner;

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
        administracion admin=new administracion();
        PrimerAjuste c1 = new PrimerAjuste('h',0,5);
        PrimerAjuste c2 = new PrimerAjuste('p',5,3);
        PrimerAjuste c3 = new PrimerAjuste('h',8,6);
        Scanner r= new Scanner(System.in);
        admin.addContenido(c1);
        admin.addContenido(c2);
        admin.addContenido(c3);
        admin.mostrar();
        
        while(true){
            System.out.println(" 1. Insertar"+"\n 2. Mostrar"+"\n 3. Salir");
            int op = r.nextInt();
            switch(op){
                case 1:
                {
                    System.out.println("Escriba la longitud");
                    int numero= r.nextInt();
                    
                    PrimerAjuste nuevo=new PrimerAjuste('p',admin.buscarindice(numero),numero);
                    admin.addContenidoBuscado(admin.buscar(numero),nuevo);
                    break;
                }
                case 2:
                {
                    admin.mostrar();
                    break;
                }
                case 3:
                {
                    break;
                }
                default:
                {
                    System.out.println("Error comando desconocido");
                }
            }
                    
        }
        
        
    }
    
}
