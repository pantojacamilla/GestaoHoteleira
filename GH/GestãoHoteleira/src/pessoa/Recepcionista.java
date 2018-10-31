package pessoa;

public class Recepcionista extends Funcionario {
    
    private String cargo;
    private double sal;

    @Override
    public String getCargo() {
        return cargo;
    }

    @Override
    public void setCargo(String cargo) {
        this.cargo = "recepcionista";
    }

    @Override
    public double getSal() {
        return sal;
    }

    @Override
    public void setSal(double sal) {
        this.sal = sal;
    }
    
    
    
    
}
