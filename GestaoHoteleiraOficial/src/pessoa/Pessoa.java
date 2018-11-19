package pessoa;

import endereco.Endereco;
import java.util.ArrayList;

public class Pessoa extends Endereco{
    
//ATRIBUTOS  
   private String nome;
   private String data_nasc;
   private String sexo;
   private String rg;
   private String cpf;
   private String telefone;
   private String email;
   ArrayList<Papel>  listaPapel = new ArrayList<>();
   ArrayList<Funcionario> listaFunc = new ArrayList<>();
  
//CONSTRUTOR   
    public Pessoa(String nome, String data_nasc, String sexo, String rg, String cpf, String telefone, String email, String pais, String uf, String cidade, String bairro, String cep, String complemento) {
        super(pais, uf, cidade, bairro, cep, complemento);
        this.nome = nome;
        this.data_nasc = data_nasc;
        this.sexo = sexo;
        this.rg = rg;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
    }
   
//GETTERS E SETTERS    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Papel> getListaPapel() {
        return listaPapel;
    }

    public void setListaPapeis(ArrayList<Papel> listaPapel) {
        this.listaPapel = listaPapel;
    }
    
   public void setListaPapel(Papel p){
      this.listaPapel.add(p);
   }

    public ArrayList<Funcionario> getListaFunc() {
        return listaFunc;
    }

    public void setListaFuncionarios(ArrayList<Funcionario> listaFunc) {
        this.listaFunc = listaFunc;
    }
   
   public void setListaFuncionario(Funcionario f){
       this.listaFunc.add(f);
   }
}
