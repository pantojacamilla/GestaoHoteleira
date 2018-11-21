package hotel;

import java.util.ArrayList;
import java.util.Date;
import pessoa.Papel;

/*
 * @author Milena
 */

public class Reserva {
    private Date dataReserva;
    private Date inicioEstadia;
    private Date finalEstadia;
    private String periodoEstadia;
   
    ArrayList<Reserva> listaReserva = new ArrayList<>();

    public Reserva(Date dataReserva, Date inicioEstadia, Date finalEstadia, String periodoEstadia) {
        this.dataReserva = dataReserva;
        this.inicioEstadia = inicioEstadia;
        this.finalEstadia = finalEstadia;
        this.periodoEstadia = periodoEstadia;
    }
    
    
    public Date getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(Date dataReserva) {
        this.dataReserva = dataReserva;
    }

    public Date getInicioEstadia() {
        return inicioEstadia;
    }

    public void setInicioEstadia(Date inicioEstadia) {
        this.inicioEstadia = inicioEstadia;
    }

    public Date getFinalEstadia() {
        return finalEstadia;
    }

    public void setFinalEstadia(Date finalEstadia) {
        this.finalEstadia = finalEstadia;
    }

    public String getPeriodoEstadia() {
        return periodoEstadia;
    }

    public void setPeriodoEstadia(String periodoEstadia) {
        this.periodoEstadia = periodoEstadia;
    }

    public ArrayList<Reserva> getListaReserva() {
        return listaReserva;
    }
    
    public void setListaPapeis(ArrayList<Reserva> listaReserva) {
        this.listaReserva = listaReserva;
    }
    
    public void setListaReserva(ArrayList<Reserva> listaReserva) {
        this.listaReserva = listaReserva;
    }
}
