/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mipaquete;

/**
 *
 * @author MI
 */
public class TarjetaDebito {
//private double montoActual;
private double saldo;

public  TarjetaDebito (double Saldo){
    this.saldo = Saldo;
    
}


       
public void depositar(double Saldo){
    if (Saldo>0){
        this.saldo+=Saldo;
    } 
}
 public void retirar (double Saldo){
   if (this.saldo - Saldo<0){
       this.saldo=0;
   }else {
       this.saldo -= Saldo;
   }  
     
 }

@Override
   public  String toString(){
        return "Saldo =" + saldo;
       
  
 
 }  
 }    

