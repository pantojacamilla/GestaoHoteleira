package hotel;

import javax.swing.JOptionPane;

/**
 *
 * @author Milena
 */
public class Quarto {
    private int numeroQuartos,numeroHospedesQuarto;
    private String tipoQuarto;
    private float precoDiaria;
    private boolean disponibilidade;

    public int getNumeroQuartos() {
        return numeroQuartos;
    }

    public void setNumeroQuartos(int numeroQuartos) {
        this.numeroQuartos = numeroQuartos;
    }

    public String getTipoQuarto() {
        return tipoQuarto;
    }

    public void setTipoQuarto(String tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }

    public int getNumeroHospedesQuarto() {
        return numeroHospedesQuarto;
    }

    public void setNumeroHospedesQuarto(int numeroHospedesQuarto) {
        this.numeroHospedesQuarto = numeroHospedesQuarto;
    }

    public float getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(float precoDiaria) {
        this.precoDiaria = precoDiaria;
        
        //condição para inpedir um valor negativo (invalido)
        while (precoDiaria <= 0){
            precoDiaria = Float.parseFloat (JOptionPane.showInputDialog ("Digite um valor valido"));
        }
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    //Método que altera o valor da diaria
    public void alterarvalor(){
        setPrecoDiaria (Float.parseFloat (JOptionPane.showInputDialog ("Digite o novo valor da diária")));
        
        //condição para inpedir um valor negativo (invalido)
        while (precoDiaria <= 0){
            precoDiaria = Float.parseFloat (JOptionPane.showInputDialog ("Digite uma valor valido"));
        }
    }
}
