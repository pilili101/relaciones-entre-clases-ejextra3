/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

public class PolizaService {

    Scanner scn = new Scanner(System.in);
    ArrayList<Cliente> clientes;

    public PolizaService() {
    }

    public void crearPersona() {

        Cliente c = new Cliente();
        boolean bandera = true;

        System.out.println("");
        //preguntar datos de cliente
        clientes.add(c);
        System.out.println("Desea seguir cargando clientes? (S/N)");
        if (bandera) {

        }
    }

    public void crearVehiculo() {

    }

    public void crearPoliza(){
        
    }
}
