/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuentas;

/**
 *
 * @author Tena
 */


public class CCuenta {
    
       private  String nombre ;
       private  String cuenta ;
       private   double saldo ;
       private double tipoInteres;
         
     public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal){
        nombre= nom;
        cuenta= cue;
         saldo = sal;
        
    }

    
    
     public void asignarNombre(String nom)
    {
        nombre=nom;
    }
   
    public String darNombre()
    {
        return nombre;
    }
    
  public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }

     public String darCuenta()
    {
        return cuenta;
    }
    
    
    
      public void setSaldo(double saldo) {
    this.saldo = saldo;
  }
    
    
    
   
     public double estado ()
    {
        return saldo;
    }
    
    
         public double DarTipoInterés() {
    return tipoInteres;
  }
    
    

 

 public void setTipoInterés(double tipoInterés) {
    this.tipoInteres = tipoInterés;
  }
 

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        
         saldo = this.saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
         
         saldo = saldo- cantidad;
    }
    


}
    




