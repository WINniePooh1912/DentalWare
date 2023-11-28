package Agenda;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Cell extends JButton{

    private Date date;
    private boolean title;
    private boolean isToday;
    
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

    public void setAsToday() {
        isToday = true;
        setForeground(new Color(222,212,210));
        setFont(new java.awt.Font("Tahoma", 1, 13));
    }
    
    @Override
    protected void paintComponent(Graphics grphcs) {
        if(title) {
            grphcs.setColor(new Color(118,194,164));
            grphcs.drawLine(0, getHeight() - 1, getWidth(), getHeight() - 1);
        }
        if(isToday) {
            Graphics2D g2 = (Graphics2D)grphcs;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(new Color(34, 111, 138));
            int x = getWidth()/2 - 20;
            int y = getHeight()/2 - 20;
            g2.fillRoundRect(x, y, 40, 40, 100, 100);
        }
        super.paintComponent(grphcs); 
    }
}
