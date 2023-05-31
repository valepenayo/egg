//
package entidad;

/**
 *
 * @author vale
 */
public class ahorcado {
    private String vector[];
    private String frase;
    private int cantLetras;
    private int cantJugadasMax;

    public ahorcado() {
    }

    public ahorcado(String[] vector, String frase, int cantLetras, int cantJugadasMax) {
        this.vector = vector;
        this.frase = frase;
        this.cantLetras = cantLetras;
        this.cantJugadasMax = cantJugadasMax;
    }

    public String[] getVector() {
        return vector;
    }

    public void setVector(String[] vector) {
        this.vector = vector;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getCantLetras() {
        return cantLetras;
    }

    public void setCantLetras(int cantLetras) {
        this.cantLetras = cantLetras;
    }

    public int getCantJugadasMax() {
        return cantJugadasMax;
    }

    public void setCantJugadasMax(int cantJugadasMax) {
        this.cantJugadasMax = cantJugadasMax;
    }

   
}