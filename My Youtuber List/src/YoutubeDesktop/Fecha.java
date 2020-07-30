package YoutubeDesktop;

public class Fecha {
    
    private int anio;
    private int mes;
    private int dia;
    
    
    public Fecha() {
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    /**
     * @return the anio
     */
    public int getAnio() {
        return anio;
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }

    /**
     * @return the mes
     */
    public int getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * @return the dia
     */
    public int getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    public void splitFecha(String fecha) {
        
        String[] toFecha = fecha.split("/");
        this.dia = Integer.parseInt(toFecha[0]);
        this.mes = Integer.parseInt(toFecha[1]);
        this.anio = Integer.parseInt(toFecha[2]);
        
    }

    public String toString() {
        return dia + "/" + mes + "/" + anio;
    }
    }