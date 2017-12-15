/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da;

/**
 *
 * @author Ricardo Rodriguez
 * @param <T>
 */
public class NodoData<T> {
    
    private NodoData anterior;
    private NodoData siguiente;
    private T nombre;
    private T tiempo;
    private T hora;

    public NodoData(T nombre, T tiempo, T hora) {
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.hora = hora;
        
        this.anterior = null;
        this.siguiente = null;
        
    }


    public NodoData getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoData anterior) {
        this.anterior = anterior;
    }

    public NodoData getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoData siguiente) {
        this.siguiente = siguiente;
    }

    public T getNombre() {
        return nombre;
    }

    public void setNombre(T nombre) {
        this.nombre = nombre;
    }

    public T getTiempo() {
        return tiempo;
    }

    public void setTiempo(T tiempo) {
        this.tiempo = tiempo;
    }

    public T getHora() {
        return hora;
    }

    public void setHora(T hora) {
        this.hora = hora;
    }
    
    
    
    
    
}
