

import java.awt.Color;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Panos
 */
public class luck extends javax.swing.JFrame implements Runnable {

    @Override
    public void run() {
        slot.safety();
        long start = System.currentTimeMillis();
        do {
            int num = rand(36);
            slot.result.setText(num + "");
            if (num == 0) {
                slot.result.setBackground(Color.green);
            } else if (num == 1 || num == 3 || num == 5 || num == 7 || num == 9 || num == 12 || num == 14 || num == 16 || num == 18 || num == 19 || num == 21 || num == 23 || num == 25 || num == 27 || num == 30 || num == 32 || num == 34 || num == 36) {
                slot.result.setForeground(Color.black);
                slot.result.setBackground(Color.red);
            } else {
                slot.result.setForeground(Color.white);
                slot.result.setBackground(Color.black);
            }
            repaint();
            try {
                Thread.sleep(150);
            } catch (InterruptedException ex) {
                Logger.getLogger(luck.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            

        } while (System.currentTimeMillis() - start < 5000);
        slot.checkWin();
       
        

        
        if (slot.m == 0) {
            Thread t5 = new Thread(new lostBudget(), "t5");
            t5.start();
            
         if("E".equals(slot.given.getText()) || "O".equals(slot.given.getText())){
        slot.colorStopSafe();
        }else{
        slot.stopSafe();
         }
        } else if (slot.m == 1) {
            Thread t6 = new Thread(new budget(), "t6");
            t6.start();
            
         if("E".equals(slot.given.getText()) || "O".equals(slot.given.getText())){
        slot.colorStopSafe();
        }else{
        slot.stopSafe();
         }
        }
        slot.talk.insert((slot.i+1) + ") ---------------------------------\n", 0);
         Thread t7 = new Thread(new writteMe(), "t7");
         t7.start();
    }

    
    
    
    private int rand(int i) {
        Random roul = new Random();
        int amber = 1 + roul.nextInt(i);
        return amber;
    }
}
