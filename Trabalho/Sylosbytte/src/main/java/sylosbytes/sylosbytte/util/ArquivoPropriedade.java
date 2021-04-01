
package sylosbytes.sylosbytte.util;



import sylosbytes.sylosbytte.modelo.Propriedade;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class ArquivoPropriedade {
    
    public static void inserir(Propriedade propriedade) {
        
        
        try {
            ArrayList<Propriedade> atual = listar();
            atual.add(propriedade);
            FileOutputStream fos = new FileOutputStream(info.ARQUIVO_PROPRIEDADE);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(atual);
            oos.close();
        } catch (IOException ex) {
            System.out.println("Erro ao cadastrar propriedade");
        }
    }
    
    public static ArrayList<Propriedade> listar() {
        ArrayList<Propriedade> lista = new ArrayList();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(info.ARQUIVO_PROPRIEDADE);
            ObjectInputStream ois = new ObjectInputStream(fis);
            lista = (ArrayList<Propriedade>) ois.readObject();
            ois.close();
            return lista;
        } catch (FileNotFoundException e) {
            System.out.println("ARQUIVO NÃO LOCALIZADO");
        } catch (EOFException e) {  
            return lista;
        } catch (IOException | ClassNotFoundException e) {

        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                System.out.println("NAO É POSSIVEL LER ARQUIVO");
            }
        }
        return lista;
    }


   
    
}



/**/
    
