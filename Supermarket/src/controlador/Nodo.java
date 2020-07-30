package controlador;

import modelo.Producto;

/**
 * ésta es una clase Nodo modificada, donde la información dentro de el es un Objeto
 * tipo Producto, para la realización de procesos como: agregar a Cola, buscar en Cola 
 * algún producto en específico
 * @version 1.0
 */
public class Nodo
{
    private Producto data;
    private Nodo siguiente;
    private Nodo anterior;

    /**
     * Constructor de Nodo
     * @param data 
     */
    public Nodo(Producto data)
    {
        this.data = data;
        this.siguiente = null;
        this.anterior = null;
    }

    /**
     * 
     * @return info en el Nodo
     */
    public Producto getData() {
        return data;
    }

    /**
     * 
     * @return obtiene el Nodo Siguiente
     */
    public Nodo getSiguiente() {
        return siguiente;
    }

    /**
     * 
     * @return obtiene el Nodo Anterior
     */
    public Nodo getAnterior() {
        return anterior;
    }

    /**
     * configura la información en el Nodo
     * @param data nueva información del Nodo
     */
    public void setData(Producto data) {
        this.data = data;
    }

    /**
     * configura el Nodo siguiente
     * @param siguiente nuevo Nodo siguiente
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * configura el Nodo anterior
     * @param anterior nuevo Nodo anterior
     */
    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
}