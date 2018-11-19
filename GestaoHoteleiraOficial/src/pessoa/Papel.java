package pessoa;

 public abstract class Papel {
     
//checar date inicio date fim
    private Pessoa pessoa; 
    private String tipo;
    private String status;
    private String dataInic;
    private String dataFim;
    
    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDataInic() {
        return dataInic;
    }

    public void setDataInic(String dataInic) {
        this.dataInic = dataInic;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }
     
}
