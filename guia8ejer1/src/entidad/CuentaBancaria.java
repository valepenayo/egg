
package entidad;

public class CuentaBancaria {
    private int numcuenta;
    private  long DNIcliente;
    private double saldo;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numcuenta, long DNIcliente, double saldo) {
        this.numcuenta = numcuenta;
        System.out.println("");
        this.DNIcliente = DNIcliente;
        this.saldo = saldo;
    }
    

    public int getNumcuenta() {
        return numcuenta;
    }

    public void setNumcuenta(int numcuenta) {
        this.numcuenta = numcuenta;
    }

    public long getDNIcliente() {
        return DNIcliente;
    }

    public void setDNIcliente(int DNIcliente) {
        this.DNIcliente = DNIcliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}

