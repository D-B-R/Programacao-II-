
package sylosbytes.sylosbytte.modelo;
/**
 *
 * @author DANIEL BERNARDO ROCHA (DBR79)
 */

import java.io.Serializable;
import java.time.LocalDate;


public class Aluguel implements Serializable{
    
    
    Produtor produtor;
    
    LocalDate dataInicial;
    
    Double qtd;
    
    String status;
    
    int id;

    public Aluguel( Produtor produtor, LocalDate dataInicial, Double qtd, String status,int id) {
        
        this.produtor = produtor;
        
        this.dataInicial = dataInicial;
        
        this.qtd = qtd;
        
        this.status = status;
        
        this.id = id;
    }

    public Aluguel() {
    }

    public int getId() {
        
        return id;
    }

    public String getStatus() {
        
        return status;
        
    }

    public Produtor getProdutor() {
        
        return produtor;
    }

    public LocalDate getDataInicial() {
        
        return dataInicial;
    }

    public Double getQtd() {
        
        return qtd;
    }

    public void setProdutor(Produtor produtor) {
        
        this.produtor = produtor;
    }

    public void setDataInicial(LocalDate dataInicial) {
        
        this.dataInicial = dataInicial;
    }

    public void setQtd(Double qtd) {
        
        this.qtd = qtd;
    }

    public void setId(int id) {
        
        this.id = id;
    }

    public void setStatus(String status) {
        
        this.status = status;
    }
    
    
    
    
}



/**/