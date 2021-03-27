package sylosbytes.sylosbytte.modelo;
/**
 *
 * @author DANIEL BERNARDO ROCHA (DBR79)
 */

import java.io.Serializable;



public class Propriedade implements Serializable{
    
    String municipio;
    
    String nomePropriedade;
     
    String estado;
   

    public Propriedade() {
    }

    public Propriedade(String municipio, String nomePropriedade ,String estado ) {
        
        this.municipio = municipio;
        
        this.nomePropriedade = nomePropriedade;
        
        this.estado = estado;
        
    }

    public String getMunicipio() {
        return municipio;
    }

    public String getEstado() {
        
        return estado;
    }

    public String getNomePropriedadeo() {
        
        return nomePropriedade;
    }

    public void setMunicipio(String municipio) {
        
        this.municipio = municipio;
    }

    public void setEstado(String estado) {
        
        this.estado = estado;
    }

    public void setNomePropriedade(String nomePropriedade) {
        
        this.nomePropriedade= nomePropriedade;
    }
    
    
    
    
}



/**/