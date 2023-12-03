package dentalware;

public class MedicalHistory {
    private float[] odontogram;
    private String motive;
    private String[] habits;
    private String bucalHigiene;
    private String[] allergies;
    private String[] illness;
    private boolean isItPregnant;
    private String observations;
    private String bloodType;
    private MedicalHistory next;

    public MedicalHistory() {
        this.next = null;
    }
    
    public MedicalHistory(float[] odontogram, String motive, String[] habits, String bucalHigiene, String[] allergies, String[] illness, boolean isItPregnant, String observations, String bloodType) {
        this.odontogram = odontogram;
        this.motive = motive;
        this.habits = habits;
        this.bucalHigiene = bucalHigiene;
        this.allergies = allergies;
        this.illness = illness;
        this.isItPregnant = isItPregnant;
        this.observations = observations;
        this.bloodType = bloodType;
        this.next = null;
    }
    
    public boolean isStackEmpty() {
        if(next == null)
            return true;
        return false;
    }

    public void push(float[] odontogram, String motive, String[] habits, String bucalHigiene, String[] allergies, String[] illness, boolean isItPregnant, String observations, String bloodType) {
        MedicalHistory node = new MedicalHistory(odontogram, motive, habits, bucalHigiene, allergies, illness, isItPregnant, observations, bloodType);

        if(isStackEmpty())
            next = node;
        else {
            MedicalHistory aux = next;
            next = node;
            node.setNext(aux);
        }
    }
    
    public void pop() {
        MedicalHistory aux = next;

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

    public float[] getOdontogram() {
        return odontogram;
    }

    public void setOdontogram(float[] odontogram) {
        this.odontogram = odontogram;
    }

    public String getMotive() {
        return motive;
    }

    public void setMotive(String motive) {
        this.motive = motive;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    public String getBucalHigiene() {
        return bucalHigiene;
    }

    public void setBucalHigiene(String bucalHigiene) {
        this.bucalHigiene = bucalHigiene;
    }

    public String[] getAllergies() {
        return allergies;
    }

    public void setAllergies(String[] allergies) {
        this.allergies = allergies;
    }

    public String[] getIllness() {
        return illness;
    }

    public void setIllness(String[] illness) {
        this.illness = illness;
    }

    public boolean isIsItPregnant() {
        return isItPregnant;
    }

    public void setIsItPregnant(boolean isItPregnant) {
        this.isItPregnant = isItPregnant;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public MedicalHistory getNext() {
        return next;
    }

    public void setNext(MedicalHistory next) {
        this.next = next;
    }
    
}
