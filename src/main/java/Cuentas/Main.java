/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cuentas;

import Cuentas.CCuenta;
import java.util.Scanner;


/**
 *
 * @author Tena
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        CCuenta cuenta1;
        Scanner captura = new Scanner(System.in);

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500);
            System.out.println("OPCIONES: 1- Conocer saldo cuenta, 2- Retirar saldo, 3. Ingresar saldo, escribe el numero de la opcion solicitada");
        int opcion = captura.nextInt(); 
    /**
     *
     * @param cuenta1
     * @param saldoActual
     */  
    
        
 
    }
    
    /**
     *
     * @param cuenta1
     * @param saldoActual
     * @param opcion
     * @param cantidad
     */
    public void operativa_cuenta( CCuenta cuenta1,  double saldoActual, int opcion, float cantidad ){
        
           switch(opcion){
                 
               case 1:
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
                   
       
     case 2:
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        case 3:
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        } 
        
    }
    }
}




