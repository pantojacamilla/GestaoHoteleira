package pessoa;

public abstract class Funcionario extends Papel{
    
    private Pessoa f;
    private String cargo;
    private double salario;
    private boolean atividade = false; //Referente a situação atual do funcionario

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isAtividade() {
        return atividade;
    }

    public void setAtividade(boolean atividade) {
        this.atividade = atividade;
    }

    public Pessoa getF() {
        return f;
    }

    public void setF(Pessoa f) {
        this.f = f;
    }  
}
