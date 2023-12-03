package dentalware;

public class Doctor extends User {
    private String numCedula;
    private Doctor next;

    public Doctor() {
        this.next = null;
    }    
    public Doctor(String numCedula, String name, int age, char sex, String address, String telephone, String user, String password, int type) {
        super(name, age, sex, address, telephone, user, password, type);
        this.numCedula = numCedula;
    }
    
    public boolean isStackEmpty() {
        if(this.next == null)
            return true;
        return false;
    }

    public void push(String numCedula, String name, int age, char sex, String address, String telephone, String user, String password, int type) {
        Doctor node = new Doctor(numCedula, name, age, sex, address, telephone, user, password, type);

        if(isStackEmpty())
            next = node;
        else {
            Doctor aux = next;
            next = node;
            node.setNext(aux);
        }
    }
    
    public void pop() {
        Doctor aux = next;

        if(isStackEmpty())
            System.out.println("The stack is empty.");
        else {
            if(aux.getNext() == null)
                next = null;
            else
                next = aux.getNext();
            System.out.println("First file deleted.");
        }
    }

    /*public boolean traverse(String name) {
        MedicalHistory aux = next;
        int counter = 1;

        while(aux != null) {
            if (aux.getName().equalsIgnoreCase(name)) {
                JOptionPane.showMessageDialog(null, "Restaurante #" + counter + ""
                       + ": \n Estrellas: " + aux.getStars() +"\n Nombre: " + aux.getName()
                       + "\n Comida: " + aux.getFood() + "\n Precio: " + aux.getCost(),
                       "Mostrando resultados de búsqueda", JOptionPane.INFORMATION_MESSAGE); 
                return true;
            }
            aux = aux.getNext();
            counter++;
        }
        return false;
    }*/

    public String getNumCedula() {
        return numCedula;
    }

    public void setNumCedula(String numCedula) {
        this.numCedula = numCedula;
    }

    public Doctor getNext() {
        return next;
    }

    public void setNext(Doctor next) {
        this.next = next;
    }
    
}
