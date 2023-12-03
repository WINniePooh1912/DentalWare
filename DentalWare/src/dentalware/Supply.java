package dentalware;

import javax.swing.JOptionPane;

public class Supply {
   private String nameDoctor;
   private String nameProduct;
   private String supplier;
   private int amount;
   private String priority;
   private Supply next;

    public Supply() {
        this.next = null;
    }

    public Supply(String nameDoctor, String nameProduct, String supplier, int amount, String priority) {
        this.nameDoctor = nameDoctor;
        this.nameProduct = nameProduct;
        this.supplier = supplier;
        this.amount = amount;
        this.priority = priority;
        this.next = null;
    }
    
    public boolean isQueueEmpty() {
        if(next == null)
            return true;
        return false;
    }
    
    public void enqueue(String nameDoctor, String nameProduct, String supplier, int amount, String priority) {
        Supply node = new Supply(nameDoctor, nameProduct, supplier, amount, priority);
        
        if(isQueueEmpty())
            next = node;
        else {
            Supply aux = next;
            while(aux.getNext() != null)
                aux = aux.getNext();
            aux.setNext(node);
        }
    }
    
    /*public void dequeue(parent) {
        Supply aux = next;
        
        if(next.getNext() == null)
            next = null;
        else {
            next = aux.getNext();
            JOptionPane.showMessageDialog(parent, "Last supply deleted", "¡CAUTION!", JOptionPane.INFORMATION_MESSAGE);
        }
    }*/

    public String getNameDoctor() {
        return nameDoctor;
    }

    public void setNameDoctor(String nameDoctor) {
        this.nameDoctor = nameDoctor;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public Supply getNext() {
        return next;
    }

    public void setNext(Supply next) {
        this.next = next;
    }
   
}
