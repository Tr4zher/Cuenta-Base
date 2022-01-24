
package mipaquete;

import javax.swing.JOptionPane;

public class Cuentabase {
    //Atributos

public static void main(String[] args) {
    TarjetaDebito saldo = new TarjetaDebito(1000);
    
    saldo.depositar(1500);
    saldo.retirar(60);
//JOptionPane.showMessageDialog(null, saldo);
System.out.println(saldo);
   
}
}

 /*   private Cuentabase(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

//package Cuentabase;

  public class TarjetaDebito {
  }

//package cuentabase;

 public class TarjetaDebito {

// Definición de las propiedades de la clase
private int numero;
private double saldo;
public TarjetaDebito(int TarjetaDebito, double inicial) {
    numero = TarjetaDebito;
    saldo = inicial;
} // Fin del constructor cuenta

public void depositar(double cantidad) {
    saldo = saldo + cantidad;
} // Fin del método depositar

public void retirar(double cantidad) {
    saldo = saldo - cantidad;
} // Fin del método retirar

public double saldo() {
    return saldo;
} // Fin del método saldo    
}  

//También considero esto, para esta clase
//Constructor con parámetros
public CuentaBase (int numero, double saldo) {
    this.numero = numero;
    this.saldo = saldo;
}

//Método deposito
public void Deposito (double cantidad) {
    this.saldo = this.saldo + cantidad;
}

//Método retiros
public void Retiro (double cantidad) {
    this.saldo = this.saldo + cantidad;
}//Cual es mejor para el ejercicio?

package cuentabase;

public class CuentaAhorro {

}

 */   
//}
