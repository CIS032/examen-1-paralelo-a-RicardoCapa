/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenn1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Capa Brothers
 */
public class Banco {

    static ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();

    public static void agregar(Cuenta cuenta) {
        cuentas.add(cuenta);
    }

    public static void grabar() {
        PrintWriter pw = null;
        try {
            FileWriter fw = new FileWriter("C:\\Users\\Capa Brothers\\Documents\\NetBeansProjects\\ExamenN1/cuentas.csv", true);
            pw = new PrintWriter(fw);
        } catch (IOException ex) {
            System.out.println("Error al abrir archivos " + ex);
        }
        for (Cuenta cuenta : cuentas) {
            if (cuenta instanceof CuentaAhorro) {
                CuentaAhorro c = (CuentaAhorro) cuenta;
                String linea = "Numero Cuenta = " + c.getNumeroCuenta() + " Cliente: " + c.getCliente() + " Tipo CLiente: " + c.getTipoCliente() + " Saldo: " + c.getBalance();
                pw.println(linea);
            }
            if (cuenta instanceof CuentaPrestamo) {
                CuentaPrestamo c = (CuentaPrestamo) cuenta;
                String linea = "Numero Cuenta = " + c.getNumeroCuenta() + " Cliente: " + c.getCliente() + " Tipo CLiente: " + c.getTipoCliente() + " Saldo: " + c.getBalance();
                pw.println(linea);
            }
            if (cuenta instanceof CuentaHipoteca) {
                CuentaHipoteca c = (CuentaHipoteca) cuenta;
                String linea = "Numero Cuenta = " + c.getNumeroCuenta() + " Cliente: " + c.getCliente() + " Tipo CLiente: " + c.getTipoCliente() + " Saldo: " + c.getBalance();
                pw.println(linea);
            }
        }
        pw.close();
    }
}
