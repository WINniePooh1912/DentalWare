package Agenda;

import java.awt.Color;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Cell extends JButton{

    private Date date;
    private boolean title;
    
    public Cell() {
        setContentAreaFilled(false);
        setBorder(null);
        setHorizontalAlignment(JLabel.CENTER);
    }
    
    public void asTitle() {
        title = true;
    }
    
    public boolean isTitle() {
        return title;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    public void currentMonth(boolean act) {
        if(act) {
            setForeground(new Color(34, 111, 138));
        } else {
            setForeground(new Color(67, 187, 204));
        }
    }
}
