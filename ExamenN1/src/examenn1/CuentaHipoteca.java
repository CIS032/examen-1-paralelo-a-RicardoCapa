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
public class CuentaHipoteca extends Cuenta {
     int deposito = 0;
     int meses = 0;

    public CuentaHipoteca(String cliente, String tipoCliente, double balance, double tasaInteres, int numeroCuenta) {
        super(cliente, tipoCliente, balance, tasaInteres, numeroCuenta);
    }
     
    @Override
    public double depositar(double monto) {
        double total = this.getBalance() + monto;
        this.setBalance(total);
        return total;
    }

     @Override
    public double calcularInteres(int meses) {
        double resultado;
        resultado = meses * this.getTasaInteres();
        return resultado;

    }
    

}
