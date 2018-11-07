package hotel;

import java.util.Date;

/**
 *
 * @author Milena
 */
public class Hospedagem {
    private int numeroApartamento,numeroHospedes;
    private Date dataEntrada,dataSaida;
    private float valorHospedagem;

    public int getNumeroApartamento() {
        return numeroApartamento;
    }

    public void setNumeroApartamento(int numeroApartamento) {
        this.numeroApartamento = numeroApartamento;
    }

    public int getNumeroHospedes() {
        return numeroHospedes;
    }

    public void setNumeroHospedes(int numeroHospedes) {
        this.numeroHospedes = numeroHospedes;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public float getValorHospedagem() {
        return valorHospedagem;
    }

    public void setValorHospedagem(float valorHospedagem) {
        this.valorHospedagem = valorHospedagem;
    }
    
}
