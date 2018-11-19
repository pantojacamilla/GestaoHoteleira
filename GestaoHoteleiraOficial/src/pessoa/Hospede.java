package pessoa;

import java.util.ArrayList;

public class Hospede extends Papel{
    
    private String dataInic;
    private String dataFim;
    ArrayList<Reserva> reserva = new ArrayList<>();

    @Override
    public String getDataInic() {
        return dataInic;
    }

    @Override
    public void setDataInic(String dataInic) {
        this.dataInic = dataInic;
    }

    @Override
    public String getDataFim() {
        return dataFim;
    }

    @Override
    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public ArrayList<Reserva> getReserva() {
        return reserva;
    }

    public void setReservas(ArrayList<Reserva> reserva) {
        this.reserva = reserva;
    }
    
    public void setReserva(Reserva h){
        this.reserva.add(h);
    }
    
    
}
