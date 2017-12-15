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
public class ListaMerge<T extends Comparable<T>> {
    
    private Nodo<T> cabeza;
    private Nodo<T> ultimo;
    private int size;

    public ListaMerge() {
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
            
            Persona nuevaPersona = new Persona(nombre, apellido, apellido2, documento, edad);
            Nodo nuevo = new Nodo(nuevaPersona);
            if (isEmpty()) {
                cabeza = nuevo;
                ultimo = nuevo;
            } else {
                ultimo.setSiguiente(nuevo);
                ultimo = nuevo;
            }
            nuevo.setPersona(nuevaPersona);
            size++;
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * <h1>MergeSort</h1>
     * <p>
     * Ordena la lista utilizando el metodo de ordenamiento por mezcla</p>
     *
     * @param inicial Nodo donde empieza la lista.
     * @return Nodo: Cabeza.
     */
    public Nodo mergeSort(Nodo inicial) {
        //Divide la lista esta que sea nula o solo tenga 1 elemento en la lista.
        
        if (inicial == null || inicial.getSiguiente() == null) {
            return inicial;
        }
        
        //Divide la lista en 2 listas.
        //Encuentra el nodo de la mitad de la lista y divide la lista en 2.
        Nodo mitad = dividirLista(inicial);
        Nodo sigMitad = mitad.getSiguiente();
        mitad.setSiguiente(null);

        //Divide la lista hasta que tenga solo un elemento cada uno.
        Nodo listaUno = mergeSort(inicial);
        Nodo listaDos = mergeSort(sigMitad);

        //Comienza a mezclar la mitad listaUno y la mitad listaDos.
        mergeS(listaUno, listaDos);
        return cabeza;
    }
    
     /**
     * <h1>MergeS</h1>
     * <p>
     * Mezcla las sublistas creadas por el MergeSort</p>
     *
     * @param listaUnoIni Inicio de la Lista Izquierda
     * @param listaDosIni Inicio de la Lista Derecha
     */
    public void mergeS(Nodo listaUnoIni, Nodo listaDosIni) {
        Nodo aux;
        Nodo mezclar = null;
        Nodo añadido = new Nodo(null);

        while (listaUnoIni != null && listaDosIni != null) {
            if (listaUnoIni.getPersona().getCedula().compareTo(listaDosIni.getPersona().getCedula()) < 0) {
                aux = listaUnoIni;
                listaUnoIni = listaUnoIni.getSiguiente();
            } else {
                aux = listaDosIni;
                listaDosIni = listaDosIni.getSiguiente();
            }

            if (mezclar != null) {
                añadido.setSiguiente(aux);
            } else {
                mezclar = aux;
            }
            añadido = aux;   
        }//fin While

        if (listaUnoIni == null) {
            añadido.setSiguiente(listaDosIni);
        } else {
            añadido.setSiguiente(listaUnoIni);
        }
        cabeza = mezclar;
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
     * <h1>Pasaporte Cedula</h1>
     * <p>
     * Comprueba si el documento introducido es un pasaporte o una cedula.</p>
     *
     * @param Documento String que se desea comprobar.
     * @return boolean con el resultado de la operacion.
     */
    public boolean pasaporteCedula(String Documento) {
        boolean bandera = false;
        if (abcMayus(Documento.charAt(0)) || abcMinus(Documento.charAt(0))) {
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
     * <h1>Dividir Lista</h1>
     * <p>
     * Busca la mitad de la lista.</p>
     *
     * @param inicial Nodo donde inicia la lista.
     * @return Nodo: Puntero.
     */
    public Nodo dividirLista(Nodo inicial) {
        if (inicial == null) {
            return inicial;
        }
        Nodo aux1 = inicial;
        Nodo aux2 = inicial;
        
        while (aux2 != null && aux2.getSiguiente() != null && aux2.getSiguiente().getSiguiente() != null) {
            aux1 = aux1.getSiguiente();
            aux2 = aux2.getSiguiente().getSiguiente();
        }
        return aux1;
    }
    
    /**
     * <h1>Pasaporte Primero</h1>
     * <p>
     * Busca si hay pasaportes en la lista de ser asi los agrega de primero.</p>
     */
    public void pasaportePrimero() {
        Nodo aux = cabeza;
        ListaMerge cedulaAux = new ListaMerge();
        ListaMerge pasaporteAux = new ListaMerge();

        while (aux != null) {
            if (pasaporteCedula(aux.getPersona().getCedula())) { //Si es un pasaporte lo agrega a la lista auxiliar de pasaportes.
                pasaporteAux.add(aux.getPersona().getNombre(), aux.getPersona().getApellido(),
                        aux.getPersona().getApellido2(), aux.getPersona().getCedula(), aux.getPersona().getEdad());
            } else {
                cedulaAux.add(aux.getPersona().getNombre(), aux.getPersona().getApellido(), //Sino lo agrega a la lista auxiliar de cedulas.
                        aux.getPersona().getApellido2(), aux.getPersona().getCedula(), aux.getPersona().getEdad());
            }
            aux = aux.getSiguiente();
        }
        int cont = size;
        while (cont > 0) {
            remove(0);
            cont--;
        }
        agregarDesdeListaAux(pasaporteAux);
        agregarDesdeListaAux(cedulaAux);
    }
    
    /**
     * <h1>Agregar Desde ListaAux</h1>
     * <p>
     * Agrega a las persona desde otras listas. Y vacia la lista auxiliar.</p>
     *
     * @param listaAux
     */
    public void agregarDesdeListaAux(ListaMerge listaAux) {
        if (!listaAux.isEmpty()) {
            Nodo aux = listaAux.cabeza;
            while (aux != null) {
                add(aux.getPersona().getNombre(), aux.getPersona().getApellido(), //Agrega los pasaportes a la Lista original.
                        aux.getPersona().getApellido2(), aux.getPersona().getCedula(), aux.getPersona().getEdad());
                aux = aux.getSiguiente();
            }
            int cont = listaAux.size;
            while (cont > 0) {
                listaAux.remove(0);
                cont--;
            }
        }
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
