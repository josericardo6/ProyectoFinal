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
public class ListaInsertion <T extends Comparable<T>>  {
    
    private Nodo<T> cabeza;
    private Nodo<T> ultimo;
    private int size;
    
    public ListaInsertion() {
        this.cabeza = null;
        this.ultimo = null;
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public Nodo<T> getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo<T> cabeza) {
        this.cabeza = cabeza;
    }

    public Nodo<T> getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo<T> ultimo) {
        this.ultimo = ultimo;
    }

    public boolean isEmpty() {
        return cabeza == null;
    }
    
    /**
     * <h1>ToString</h1>
     * <p>
     * Imprime las personas de la lista.</p>
     *
     * @return String: Lista.
     */
    @Override
    public String toString() {
        if (!isEmpty()) {
            StringBuilder builder = new StringBuilder();
            Nodo aux = cabeza;
            int cont = 0;
            while (cont < size) {
                builder.append(" - ").append(aux.getPersona());
                builder.append("\n");
                aux = aux.getSiguiente();
                cont++;
            }
            return builder.toString();
        }
        return "";
    }
    
    /**
     * <h1>Add</h1>
     * <p>
     * Agrega personas a la lista simple.</p>
     *
     * @param nombre Nombre de la Persona
     * @param apellido Primer Apellido de la Persona
     * @param apellido2 Segundo Apellido de la Persona
     * @param documento Documento de la Persona
     * @param edad Edad de la Persona
     * @return boolean: Con el resultado de la operacion.
     */
    public boolean add(String nombre, String apellido, String apellido2, String documento, double edad) {
        if (!validarCedulaPasaporte(documento)) {
            if (pasaporteCedula(documento)) {
                documento = documento.toUpperCase();
            }
            Persona miPersona = new Persona(nombre, apellido, apellido2, documento, edad);
            Nodo nuevo = new Nodo(miPersona);
            if (isEmpty()) {
                cabeza = nuevo;
                ultimo = nuevo;
            } else {
                ultimo.setSiguiente(nuevo);
                ultimo = nuevo;
            }
            nuevo.setPersona(miPersona);
            size++;
            return true;
        } else {
            return false;
        }
    }
    
     /**
     * <h1>Insertion Sort</h1>
     * <p>
     * Metodo de ordenamiento por insercion inserta la cedula de menor a mayor.
     * Basandose en la provincia, folio, asiento. Y en caso de que el documento
     * sea un pasaporte lo insertaria primero.</p>
     */
    public void insertionSort() {
        Nodo aux = cabeza;
        if (aux == null || aux.getSiguiente() == null) { //Equivalente a size = 0 o 1. De ser asi la Lista esta vacia o ordenada respectivamente.
            return;
        }

        Nodo listaOrdenada = null;
        while (aux != null) { //Recorre hasta el Final de la lista Simple.
            Nodo sig = aux.getSiguiente();
            aux.setSiguiente(null);
            listaOrdenada = sortedInsert(listaOrdenada, aux);
            aux = sig;
        }

        cabeza = listaOrdenada;
        ultimoNodoLista();
        pasaportePrimero();     //Coloca los pasaportes primero despues de ordenar.
    }
    
    /**
     * <h1>Sorted Insert</h1>
     * <p>
     * Ordena la Lista.</p>
     *
     * @param listaOrdenada Nodos ordenados
     * @param añadido Nodo que se desea ordenar
     * @return Cola ordenada.
     */
    public Nodo sortedInsert(Nodo listaOrdenada, Nodo añadido) {
        
        
        if (listaOrdenada == null) { //CASO 1: Si la Lista Ordenada se encuentra vacia.
            return añadido; //Añade el primer elemento a la Lista ordenada.
        }

        Nodo ant = null;
        Nodo aux = listaOrdenada;               //CASO 2:
        while (aux != null && aux.getPersona().getCedula().compareTo(añadido.getPersona().getCedula()) < 0) {   //Mientras el Aux de la ordenada sea menor al Nodo de la Lista Original.
            ant = aux;
            aux = aux.getSiguiente();
        }

        if (ant == null) {                      //Si esta condicion se cumple significa que el nodo añadido es menor que el primero de la Lista.
            añadido.setSiguiente(listaOrdenada); //Por lo tanto lo añade de primero en la Lista
            return añadido;
        }

        Nodo antSig = ant.getSiguiente();  //CASO 3: Sino el Nodo mayor se añade despues del menor.
        ant.setSiguiente(añadido);              
        añadido.setAnterior(ant);
        añadido.setSiguiente(antSig);           //Conecta el Nodo mayor con el que estaba conectado antes el menor.
        return listaOrdenada;
    }
    
     /**
     * <h1>Pasaporte Primero</h1>
     * <p>
     * Busca si hay pasaportes en la lista de ser asi los agrega de primero.</p>
     */
    public void pasaportePrimero() {
        Nodo aux = cabeza;
        int cont = 0;

        while (aux != null) {
            if (pasaporteCedula(aux.getPersona().getCedula())) { //Cuenta cuantos pasaportes hay en la Lista.
                cont++;
            }
            aux = aux.getSiguiente();
        }

        int cont2 = 0;
        while (cont > 0) {
            aux = cabeza;
            Nodo aux2 = aux;
            while (aux != null) {
                if (pasaporteCedula(aux.getPersona().getCedula())) {
                    break;
                }
                cont2++;                     //Cuenta cuantos nodos tiene delante de este.
                aux = aux.getSiguiente();
            }
            removeMultiple(cont2);          //Elimina todos los nodos al frente del pasaporte.
            while (cont2 > 0) {             //Añade todos los nodos que fueron removidos al poner el pasaporte de primero.
                add(aux2.getPersona().getNombre(), aux2.getPersona().getApellido(),
                        aux2.getPersona().getApellido2(), aux2.getPersona().getCedula(), aux2.getPersona().getEdad());
                aux2 = aux2.getSiguiente();
                cont2--;
            }
            cont--;
        }
    }
    
    /**
     * <h1>Ultimo Nodo Lista</h1>
     * <p>
     * Declara el ultimo nodo de la lista en caso de que haya cambiado al
     * ordenar la estructura.</p>
     */
    public void ultimoNodoLista() {
        Nodo aux = cabeza;
        while (aux != null) { //Declara cual va a ser el Ultimo nodo de la lista.
            ultimo = aux;
            aux = aux.getSiguiente();
        }
    }
    
    /**
     * <h1>Pasaporte Cedula</h1>
     * <p>
     * Comprueba si el documento introducido es un pasaporte o una cedula.</p>
     *
     * @param Documento String que se desea comprobar
     * @return boolean: con el resultado.
     */
    public boolean pasaporteCedula(String Documento) {
        boolean bandera = false;
        if (abcMayus(Documento.charAt(0)) || abcMinus(Documento.charAt(0))) {
            bandera = true;
        }
        return bandera;
    }
    
    /**
     * <h1>Validar Cedula Pasaporte</h1>
     * <p>
     * Comprueba si la Cedula o el Pasaporte introducido cumple con los
     * requerimientos necesarios.</p>
     *
     * @param documento String que se desea validar.
     * @return boolean: Con el resultado de la operacion.
     */
    public boolean validarCedulaPasaporte(String documento) {
        boolean bandera = false;
        Nodo aux = cabeza;
        int cont = 0;
        if ((documento.length() != 11 && documento.length() != 6) || (documento.length() == 6 && pasaporteFormato(documento)) || (documento.length() == 11 && cedulaFormato(documento))) {
            bandera = true;
            System.err.println("La Cedula debe incluir 11 digitos incluyendo los guiones,"
                    + " ademas de que no puede iniciar con 0 y el Pasaporte debe incluir una Letra y cinco digitos.");
        }
        while (cont < size) {
            if (aux.getPersona().getCedula().equals(documento)) {
                bandera = true;
                System.err.println("El pasaporte o Cedula introducido ya existe.");
                break;
            }
            cont++;
            aux = aux.getSiguiente();
        }
        return bandera;
    }
    
    /**
     * <h1>Remove Multiple</h1>
     * <p>
     * Remueve de la Lista a todas las personas hasta llegar al index deseado.
     * </p>
     *
     * @param index cantidad de dequeues que se desean realizar.
     * @return boolean: Con el resultado de la operacion.
     */
    public boolean removeMultiple(int index) {
        if (isEmpty()) {
            return false;
        } else {
            while (index > 0) {
                remove(0);
                index--;
            }
            return true;
        }
    }
    
    /**
     * <h1>Cedula Formato</h1>
     * <p>
     * Verifica que la cedula cumpla con los requerimientos. Iniciar con un
     * numero que no puede ser 0. Seguido debe llevar un guion. Despues cuatro
     * numeros otro guion y otros cuatro numeros.</p>
     *
     * @param Cedula String que se desea validar
     * @return boolean: con el resultado de la operacion.
     */
    public boolean cedulaFormato(String Cedula) {
        boolean bandera = false;
        for (int i = 2; i < 5; i++) {
            if (!Character.isDigit(Cedula.charAt(i))) {
                bandera = true;
            }
        }
        for (int i = 7; i < 11; i++) {
            if (!Character.isDigit(Cedula.charAt(i))) {
                bandera = true;
            }
        }
        if (!Character.isDigit(Cedula.charAt(0)) || Cedula.charAt(1) != '-' || Cedula.charAt(6) != '-' || Cedula.charAt(0) == '0') {
            bandera = true;
        }
        return bandera;
    }
    
    
     /**
     * <h1>AbcMayus</h1>
     * <p>
     * Verifica si el caracter introducido es una letra del abecedario en
     * Mayuscula. De ser asi significa que el numero entrante es un
     * Pasaporte.</p>
     *
     * @param letra caracter que se desea validar
     * @return boolean: el resultado de la operacion.
     */
    public boolean abcMayus(char letra) {
        char a = (char) 65;
        boolean bandera = false;
        for (int i = 0; i < 26; i++) {
            if (a == letra) {
                bandera = true;
                break;
            } else {
                a = (char) (a + 1);
            }
        }
        return bandera;
    }

    /**
     * <h1>AbcMinus</h1>
     * <p>
     * Verifica si el caracter introducido es una letra del abecedario en
     * Minuscula. De ser asi significa que el numero entrante es un
     * Pasaporte.</p>
     *
     * @param letra caracter que se desea validar
     * @return boolean: el resultado de la operacion.
     */
    public boolean abcMinus(char letra) {
        char a = (char) 97;
        boolean bandera = false;
        for (int i = 0; i < 26; i++) {
            if (a == letra) {
                bandera = true;
                break;
            } else {
                a = (char) (a + 1);
            }
        }
        return bandera;
    }
    
    /**
     * <h1>Pasaporte Formato</h1>
     * <p>
     * Verifica que el pasaporte cumpla con los requerimientos. Iniciar con una
     * letra y tener 6 numeros.</p>
     *
     * @param Pasaporte String que se desea validar
     * @return boolean: con el resultado de la operacion.
     */
    public boolean pasaporteFormato(String Pasaporte) {
        boolean bandera = false;
        for (int i = 1; i < 6; i++) {
            if (Character.isLetter(Pasaporte.charAt(i))) {
                bandera = true;
            }
        }
        if (!Character.isLetter(Pasaporte.charAt(0))) {
            bandera = true;
        }
        return bandera;
    }
    
    /**
     * <h1>Remove</h1>
     * <p>
     * Comprueba si el index introducido es valido. De ser asi elimina a la
     * persona de la lista.</p>
     *
     * @param index posicion del nodo a eliminar.
     * @return
     */
    public boolean remove(int index) {
        if (0 == size) {
            return false;
        } else if (0 > index || index > size - 1) {
            throw new ArrayIndexOutOfBoundsException("Indice invalido");
        } else {
            if (0 == index) {
                cabeza = cabeza.getSiguiente();
            } else if (index == size - 1) {
                Nodo aux = cabeza;
                while (aux.getSiguiente() != null) {
                    aux = aux.getSiguiente();
                }
                aux.setSiguiente(null);
                ultimo = aux;
            } else {
                Nodo aux = cabeza;
                for (int i = 0; i < index - 1; i++) {
                    aux = aux.getSiguiente();
                }
                aux.setSiguiente(aux.getSiguiente().getSiguiente());
            }
            --size;
            return true;
        }
    }
    
    /**
     * <h1>AddCircular</h1>
     * <p>
     * Agrega personas a la lista Circular.</p>
     *
     * @param nombre Nombre de la Persona
     * @param apellido Primer Apellido de la Persona
     * @param apellido2 Segundo Apellido de la Persona
     * @param documento Documento de la Persona
     * @param edad Edad de la Persona
     * @return boolean: con el resultado de la operacion.
     */
    public boolean addCircular(String nombre, String apellido, String apellido2, String documento, double edad) {
        if (!validarCedulaPasaporte(documento)) {
            if (pasaporteCedula(documento)) {
                documento = documento.toUpperCase();
            }
            Persona persona = new Persona(nombre, apellido, apellido2, documento, edad);
            Nodo nuevo = new Nodo(persona);
            if (isEmpty()) {
                cabeza = nuevo;
                ultimo = nuevo;
                ultimo.setSiguiente(cabeza);
                cabeza.setAnterior(ultimo);
            } else {
                ultimo.setSiguiente(nuevo);
                nuevo.setAnterior(ultimo);
                nuevo.setSiguiente(cabeza);
                cabeza.setAnterior(nuevo);
                ultimo = nuevo;
            }
            nuevo.setPersona(persona);
            size++;
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * <h1>Insertion SortCircular</h1>
     * <p>
     * Metodo de ordenamiento por insercion inserta la cedula de menor a mayor.
     * Basandose en la provincia, folio, asiento. Y en caso de que el documento
     * sea un pasaporte lo insertaria primero.</p>
     */
    public void insertionSortCircular() {
        
        Nodo aux = cabeza;
        if (aux == null || aux.getSiguiente() == null) { //Equivalente a size = 0 o 1. De ser asi la Lista esta vacia o ordenada respectivamente.
            return;
        }

        Nodo listaOrdenada = null;
        
        int cont = 0;
        
        while (cont < size) { //Recorre hasta el Final de la Lista.
            Nodo sig = aux.getSiguiente();
            aux.setSiguiente(null);
            listaOrdenada = sortedInsert(listaOrdenada, aux);
            aux = sig;
            cont++;
        }

        cabeza = listaOrdenada;
        ultimoNodoLista();
        pasaportePrimero();     //Coloca los pasaportes primero despues de ordenar.
    }
    
     /**
     * <h1>printDocs</h1>
     * <p>
     * Regresa una lista de solo documentos ordenada 
     * </p>
     *
     * @return String: resultado de la operacion(Lista).
     */
    public String printDocs(){
        
        if (!isEmpty()) {
            StringBuilder builder = new StringBuilder();
            Nodo aux = cabeza;
            int cont = 0;
            while (cont < size) {
                builder.append(aux.getPersona().getCedula()).append("  ->  ");
                aux = aux.getSiguiente();
                cont++;
            }
            
            String res = builder.toString().substring(0, builder.toString().length() - 5);
            res+= "\n";
            
            return res;
        }
        return "";
    }
    
}
