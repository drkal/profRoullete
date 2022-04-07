/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Panos
 */
public class lostBudget extends javax.swing.JFrame  implements Runnable {

    @Override
    public void run() {
         try {
            Thread.sleep(20);
             double k;
            double v;
            
            k = Double.parseDouble(slot.money.getText());
            v = Double.parseDouble(slot.bet.getText());
            
           
            k = k - v;
            slot.money.setText(k + "");
            
            slot.bet.setText("0");
            
             slot.i++;
            double d;
            d = (slot.r / slot.i) * 100;
            slot.games.setText(slot.i + "");
            slot.percent.setText(Math.round(d) + " %");
        } catch (InterruptedException ex) {
            Logger.getLogger(budget.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }
    

