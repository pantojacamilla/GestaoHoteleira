package hotel;

import java.util.Date;

/**
 *
 * @author Milena
 */
public class Reserva {
    private Date dataReserva,inicioEstadia,finalEstadia;
    private String periodoEstadia;

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
    
    
    
}
