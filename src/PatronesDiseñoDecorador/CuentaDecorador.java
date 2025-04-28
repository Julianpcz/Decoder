/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronesDiseñoDecorador;

import Model.Cuenta;
import impl.ICuentaDisney;

public abstract class CuentaDecorador implements ICuentaDisney {
    
    protected ICuentaDisney cuentaDecorada;
    
    public CuentaDecorador(ICuentaDisney cuentaDecorada) {
    
    this.cuentaDecorada = cuentaDecorada;
    
    }
    
    @Override
    public void abrirCuenta(Cuenta c) {
              this.cuentaDecorada.abrirCuenta(c);
    }
}
