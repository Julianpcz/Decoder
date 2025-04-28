/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Model;

import PatronesDiseñoDecorador.PlanDecorador;
import impl.ICuentaDisney;
import impl.CuentaNormal;
import Model.Cuenta;


public class App {

   
    public static void main(String[] args) {
        Cuenta c = new Cuenta(10,"Villa Ahmed Lopez Guiu");
        
        ICuentaDisney cuenta = new CuentaNormal();
        ICuentaDisney CuentaConPlan = new PlanDecorador(cuenta);
        
        CuentaConPlan.abrirCuenta(c);
    }
    
}
