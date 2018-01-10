/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenn1;

/**
 *
 * @author Capa Brothers
 */
public abstract class Cuenta {
   private String cliente;
    private String tipoCliente;
    private double balance;
    private double tasaInteres;
    private int numeroCuenta;

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Cuenta() {
    }

    public Cuenta(String cliente, String tipoCliente, double balance, double tasaInteres , int numeroCuenta) {
        this.cliente = cliente;
        this.tipoCliente = tipoCliente;
        this.balance = balance;
        this.tasaInteres = tasaInteres;
        this.numeroCuenta = numeroCuenta;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }
    public abstract double calcularInteres(int meses);
    public abstract double depositar(double monto);


}
