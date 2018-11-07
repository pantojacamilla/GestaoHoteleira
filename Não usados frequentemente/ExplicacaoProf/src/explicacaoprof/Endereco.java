
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AndersonCosta
 */
public class Endereco {
    String logradouro;
    
    ArrayList pessoas;

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public ArrayList getPessoas() {
        return pessoas;
    }

    public void setPessoas(Pessoa pessoa) {
        this.pessoas.add(pessoa);
    }
    
    
}
