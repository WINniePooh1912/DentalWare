package dentalware;

import javax.swing.JOptionPane;

public class Quotation {
    private String nameDoctor;
    private String procedure;
    private String[] material;
    private int price;
    private float monthlyPayments;
    private boolean appliesMonthly;
    private int amountMonths;
    private Quotation next;

    public Quotation(String nameDoctor, String procedure, String[] material, int price, float monthlyPayments, boolean appliesMonthly, int amountMonths) {
        this.nameDoctor = nameDoctor;
        this.procedure = procedure;
        this.material = material;
        this.price = price;
        this.monthlyPayments = monthlyPayments;
        this.appliesMonthly = appliesMonthly;
        this.amountMonths = amountMonths;
        this.next = null;
    }
    
    public boolean isQueueEmpty() {
        if(next == null)
            return true;
        return false;
    }
    
    public void enqueue(String nameDoctor, String procedure, String[] material, int price, float monthlyPayments, boolean appliesMonthly, int amountMonths) {
        Quotation node = new Quotation(nameDoctor, procedure, material, price, monthlyPayments, appliesMonthly, amountMonths);
        
        if(isQueueEmpty())
            next = node;
        else {
            Quotation aux = next;
            while(aux.getNext() != null)
                aux = aux.getNext();
            aux.setNext(node);
        }
    }
    
    /*public void dequeue(parent) {
        Quotation aux = next;
        
        if(next.getNext() == null)
            next = null;
        else {
            next = aux.getNext();
            JOptionPane.showMessageDialog(parent, "Last quotation deleted", "¡CAUTION!", JOptionPane.INFORMATION_MESSAGE);
        }
    }*/

    public String getNameDoctor() {
        return nameDoctor;
    }

    public void setNameDoctor(String nameDoctor) {
        this.nameDoctor = nameDoctor;
    }

    public String getProcedure() {
        return procedure;
    }

    public void setProcedure(String procedure) {
        this.procedure = procedure;
    }

    public String[] getMaterial() {
        return material;
    }

    public void setMaterial(String[] material) {
        this.material = material;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public float getMonthlyPayments() {
        return monthlyPayments;
    }

    public void setMonthlyPayments(float monthlyPayments) {
        this.monthlyPayments = monthlyPayments;
    }

    public boolean isAppliesMonthly() {
        return appliesMonthly;
    }

    public void setAppliesMonthly(boolean appliesMonthly) {
        this.appliesMonthly = appliesMonthly;
    }

    public int getAmountMonths() {
        return amountMonths;
    }

    public void setAmountMonths(int amountMonths) {
        this.amountMonths = amountMonths;
    }

    public Quotation getNext() {
        return next;
    }

    public void setNext(Quotation next) {
        this.next = next;
    }
        
}
