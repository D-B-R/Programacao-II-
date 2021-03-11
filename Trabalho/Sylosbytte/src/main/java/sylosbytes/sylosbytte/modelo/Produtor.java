
package sylosbytes.sylosbytte.modelo;
/**
 *
 * @author DANIEL BERNARDO ROCHA (DBR79)
 */

import java.io.Serializable;
import java.time.LocalDate;


public class Produtor implements Serializable{
    
    String name;
    
    LocalDate dataNascimento;
     
    String cpf;
   

    public Produtor() {
    }

    public Produtor(String name, LocalDate dataNascimento ,String cpf ) {
        
        this.name = name;
        
        this.dataNascimento = dataNascimento;
        
        this.cpf = cpf;
        
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        
        return cpf;
    }

    public LocalDate getDataNascimento() {
        
        return dataNascimento;
    }

    public void setName(String name) {
        
        this.name = name;
    }

    public void setCpf(String cpf) {
        
        this.cpf = cpf;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        
        this.dataNascimento = dataNascimento;
    }
    
    
    
    
}



/**/