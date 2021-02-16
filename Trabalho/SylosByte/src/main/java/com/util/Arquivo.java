
package com.util;

import com.modelo.Usuario;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * 
 * @author DANIEL BERNARDO ROCHA (DBR79)
 */

public class Arquivo {
    
    public void inserir (Usuario usuario){
       try {
            ArrayList <Usuario> atual = listar();
            atual.add(usuario);
            FileOutputStream fos =  new  FileOutputStream(Info.ARQUIVO_USUARIO);
           try (ObjectOutputStream oos = new  ObjectOutputStream(fos)) {
               oos.writeObject(atual);
           }
            
        } catch (IOException ex) {
            System.out.println(" Erro ao inserir usuário " );
        }
     
    
} 

    private ArrayList<Usuario> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

  