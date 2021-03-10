package com.sylosbyte;

/**
 *
 * @author DANIEL BERNARDO ROCHA (DBR79)
 */
import com.modelo.Usuario;
import com.sylosbyte.Info;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Arquivo {

    
    public static void inserir(Usuario usuario) {
        try {
            ArrayList<Usuario> atual = listar();
            atual.add(usuario);
            FileOutputStream fos = new FileOutputStream(Info.ARQUIVO_USUARIO);
            try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(atual);
            }

        } catch (IOException ex) {
            System.out.println(" Erro ao inserir usuário ");
        }

    }

  public static ArrayList<Usuario> listar() {
        ArrayList<Usuario> lista = new ArrayList();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(Info.ARQUIVO_USUARIO);
            ObjectInputStream ois = new ObjectInputStream(fis);
            lista = (ArrayList<Usuario>) ois.readObject();
            ois.close();
            return lista;
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
        } catch (EOFException e) {  
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