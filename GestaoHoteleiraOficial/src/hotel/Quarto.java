package hotel;

import java.util.ArrayList;
import javax.swing.JOptionPane;
/*
 * @author Milena
 */
public class Quarto {
    private int numeroQuartos;
    private int numeroHospedesQuarto;
    private String tipoQuarto;
    private double precoDiaria;
    private String disponibilidade;
    
     ArrayList<Quarto> listaQuarto = new ArrayList<>();

    public Quarto(int numeroQuartos, int numeroHospedesQuarto, String tipoQuarto, double precoDiaria, String disponibilidade) {
        this.numeroQuartos = numeroQuartos;
        this.numeroHospedesQuarto = numeroHospedesQuarto;
        this.tipoQuarto = tipoQuarto;
        this.precoDiaria = precoDiaria;
        this.disponibilidade = disponibilidade;
    }
    
    public ArrayList<Quarto> getListaQuarto() {
        return listaQuarto;
    }

    public void setListaQuarto(ArrayList<Quarto> listaQuarto) {
        this.listaQuarto = listaQuarto;
    }
    
    public void setListaQuartos(ArrayList<Quarto> listaQuarto) {
        this.listaQuarto = listaQuarto;
    }
     

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

    public double getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(float precoDiaria) {
        this.precoDiaria = precoDiaria;
        
        //condição para inpedir um valor negativo (invalido)
        while (precoDiaria <= 0){
            precoDiaria = Float.parseFloat (JOptionPane.showInputDialog ("Digite um valor valido"));
        }
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
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
