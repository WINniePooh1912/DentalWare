package dentalware;

public class Assistant extends User {
    private String nameDoctor;
    private String school;
    private boolean isItGraduate;
    private boolean isItIntern;
    protected Assistant next;

    public Assistant() {
        this.next = null;
    }

    public Assistant(String nameDoctor, String school, boolean isItGraduate, boolean isItIntern, String name, int age, char sex, String address, String telephone, String user, String password, int type) {
        super(name, age, sex, address, telephone, user, password, type);
        this.nameDoctor = nameDoctor;
        this.school = school;
        this.isItGraduate = isItGraduate;
        this.isItIntern = isItIntern;
        this.next = null;
    }
    
    public boolean isStackEmpty() {
        if(this.next == null)
            return true;
        return false;
    }

    public void push(String nameDoctor, String school, boolean isItGraduate, boolean isItIntern, String name, int age, char sex, String address, String telephone, String user, String password, int type) {
        Assistant node = new Assistant(nameDoctor, school, isItGraduate, isItIntern, name, age, sex, address, telephone, user, password, type);

        if(isStackEmpty())
            next = node;
        else {
            Assistant aux = (Assistant) next;
            next = node;
            node.setNext(aux);
        }
    }
    
    public void pop() {
        Assistant aux = next;

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

    public String getNameDoctor() {
        return nameDoctor;
    }

    public void setNameDoctor(String nameDoctor) {
        this.nameDoctor = nameDoctor;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public boolean isItGraduate() {
        return isItGraduate;
    }

    public void setIsItGraduate(boolean isItGraduate) {
        this.isItGraduate = isItGraduate;
    }

    public boolean isItIntern() {
        return isItIntern;
    }

    public void setIsItIntern(boolean isItIntern) {
        this.isItIntern = isItIntern;
    }

    public Assistant getNext() {
        return next;
    }

    public void setNext(Assistant next) {
        this.next = next;
    }
    
}
