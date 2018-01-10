/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenn1;

import javax.swing.JOptionPane;

/**
 *
 * @author Capa Brothers
 */
public class Principal {

    public static void main(String[] args) {
        int opcion = 0;
        boolean continuar = true;
        String menu = "Elejir una de las siguiente opciones \n"
                + "1 Cuenta Ahorro \n"
                + "2 Cuenta Prestamo \n"
                + "3 Cuenta Hipoteca \n"
                + "4 Salir";
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (opcion) {
                case 1://Cuenta Ahorros
                    String cli = JOptionPane.showInputDialog(null, "Ingrese nombre del cliente");
                    String tipoCli = JOptionPane.showInputDialog(null, "Ingrese tipo de cliente");
                    double balance = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese saldo"));
                    int numerCuenta = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero de Cuenta"));
                    CuentaAhorro a = new CuentaAhorro(cli, tipoCli, balance, balance, numerCuenta);
                    Banco.agregar(a);
                    break;
                case 2://Cuenta Prestamo
                    String cli1 = JOptionPane.showInputDialog(null, "Ingrese nombre del cliente");
                    String tipoCli1 = JOptionPane.showInputDialog(null, "Ingrese tipo de cliente");
                    double balance1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese saldo"));
                    int numerCuenta1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero de Cuenta"));
                    CuentaPrestamo p = new CuentaPrestamo(cli1, tipoCli1, balance1, balance1, numerCuenta1);
                    Banco.agregar(p);
                    break;
                case 3: //Cuenta Hipoteca
                    String cli2 = JOptionPane.showInputDialog(null, "Ingrese nombre del cliente");
                    String tipoCli2 = JOptionPane.showInputDialog(null, "Ingrese tipo de cliente");
                    double balance2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese saldo"));
                    int numerCuenta2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero de Cuenta"));
                    CuentaHipoteca u = new CuentaHipoteca(cli2, tipoCli2, balance2, balance2, numerCuenta2);
                    Banco.agregar(u);
                    break;
                case 4:
                    Banco.grabar();
                    continuar = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ingrese una opcion Valida");
            }

        } while (continuar);
    }
}
