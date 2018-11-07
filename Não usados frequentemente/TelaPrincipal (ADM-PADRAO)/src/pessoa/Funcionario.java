package pessoa;

abstract class Funcionario extends Papel {
    
    private String cargo;
 //   private boolean estado; Para esse atributo teremos que fazer a lógica posteriormente pois estado não estava na tela
//    private double sal; Para esse atributo teremos que fazer a lógica posteriormente pois salário não estava na tela

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

/*   public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
 */  
      
}
