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
public class CuentaPrestamo extends Cuenta {

    public CuentaPrestamo(String cliente, String tipoCliente, double balance, double tasaInteres, int numeroCuenta) {
        super(cliente, tipoCliente, balance, tasaInteres, numeroCuenta);
    }

    @Override
    public double calcularInteres(int meses) { 
       return  meses*this.getTasaInteres();
    }

    @Override
    public double depositar(double monto) {
        double total = 0;
        total= monto + this.getBalance();
        this.setBalance(total);
        return total;
    }
    

   
    
}
