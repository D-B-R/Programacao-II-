
package sylosbytes.sylosbytte.util;

/**
 *
 * @author DANIEL BERNARDO ROCHA (DBR79)
 */

import sylosbytes.sylosbytte.modelo.Aluguel;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class ArquivoAluguel {
    public static void inserir(Aluguel aluguel) {
        try {
            ArrayList<Aluguel> atual = listar();
            atual.add(aluguel);
            FileOutputStream fos = new FileOutputStream(info.ARQUIVO_ALUGUEL);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(atual);
            oos.close();
        } catch (IOException ex) {
            System.out.println("NAO FOI POSSIVEL INSERIR O ALUGUEL ");
        }
    }
    
    public static ArrayList<Aluguel> listar() {
        ArrayList<Aluguel> lista = new ArrayList();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(info.ARQUIVO_ALUGUEL);
            ObjectInputStream ois = new ObjectInputStream(fis);
            lista = (ArrayList<Aluguel>) ois.readObject();
            ois.close();
            return lista;
        } catch (FileNotFoundException e) {
            System.out.println("NAO FOI LOCALIZADO O ARQUIVO ");
        } catch (EOFException e) {  
            return lista;
        } catch (IOException | ClassNotFoundException e) {

        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                System.out.println("NÃO FOI POSSIVEL LER ARQUIVO");
            }
        }
        return lista;
    }
     public static void alterar(Aluguel a, int id, String status, Double valor){
        ArrayList<Aluguel> lista = ArquivoAluguel.listar();
        for(Aluguel aluguel: lista){
            if(aluguel.getId() == id){
                aluguel.setValor(valor);
                aluguel.setStatus(status);
                 try {
                        FileOutputStream fos = new FileOutputStream(info.ARQUIVO_ALUGUEL);
                        ObjectOutputStream oos = new ObjectOutputStream(fos);
                        oos.writeObject(lista);
                        oos.close();
                    } catch (IOException ex) {
                        System.out.println("FALHA AO MODIFICAR ALUGUEL");
                    }
            }
        }
    }

}


/**/
