/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package impl;

import impl.ICuentaDisney;
import Model.Cuenta;

public class CuentaPremiun implements ICuentaDisney {
    
    @Override
    public void abrirCuenta(Cuenta c) {
    
    System.out.println("----------------------");
     System.out.println("Se creo una cuenta premiun de disney plus.");
      System.out.println("Cliente: " + c.getCliente());
    
    }
    
}
