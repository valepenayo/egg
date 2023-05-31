
package entidad;

public class Cafetera {
    private double capMax;
    private double cantActual;

    public Cafetera() {
    }

    public Cafetera(double capMax, double cantActual) {
        this.capMax = capMax;
        this.cantActual = cantActual;
    }

    public double getCapMax() {
        return capMax;
    }

    public void setCapMax(double capMax) {
        this.capMax = capMax;
    }

    public double getCantActual() {
        return cantActual;
    }

    public void setCantActual(double cantActual) {
        this.cantActual = cantActual;
    }

    @Override
    public String toString() {
        return "Cafetera{" + "capMax=" + capMax + ", cantActual=" + cantActual + '}';
    }
    
    
}
