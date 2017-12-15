/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da;

/**
 *
 * @author Ricardo Rodriguez
 */
public class ListaData<T extends Comparable<T>> {
    
    private NodoData<T> cabeza;
    private NodoData<T> ultimo;
    private int size;

    public ListaData() {
        
        this.cabeza = null;
        this.ultimo = null;
        this.size = 0;
        
    }

    public NodoData<T> getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoData<T> cabeza) {
        this.cabeza = cabeza;
    }

    public NodoData<T> getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoData<T> ultimo) {
        this.ultimo = ultimo;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
      public boolean add(NodoData nuevo) {
        
        if (null == cabeza) {
            cabeza = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;
        }
        ++size;
        return true;
    }
    
      /**
     * <h1>toString</h1>
     * <p>
     * Metodo que muestra la lista de datos.</p>
     *
     * @return String: Lista de datos
     */
    @Override
    public String toString(){
        
        NodoData aux = cabeza; //Inicializa el nodo auxiliar con el valor de la cabeza
        String resultado = "";
     
        for(int i = 0; i < size; i++){
            
            resultado +=" -- [" + aux.getNombre()+ "] [" + aux.getTiempo()+ "s] [" + aux.getHora()+ "] \n\n"; //Toma el dato del auxiliar y lo agrega al string
            
            if(aux.getSiguiente()== null){
                
                break;
                
            }else{
                
                aux = aux.getSiguiente(); //le da un nuevo valor al auxiliar, el valor dado es del nodo que sigue, osea se corre un campo
                
            }

            
        }
        
        return resultado;
    }
      
}
