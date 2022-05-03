
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
        
        administracion admin=new administracion();
         Scanner r= new Scanner(System.in);
        // iniciacion de la memeria
        /*
        10 huecos (H)de memeria con espacios aleateris
        */
        int espacio; 
        //numero aleatorios entre 10 y 3
   
        for (int i = 0; i < 10; i++) {
            espacio = (int) (Math.random() * (10 - 3 + 1) + 3);
            PrimerAjuste nuevo=new PrimerAjuste("h",admin.buscarindice(),espacio);
             admin.addContenidoInicial(nuevo);
        }
 
        admin.mostrar();
        
        boolean salir = true;
        while(salir){
            System.out.println(" 1. Insertar"+"\n 2. Mostrar"+"\n 3. Salir");
            int op = r.nextInt();
            switch(op){
                case 1:
                {
                    System.out.println("Escriba la longitud");
                    int numero= r.nextInt();
                    // crear el nuevo espacio de memoria
                    // tipo - inicio - longitud 
                    PrimerAjuste nuevo=new PrimerAjuste("p",admin.buscarindice(),numero);
                    // agrar el espacio de memerio 
                    admin.addContenido(nuevo);
                    break;
                }
                case 2:
                {
                    admin.mostrar();
                    break;
                }
                case 3:
                {
                    salir = false;
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
