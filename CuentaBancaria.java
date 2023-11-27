public class CuentaBancaria {
    private int numeroCuenta;
    private double saldo;
    private String nombreCliente;
    private String email;
    private String numeroTelefono;

    public CuentaBancaria(int numeroCuenta, double saldo, String nombreCliente, String email, String numeroTelefono) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.nombreCliente = nombreCliente;
        this.email = email;
        this.numeroTelefono = numeroTelefono;
    }

    // Métodos setters y getters
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    // Métodos adicionales
    public void depositar(double cantidad) {
        saldo += cantidad;
        System.out.println("Se depositaron " + cantidad + " €");
    }

    public void retirar(double cantidad) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
            System.out.println("Se retiraron " + cantidad + " €");
        } else {
            System.out.println("Fondos insuficientes");
        }
    }

    // Verificación
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(12345, 1000.0, "Ejemplo Cliente", "cliente@email.com", "123-456-7890");
        System.out.println("Saldo actual: " + cuenta.getSaldo() + " €");
        cuenta.depositar(500.0);
        System.out.println("Saldo actual: " + cuenta.getSaldo() + " €");
        cuenta.retirar(2000.0);
    }
}