package dentalware;

import javax.swing.JOptionPane;

public class Appointment {
    private String nameDoctor;
    private String namePacient;
    private String date;
    private String time;
    private String procedure;
    private Appointment next;

    public Appointment() {
        this.next = null;
    }

    public Appointment(String nameDoctor, String namePacient, String date, String time, String procedure) {
        this.nameDoctor = nameDoctor;
        this.namePacient = namePacient;
        this.date = date;
        this.time = time;
        this.procedure = procedure;
        this.next = null;
    }
    
    public boolean isQueueEmpty() {
        if(next == null)
            return true;
        return false;
    }
    
    public void enqueue(String nameDoctor, String namePacient, String date, String time, String procedure) {
        Appointment node = new Appointment(nameDoctor, namePacient, date, time, procedure);
        
        if(isQueueEmpty())
            next = node;
        else {
            Appointment aux = next;
            while(aux.getNext() != null)
                aux = aux.getNext();
            aux.setNext(node);
        }
    }
    
    /*public void dequeue(parent) {
        Appointment aux = next;
        
        if(next.getNext() == null)
            next = null;
        else {
            next = aux.getNext();
            JOptionPane.showMessageDialog(parent, "Last appointment deleted", "¡CAUTION!", JOptionPane.INFORMATION_MESSAGE);
        }
    }*/

    public String getNameDoctor() {
        return nameDoctor;
    }

    public void setNameDoctor(String nameDoctor) {
        this.nameDoctor = nameDoctor;
    }

    public String getNamePacient() {
        return namePacient;
    }

    public void setNamePacient(String namePacient) {
        this.namePacient = namePacient;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getProcedure() {
        return procedure;
    }

    public void setProcedure(String procedure) {
        this.procedure = procedure;
    }

    public Appointment getNext() {
        return next;
    }

    public void setNext(Appointment next) {
        this.next = next;
    }
    
}
