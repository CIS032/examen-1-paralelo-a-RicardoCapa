/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenn1;

import java.util.ArrayList;

/**
 *
 * @author Capa Brothers
 */
public class CuentaAhorro extends Cuenta {

    public CuentaAhorro(String cliente, String tipoCliente, double balance, double tasaInteres, int numeroCuenta) {
        super(cliente, tipoCliente, balance, tasaInteres, numeroCuenta);
    }

    @Override
    public double calcularInteres(int meses) {
        return meses * this.getTasaInteres();
    }

    @Override
    public double depositar(double monto) {
        double total = monto + this.getBalance();
        this.setBalance(total);
        return total;
    }

    public double retirar(double monto) {
        double total = this.getBalance() - monto;
        this.setBalance(total);
        return total;
    }

}
