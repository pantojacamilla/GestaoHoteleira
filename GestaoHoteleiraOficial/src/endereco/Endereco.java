package endereco;
/*
  @author Camilla Lobato Pantoja
 */
public class Endereco {
// ATRIBUTOS
    private String pais;
    private String uf;
    private String cidade;
    private String bairro;
    private String cep; 
    private String complemento;
    
    
//CONSTRUTOR
    public Endereco(String pais, String uf, String cidade, String bairro, String cep, String complemento) {
        this.pais = pais;
        this.uf = uf;
        this.cidade = cidade;
        this.bairro = bairro;
        this.cep = cep;
        this.complemento = complemento;
    }
     
// GETTERS E SETTERS

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }


}
