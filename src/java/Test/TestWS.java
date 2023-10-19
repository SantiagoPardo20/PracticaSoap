/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Test;

import ws.WebOperacion;
import ws.WebOperacion_Service;

/**
 *
 * @author santi
 */
public class TestWS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //crear el cliente 
        WebOperacion_Service servicio =new WebOperacion_Service();
        WebOperacion cliente = servicio.getWebOperacionPort();
        
        // ytilizar metodos
        if(cliente.login("santy", "1234")){
            System.out.println("Correcto");
        }else{
            System.out.println("Error");
        }
        //porcesar pago
        System.out.println(cliente.procesar(5000, 20000));        
        
    }
    
}
