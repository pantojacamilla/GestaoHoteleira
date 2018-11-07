package pessoa;

//import java.util.ArrayList;

public class FuncionarioTela extends Pessoa{
     private String cargo;
     
/*     
     ArrayList<pessoa.FuncionarioTela> ListaFuncionarios;
   

    public FuncionarioTela(String nome, String data_nasc, String sexo, String rg, String cpf, String telefone, String email, String cargo) {
         this.nome = nome;
         this.data_nasc = data_nasc;
         this.sexo = sexo;
         this.rg = rg;
         this.cpf = cpf;
         this.telefone = telefone;
         this.email = email;
         this.cargo = cargo;
         ListaFuncionarios = new ArrayList();
    }

*/
     
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
/* 
    public ArrayList<FuncionarioTela> getListaFuncionarios() {
        return ListaFuncionarios;
    }

    public void setListaFuncionarios(ArrayList<FuncionarioTela> ListaFuncionarios) {
        this.ListaFuncionarios = ListaFuncionarios;
    }
    
    public void addListaFuncionarios(FuncionarioTela F){
        ListaFuncionarios.add(F);
    }
*/   
}
