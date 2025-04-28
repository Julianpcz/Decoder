/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


public class Cuenta {
    private int id;
    private String cliente;
    
    public Cuenta() {
    
    
    }
    
    public Cuenta(int id, String cliente){
    
    this.id = id;
    this.cliente = cliente;
   
    } 
    
    public int getId(){
    
    return id;
    
    }
    
    public void setId(int id){
    
    this.id = id;
        
    }
    
    public String getCliente(){
    
    return cliente;
        
    }
    
    public void setCliente(String cliente){
    
    this.cliente = cliente;
    }
}
