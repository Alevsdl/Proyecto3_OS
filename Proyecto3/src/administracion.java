
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

    public void addContenido(PrimerAjuste elemento) {
        // recorrer toda la lista buscando el primer lugar donde cabe el proceso
        boolean asignado = false;
        for (PrimerAjuste aux : contenido) {
            if (aux.getLongitud() >= elemento.getLongitud()) {
                // quiere decir que cabe, verificar que no es un proceso
                if (aux.getTipo() == 'h') {
                    aux.setTipo(elemento.getTipo());
                    aux.setLongitud(elemento.getLongitud());
                    asignado = true;
                    break;
                }

            }
        }

        if (asignado) {
            ajustarLista();
        } else {
            System.out.println("No hay espacio disponible");
        }

    }

    public void ajustarLista() {
        int inicio = 0;
        for (PrimerAjuste e : contenido) {
            if (inicio == 0) {
                e.setEmpieza(inicio);
                inicio = inicio + e.getLongitud();
            } else {
                e.setEmpieza(inicio);
                inicio = inicio + e.getLongitud();

            }

        }
    }

    public void addContenidoInicial(PrimerAjuste elemento) {
        contenido.addLast(elemento);
    }

    public void mostrar() {
        if (contenido.isEmpty()) {
            System.out.println("La lista esta vacia");
        }
        for (int i = 0; i < contenido.size(); i++) {
            System.out.println("Tipo " + ":" + contenido.get(i).getTipo());
            System.out.println("Empieza en: " + ":" + contenido.get(i).getEmpieza());
            System.out.println("Con longitud" + ":" + contenido.get(i).getLongitud());
        }
    }

    public Integer buscar(PrimerAjuste espacio) {
        int indice;
        PrimerAjuste aux;
        for (int i = 0; i < contenido.size(); i++) {
            aux = contenido.get(i);
            if (aux == espacio) {
                return i;
            }
        }
        return null;
    }

    // regresa el indice donde inicia el nuevo espacio de memeoria 
    public Integer buscarindice() {
        int indice;
//        boolean aux=true;
//        if(contenido.isEmpty()){
//            System.out.println("La lista esta vacia");
//        }else{
//            for (int i = 0; i<contenido.size(); i++) {
//               if(contenido.get(i).getLongitud()<=numero && true)
//               {
//                   indice=i;
//                   return contenido.get(i).getEmpieza();
//               }
//            }
//        }
//        return null;
        if (contenido.isEmpty()) {
            return 0;
        } else {
            indice = contenido.getLast().getEmpieza() + contenido.getLast().getLongitud();
            return indice;
        }
    }

}
