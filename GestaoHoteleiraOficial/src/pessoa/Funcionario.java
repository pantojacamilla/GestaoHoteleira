package pessoa;

public abstract class Funcionario extends Papel{ //abstract
    
    private double salario; 
    private boolean trabalhando;
    
    
    //MÉTODOS CONCRETOS
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
