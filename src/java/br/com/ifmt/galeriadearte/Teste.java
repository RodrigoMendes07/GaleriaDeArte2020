/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifmt.galeriadearte;

import br.com.ifmt.dao.ClienteJPADao;

/**
 *
 * @author ti
 */

public class Teste {
    
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente();
    
        cliente.setCpf("01130357139");
        cliente.setNome("Rodrigo Aparecido Mendes");
        cliente.setRg("15160386");

                ClienteJPADao.getInstance().removeById(2);
                
    }
}
