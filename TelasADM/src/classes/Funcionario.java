package classes;

/*
 * @author Camilla Sama
 */
public class Funcionario extends Pessoa {
    
//ATRIBUTOS    
    private String cargo;
//    private double salario;
    
//CONSTRUCTOR   
    public Funcionario(String cargo, /*double salario,*/ String nome, 
                        String data_nasc, String sexo, String cpf, String rg, 
                        String telefone, String email,String pais,String uf, 
                        String cidade, String bairro, String cep, String complemento) {
        
        this.cargo = cargo;
 //this.salario = salario;
        this.nome = nome;
        this.data_nasc = data_nasc;
        this.sexo = sexo;
        this.cpf = cpf;
        this.rg = rg;
        this.telefone = telefone;
        this.email = email;
        this.pais = pais;
        this.uf = uf;
        this.cidade = cidade;
        this.bairro = bairro;
        this.cep = cep;
        this.complemento = complemento;
    }
  
    

//GETTERS E SETTERS
   //Funcionário
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
  /*  
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
*/    

  //Pessoa  
    @Override
    public String getNome() {    
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getData_nasc() {
        return data_nasc;
    }

    @Override
    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    @Override
    public String getSexo() {
        return sexo;
    }

    @Override
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String getRg() {
        return rg;
    }

    @Override
    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public String getCpf() {
        return cpf;
    }

    @Override
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String getTelefone() {
        return telefone;
    }

    @Override
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {    
        this.email = email;
    }
    
   //Endereço
    @Override
     public String getPais() {
        return pais;
    }

    @Override
    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String getUf() {
        return uf;
    }

    @Override
    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String getCidade() {
        return cidade;
    }

    @Override
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String getBairro() {
        return bairro;
    }

    @Override
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @Override
    public String getCep() {
        return cep;
    }

    @Override
    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String getComplemento() {
        return complemento;
    }

    @Override
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }



   
}
