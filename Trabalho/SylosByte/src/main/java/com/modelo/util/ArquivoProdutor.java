
package com.modelo.util;

/**
 * 
 * @author DANIEL BERNARDO ROCHA (DBR79)
 */
import com.modelo.Produtor;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class ArquivoProdutor {
    
    public static void inserir(Produtor produtor) {
        try {
            ArrayList<Produtor> atual = listar();
            atual.add(produtor); 
            FileOutputStream fos = new FileOutputStream(Info.ARQUIVO_PRODUTOR);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(atual);
            oos.close();
        } catch (IOException ex) {
            System.out.println("Erro ao inserir produtor");
        } 
    }
    
    public static ArrayList<Produtor> listar() {
        ArrayList<Produtor> lista = new ArrayList();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(Info.ARQUIVO_PRODUTOR);
            ObjectInputStream ois = new ObjectInputStream(fis);
            lista = (ArrayList<Produtor>) ois.readObject();
            ois.close();
            return lista;
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
        } catch (EOFException e) {  // arquivo vazio
            return lista;
        } catch (IOException | ClassNotFoundException e) {

        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                System.out.println("Erro ao ler arquivo");
            }
        }
        return lista;
    }
    
}


