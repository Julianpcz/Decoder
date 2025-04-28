/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronesDiseñoDecorador;

import impl.ICuentaDisney;
import Model.Cuenta;



public class PlanDecorador extends CuentaDecorador {
    
    public PlanDecorador(ICuentaDisney cuentaDecorada){
         super(cuentaDecorada); 
    
    }
    
    public void abirCuenta(Cuenta c){
         cuentaDecorada.abrirCuenta(c);
         agregarPlan(c);
    
    }
    
    public void agregarPlan(Cuenta c){
    
        System.out.println("Se agrego el plan estandar a la cuenta del cliente:  " + c.getCliente());
    
    }
}
