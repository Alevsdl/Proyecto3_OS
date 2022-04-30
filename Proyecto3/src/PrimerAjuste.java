/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class PrimerAjuste {
    
    private char tipo;
    private int empieza;
    private int longitud;

    public PrimerAjuste(char tipo, int empieza, int longitud) {
        this.tipo = tipo;
        this.empieza = empieza;
        this.longitud = longitud;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public int getEmpieza() {
        return empieza;
    }

    public void setEmpieza(int empieza) {
        this.empieza = empieza;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    } 
}
