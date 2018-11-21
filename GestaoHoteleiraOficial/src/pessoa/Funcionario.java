package pessoa;

public abstract class Funcionario extends Papel{
    
    private boolean atividade = false; //Referente a situação atual do funcionario   

    public boolean isAtividade() {
        return atividade;
    }

    public void setAtividade(boolean atividade) {
        this.atividade = atividade;
    }
}
